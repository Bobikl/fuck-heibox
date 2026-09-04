package com.tencent.ugc.decoder;

import com.tencent.ugc.videobase.common.EncodedVideoFrame;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCVideoDecodeController f103492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EncodedVideoFrame f103493b;

    private n(UGCVideoDecodeController uGCVideoDecodeController, EncodedVideoFrame encodedVideoFrame) {
        this.f103492a = uGCVideoDecodeController;
        this.f103493b = encodedVideoFrame;
    }

    public static Runnable a(UGCVideoDecodeController uGCVideoDecodeController, EncodedVideoFrame encodedVideoFrame) {
        return new n(uGCVideoDecodeController, encodedVideoFrame);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCVideoDecodeController.lambda$decode$1(this.f103492a, this.f103493b);
    }
}
