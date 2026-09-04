package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class hc implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCVideoProcessor f103693a;

    private hc(UGCVideoProcessor uGCVideoProcessor) {
        this.f103693a = uGCVideoProcessor;
    }

    public static Runnable a(UGCVideoProcessor uGCVideoProcessor) {
        return new hc(uGCVideoProcessor);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103693a.stopEncoder();
    }
}
