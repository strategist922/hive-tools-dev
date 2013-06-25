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
import org.apache.hadoop.hive.serde2.objectinspector.primitive.PrimitiveObjectInspectorFactory;
import org.apache.hadoop.io.Text;

//数组输出  toString(array, ',') 
public class ArrayToString extends GenericUDF {

  private static final int ARG_COUNT = 2; // Number of arguments to this UDF
  private static final String FUNC_NAME = "ArrayToString"; // External Name

 
  private ListObjectInspector set1OI;
  private ObjectInspector splitOI;
  private Text result;

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
          + "expected at function ArrayToString, but "
          + "\"" + arguments[0].getTypeName() + "\" "
          + "is found");
    }
    if (!arguments[1].getCategory().equals(Category.PRIMITIVE)) {
        throw new UDFArgumentTypeException(1,
            "\"" + org.apache.hadoop.hive.serde.Constants.STRING_TYPE_NAME + "\" "
            + "expected at function ArrayToString, but "
            + "\"" + arguments[1].getTypeName() + "\" "
            + "is found");
      }
    
    set1OI = (ListObjectInspector) arguments[0];
    splitOI = arguments[1];
    result = new Text();
    return PrimitiveObjectInspectorFactory.writableStringObjectInspector;
  }



  @Override
  public Object evaluate(DeferredObject[] arguments) throws HiveException {
	  
	if (arguments == null || arguments[0] == null || arguments[1] == null)
			return result;
	
    Object set1 = arguments[0].get();
    Object split = arguments[1].get();
    
	if (set1 == null || split == null)
		return result;
    
	int set1Length = set1OI.getListLength(set1);
    
   
    if (set1Length == 0) {
        return result;
    }
    
    List list1 = (List)ObjectInspectorUtils.copyToStandardObject(set1, set1OI, ObjectInspectorCopyOption.JAVA);
    
    if (list1 == null) {
    	return result;
    }
    
    String str_split = ObjectInspectorUtils.copyToStandardObject(split, splitOI, ObjectInspectorCopyOption.JAVA).toString();
    
    StringBuffer buffer = new StringBuffer();
    
    boolean isfirst = true;
    
    for(Object o : list1) {
    	if (isfirst) {
    		buffer.append(o.toString());
    		isfirst = false;
    	} else {
	    	buffer.append(str_split);
	    	buffer.append(o.toString());
    	}
    }
    result.set(buffer.toString());
    
    return result;
  }

  @Override
  public String getDisplayString(String[] children) {
    assert (children.length == ARG_COUNT);
    return "ArrayToString(" + children[0] + ", "
              + children[1] + ")";
  }
}
