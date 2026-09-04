package com.tencent.liteav.txcvodplayer.renderer;

import com.tencent.liteav.videobase.base.GLConstants;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f100208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final GLConstants.GLScaleType f100209b;

    private i(d dVar, GLConstants.GLScaleType gLScaleType) {
        this.f100208a = dVar;
        this.f100209b = gLScaleType;
    }

    public static Runnable a(d dVar, GLConstants.GLScaleType gLScaleType) {
        return new i(dVar, gLScaleType);
    }

    @Override // java.lang.Runnable
    public final void run() {
        d.a(this.f100208a, this.f100209b);
    }
}
