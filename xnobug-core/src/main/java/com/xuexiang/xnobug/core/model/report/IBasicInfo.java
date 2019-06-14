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
 * 上传报告的基础（不会变化的）信息实体需要实现的接口
 *
 * @author xuexiang
 * @since 2019-05-14 00:12
 */
public interface IBasicInfo {

    /**
     * @return 平台识别唯一号
     */
    String getAppKey();

    /**
     * 设置平台识别唯一号
     *
     * @param appKey 平台识别唯一号
     * @return
     */
    IBasicInfo setAppKey(String appKey);

    //=====================应用信息========================//

    /**
     * @return 应用包名
     */
    String getPackageName();

    /**
     * 设置应用包名
     *
     * @param packageName 应用包名
     * @return
     */
    IBasicInfo setPackageName(String packageName);

    /**
     * @return 应用版本名
     */
    String getVersionName();

    /**
     * 设置应用版本名
     *
     * @param versionName 应用版本名
     * @return
     */
    IBasicInfo setVersionName(String versionName);

    /**
     * @return 应用版本号
     */
    int getVersionCode();

    /**
     * 设置应用版本号
     *
     * @param versionCode 应用版本号
     * @return
     */
    IBasicInfo setVersionCode(int versionCode);

    /**
     * @return 渠道信息
     */
    String getChannel();

    /**
     * 设置渠道信息
     *
     * @param channel 渠道信息
     * @return
     */
    IBasicInfo setChannel(String channel);

    //=====================设备信息========================//

    /**
     * @return 设备唯一号
     */
    String getAndroidID();

    /**
     * 设置设备唯一号
     *
     * @param androidID 设备唯一号
     * @return
     */
    IBasicInfo setAndroidID(String androidID);

    /**
     * @return 设备是否root
     */
    boolean isRoot();

    /**
     * 设置设备是否root
     *
     * @param root 设备是否root
     * @return
     */
    IBasicInfo setRoot(boolean root);

    /**
     * @return 设备名称
     */
    String getDeviceName();

    /**
     * 设置设备名称
     *
     * @param deviceName 设备名称
     * @return
     */
    IBasicInfo setDeviceName(String deviceName);

    /**
     * @return 设备品牌
     */
    String getDeviceBrand();

    /**
     * 设置设备品牌
     *
     * @param deviceBrand 设备品牌
     * @return
     */
    IBasicInfo setDeviceBrand(String deviceBrand);

    /**
     * @return 操作系统版本
     */
    String getSystemVersion();

    /**
     * 设置操作系统版本
     *
     * @param systemVersion 操作系统版本
     * @return
     */
    IBasicInfo setSystemVersion(String systemVersion);

    /**
     * @return CPU架构
     */
    String getCpuABI();

    /**
     * 设置CPU架构
     *
     * @param cpuABI CPU架构
     * @return
     */
    IBasicInfo setCpuABI(String cpuABI);

}
