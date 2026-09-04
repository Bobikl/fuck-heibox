package com.tencent.liteav.videoconsumer.renderer;

import com.tencent.liteav.videobase.base.GLConstants;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ae implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f100573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final GLConstants.GLScaleType f100574b;

    private ae(u uVar, GLConstants.GLScaleType gLScaleType) {
        this.f100573a = uVar;
        this.f100574b = gLScaleType;
    }

    public static Runnable a(u uVar, GLConstants.GLScaleType gLScaleType) {
        return new ae(uVar, gLScaleType);
    }

    @Override // java.lang.Runnable
    public final void run() {
        u.a(this.f100573a, this.f100574b);
    }
}
