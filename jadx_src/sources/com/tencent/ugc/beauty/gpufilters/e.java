package com.tencent.ugc.beauty.gpufilters;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXCGPULookupFilterGroup f103351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f103352b;

    private e(TXCGPULookupFilterGroup tXCGPULookupFilterGroup, float f10) {
        this.f103351a = tXCGPULookupFilterGroup;
        this.f103352b = f10;
    }

    public static Runnable a(TXCGPULookupFilterGroup tXCGPULookupFilterGroup, float f10) {
        return new e(tXCGPULookupFilterGroup, f10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXCGPULookupFilterGroup.lambda$setIntensity$1(this.f103351a, this.f103352b);
    }
}
