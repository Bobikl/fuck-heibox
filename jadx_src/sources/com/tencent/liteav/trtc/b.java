package com.tencent.liteav.trtc;

import com.tencent.trtc.TRTCCloudDef;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TrtcCloudJni f99892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TRTCCloudDef.TRTCScreenShareParams f99893b;

    private b(TrtcCloudJni trtcCloudJni, TRTCCloudDef.TRTCScreenShareParams tRTCScreenShareParams) {
        this.f99892a = trtcCloudJni;
        this.f99893b = tRTCScreenShareParams;
    }

    public static Runnable a(TrtcCloudJni trtcCloudJni, TRTCCloudDef.TRTCScreenShareParams tRTCScreenShareParams) {
        return new b(trtcCloudJni, tRTCScreenShareParams);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f99892a.showFloatingWindow(this.f99893b.floatingView);
    }
}
