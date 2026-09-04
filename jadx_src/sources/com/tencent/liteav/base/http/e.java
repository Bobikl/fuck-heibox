package com.tencent.liteav.base.http;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HttpClientAndroid f99653a;

    private e(HttpClientAndroid httpClientAndroid) {
        this.f99653a = httpClientAndroid;
    }

    public static Runnable a(HttpClientAndroid httpClientAndroid) {
        return new e(httpClientAndroid);
    }

    @Override // java.lang.Runnable
    public final void run() {
        HttpClientAndroid.lambda$destroy$4(this.f99653a);
    }
}
