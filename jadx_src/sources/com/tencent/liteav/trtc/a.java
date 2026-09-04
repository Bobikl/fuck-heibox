package com.tencent.liteav.trtc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TrtcCloudJni f99891a;

    private a(TrtcCloudJni trtcCloudJni) {
        this.f99891a = trtcCloudJni;
    }

    public static Runnable a(TrtcCloudJni trtcCloudJni) {
        return new a(trtcCloudJni);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TrtcCloudJni.lambda$enterRoom$0(this.f99891a);
    }
}
