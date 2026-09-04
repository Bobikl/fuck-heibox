package com.tencent.ugc.encoder;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCVideoEncodeController f103573a;

    private d(UGCVideoEncodeController uGCVideoEncodeController) {
        this.f103573a = uGCVideoEncodeController;
    }

    public static Runnable a(UGCVideoEncodeController uGCVideoEncodeController) {
        return new d(uGCVideoEncodeController);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103573a.encodeFrameInternal();
    }
}
