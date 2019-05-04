package com.xuexiang.xnobug.core.model;

/**
 * 设备状态信息
 *
 * @author xuexiang
 * @since 2019-05-04 16:43
 */
public class DeviceStatusInfo {
    /**
     * 设备电量【100%】
     */
    public String batteryLevel;
    /**
     * 电池温度【50°C】
     */
    public String batteryTemperature;
    /**
     * 磁盘可用占比【15.56 GB/25.68 GB】
     */
    public String diskAvailableRatio;
    /**
     * SD卡可用占比【15.56 GB/25.68 GB】
     */
    public String sdcardAvailableRatio;
    /**
     * 内存可用占比【1.09 GB/2.69 GB】
     */
    public String memoryAvailableRatio;
    /**
     * 状态记录的时间戳【记录崩溃的时间】
     */
    public long timeStamp;

    public String getBatteryLevel() {
        return batteryLevel;
    }

    public DeviceStatusInfo setBatteryLevel(String batteryLevel) {
        this.batteryLevel = batteryLevel;
        return this;
    }

    public String getBatteryTemperature() {
        return batteryTemperature;
    }

    public DeviceStatusInfo setBatteryTemperature(String batteryTemperature) {
        this.batteryTemperature = batteryTemperature;
        return this;
    }

    public String getDiskAvailableRatio() {
        return diskAvailableRatio;
    }

    public DeviceStatusInfo setDiskAvailableRatio(String diskAvailableRatio) {
        this.diskAvailableRatio = diskAvailableRatio;
        return this;
    }

    public String getSdcardAvailableRatio() {
        return sdcardAvailableRatio;
    }

    public DeviceStatusInfo setSdcardAvailableRatio(String sdcardAvailableRatio) {
        this.sdcardAvailableRatio = sdcardAvailableRatio;
        return this;
    }

    public String getMemoryAvailableRatio() {
        return memoryAvailableRatio;
    }

    public DeviceStatusInfo setMemoryAvailableRatio(String memoryAvailableRatio) {
        this.memoryAvailableRatio = memoryAvailableRatio;
        return this;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public DeviceStatusInfo setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
        return this;
    }

    @Override
    public String toString() {
        return "DeviceStatusInfo{" +
                "batteryLevel='" + batteryLevel + '\'' +
                ", batteryTemperature='" + batteryTemperature + '\'' +
                ", diskAvailableRatio='" + diskAvailableRatio + '\'' +
                ", sdcardAvailableRatio='" + sdcardAvailableRatio + '\'' +
                ", memoryAvailableRatio='" + memoryAvailableRatio + '\'' +
                ", timeStamp=" + timeStamp +
                '}';
    }
}
