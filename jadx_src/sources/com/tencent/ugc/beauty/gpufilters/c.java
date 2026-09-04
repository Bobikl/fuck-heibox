package com.tencent.ugc.beauty.gpufilters;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXCGPUGreenScreenFilter.AnonymousClass1 f103344a;

    private c(TXCGPUGreenScreenFilter.AnonymousClass1 anonymousClass1) {
        this.f103344a = anonymousClass1;
    }

    public static Runnable a(TXCGPUGreenScreenFilter.AnonymousClass1 anonymousClass1) {
        return new c(anonymousClass1);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXCGPUGreenScreenFilter.AnonymousClass1.a(this.f103344a);
    }
}
