package com.alipay.deviceid.module.x;

import java.io.IOException;
import java.net.SocketException;
import javax.net.ssl.SSLException;
import org.apache.http.NoHttpResponseException;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.protocol.HttpContext;

/* JADX INFO: compiled from: ZHttpRequestRetryHandler.java */
/* JADX INFO: loaded from: classes6.dex */
public class bm implements HttpRequestRetryHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final String f38316a = bm.class.getSimpleName();

    @Override // org.apache.http.client.HttpRequestRetryHandler
    public boolean retryRequest(IOException iOException, int i10, HttpContext httpContext) {
        if (i10 >= 3) {
            return false;
        }
        if (iOException instanceof NoHttpResponseException) {
            return true;
        }
        return ((iOException instanceof SocketException) || (iOException instanceof SSLException)) && iOException.getMessage() != null && iOException.getMessage().contains("Broken pipe");
    }
}
