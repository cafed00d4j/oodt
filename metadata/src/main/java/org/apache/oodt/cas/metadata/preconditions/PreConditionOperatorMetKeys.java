/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package org.apache.oodt.cas.metadata.preconditions;

/**
 * 
 * @author bfoster
 * @author mattmann
 * @version $Revision$
 * 
 * <p>
 * Met keys for evaluating {@link MetExtractor} {@link PreCondition}s
 * </p>.
 */
public interface PreConditionOperatorMetKeys {

    public static String EQUAL_TO = "EQUAL_TO";

    public static String NOT_EQUAL_TO = "NOT_EQUAL_TO";

    public static String GREATER_THAN = "GREATER_THAN";

    public static String LESS_THAN = "LESS_THAN";

}
