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
package jp.javelindev.simplequerytest;

import com.shelfmap.simplequery.annotation.GenerateClass;
import com.shelfmap.simplequery.annotation.Property;
import com.shelfmap.simplequery.processing.RetainType;
import java.util.Collection;

/**
 *
 * @author Tsutomu YANO
 */
@GenerateClass(superClass=SimpleSuperClass.class)
public interface SimpleDomain {//extends SuperInterface {
    String getName();
    void setName(String name);

    Integer getAge();
    void setAge(Integer age);

    boolean isMale();
    void setMale(boolean isMale);

    @Property(retainType = RetainType.HOLD)
    Collection<? extends Number> getCollection();
    void setCollection(Collection<? extends Number> number);

    int getCount();
    void setCount(int count);
}
