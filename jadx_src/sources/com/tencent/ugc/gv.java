package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class gv implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCVideoProcessor f103674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f103675b;

    private gv(UGCVideoProcessor uGCVideoProcessor, float f10) {
        this.f103674a = uGCVideoProcessor;
        this.f103675b = f10;
    }

    public static Runnable a(UGCVideoProcessor uGCVideoProcessor, float f10) {
        return new gv(uGCVideoProcessor, f10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103674a.mVideoProcessManager.setSpecialRatio(this.f103675b);
    }
}
