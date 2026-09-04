package com.tencent.ugc.encoder;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCVideoEncodeController f103572a;

    private c(UGCVideoEncodeController uGCVideoEncodeController) {
        this.f103572a = uGCVideoEncodeController;
    }

    public static Runnable a(UGCVideoEncodeController uGCVideoEncodeController) {
        return new c(uGCVideoEncodeController);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103572a.encodeFrameInternal();
    }
}
