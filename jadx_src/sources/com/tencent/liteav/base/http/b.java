package com.tencent.liteav.base.http;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HttpClientAndroid f99648a;

    private b(HttpClientAndroid httpClientAndroid) {
        this.f99648a = httpClientAndroid;
    }

    public static Runnable a(HttpClientAndroid httpClientAndroid) {
        return new b(httpClientAndroid);
    }

    @Override // java.lang.Runnable
    public final void run() {
        HttpClientAndroid.lambda$cancelAll$1(this.f99648a);
    }
}
