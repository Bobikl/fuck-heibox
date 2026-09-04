package com.tencent.ugc.renderer;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class p implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final VideoRenderer f103825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f103826b;

    private p(VideoRenderer videoRenderer, boolean z10) {
        this.f103825a = videoRenderer;
        this.f103826b = z10;
    }

    public static Runnable a(VideoRenderer videoRenderer, boolean z10) {
        return new p(videoRenderer, z10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103825a.mIsHDR = this.f103826b;
    }
}
