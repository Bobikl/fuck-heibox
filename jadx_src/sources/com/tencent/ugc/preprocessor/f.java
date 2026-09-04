package com.tencent.ugc.preprocessor;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final GPUPreprocessor f103779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f103780b;

    private f(GPUPreprocessor gPUPreprocessor, float f10) {
        this.f103779a = gPUPreprocessor;
        this.f103780b = f10;
    }

    public static Runnable a(GPUPreprocessor gPUPreprocessor, float f10) {
        return new f(gPUPreprocessor, f10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        GPUPreprocessor.lambda$setGaussianBlurLevel$1(this.f103779a, this.f103780b);
    }
}
