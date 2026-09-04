package com.tencent.liteav.videoproducer2.capture;

import android.graphics.SurfaceTexture;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final NativeCameraCaptureListener f100867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SurfaceTexture f100868b;

    private b(NativeCameraCaptureListener nativeCameraCaptureListener, SurfaceTexture surfaceTexture) {
        this.f100867a = nativeCameraCaptureListener;
        this.f100868b = surfaceTexture;
    }

    public static Runnable a(NativeCameraCaptureListener nativeCameraCaptureListener, SurfaceTexture surfaceTexture) {
        return new b(nativeCameraCaptureListener, surfaceTexture);
    }

    @Override // java.lang.Runnable
    public final void run() {
        NativeCameraCaptureListener nativeCameraCaptureListener = this.f100867a;
        nativeCameraCaptureListener.runInNative(c.a(nativeCameraCaptureListener, this.f100868b));
    }
}
