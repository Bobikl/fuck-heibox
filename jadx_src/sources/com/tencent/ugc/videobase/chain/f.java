package com.tencent.ugc.videobase.chain;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXCGPUImageFilterChain f103881a;

    private f(TXCGPUImageFilterChain tXCGPUImageFilterChain) {
        this.f103881a = tXCGPUImageFilterChain;
    }

    public static Runnable a(TXCGPUImageFilterChain tXCGPUImageFilterChain) {
        return new f(tXCGPUImageFilterChain);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103881a.initFiltersAndInterceptors();
    }
}
