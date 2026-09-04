package com.tencent.liteav.videobase.egl;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EGLCore f100351a;

    private c(EGLCore eGLCore) {
        this.f100351a = eGLCore;
    }

    public static Runnable a(EGLCore eGLCore) {
        return new c(eGLCore);
    }

    @Override // java.lang.Runnable
    public final void run() {
        EGLCore.lambda$destroy$0(this.f100351a);
    }
}
