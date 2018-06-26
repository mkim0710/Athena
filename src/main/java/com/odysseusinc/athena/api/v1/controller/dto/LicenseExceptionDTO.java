/*
 *
 * Copyright 2018 Observational Health Data Sciences and Informatics
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Company: Odysseus Data Services, Inc.
 * Product Owner/Architecture: Gregory Klebanov
 * Authors: Pavel Grafkin, Vitaly Koulakov, Maria Pozhidaeva
 * Created: June 25, 2018
 *
 */

package com.odysseusinc.athena.api.v1.controller.dto;

import java.util.List;

public class LicenseExceptionDTO {

    private List<Integer> vocabularyIds;
    private boolean isAccessible = false;

    public LicenseExceptionDTO() {
    }

    public LicenseExceptionDTO(List<Integer> vocabularyIds) {

        this.vocabularyIds = vocabularyIds;
    }

    public List<Integer> getVocabularyIds() {
        return vocabularyIds;
    }

    public void setVocabularyIds(List<Integer> vocabularyIds) {
        this.vocabularyIds = vocabularyIds;
    }

    public boolean isAccessible() {
        return isAccessible;
    }

    public void setAccessible(boolean accessible) {
        isAccessible = accessible;
    }
}