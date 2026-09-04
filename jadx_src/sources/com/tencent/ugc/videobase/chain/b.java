package com.tencent.ugc.videobase.chain;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXCGPUImageFilter f103870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f103871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float[] f103872c;

    private b(TXCGPUImageFilter tXCGPUImageFilter, int i10, float[] fArr) {
        this.f103870a = tXCGPUImageFilter;
        this.f103871b = i10;
        this.f103872c = fArr;
    }

    public static Runnable a(TXCGPUImageFilter tXCGPUImageFilter, int i10, float[] fArr) {
        return new b(tXCGPUImageFilter, i10, fArr);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXCGPUImageFilter.lambda$setFloatVec3OnDraw$1(this.f103870a, this.f103871b, this.f103872c);
    }
}
