package com.tencent.ugc.renderer;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SurfaceViewRenderHelper f103811a;

    private g(SurfaceViewRenderHelper surfaceViewRenderHelper) {
        this.f103811a = surfaceViewRenderHelper;
    }

    public static Runnable a(SurfaceViewRenderHelper surfaceViewRenderHelper) {
        return new g(surfaceViewRenderHelper);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103811a.updateViewLayoutForHDR();
    }
}
