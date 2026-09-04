package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ha implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCVideoProcessor f103689a;

    private ha(UGCVideoProcessor uGCVideoProcessor) {
        this.f103689a = uGCVideoProcessor;
    }

    public static Runnable a(UGCVideoProcessor uGCVideoProcessor) {
        return new ha(uGCVideoProcessor);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCVideoProcessor.lambda$unInitialize$0(this.f103689a);
    }
}
