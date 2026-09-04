package com.jd.jdcache.service.impl.net;

import java.net.URL;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SSLUtils.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final e f64284a = new e();

    private e() {
    }

    @dl.d
    public final HostnameVerifier a(@dl.d URL url) {
        f0.p(url, "url");
        return new c(url);
    }

    @dl.d
    public final SSLSocketFactory b() {
        return new f();
    }
}
