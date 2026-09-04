package com.tencent.ugc.renderer;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SurfaceRenderHelper f103805a;

    private b(SurfaceRenderHelper surfaceRenderHelper) {
        this.f103805a = surfaceRenderHelper;
    }

    public static Runnable a(SurfaceRenderHelper surfaceRenderHelper) {
        return new b(surfaceRenderHelper);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceRenderHelper.lambda$release$1(this.f103805a);
    }
}
