package com.tencent.liteav.videoconsumer.renderer;

import com.tencent.liteav.videobase.videobase.DisplayTarget;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ad implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f100570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DisplayTarget f100571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f100572c;

    private ad(u uVar, DisplayTarget displayTarget, boolean z10) {
        this.f100570a = uVar;
        this.f100571b = displayTarget;
        this.f100572c = z10;
    }

    public static Runnable a(u uVar, DisplayTarget displayTarget, boolean z10) {
        return new ad(uVar, displayTarget, z10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f100570a.b(this.f100571b, this.f100572c);
    }
}
