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

package com.xuexiang.xnobug.core.model.report;

/**
 * 上传报告的基础信息
 *
 * @author xuexiang
 * @since 2019-05-14 00:09
 */
public class BasicInfo implements IBasicInfo {
    /**
     * 平台识别唯一号
     */
    public String appKey;

    //====应用信息=====//
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

    //====设备信息=====//
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

    @Override
    public String getAppKey() {
        return appKey;
    }

    @Override
    public BasicInfo setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }

    @Override
    public String getPackageName() {
        return packageName;
    }

    @Override
    public BasicInfo setPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }

    @Override
    public String getVersionName() {
        return versionName;
    }

    @Override
    public BasicInfo setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }

    @Override
    public int getVersionCode() {
        return versionCode;
    }

    @Override
    public BasicInfo setVersionCode(int versionCode) {
        this.versionCode = versionCode;
        return this;
    }

    @Override
    public String getChannel() {
        return channel;
    }

    @Override
    public BasicInfo setChannel(String channel) {
        this.channel = channel;
        return this;
    }

    @Override
    public String getAndroidID() {
        return androidID;
    }

    @Override
    public BasicInfo setAndroidID(String androidID) {
        this.androidID = androidID;
        return this;
    }

    @Override
    public boolean isRoot() {
        return isRoot;
    }

    @Override
    public BasicInfo setRoot(boolean root) {
        isRoot = root;
        return this;
    }

    @Override
    public String getDeviceName() {
        return deviceName;
    }

    @Override
    public BasicInfo setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    @Override
    public String getDeviceBrand() {
        return deviceBrand;
    }

    @Override
    public BasicInfo setDeviceBrand(String deviceBrand) {
        this.deviceBrand = deviceBrand;
        return this;
    }

    @Override
    public String getSystemVersion() {
        return systemVersion;
    }

    @Override
    public BasicInfo setSystemVersion(String systemVersion) {
        this.systemVersion = systemVersion;
        return this;
    }

    @Override
    public String getCpuABI() {
        return cpuABI;
    }

    @Override
    public BasicInfo setCpuABI(String cpuABI) {
        this.cpuABI = cpuABI;
        return this;
    }

    @Override
    public String toString() {
        return "BasicInfo{" +
                "appKey='" + appKey + '\'' +
                ", packageName='" + packageName + '\'' +
                ", versionName='" + versionName + '\'' +
                ", versionCode=" + versionCode +
                ", channel='" + channel + '\'' +
                ", androidID='" + androidID + '\'' +
                ", isRoot=" + isRoot +
                ", deviceName='" + deviceName + '\'' +
                ", deviceBrand='" + deviceBrand + '\'' +
                ", systemVersion='" + systemVersion + '\'' +
                ", cpuABI='" + cpuABI + '\'' +
                '}';
    }
}
