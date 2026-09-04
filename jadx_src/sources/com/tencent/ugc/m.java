package com.tencent.ugc;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoEditer f103742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f103743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Bitmap f103744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TXVideoEditConstants.TXRect f103745d;

    private m(TXVideoEditer tXVideoEditer, int i10, Bitmap bitmap, TXVideoEditConstants.TXRect tXRect) {
        this.f103742a = tXVideoEditer;
        this.f103743b = i10;
        this.f103744c = bitmap;
        this.f103745d = tXRect;
    }

    public static Runnable a(TXVideoEditer tXVideoEditer, int i10, Bitmap bitmap, TXVideoEditConstants.TXRect tXRect) {
        return new m(tXVideoEditer, i10, bitmap, tXRect);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$setTailWaterMark$17(this.f103742a, this.f103743b, this.f103744c, this.f103745d);
    }
}
