package com.tencent.ugc.renderer;

import android.view.Surface;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SurfaceRenderHelper f103797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Surface f103798b;

    private a(SurfaceRenderHelper surfaceRenderHelper, Surface surface) {
        this.f103797a = surfaceRenderHelper;
        this.f103798b = surface;
    }

    public static Runnable a(SurfaceRenderHelper surfaceRenderHelper, Surface surface) {
        return new a(surfaceRenderHelper, surface);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceRenderHelper.lambda$new$0(this.f103797a, this.f103798b);
    }
}
