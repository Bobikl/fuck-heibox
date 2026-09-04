package com.tencent.liteav.videobase.utils;

import android.graphics.SurfaceTexture;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SurfaceTextureHolder f100437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SurfaceTexture f100438b;

    private g(SurfaceTextureHolder surfaceTextureHolder, SurfaceTexture surfaceTexture) {
        this.f100437a = surfaceTextureHolder;
        this.f100438b = surfaceTexture;
    }

    public static Runnable a(SurfaceTextureHolder surfaceTextureHolder, SurfaceTexture surfaceTexture) {
        return new g(surfaceTextureHolder, surfaceTexture);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTextureHolder.lambda$onFrameAvailable$0(this.f100437a, this.f100438b);
    }
}
