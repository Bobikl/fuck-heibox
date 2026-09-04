package com.tencent.ugc.videobase.utils;

import android.graphics.SurfaceTexture;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SurfaceTextureHolder f103908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SurfaceTexture f103909b;

    private a(SurfaceTextureHolder surfaceTextureHolder, SurfaceTexture surfaceTexture) {
        this.f103908a = surfaceTextureHolder;
        this.f103909b = surfaceTexture;
    }

    public static Runnable a(SurfaceTextureHolder surfaceTextureHolder, SurfaceTexture surfaceTexture) {
        return new a(surfaceTextureHolder, surfaceTexture);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTextureHolder.lambda$onFrameAvailable$0(this.f103908a, this.f103909b);
    }
}
