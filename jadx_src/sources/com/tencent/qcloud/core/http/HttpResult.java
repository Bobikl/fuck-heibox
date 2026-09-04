package com.tencent.qcloud.core.http;

import com.tencent.qcloud.core.common.QCloudServiceException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class HttpResult<T> {
    private final int code;
    private final T content;
    private final Map<String, List<String>> headers;
    private final String message;
    private final HttpRequest<T> request;

    public HttpResult(HttpResponse<T> httpResponse, T t10) {
        this.code = httpResponse.code();
        this.message = httpResponse.message();
        this.headers = httpResponse.response.getHeaders().u();
        this.content = t10;
        this.request = httpResponse.request;
    }

    public QCloudServiceException asException() {
        QCloudServiceException qCloudServiceException = new QCloudServiceException(this.message);
        qCloudServiceException.setStatusCode(this.code);
        return qCloudServiceException;
    }

    public int code() {
        return this.code;
    }

    public T content() {
        return this.content;
    }

    public String header(String str) {
        List<String> list = this.headers.get(str);
        if (list == null || list.size() <= 0) {
            return null;
        }
        return list.get(0);
    }

    public Map<String, List<String>> headers() {
        return this.headers;
    }

    public final boolean isSuccessful() {
        int i10 = this.code;
        return i10 >= 200 && i10 < 300;
    }

    public String message() {
        return this.message;
    }

    public HttpRequest<T> request() {
        return this.request;
    }
}
