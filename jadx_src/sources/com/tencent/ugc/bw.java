package com.tencent.ugc;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class bw implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoEditer f103395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f103396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f103397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f103398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Bitmap f103399e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Bitmap f103400f;

    private bw(TXVideoEditer tXVideoEditer, float f10, float f11, float f12, Bitmap bitmap, Bitmap bitmap2) {
        this.f103395a = tXVideoEditer;
        this.f103396b = f10;
        this.f103397c = f11;
        this.f103398d = f12;
        this.f103399e = bitmap;
        this.f103400f = bitmap2;
    }

    public static Runnable a(TXVideoEditer tXVideoEditer, float f10, float f11, float f12, Bitmap bitmap, Bitmap bitmap2) {
        return new bw(tXVideoEditer, f10, f11, f12, bitmap, bitmap2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$setFilter$6(this.f103395a, this.f103396b, this.f103397c, this.f103398d, this.f103399e, this.f103400f);
    }
}
