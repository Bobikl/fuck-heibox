package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class go implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCVideoProcessor f103660a;

    private go(UGCVideoProcessor uGCVideoProcessor) {
        this.f103660a = uGCVideoProcessor;
    }

    public static Runnable a(UGCVideoProcessor uGCVideoProcessor) {
        return new go(uGCVideoProcessor);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103660a.onCompleteBroadcast();
    }
}
