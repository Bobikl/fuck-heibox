package com.tencent.liteav.videoproducer2.capture;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final NativeScreenCaptureListener f100878a;

    private g(NativeScreenCaptureListener nativeScreenCaptureListener) {
        this.f100878a = nativeScreenCaptureListener;
    }

    public static Runnable a(NativeScreenCaptureListener nativeScreenCaptureListener) {
        return new g(nativeScreenCaptureListener);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f100878a.notifyCaptureError();
    }
}
