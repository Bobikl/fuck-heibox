package com.tencent.ugc.encoder;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCVideoEncodeController f103574a;

    private e(UGCVideoEncodeController uGCVideoEncodeController) {
        this.f103574a = uGCVideoEncodeController;
    }

    public static Runnable a(UGCVideoEncodeController uGCVideoEncodeController) {
        return new e(uGCVideoEncodeController);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103574a.encodeFrameInternal();
    }
}
