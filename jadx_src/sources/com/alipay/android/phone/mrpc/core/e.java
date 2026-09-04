package com.alipay.android.phone.mrpc.core;

import org.apache.http.HttpResponse;
import org.apache.http.impl.client.DefaultRedirectHandler;
import org.apache.http.protocol.HttpContext;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends DefaultRedirectHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f38098b;

    public e(d dVar) {
        this.f38098b = dVar;
    }

    @Override // org.apache.http.impl.client.DefaultRedirectHandler, org.apache.http.client.RedirectHandler
    public final boolean isRedirectRequested(HttpResponse httpResponse, HttpContext httpContext) {
        int statusCode;
        this.f38097a++;
        boolean zIsRedirectRequested = super.isRedirectRequested(httpResponse, httpContext);
        if (zIsRedirectRequested || this.f38097a >= 5 || !((statusCode = httpResponse.getStatusLine().getStatusCode()) == 301 || statusCode == 302)) {
            return zIsRedirectRequested;
        }
        return true;
    }
}
