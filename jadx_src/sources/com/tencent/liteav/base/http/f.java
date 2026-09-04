package com.tencent.liteav.base.http;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HttpClientAndroid f99654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HttpClientAndroid.e f99655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f99656c;

    private f(HttpClientAndroid httpClientAndroid, HttpClientAndroid.e eVar, long j10) {
        this.f99654a = httpClientAndroid;
        this.f99655b = eVar;
        this.f99656c = j10;
    }

    public static Runnable a(HttpClientAndroid httpClientAndroid, HttpClientAndroid.e eVar, long j10) {
        return new f(httpClientAndroid, eVar, j10);
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        HttpClientAndroid.lambda$doReadData$5(this.f99654a, this.f99655b, this.f99656c);
    }
}
