package com.tencent.ugc.renderer;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final VideoRenderer f103824a;

    private o(VideoRenderer videoRenderer) {
        this.f103824a = videoRenderer;
    }

    public static Runnable a(VideoRenderer videoRenderer) {
        return new o(videoRenderer);
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoRenderer.lambda$renderFrame$9(this.f103824a);
    }
}
