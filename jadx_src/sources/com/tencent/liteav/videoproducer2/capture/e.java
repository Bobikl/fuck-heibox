package com.tencent.liteav.videoproducer2.capture;

import android.graphics.SurfaceTexture;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final NativeScreenCaptureListener f100873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SurfaceTexture f100874b;

    private e(NativeScreenCaptureListener nativeScreenCaptureListener, SurfaceTexture surfaceTexture) {
        this.f100873a = nativeScreenCaptureListener;
        this.f100874b = surfaceTexture;
    }

    public static Runnable a(NativeScreenCaptureListener nativeScreenCaptureListener, SurfaceTexture surfaceTexture) {
        return new e(nativeScreenCaptureListener, surfaceTexture);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f100873a.notifyFrameAvailable(this.f100874b);
    }
}
