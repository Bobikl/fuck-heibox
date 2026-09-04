package com.tencent.liteav.videoconsumer.renderer;

import android.view.SurfaceView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f100597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SurfaceView f100598b;

    private g(f fVar, SurfaceView surfaceView) {
        this.f100597a = fVar;
        this.f100598b = surfaceView;
    }

    public static Runnable a(f fVar, SurfaceView surfaceView) {
        return new g(fVar, surfaceView);
    }

    @Override // java.lang.Runnable
    public final void run() {
        f.a(this.f100597a, this.f100598b);
    }
}
