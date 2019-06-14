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
