package com.tencent.ugc.encoder;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCVideoEncodeController f103575a;

    private f(UGCVideoEncodeController uGCVideoEncodeController) {
        this.f103575a = uGCVideoEncodeController;
    }

    public static Runnable a(UGCVideoEncodeController uGCVideoEncodeController) {
        return new f(uGCVideoEncodeController);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103575a.encodeFrameInternal();
    }
}
