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
