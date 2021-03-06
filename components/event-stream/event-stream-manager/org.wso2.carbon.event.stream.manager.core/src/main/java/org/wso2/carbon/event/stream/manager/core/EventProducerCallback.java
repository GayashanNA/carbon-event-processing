/**
 * Copyright (c) 2005 - 2013, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package org.wso2.carbon.event.stream.manager.core;

import org.wso2.carbon.databridge.commons.Event;

/**
 * Represents sources that feed events to the event junction.
 */
public interface EventProducerCallback {

    public void sendEventData(Object[] data);

    public void sendEvent(Event event);

    public void sendEvents(org.wso2.siddhi.core.event.Event[] events);

}
