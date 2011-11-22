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

import com.shelfmap.simplequery.annotation.Property;
import com.shelfmap.simplequery.annotation.SimpleDbDomain;
import com.shelfmap.simplequery.domain.RetainType;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Tsutomu YANO
 */
@SimpleDbDomain(value="simpledomain", autoGenerate=true)
public interface SimpleDomain extends SuperInterface {
    String getName();

    Integer getAge();
    void setAge(Integer age);

    boolean isMale();

    @Property(retainType = RetainType.NEW, realType = ArrayList.class)
    Collection<? extends Number> getCollection();
    void setCollection(Collection<? extends Number> number);
}