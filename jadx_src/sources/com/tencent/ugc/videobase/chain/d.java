package com.tencent.ugc.videobase.chain;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXCGPUImageFilter f103876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f103877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float[] f103878c;

    private d(TXCGPUImageFilter tXCGPUImageFilter, int i10, float[] fArr) {
        this.f103876a = tXCGPUImageFilter;
        this.f103877b = i10;
        this.f103878c = fArr;
    }

    public static Runnable a(TXCGPUImageFilter tXCGPUImageFilter, int i10, float[] fArr) {
        return new d(tXCGPUImageFilter, i10, fArr);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXCGPUImageFilter.lambda$setFloatVec4OnDraw$3(this.f103876a, this.f103877b, this.f103878c);
    }
}
