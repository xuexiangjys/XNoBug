package com.xuexiang.xnobug.core.proxy.impl;

import android.support.annotation.NonNull;

import com.xuexiang.xnobug.core.proxy.IHttpService;

import java.io.File;
import java.util.List;
import java.util.Map;

/**
 * 默认网络请求服务
 * @author xuexiang
 * @since 2019-06-14 18:13
 */
public class DefaultHttpServiceImpl implements IHttpService {

    @Override
    public void asyncPost(@NonNull String url, @NonNull Map<String, Object> params, @NonNull Callback callBack) {

    }

    @Override
    public void asyncUpload(@NonNull String url, Map<String, Object> params, @NonNull String key, @NonNull File file, UploadCallback callback) {

    }

    @Override
    public void asyncUpload(@NonNull String url, Map<String, Object> params, @NonNull String key, @NonNull List<File> files, UploadCallback callback) {

    }
}
