package com.tencent.ugc.renderer;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class v implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final VideoRenderer f103844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f103845b;

    private v(VideoRenderer videoRenderer, boolean z10) {
        this.f103844a = videoRenderer;
        this.f103845b = z10;
    }

    public static Runnable a(VideoRenderer videoRenderer, boolean z10) {
        return new v(videoRenderer, z10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoRenderer.lambda$stop$1(this.f103844a, this.f103845b);
    }
}
