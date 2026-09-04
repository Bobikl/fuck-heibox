package com.tencent.liteav.videoproducer2.capture;

import android.graphics.SurfaceTexture;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final NativeCameraCaptureListener f100869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SurfaceTexture f100870b;

    private c(NativeCameraCaptureListener nativeCameraCaptureListener, SurfaceTexture surfaceTexture) {
        this.f100869a = nativeCameraCaptureListener;
        this.f100870b = surfaceTexture;
    }

    public static Runnable a(NativeCameraCaptureListener nativeCameraCaptureListener, SurfaceTexture surfaceTexture) {
        return new c(nativeCameraCaptureListener, surfaceTexture);
    }

    @Override // java.lang.Runnable
    public final void run() {
        NativeCameraCaptureListener.nativeOnFrameAvailable(this.f100869a.mNativeHandle, this.f100870b);
    }
}
