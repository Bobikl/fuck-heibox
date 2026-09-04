package com.tencent.ugc.renderer;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class t implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final VideoRenderer f103837a;

    private t(VideoRenderer videoRenderer) {
        this.f103837a = videoRenderer;
    }

    public static Runnable a(VideoRenderer videoRenderer) {
        return new t(videoRenderer);
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoRenderer.lambda$onSurfaceDestroy$15(this.f103837a);
    }
}
