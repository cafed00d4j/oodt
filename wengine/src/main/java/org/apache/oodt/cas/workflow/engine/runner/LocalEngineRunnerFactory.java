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
package org.apache.oodt.cas.workflow.engine.runner;

/**
 * 
 * @author mattmann
 * @author bfoster
 * @version $Revision$
 * 
 * Factory for creating local EngineRunners
 *
 */
public class LocalEngineRunnerFactory implements EngineRunnerFactory {

	private int cacheSize = 0;
	private int numOfSlots = 6;
	
	public LocalEngineRunner createRunner() {
		return new LocalEngineRunner(this.numOfSlots, this.cacheSize);
	}
	
	public void setNumOfSlots(int numOfSlots) {
		this.numOfSlots = numOfSlots;
	}
	
	public void setCacheSize(int cacheSize) {
		this.cacheSize = cacheSize;
	}

}