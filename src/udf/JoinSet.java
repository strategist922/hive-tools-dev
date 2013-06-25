/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package udf;
import java.util.ArrayList;
import java.util.List;
import org.apache.hadoop.hive.ql.exec.UDFArgumentException;
import org.apache.hadoop.hive.ql.exec.UDFArgumentTypeException;
import org.apache.hadoop.hive.ql.metadata.HiveException;
import org.apache.hadoop.hive.ql.udf.generic.GenericUDF;
import org.apache.hadoop.hive.serde2.objectinspector.ListObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspectorUtils;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector.Category;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspectorUtils.ObjectInspectorCopyOption;

//数组取交集 join_set(array(1,2,3), array(3,4))
public class JoinSet extends GenericUDF {

  private static final int ARG_COUNT = 2; // Number of arguments to this UDF
  private static final String FUNC_NAME = "JoinSet"; // External Name

 
  private ListObjectInspector set1OI;
  private ListObjectInspector set2OI;
  private static final List emptylist = new ArrayList(0);
//before call this function . do the ini job here
  @Override
  public ObjectInspector initialize(ObjectInspector[] arguments)
      throws UDFArgumentException {

    // Check if two arguments were passed
    if (arguments.length != ARG_COUNT) {
      throw new UDFArgumentException(
          "The function " + FUNC_NAME + " accepts "
              + ARG_COUNT + " arguments.");
    }

    if (!arguments[0].getCategory().equals(Category.LIST)) {
      throw new UDFArgumentTypeException(0,
          "\"" + org.apache.hadoop.hive.serde.Constants.LIST_TYPE_NAME + "\" "
          + "expected at function JoinSet, but "
          + "\"" + arguments[0].getTypeName() + "\" "
          + "is found");
    }
    
    if (!arguments[1].getCategory().equals(Category.LIST)) {
        throw new UDFArgumentTypeException(1,
            "\"" + org.apache.hadoop.hive.serde.Constants.LIST_TYPE_NAME + "\" "
            + "expected at function JoinSet, but "
            + "\"" + arguments[1].getTypeName() + "\" "
            + "is found");
      }
    
    set1OI = (ListObjectInspector) arguments[0];
    set2OI = (ListObjectInspector) arguments[1];
    
    if (!ObjectInspectorUtils.compareTypes(set1OI.getListElementObjectInspector(),
    		set2OI.getListElementObjectInspector())) {
        throw new UDFArgumentTypeException(1,
                " Same element type in array " 
                + "expected at function JoinSet, but "
                + "\"" + set2OI.getListElementObjectInspector().getTypeName() + "\" "
                + "is found");
    }
    

    
    return ObjectInspectorUtils.getStandardObjectInspector(set1OI,
	          ObjectInspectorCopyOption.JAVA);
  }



  @Override
  public Object evaluate(DeferredObject[] arguments) throws HiveException {
	if (arguments == null || arguments[0] == null || arguments[1] == null)
		return emptylist;
	
    Object set1 = arguments[0].get();
    Object set2 = arguments[1].get();
    
    if (set1 == null || set2 == null)
    	return emptylist;
    
    int set1Length = set1OI.getListLength(set1);
    int set2Length = set2OI.getListLength(set2);
   
    if (set1Length == 0) {
        return set2;
    }
    if (set2Length == 0) {
    	return set1;
    }
    
    List list1 = (List)ObjectInspectorUtils.copyToStandardObject(set1, set1OI, ObjectInspectorCopyOption.JAVA);
    List list2 = (List)ObjectInspectorUtils.copyToStandardObject(set2, set2OI, ObjectInspectorCopyOption.JAVA);
  
    list2.retainAll(list1);
    
    return list2;
  }

  @Override
  public String getDisplayString(String[] children) {
    assert (children.length == ARG_COUNT);
    return "joinSet(" + children[0] + ", "
              + children[1] + ")";
  }
}
