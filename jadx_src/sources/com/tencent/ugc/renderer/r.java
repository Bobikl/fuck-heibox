package com.tencent.ugc.renderer;

import android.view.Surface;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class r implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final VideoRenderer f103833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Surface f103834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f103835c;

    private r(VideoRenderer videoRenderer, Surface surface, boolean z10) {
        this.f103833a = videoRenderer;
        this.f103834b = surface;
        this.f103835c = z10;
    }

    public static Runnable a(VideoRenderer videoRenderer, Surface surface, boolean z10) {
        return new r(videoRenderer, surface, z10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoRenderer.lambda$onSurfaceChanged$13(this.f103833a, this.f103834b, this.f103835c);
    }
}
