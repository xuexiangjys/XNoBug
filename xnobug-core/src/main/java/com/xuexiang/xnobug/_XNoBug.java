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
                //日志存储的目录名（相对路径）
                LOG_NAME,
                //生成日志的前缀名
                "xlog",
                LogLevel.ERROR);
        //构建磁盘打印
        LoggerFactory.getSimpleDiskLogger(
                //Log的标示名
                LOG_NAME,
                //磁盘打印的策略
                diskLogStrategy,
                //方法的偏移（默认是0，可根据自己的需要设定）
                0
        );
    }

    static ILogger getLogger() {
        return XLog.get().getLogger(LOG_NAME);
    }




}
