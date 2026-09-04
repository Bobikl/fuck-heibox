package com.tencent.ugc.decoder;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCVideoDecodeController f103489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final UGCVideoDecodeControllerListener f103490b;

    private l(UGCVideoDecodeController uGCVideoDecodeController, UGCVideoDecodeControllerListener uGCVideoDecodeControllerListener) {
        this.f103489a = uGCVideoDecodeController;
        this.f103490b = uGCVideoDecodeControllerListener;
    }

    public static Runnable a(UGCVideoDecodeController uGCVideoDecodeController, UGCVideoDecodeControllerListener uGCVideoDecodeControllerListener) {
        return new l(uGCVideoDecodeController, uGCVideoDecodeControllerListener);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103489a.mListener = this.f103490b;
    }
}
