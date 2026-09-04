package com.tencent.liteav.base.http;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HttpClientAndroid f99649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Long f99650b;

    private c(HttpClientAndroid httpClientAndroid, Long l10) {
        this.f99649a = httpClientAndroid;
        this.f99650b = l10;
    }

    public static Runnable a(HttpClientAndroid httpClientAndroid, Long l10) {
        return new c(httpClientAndroid, l10);
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        HttpClientAndroid.lambda$resumeRepeatDownload$2(this.f99649a, this.f99650b);
    }
}
