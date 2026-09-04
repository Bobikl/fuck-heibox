package com.tencent.ugc.renderer;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SurfaceViewRenderHelper f103810a;

    private f(SurfaceViewRenderHelper surfaceViewRenderHelper) {
        this.f103810a = surfaceViewRenderHelper;
    }

    public static Runnable a(SurfaceViewRenderHelper surfaceViewRenderHelper) {
        return new f(surfaceViewRenderHelper);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceViewRenderHelper.lambda$checkViewAvailability$2(this.f103810a);
    }
}
