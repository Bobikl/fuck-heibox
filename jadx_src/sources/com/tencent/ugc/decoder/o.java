package com.tencent.ugc.decoder;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCVideoDecodeController f103494a;

    private o(UGCVideoDecodeController uGCVideoDecodeController) {
        this.f103494a = uGCVideoDecodeController;
    }

    public static Runnable a(UGCVideoDecodeController uGCVideoDecodeController) {
        return new o(uGCVideoDecodeController);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCVideoDecodeController.lambda$abandonDecodingFrames$2(this.f103494a);
    }
}
