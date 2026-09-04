package com.tencent.liteav.videoproducer.capture;

import android.media.projection.MediaProjection;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final VirtualDisplayManager f100778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MediaProjection f100779b;

    private j(VirtualDisplayManager virtualDisplayManager, MediaProjection mediaProjection) {
        this.f100778a = virtualDisplayManager;
        this.f100779b = mediaProjection;
    }

    public static Runnable a(VirtualDisplayManager virtualDisplayManager, MediaProjection mediaProjection) {
        return new j(virtualDisplayManager, mediaProjection);
    }

    @Override // java.lang.Runnable
    public final void run() {
        VirtualDisplayManager.a(this.f100778a, this.f100779b);
    }
}
