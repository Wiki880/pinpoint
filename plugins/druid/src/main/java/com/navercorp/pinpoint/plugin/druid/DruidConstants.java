/*
 *  Copyright 2018 NAVER Corp.
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
 */
package com.navercorp.pinpoint.plugin.druid;

import com.navercorp.pinpoint.common.trace.ServiceType;
import com.navercorp.pinpoint.common.trace.ServiceTypeFactory;

/**
 * The type Druid constants.
 *
 * @author Victor.Zxy
 * @version 1.8.1
 * @since 2017/07/21
 */
public final class DruidConstants {

    private DruidConstants() {
    }

    /**
     * The constant SCOPE.
     */
    public static final String SCOPE = "DRUID_SCOPE";

    /**
     * The constant SERVICE_TYPE.
     */
    public static final ServiceType SERVICE_TYPE = ServiceTypeFactory.of(6062, "DRUID");

    /**
     * The constant ACCESSOR_DATASOURCE_MONITOR.
     */
    public static final String ACCESSOR_DATASOURCE_MONITOR = "com.navercorp.pinpoint.plugin.druid.DataSourceMonitorAccessor";

    /**
     * The constant INTERCEPTOR_CONSTRUCTOR.
     */
    public static final String INTERCEPTOR_CONSTRUCTOR = "com.navercorp.pinpoint.plugin.druid.interceptor.DataSourceConstructorInterceptor";
    /**
     * The constant INTERCEPTOR_CLOSE.
     */
    public static final String INTERCEPTOR_CLOSE = "com.navercorp.pinpoint.plugin.druid.interceptor.DataSourceCloseInterceptor";

    /**
     * The constant INTERCEPTOR_GET_CONNECTION.
     */
    public static final String INTERCEPTOR_GET_CONNECTION = "com.navercorp.pinpoint.plugin.druid.interceptor.DataSourceGetConnectionInterceptor";
    /**
     * The constant INTERCEPTOR_CLOSE_CONNECTION.
     */
    public static final String INTERCEPTOR_CLOSE_CONNECTION = "com.navercorp.pinpoint.plugin.druid.interceptor.DataSourceCloseConnectionInterceptor";

    /**
     * The constant PLUGIN_ENABLE.
     */
    public static final String PLUGIN_ENABLE = "profiler.jdbc.druid";
    /**
     * The constant PROFILE_CONNECTIONCLOSE_ENABLE.
     */
    public static final String PROFILE_CONNECTIONCLOSE_ENABLE = "profiler.jdbc.druid.connectionclose";

}