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

/**
 * 应用信息
 *
 * @author xuexiang
 * @since 2019-05-04 17:00
 */
public class AppInfo {

    /**
     * 应用包名
     */
    public String packageName;
    /**
     * 应用版本名
     */
    public String versionName;
    /**
     * 应用版本号
     */
    public int versionCode;
    /**
     * 渠道信息
     */
    public String channel;

    public String getPackageName() {
        return packageName;
    }

    public AppInfo setPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }

    public String getVersionName() {
        return versionName;
    }

    public AppInfo setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }

    public int getVersionCode() {
        return versionCode;
    }

    public AppInfo setVersionCode(int versionCode) {
        this.versionCode = versionCode;
        return this;
    }

    public String getChannel() {
        return channel;
    }

    public AppInfo setChannel(String channel) {
        this.channel = channel;
        return this;
    }

    @Override
    public String toString() {
        return "AppInfo{" +
                "packageName='" + packageName + '\'' +
                ", versionName='" + versionName + '\'' +
                ", versionCode=" + versionCode +
                ", channel='" + channel + '\'' +
                '}';
    }
}
