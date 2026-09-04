package com.alipay.mobile.android.verify.bridge.b;

/* JADX INFO: compiled from: ScriptLoaderPlugin.java */
/* JADX INFO: loaded from: classes6.dex */
public class f implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f39348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ d f39349c;

    f(d dVar, String str) {
        this.f39349c = dVar;
        this.f39348b = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f39349c.f39346c) {
            this.f39349c.f39345b.loadUrl(String.format("javascript: %s", this.f39348b));
        }
    }
}
