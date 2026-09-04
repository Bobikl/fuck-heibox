package com.tencent.liteav.base.http;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HttpClientAndroid f99646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HttpClientAndroid.d f99647b;

    private a(HttpClientAndroid httpClientAndroid, HttpClientAndroid.d dVar) {
        this.f99646a = httpClientAndroid;
        this.f99647b = dVar;
    }

    public static Runnable a(HttpClientAndroid httpClientAndroid, HttpClientAndroid.d dVar) {
        return new a(httpClientAndroid, dVar);
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        this.f99646a.doRequest(this.f99647b);
    }
}
