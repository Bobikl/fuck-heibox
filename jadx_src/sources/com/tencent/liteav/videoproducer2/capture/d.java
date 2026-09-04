package com.tencent.liteav.videoproducer2.capture;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final NativeCameraCaptureListener f100871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f100872b;

    private d(NativeCameraCaptureListener nativeCameraCaptureListener, int i10) {
        this.f100871a = nativeCameraCaptureListener;
        this.f100872b = i10;
    }

    public static Runnable a(NativeCameraCaptureListener nativeCameraCaptureListener, int i10) {
        return new d(nativeCameraCaptureListener, i10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        NativeCameraCaptureListener.nativeOnCameraError(this.f100871a.mNativeHandle, this.f100872b);
    }
}
