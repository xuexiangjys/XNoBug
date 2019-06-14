/*
 * Copyright (C) 2019 xuexiangjys(xuexiangjys@163.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.xuexiang.xnobug.core.model;

import java.util.Map;

/**
 * 事件信息
 *
 * @author xuexiang
 * @since 2019-06-14 16:15
 */
public class EventInfo {
    /**
     * 事件id
     */
    public String id;
    /**
     * 事件标志
     */
    public String label;
    /**
     * 事件数据
     */
    public Map<String, Object> data;

    public EventInfo(String id) {
        this.id = id;
    }

    public EventInfo(String id, String label) {
        this.id = id;
        this.label = label;
    }

    public EventInfo(String id, String label, Map<String, Object> data) {
        this.id = id;
        this.label = label;
        this.data = data;
    }

    public String getId() {
        return id;
    }

    public EventInfo setId(String id) {
        this.id = id;
        return this;
    }

    public String getLabel() {
        return label;
    }

    public EventInfo setLabel(String label) {
        this.label = label;
        return this;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public EventInfo setData(Map<String, Object> data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return "EventInfo{" +
                "id='" + id + '\'' +
                ", label='" + label + '\'' +
                ", data=" + data +
                '}';
    }
}
