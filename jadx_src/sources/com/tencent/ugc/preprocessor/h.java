package com.tencent.ugc.preprocessor;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final GPUPreprocessor f103783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Bitmap f103784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Bitmap f103785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f103786d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f103787e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f103788f;

    private h(GPUPreprocessor gPUPreprocessor, Bitmap bitmap, Bitmap bitmap2, float f10, float f11, float f12) {
        this.f103783a = gPUPreprocessor;
        this.f103784b = bitmap;
        this.f103785c = bitmap2;
        this.f103786d = f10;
        this.f103787e = f11;
        this.f103788f = f12;
    }

    public static Runnable a(GPUPreprocessor gPUPreprocessor, Bitmap bitmap, Bitmap bitmap2, float f10, float f11, float f12) {
        return new h(gPUPreprocessor, bitmap, bitmap2, f10, f11, f12);
    }

    @Override // java.lang.Runnable
    public final void run() {
        GPUPreprocessor.lambda$setFilterGroupImages$3(this.f103783a, this.f103784b, this.f103785c, this.f103786d, this.f103787e, this.f103788f);
    }
}
