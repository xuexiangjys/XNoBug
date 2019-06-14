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
 * 设备信息
 *
 * @author xuexiang
 * @since 2019-05-04 16:21
 */
public class DeviceInfo {

    /**
     * 设备唯一号
     */
    public String androidID;

    /**
     * 设备是否root
     */
    public boolean isRoot;
    /**
     * 设备名称
     */
    public String deviceName;

    /**
     * 设备品牌
     */
    public String deviceBrand;

    /**
     * 操作系统版本
     */
    public String systemVersion;

    /**
     * CPU架构
     */
    public String cpuABI;

    public String getAndroidID() {
        return androidID;
    }

    public DeviceInfo setAndroidID(String androidID) {
        this.androidID = androidID;
        return this;
    }

    public boolean isRoot() {
        return isRoot;
    }

    public DeviceInfo setRoot(boolean root) {
        isRoot = root;
        return this;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public DeviceInfo setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    public String getDeviceBrand() {
        return deviceBrand;
    }

    public DeviceInfo setDeviceBrand(String deviceBrand) {
        this.deviceBrand = deviceBrand;
        return this;
    }

    public String getSystemVersion() {
        return systemVersion;
    }

    public DeviceInfo setSystemVersion(String systemVersion) {
        this.systemVersion = systemVersion;
        return this;
    }

    public String getCpuABI() {
        return cpuABI;
    }

    public DeviceInfo setCpuABI(String cpuABI) {
        this.cpuABI = cpuABI;
        return this;
    }

    @Override
    public String toString() {
        return "DeviceInfo{" +
                "androidID='" + androidID + '\'' +
                ", isRoot=" + isRoot +
                ", deviceName='" + deviceName + '\'' +
                ", deviceBrand='" + deviceBrand + '\'' +
                ", systemVersion='" + systemVersion + '\'' +
                ", cpuABI='" + cpuABI + '\'' +
                '}';
    }
}
