package com.tencent.ugc.beauty.gpufilters;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXCGPUGaussianBlurFilter.a f103340a;

    private a(TXCGPUGaussianBlurFilter.a aVar) {
        this.f103340a = aVar;
    }

    public static Runnable a(TXCGPUGaussianBlurFilter.a aVar) {
        return new a(aVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXCGPUGaussianBlurFilter.a.a(this.f103340a);
    }
}
