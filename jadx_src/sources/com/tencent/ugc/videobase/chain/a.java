package com.tencent.ugc.videobase.chain;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXCGPUImageFilter f103867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f103868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f103869c;

    private a(TXCGPUImageFilter tXCGPUImageFilter, int i10, float f10) {
        this.f103867a = tXCGPUImageFilter;
        this.f103868b = i10;
        this.f103869c = f10;
    }

    public static Runnable a(TXCGPUImageFilter tXCGPUImageFilter, int i10, float f10) {
        return new a(tXCGPUImageFilter, i10, f10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXCGPUImageFilter.lambda$setFloatOnDraw$0(this.f103867a, this.f103868b, this.f103869c);
    }
}
