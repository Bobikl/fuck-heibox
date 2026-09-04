package com.tencent.qcloud.core.http;

import com.tencent.qcloud.core.common.QCloudClientException;
import com.tencent.qcloud.core.common.QCloudProgressListener;
import com.tencent.qcloud.core.common.QCloudServiceException;
import okhttp3.c0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class NetworkProxy<T> {
    protected String identifier;
    protected QCloudProgressListener mProgressListener;
    protected HttpTaskMetrics metrics;

    protected abstract void cancel();

    protected abstract HttpResult<T> convertResponse(HttpRequest<T> httpRequest, c0 c0Var) throws QCloudServiceException, QCloudClientException;

    protected abstract HttpResult<T> executeHttpRequest(HttpRequest<T> httpRequest) throws QCloudServiceException, QCloudClientException;
}
