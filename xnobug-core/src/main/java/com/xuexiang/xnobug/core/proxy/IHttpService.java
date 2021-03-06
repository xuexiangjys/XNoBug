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

package com.xuexiang.xnobug.core.proxy;

import android.support.annotation.NonNull;

import java.io.File;
import java.util.List;
import java.util.Map;

/**
 * 提供网络请求功能的实现接口
 *
 * @author xuexiang
 * @since 2019-05-04 23:05
 */
public interface IHttpService {

    /**
     * 异步post
     *
     * @param url      post请求地址
     * @param params   post请求参数
     * @param callBack 回调
     */
    void asyncPost(@NonNull String url, @NonNull Map<String, Object> params, @NonNull Callback callBack);

    /**
     * 异步上传（单文件）
     *
     * @param url      上传的路径
     * @param params   上传的普通参数
     * @param key      上传文件的key
     * @param file     上传的文件
     * @param callback 上传的回调
     */
    void asyncUpload(@NonNull String url, Map<String, Object> params, @NonNull String key, @NonNull File file, UploadCallback callback);

    /**
     * 异步上传（多文件）
     *
     * @param url      上传的路径
     * @param params   上传的普通参数
     * @param key      上传文件的key
     * @param files    上传的文件集合
     * @param callback 上传的回调
     */
    void asyncUpload(@NonNull String url, Map<String, Object> params, @NonNull String key, @NonNull List<File> files, UploadCallback callback);

    /**
     * 网络请求回调
     */
    interface Callback {
        /**
         * 结果回调
         *
         * @param result 结果
         */
        void onSuccess(String result);

        /**
         * 错误回调
         *
         * @param throwable 错误提示
         */
        void onError(Throwable throwable);
    }


    /**
     * 上传回调
     */
    interface UploadCallback extends Callback {
        /**
         * 上传之前
         */
        void onStart();

        /**
         * 更新上传进度
         *
         * @param progress 进度0.00 - 0.50  - 1.00
         * @param total    文件总大小 单位字节
         */
        void onProgress(float progress, long total);

    }

}
