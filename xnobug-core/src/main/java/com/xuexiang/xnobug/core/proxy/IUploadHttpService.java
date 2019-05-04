package com.xuexiang.xnobug.core.proxy;

import android.support.annotation.NonNull;

import java.io.File;
import java.util.List;
import java.util.Map;

/**
 * 提供文件上传功能
 *
 * @author xuexiang
 * @since 2019-05-04 23:05
 */
public interface IUploadHttpService {

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
