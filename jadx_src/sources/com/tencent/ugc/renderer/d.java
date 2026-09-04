package com.tencent.ugc.renderer;

import android.view.SurfaceView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SurfaceViewRenderHelper f103807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SurfaceView f103808b;

    private d(SurfaceViewRenderHelper surfaceViewRenderHelper, SurfaceView surfaceView) {
        this.f103807a = surfaceViewRenderHelper;
        this.f103808b = surfaceView;
    }

    public static Runnable a(SurfaceViewRenderHelper surfaceViewRenderHelper, SurfaceView surfaceView) {
        return new d(surfaceViewRenderHelper, surfaceView);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceViewRenderHelper.lambda$new$0(this.f103807a, this.f103808b);
    }
}
