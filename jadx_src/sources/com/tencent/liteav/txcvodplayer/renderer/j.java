package com.tencent.liteav.txcvodplayer.renderer;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f100210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.tencent.liteav.base.util.l f100211b;

    private j(d dVar, com.tencent.liteav.base.util.l lVar) {
        this.f100210a = dVar;
        this.f100211b = lVar;
    }

    public static Runnable a(d dVar, com.tencent.liteav.base.util.l lVar) {
        return new j(dVar, lVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        d.a(this.f100210a, this.f100211b);
    }
}
