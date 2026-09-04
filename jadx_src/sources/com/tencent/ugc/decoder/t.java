package com.tencent.ugc.decoder;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class t implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCVideoDecodeController f103500a;

    private t(UGCVideoDecodeController uGCVideoDecodeController) {
        this.f103500a = uGCVideoDecodeController;
    }

    public static Runnable a(UGCVideoDecodeController uGCVideoDecodeController) {
        return new t(uGCVideoDecodeController);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103500a.notifyDecodeCompleted();
    }
}
