package com.tencent.ugc.renderer;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final VideoRenderer f103822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final VideoRenderListener f103823b;

    private n(VideoRenderer videoRenderer, VideoRenderListener videoRenderListener) {
        this.f103822a = videoRenderer;
        this.f103823b = videoRenderListener;
    }

    public static Runnable a(VideoRenderer videoRenderer, VideoRenderListener videoRenderListener) {
        return new n(videoRenderer, videoRenderListener);
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoRenderer.lambda$start$0(this.f103822a, this.f103823b);
    }
}
