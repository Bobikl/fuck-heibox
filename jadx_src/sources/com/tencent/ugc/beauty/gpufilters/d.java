package com.tencent.ugc.beauty.gpufilters;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXCGPULookupFilterGroup f103345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f103346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f103347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f103348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Bitmap f103349e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Bitmap f103350f;

    private d(TXCGPULookupFilterGroup tXCGPULookupFilterGroup, float f10, float f11, float f12, Bitmap bitmap, Bitmap bitmap2) {
        this.f103345a = tXCGPULookupFilterGroup;
        this.f103346b = f10;
        this.f103347c = f11;
        this.f103348d = f12;
        this.f103349e = bitmap;
        this.f103350f = bitmap2;
    }

    public static Runnable a(TXCGPULookupFilterGroup tXCGPULookupFilterGroup, float f10, float f11, float f12, Bitmap bitmap, Bitmap bitmap2) {
        return new d(tXCGPULookupFilterGroup, f10, f11, f12, bitmap, bitmap2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXCGPULookupFilterGroup.lambda$setBitmap$0(this.f103345a, this.f103346b, this.f103347c, this.f103348d, this.f103349e, this.f103350f);
    }
}
