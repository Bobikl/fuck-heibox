package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class hd implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCVideoProcessor f103694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f103695b;

    private hd(UGCVideoProcessor uGCVideoProcessor, int i10) {
        this.f103694a = uGCVideoProcessor;
        this.f103695b = i10;
    }

    public static Runnable a(UGCVideoProcessor uGCVideoProcessor, int i10) {
        return new hd(uGCVideoProcessor, i10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103694a.mFrameRateFilter = new UGCFrameRateFilter(this.f103695b);
    }
}
