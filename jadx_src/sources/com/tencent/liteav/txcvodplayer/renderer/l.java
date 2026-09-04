package com.tencent.liteav.txcvodplayer.renderer;

import android.graphics.SurfaceTexture;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f100213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SurfaceTexture f100214b;

    private l(d dVar, SurfaceTexture surfaceTexture) {
        this.f100213a = dVar;
        this.f100214b = surfaceTexture;
    }

    public static Runnable a(d dVar, SurfaceTexture surfaceTexture) {
        return new l(dVar, surfaceTexture);
    }

    @Override // java.lang.Runnable
    public final void run() {
        d.a(this.f100213a, this.f100214b);
    }
}
