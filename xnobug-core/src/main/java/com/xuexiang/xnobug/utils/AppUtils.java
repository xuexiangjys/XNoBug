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

package com.xuexiang.xnobug.utils;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.text.TextUtils;

import com.xuexiang.xnobug.XNoBug;
import com.xuexiang.xnobug.core.model.AppInfo;
import com.xuexiang.xnobug.core.model.ErrorInfo;

/**
 * 应用工具类
 *
 * @author xuexiang
 * @since 2019-05-04 18:09
 */
public final class AppUtils {

    private AppUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    /**
     * 获取应用信息
     *
     * @param context
     * @return
     */
    public static AppInfo getAppInfo(@NonNull Context context) {
        AppInfo info = new AppInfo();
        info.packageName = context.getPackageName();
        info.versionName = XNoBug.getIXNoBugStrategy().getVersionName(context);
        info.versionCode = XNoBug.getIXNoBugStrategy().getVersionCode(context);
        //模糊查询渠道号的值
        info.channel = XNoBug.getIXNoBugStrategy().getAppChannel(context);
        return info;
    }


    /**
     * 根据key值获取application中注册的 meta-data 值
     *
     * @param keyName The key of meta-data.
     * @return the value of meta-data in application
     */
    public static String getMetaDataInApp(@NonNull Context context, @NonNull final String keyName) {
        String value = "";
        try {
            ApplicationInfo ai = context.getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.GET_META_DATA);
            if (ai.metaData != null) {
                value = String.valueOf(ai.metaData.get(keyName));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return value;
    }


    /**
     * 根据key值获取application中注册的 meta-data 值（模糊查询）
     *
     * @param keyName The key of meta-data.
     * @return the value of meta-data in application
     */
    public static String getFitMetaDataInApp(@NonNull Context context, @NonNull final String keyName) {
        String value = "";
        try {
            ApplicationInfo ai = context.getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.GET_META_DATA);
            if (ai.metaData != null) {
                for (String key : ai.metaData.keySet()) {
                    if (!TextUtils.isEmpty(key) && key.contains(keyName)) {
                        return String.valueOf(ai.metaData.get(key));
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return value;
    }

    /**
     * 获取应用的VersionCode
     *
     * @param context
     * @return
     */
    public static int getVersionCode(Context context) {
        PackageInfo packageInfo = getPackageInfo(context);
        return packageInfo != null ? packageInfo.versionCode : -1;
    }

    /**
     * 获取应用的VersionName
     *
     * @param context
     * @return
     */
    public static String getVersionName(Context context) {
        PackageInfo packageInfo = getPackageInfo(context);
        return packageInfo != null ? packageInfo.versionName : "";
    }

    private static PackageInfo getPackageInfo(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 获取错误信息
     *
     * @param throwable
     * @return
     */
    public static ErrorInfo getErrorInfo(Throwable throwable) {
        ErrorInfo info = new ErrorInfo();
        info.errorTime = System.currentTimeMillis();
        if (throwable.getCause() != null) {
            throwable = throwable.getCause();
        }
        info.errorSummary = throwable.getMessage();
        if (throwable.getStackTrace() != null && throwable.getStackTrace().length > 0) {
            StackTraceElement element = throwable.getStackTrace()[0];
            info.className = element.getClassName();
            info.lineNumber = element.getLineNumber();
            info.methodName = element.getMethodName();
            info.errorType = throwable.getClass().getName();
        }
        info.threadName = Thread.currentThread().getName();
        return info;
    }

}
