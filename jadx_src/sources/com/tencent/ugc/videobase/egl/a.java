package com.tencent.ugc.videobase.egl;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EGLCore f103882a;

    private a(EGLCore eGLCore) {
        this.f103882a = eGLCore;
    }

    public static Runnable a(EGLCore eGLCore) {
        return new a(eGLCore);
    }

    @Override // java.lang.Runnable
    public final void run() {
        EGLCore.lambda$destroy$0(this.f103882a);
    }
}
