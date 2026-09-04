package com.tencent.liteav.txcvodplayer.renderer;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f100212a;

    private k(d dVar) {
        this.f100212a = dVar;
    }

    public static Runnable a(d dVar) {
        return new k(dVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        d.a(this.f100212a);
    }
}
