package com.alipay.android.phone.mrpc.core;

import org.apache.http.HttpResponse;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.protocol.HttpContext;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements ConnectionKeepAliveStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f38099a;

    public f(d dVar) {
        this.f38099a = dVar;
    }

    @Override // org.apache.http.conn.ConnectionKeepAliveStrategy
    public final long getKeepAliveDuration(HttpResponse httpResponse, HttpContext httpContext) {
        return 180000L;
    }
}
