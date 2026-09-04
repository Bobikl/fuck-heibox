package com.tencent.ugc;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class bq implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoEditer f103378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Bitmap f103379b;

    private bq(TXVideoEditer tXVideoEditer, Bitmap bitmap) {
        this.f103378a = tXVideoEditer;
        this.f103379b = bitmap;
    }

    public static Runnable a(TXVideoEditer tXVideoEditer, Bitmap bitmap) {
        return new bq(tXVideoEditer, bitmap);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$setFilter$5(this.f103378a, this.f103379b);
    }
}
