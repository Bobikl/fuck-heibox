package com.tencent.liteav.txcvodplayer.renderer;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f100201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f100202b;

    private f(d dVar, boolean z10) {
        this.f100201a = dVar;
        this.f100202b = z10;
    }

    public static Runnable a(d dVar, boolean z10) {
        return new f(dVar, z10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        d.a(this.f100201a, this.f100202b);
    }
}
