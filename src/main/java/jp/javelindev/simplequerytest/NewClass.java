/*
 * Copyright 2012 Tsutomu YANO.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jp.javelindev.simplequerytest;

import java.util.Collection;
import jp.javelindev.simplequerytest.model.impl.*;

/**
 *
 * @author Tsutomu YANO
 */
public class NewClass extends DefaultSimpleDomain {
    public NewClass(String name, Integer age, boolean male, Collection<? extends Number> collection, int count) {
        super(name, age, male, collection, count);
    }
}
