package com.tencent.ugc.encoder;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCVideoEncodeController f103576a;

    private g(UGCVideoEncodeController uGCVideoEncodeController) {
        this.f103576a = uGCVideoEncodeController;
    }

    public static Runnable a(UGCVideoEncodeController uGCVideoEncodeController) {
        return new g(uGCVideoEncodeController);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103576a.encodeFrameInternal();
    }
}
