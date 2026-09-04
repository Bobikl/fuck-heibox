package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class gp implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCVideoProcessor f103661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.tencent.liteav.base.util.l f103662b;

    private gp(UGCVideoProcessor uGCVideoProcessor, com.tencent.liteav.base.util.l lVar) {
        this.f103661a = uGCVideoProcessor;
        this.f103662b = lVar;
    }

    public static Runnable a(UGCVideoProcessor uGCVideoProcessor, com.tencent.liteav.base.util.l lVar) {
        return new gp(uGCVideoProcessor, lVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103661a.mRotation = this.f103662b;
    }
}
