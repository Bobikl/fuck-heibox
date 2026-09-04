package com.tencent.ugc.videobase.chain;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXCGPUImageFilter f103873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f103874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float[] f103875c;

    private c(TXCGPUImageFilter tXCGPUImageFilter, int i10, float[] fArr) {
        this.f103873a = tXCGPUImageFilter;
        this.f103874b = i10;
        this.f103875c = fArr;
    }

    public static Runnable a(TXCGPUImageFilter tXCGPUImageFilter, int i10, float[] fArr) {
        return new c(tXCGPUImageFilter, i10, fArr);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXCGPUImageFilter.lambda$setFloatVec2OnDraw$2(this.f103873a, this.f103874b, this.f103875c);
    }
}
