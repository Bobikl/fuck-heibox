package com.tencent.ugc.renderer;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class s implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final VideoRenderer f103836a;

    private s(VideoRenderer videoRenderer) {
        this.f103836a = videoRenderer;
    }

    public static Runnable a(VideoRenderer videoRenderer) {
        return new s(videoRenderer);
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoRenderer.lambda$onRequestRedraw$14(this.f103836a);
    }
}
