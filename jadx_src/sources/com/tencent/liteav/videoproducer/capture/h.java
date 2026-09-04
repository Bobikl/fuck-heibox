package com.tencent.liteav.videoproducer.capture;

import android.media.projection.MediaProjection;
import android.view.Surface;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final VirtualDisplayManager f100770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Surface f100771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f100772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f100773d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final MediaProjection f100774e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final VirtualDisplayManager.VirtualDisplayListener f100775f;

    private h(VirtualDisplayManager virtualDisplayManager, Surface surface, int i10, int i11, MediaProjection mediaProjection, VirtualDisplayManager.VirtualDisplayListener virtualDisplayListener) {
        this.f100770a = virtualDisplayManager;
        this.f100771b = surface;
        this.f100772c = i10;
        this.f100773d = i11;
        this.f100774e = mediaProjection;
        this.f100775f = virtualDisplayListener;
    }

    public static Runnable a(VirtualDisplayManager virtualDisplayManager, Surface surface, int i10, int i11, MediaProjection mediaProjection, VirtualDisplayManager.VirtualDisplayListener virtualDisplayListener) {
        return new h(virtualDisplayManager, surface, i10, i11, mediaProjection, virtualDisplayListener);
    }

    @Override // java.lang.Runnable
    public final void run() {
        VirtualDisplayManager.a(this.f100770a, this.f100771b, this.f100772c, this.f100773d, this.f100774e, this.f100775f);
    }
}
