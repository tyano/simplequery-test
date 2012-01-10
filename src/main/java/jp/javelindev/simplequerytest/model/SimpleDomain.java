/*
 * Copyright 2011 Tsutomu YANO.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jp.javelindev.simplequerytest.model;

import com.shelfmap.interfaceprocessor.annotation.GenerateClass;
import com.shelfmap.interfaceprocessor.annotation.Property;
import com.shelfmap.simplequery.annotation.Container;
import com.shelfmap.simplequery.annotation.IntAttribute;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Tsutomu YANO
 */
@GenerateClass
public interface SimpleDomain {
    String getName();
    void setName(String name);

    @IntAttribute(padding=3)
    Integer getAge();
    void setAge(Integer age);

    boolean isMale();
    void setMale(boolean isMale);

    @Container(containerType=ArrayList.class, valueType=Integer.class)
    @Property(retainType = RetainType.HOLD)
    Collection<? extends Number> getCollection();
    void setCollection(Collection<? extends Number> number);

    @IntAttribute(padding=4)
    int getCount();
    void setCount(int count);
}
