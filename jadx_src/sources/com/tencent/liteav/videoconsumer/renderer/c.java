package com.tencent.liteav.videoconsumer.renderer;

import android.view.Surface;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f100581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Surface f100582b;

    private c(b bVar, Surface surface) {
        this.f100581a = bVar;
        this.f100582b = surface;
    }

    public static Runnable a(b bVar, Surface surface) {
        return new c(bVar, surface);
    }

    @Override // java.lang.Runnable
    public final void run() {
        b.a(this.f100581a, this.f100582b);
    }
}
