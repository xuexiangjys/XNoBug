package com.xuexiang.xnobug;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;

import com.xuexiang.xnobug.core.strategy.IXNoBugStrategy;
import com.xuexiang.xnobug.core.strategy.IProxyStrategy;
import com.xuexiang.xnobug.core.strategy.impl.DefaultProxyStrategyImpl;
import com.xuexiang.xnobug.core.strategy.impl.DefaultXNoBugStrategyImpl;
import com.xuexiang.xnobug.logs.Logger;
import com.xuexiang.xnobug.utils.AppUtils;

/**
 * XNoBug API入口
 *
 * @author xuexiang
 * @since 2019-05-04 15:38
 */
public final class XNoBug {

    private static final String KEY_XNOBUG_APP_ID = "XNoBug_APP_ID";

    /**
     * 必须设置
     */
    private static Application sContext;
    /**
     * 应用在平台上注册的ID，应用的唯一识别码【必须设置】
     */
    private static String sAppID;
    /**
     * XNoBug初始化策略
     */
    private static IXNoBugStrategy sIXNoBugStrategy;
    /**
     * 代理策略
     */
    private static IProxyStrategy sIProxyStrategy;

    //=======================初始化设置===========================//

    /**
     * 初始化SDK
     *
     * @param context
     * @param appId   应用在平台上注册的ID
     */
    public static void init(Application context, String appId) {
        sContext = context;
        sAppID = appId;
        _XNoBug.initLogger(context);
    }

    /**
     * 初始化SDK
     *
     * @param context
     * @param appId         应用在平台上注册的ID
     * @param isDebug       是否是调试模式
     * @param noBugStrategy XNoBug初始化策略
     */
    public static void init(Application context, String appId, boolean isDebug, IXNoBugStrategy noBugStrategy) {
        sContext = context;
        sAppID = appId;
        sIXNoBugStrategy = noBugStrategy;
        Logger.debug(isDebug);
        _XNoBug.initLogger(context);
    }

    /**
     * 初始化SDK
     *
     * @param context
     * @param appId         应用在平台上注册的ID
     * @param isDebug       是否是调试模式
     * @param noBugStrategy XNoBug初始化策略
     * @param proxyStrategy 代理策略
     */
    public static void init(Application context, String appId, boolean isDebug, IXNoBugStrategy noBugStrategy, IProxyStrategy proxyStrategy) {
        sContext = context;
        sAppID = appId;
        sIXNoBugStrategy = noBugStrategy;
        sIProxyStrategy = proxyStrategy;
        Logger.debug(isDebug);
        _XNoBug.initLogger(context);
    }

    /**
     * 设置代理策略
     *
     * @param sIProxyStrategy
     */
    public static void setIProxyStrategy(IProxyStrategy sIProxyStrategy) {
        XNoBug.sIProxyStrategy = sIProxyStrategy;
    }

    /**
     * 设置是否打开调试
     *
     * @param isDebug
     */
    public static void debug(boolean isDebug) {
        Logger.debug(isDebug);
    }

    //=======================属性获取===========================//

    public static Context getContext() {
        if (sContext == null) {
            throw new ExceptionInInitializerError("请先在全局Application中调用 XNoBug.init() 初始化！");
        }
        return sContext;
    }

    /**
     * @return 返回应用ID
     */
    public static String getAppID() {
        if (TextUtils.isEmpty(sAppID)) {
            sAppID = AppUtils.getMetaDataInApp(getContext(), KEY_XNOBUG_APP_ID);
            if (TextUtils.isEmpty(sAppID)) {
                throw new ExceptionInInitializerError("请先在全局Application中调用 XNoBug.init() 初始化 APP_ID或者在 manifest中注册 meta-data： XNoBug_APP_ID ！");
            }
        }
        return sAppID;
    }

    /**
     * @return XNoBug的策略
     */
    public static IXNoBugStrategy getIXNoBugStrategy() {
        if (sIXNoBugStrategy == null) {
            sIXNoBugStrategy = new DefaultXNoBugStrategyImpl();
        }
        return sIXNoBugStrategy;
    }

    /**
     * @return 代理策略
     */
    public static IProxyStrategy getIProxyStrategy() {
        if (sIProxyStrategy == null) {
            sIProxyStrategy = new DefaultProxyStrategyImpl();
        }
        return sIProxyStrategy;
    }


}
