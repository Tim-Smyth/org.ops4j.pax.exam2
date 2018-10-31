/*
 * Copyright 2012 Harald Wellmann
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package org.ops4j.pax.exam.openwebbeans;

import javax.enterprise.inject.spi.BeanManager;

import org.ops4j.pax.exam.cdi.spi.BeanManagerProvider;

/**
 * @author Harald Wellmann
 * @since 3.0.0
 */
public class OpenWebBeansBeanManagerProvider implements BeanManagerProvider {

    @Override
    public BeanManager getBeanManager() {
        return OpenWebBeansTestContainer.getCdiContainer().getBeanManager();
    }
}
