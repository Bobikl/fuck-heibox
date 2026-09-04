package com.tencent.ugc.renderer;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ab implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final VideoRenderer f103801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f103802b;

    private ab(VideoRenderer videoRenderer, boolean z10) {
        this.f103801a = videoRenderer;
        this.f103802b = z10;
    }

    public static Runnable a(VideoRenderer videoRenderer, boolean z10) {
        return new ab(videoRenderer, z10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoRenderer.lambda$setHorizontalMirror$7(this.f103801a, this.f103802b);
    }
}
