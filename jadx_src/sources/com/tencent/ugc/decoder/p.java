package com.tencent.ugc.decoder;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class p implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCVideoDecodeController f103495a;

    private p(UGCVideoDecodeController uGCVideoDecodeController) {
        this.f103495a = uGCVideoDecodeController;
    }

    public static Runnable a(UGCVideoDecodeController uGCVideoDecodeController) {
        return new p(uGCVideoDecodeController);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCVideoDecodeController.lambda$signalEndOfStream$3(this.f103495a);
    }
}
