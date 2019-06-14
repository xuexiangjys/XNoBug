package com.xuexiang.xnobug;

import android.app.Application;

import com.xuexiang.xlog.XLog;
import com.xuexiang.xlog.annotation.LogLevel;
import com.xuexiang.xlog.logger.ILogger;
import com.xuexiang.xlog.logger.LoggerFactory;
import com.xuexiang.xlog.strategy.log.DiskLogStrategy;

/**
 * @author xuexiang
 * @since 2019-05-04 15:38
 */
final class _XNoBug {

    private static final String LOG_NAME = "XNoBug";

    /**
     * 初始化日志库【这里使用的是XLog】
     */
    static void initLogger(Application context) {
        XLog.init(context);

        //磁盘打印策略
        DiskLogStrategy diskLogStrategy = LoggerFactory.getDiskLogStrategy(
                LOG_NAME, //日志存储的目录名（相对路径）
                "xlog",  //生成日志的前缀名
                LogLevel.ERROR);
        //构建磁盘打印
        LoggerFactory.getSimpleDiskLogger(
                LOG_NAME, //Log的标示名
                diskLogStrategy, //磁盘打印的策略
                0  //方法的偏移（默认是0，可根据自己的需要设定）
        );
    }

    static ILogger getLogger() {
        return XLog.get().getLogger(LOG_NAME);
    }




}
