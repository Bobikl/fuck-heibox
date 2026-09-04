package com.tencent.liteav.txcvodplayer.renderer;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f100205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f100206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f100207c;

    private h(d dVar, int i10, int i11) {
        this.f100205a = dVar;
        this.f100206b = i10;
        this.f100207c = i11;
    }

    public static Runnable a(d dVar, int i10, int i11) {
        return new h(dVar, i10, i11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        d.a(this.f100205a, this.f100206b, this.f100207c);
    }
}
