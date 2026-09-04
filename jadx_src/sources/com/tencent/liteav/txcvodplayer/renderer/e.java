package com.tencent.liteav.txcvodplayer.renderer;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f100200a;

    private e(d dVar) {
        this.f100200a = dVar;
    }

    public static Runnable a(d dVar) {
        return new e(dVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        d.b(this.f100200a);
    }
}
