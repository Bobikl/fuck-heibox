package com.tencent.liteav.videoconsumer.renderer;

import android.view.Surface;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class y implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f100669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Surface f100670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f100671c;

    private y(u uVar, Surface surface, boolean z10) {
        this.f100669a = uVar;
        this.f100670b = surface;
        this.f100671c = z10;
    }

    public static Runnable a(u uVar, Surface surface, boolean z10) {
        return new y(uVar, surface, z10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        u.a(this.f100669a, this.f100670b, this.f100671c);
    }
}
