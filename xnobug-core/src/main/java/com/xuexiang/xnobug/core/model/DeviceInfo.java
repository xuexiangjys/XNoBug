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
