package com.tencent.ugc;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoEditer f103739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TXVideoEditConstants.TXRect f103740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Bitmap f103741c;

    private l(TXVideoEditer tXVideoEditer, TXVideoEditConstants.TXRect tXRect, Bitmap bitmap) {
        this.f103739a = tXVideoEditer;
        this.f103740b = tXRect;
        this.f103741c = bitmap;
    }

    public static Runnable a(TXVideoEditer tXVideoEditer, TXVideoEditConstants.TXRect tXRect, Bitmap bitmap) {
        return new l(tXVideoEditer, tXRect, bitmap);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$setWaterMark$16(this.f103739a, this.f103740b, this.f103741c);
    }
}
