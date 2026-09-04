package com.tencent.liteav.trtc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TrtcCloudJni f99894a;

    private c(TrtcCloudJni trtcCloudJni) {
        this.f99894a = trtcCloudJni;
    }

    public static Runnable a(TrtcCloudJni trtcCloudJni) {
        return new c(trtcCloudJni);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f99894a.hideFloatingWindow();
    }
}
