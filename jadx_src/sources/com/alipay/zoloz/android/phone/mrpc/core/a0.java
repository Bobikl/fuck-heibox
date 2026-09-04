package com.alipay.zoloz.android.phone.mrpc.core;

import android.util.Log;
import java.io.IOException;
import java.net.SocketException;
import javax.net.ssl.SSLException;
import org.apache.http.NoHttpResponseException;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.protocol.HttpContext;

/* JADX INFO: compiled from: ZHttpRequestRetryHandler.java */
/* JADX INFO: loaded from: classes6.dex */
public class a0 implements HttpRequestRetryHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final String f39617a = a0.class.getSimpleName();

    @Override // org.apache.http.client.HttpRequestRetryHandler
    public boolean retryRequest(IOException iOException, int i10, HttpContext httpContext) {
        if (i10 >= 3) {
            return false;
        }
        if (iOException instanceof NoHttpResponseException) {
            Log.v(f39617a, "exception instanceof NoHttpResponseException");
            return true;
        }
        if ((!(iOException instanceof SocketException) && !(iOException instanceof SSLException)) || iOException.getMessage() == null || !iOException.getMessage().contains("Broken pipe")) {
            return false;
        }
        Log.v(f39617a, "exception instanceof SocketException:Broken pipe");
        return true;
    }
}
