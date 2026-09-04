package com.tencent.liteav.videoproducer2.capture;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final NativeScreenCaptureListener f100875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f100876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f100877c;

    private f(NativeScreenCaptureListener nativeScreenCaptureListener, boolean z10, boolean z11) {
        this.f100875a = nativeScreenCaptureListener;
        this.f100876b = z10;
        this.f100877c = z11;
    }

    public static Runnable a(NativeScreenCaptureListener nativeScreenCaptureListener, boolean z10, boolean z11) {
        return new f(nativeScreenCaptureListener, z10, z11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f100875a.notifyStartFinish(this.f100876b, this.f100877c);
    }
}
