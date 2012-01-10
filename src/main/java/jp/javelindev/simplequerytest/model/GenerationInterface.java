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
package jp.javelindev.simplequerytest.model;

import com.shelfmap.interfaceprocessor.annotation.GenerateClass;
import com.shelfmap.simplequery.Context;
import com.shelfmap.simplequery.annotation.Container;
import com.shelfmap.simplequery.annotation.FloatAttribute;
import com.shelfmap.simplequery.annotation.IntAttribute;
import com.shelfmap.simplequery.annotation.LongAttribute;
import com.shelfmap.simplequery.annotation.Reverse;
import com.shelfmap.simplequery.domain.ReverseToManyDomainReference;
import com.shelfmap.simplequery.domain.ReverseToOneDomainReference;
import com.shelfmap.simplequery.domain.ToOneDomainReference;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tsutomu YANO
 */
@GenerateClass(serializable=true, serialVersion=1L)
public interface GenerationInterface {
    Context getContext();
    ToOneDomainReference<SimpleDomain> getDetail();
    
    @Reverse(attributeName="targetAttribute")
    ReverseToOneDomainReference<SimpleDomain> getReverseSimpleDomain();
    
    @Reverse(attributeName="toManyAttribute")
    ReverseToManyDomainReference<SimpleDomain> getReverseManySimpleDomain();

    @IntAttribute(padding=3)
    int getAge();

    @LongAttribute(padding=5)
    long getDistance();

    @FloatAttribute(maxDigitLeft=3, maxDigitRight=2)
    float getRatio();

    @IntAttribute(padding=3)
    Integer getAgeInt();

    @LongAttribute(padding=5)
    Long getDistanceLong();

    @FloatAttribute(maxDigitLeft=3, maxDigitRight=2)
    Float getRatioFloat();

//    @Container(containerType=ArrayList.class, valueType=jp.javelindev.simplequerytest.impl.DefaultSimpleDomain.class)
//    List<SimpleDomain> getSimpleDomainList();
}
