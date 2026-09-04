package com.tencent.ugc.renderer;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SurfaceViewRenderHelper f103809a;

    private e(SurfaceViewRenderHelper surfaceViewRenderHelper) {
        this.f103809a = surfaceViewRenderHelper;
    }

    public static Runnable a(SurfaceViewRenderHelper surfaceViewRenderHelper) {
        return new e(surfaceViewRenderHelper);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceViewRenderHelper.lambda$release$1(this.f103809a);
    }
}
