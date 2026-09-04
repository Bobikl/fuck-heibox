package com.tencent.ugc.renderer;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class aa implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final VideoRenderer f103799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.tencent.liteav.base.util.l f103800b;

    private aa(VideoRenderer videoRenderer, com.tencent.liteav.base.util.l lVar) {
        this.f103799a = videoRenderer;
        this.f103800b = lVar;
    }

    public static Runnable a(VideoRenderer videoRenderer, com.tencent.liteav.base.util.l lVar) {
        return new aa(videoRenderer, lVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoRenderer.lambda$setRenderRotation$6(this.f103799a, this.f103800b);
    }
}
