package com.tencent.qcloud.core.http;

import com.tencent.qcloud.core.common.QCloudServiceException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import okhttp3.c0;

/* JADX INFO: loaded from: classes4.dex */
public final class HttpResponse<T> {
    final HttpRequest<T> request;
    final c0 response;

    public HttpResponse(HttpRequest<T> httpRequest, c0 c0Var) {
        this.request = httpRequest;
        this.response = c0Var;
    }

    public static void checkResponseSuccessful(HttpResponse httpResponse) throws QCloudServiceException {
        if (httpResponse == null) {
            throw new QCloudServiceException("response is null");
        }
        if (httpResponse.isSuccessful()) {
            return;
        }
        QCloudServiceException qCloudServiceException = new QCloudServiceException(httpResponse.message());
        qCloudServiceException.setStatusCode(httpResponse.code());
        throw qCloudServiceException;
    }

    public final InputStream byteStream() {
        if (this.response.q() == null) {
            return null;
        }
        return this.response.q().byteStream();
    }

    public final byte[] bytes() throws IOException {
        if (this.response.q() == null) {
            return null;
        }
        return this.response.q().bytes();
    }

    public int code() {
        return this.response.x();
    }

    public final long contentLength() {
        if (this.response.q() == null) {
            return 0L;
        }
        return this.response.q().getF132481e();
    }

    public String header(String str) {
        return this.response.C(str);
    }

    public Map<String, List<String>> headers() {
        return this.response.getHeaders().u();
    }

    public final boolean isSuccessful() {
        c0 c0Var = this.response;
        return c0Var != null && c0Var.c1();
    }

    public String message() {
        return this.response.getMessage();
    }

    public HttpRequest<T> request() {
        return this.request;
    }

    public final String string() throws IOException {
        if (this.response.q() == null) {
            return null;
        }
        return this.response.q().string();
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "http code = %d, http message = %s %nheader is %s", Integer.valueOf(code()), message(), this.response.getHeaders().u());
    }
}
