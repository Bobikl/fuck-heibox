package com.tencent.ugc.preprocessor;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final GPUPreprocessor f103774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Bitmap f103775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f103776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f103777d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f103778e;

    private e(GPUPreprocessor gPUPreprocessor, Bitmap bitmap, float f10, float f11, float f12) {
        this.f103774a = gPUPreprocessor;
        this.f103775b = bitmap;
        this.f103776c = f10;
        this.f103777d = f11;
        this.f103778e = f12;
    }

    public static Runnable a(GPUPreprocessor gPUPreprocessor, Bitmap bitmap, float f10, float f11, float f12) {
        return new e(gPUPreprocessor, bitmap, f10, f11, f12);
    }

    @Override // java.lang.Runnable
    public final void run() {
        GPUPreprocessor.lambda$setWatermark$0(this.f103774a, this.f103775b, this.f103776c, this.f103777d, this.f103778e);
    }
}
