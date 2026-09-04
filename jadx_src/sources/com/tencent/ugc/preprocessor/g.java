package com.tencent.ugc.preprocessor;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final GPUPreprocessor f103781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f103782b;

    private g(GPUPreprocessor gPUPreprocessor, float f10) {
        this.f103781a = gPUPreprocessor;
        this.f103782b = f10;
    }

    public static Runnable a(GPUPreprocessor gPUPreprocessor, float f10) {
        return new g(gPUPreprocessor, f10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        GPUPreprocessor.lambda$setFilterMixLevel$2(this.f103781a, this.f103782b);
    }
}
