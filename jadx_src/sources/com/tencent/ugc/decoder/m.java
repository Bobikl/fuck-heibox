package com.tencent.ugc.decoder;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCVideoDecodeController f103491a;

    private m(UGCVideoDecodeController uGCVideoDecodeController) {
        this.f103491a = uGCVideoDecodeController;
    }

    public static Runnable a(UGCVideoDecodeController uGCVideoDecodeController) {
        return new m(uGCVideoDecodeController);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103491a.stopInternal();
    }
}
