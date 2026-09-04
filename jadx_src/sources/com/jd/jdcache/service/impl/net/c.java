package com.jd.jdcache.service.impl.net;

import java.net.URL;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SSLUtils.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class c implements HostnameVerifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final URL f64282a;

    public c(@dl.d URL url) {
        f0.p(url, "url");
        this.f64282a = url;
    }

    @dl.d
    public final URL a() {
        return this.f64282a;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(@dl.e String str, @dl.e SSLSession sSLSession) {
        return HttpsURLConnection.getDefaultHostnameVerifier().verify(this.f64282a.getHost(), sSLSession);
    }
}
