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
package statics;

public class DoubleNumDistinctValueEstimator extends NumDistinctValueEstimator {

  public DoubleNumDistinctValueEstimator(int numBitVectors) {
    super(numBitVectors);
  }

  public DoubleNumDistinctValueEstimator(String s, int numVectors) {
    super(s, numVectors);
  }

   public void addToEstimator(double d) {
     int v = new Double(d).hashCode();
     super.addToEstimator(v);
  }

  public void addToEstimatorPCSA(double d) {
    int v = new Double(d).hashCode();
    super.addToEstimatorPCSA(v);
  }
}
