package com.apm.lite.h;

import java.net.HttpURLConnection;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;

/* JADX INFO: loaded from: classes6.dex */
public class a {
    public static void a(HttpURLConnection httpURLConnection) {
        if (httpURLConnection instanceof HttpsURLConnection) {
            try {
                SSLContext sSLContext = SSLContext.getInstance("TLS");
                sSLContext.init(null, null, null);
                ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(new b(sSLContext.getSocketFactory()));
            } catch (Throwable unused) {
            }
        }
    }
}
