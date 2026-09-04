package com.tencent.ugc.decoder;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class s implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCVideoDecodeController f103499a;

    private s(UGCVideoDecodeController uGCVideoDecodeController) {
        this.f103499a = uGCVideoDecodeController;
    }

    public static Runnable a(UGCVideoDecodeController uGCVideoDecodeController) {
        return new s(uGCVideoDecodeController);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103499a.notifyAbandonDecodingFramesCompleted();
    }
}
