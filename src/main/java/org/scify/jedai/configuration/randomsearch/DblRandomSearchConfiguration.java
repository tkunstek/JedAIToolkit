/*
* Copyright [2016-2020] [George Papadakis (gpapadis@yahoo.gr)]
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
 */
package org.scify.jedai.configuration.randomsearch;

/**
 *
 * @author GAP2
 */
public class DblRandomSearchConfiguration extends AbstractRandomSearchConfiguration {

    private final float interval;
    private final float maximumValue;
    private final float minimumValue;

    public DblRandomSearchConfiguration(float max, float min) {
        super();
        maximumValue = max;
        minimumValue = min;
        interval = maximumValue - minimumValue;
    }
    
    @Override
    protected Object randomValueGeneration() {
        return minimumValue + RANDOM_GEN.nextFloat() * interval;
    }
}
