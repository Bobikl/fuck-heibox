package com.tencent.ugc.renderer;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SurfaceRenderHelper f103806a;

    private c(SurfaceRenderHelper surfaceRenderHelper) {
        this.f103806a = surfaceRenderHelper;
    }

    public static Runnable a(SurfaceRenderHelper surfaceRenderHelper) {
        return new c(surfaceRenderHelper);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceRenderHelper.lambda$checkViewAvailability$2(this.f103806a);
    }
}
