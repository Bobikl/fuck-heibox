package com.tencent.ugc.renderer;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ac implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final VideoRenderer f103803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f103804b;

    private ac(VideoRenderer videoRenderer, boolean z10) {
        this.f103803a = videoRenderer;
        this.f103804b = z10;
    }

    public static Runnable a(VideoRenderer videoRenderer, boolean z10) {
        return new ac(videoRenderer, z10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoRenderer.lambda$setVerticalMirror$8(this.f103803a, this.f103804b);
    }
}
