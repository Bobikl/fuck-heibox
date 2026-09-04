package com.tencent.liteav.videoproducer2.capture;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final NativeCameraCaptureListener f100865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f100866b;

    private a(NativeCameraCaptureListener nativeCameraCaptureListener, int i10) {
        this.f100865a = nativeCameraCaptureListener;
        this.f100866b = i10;
    }

    public static Runnable a(NativeCameraCaptureListener nativeCameraCaptureListener, int i10) {
        return new a(nativeCameraCaptureListener, i10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        NativeCameraCaptureListener nativeCameraCaptureListener = this.f100865a;
        nativeCameraCaptureListener.runInNative(d.a(nativeCameraCaptureListener, this.f100866b));
    }
}
