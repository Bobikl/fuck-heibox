package com.tencent.liteav.base.http;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HttpClientAndroid f99651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f99652b;

    private d(HttpClientAndroid httpClientAndroid, long j10) {
        this.f99651a = httpClientAndroid;
        this.f99652b = j10;
    }

    public static Runnable a(HttpClientAndroid httpClientAndroid, long j10) {
        return new d(httpClientAndroid, j10);
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        HttpClientAndroid.lambda$resumeRepeatDownload$3(this.f99651a, this.f99652b);
    }
}
