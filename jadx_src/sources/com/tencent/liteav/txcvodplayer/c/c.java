package com.tencent.liteav.txcvodplayer.c;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f100137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f100138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f100139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.tencent.liteav.txcvodplayer.b.c.b f100140d;

    private c(a aVar, int i10, String str, com.tencent.liteav.txcvodplayer.b.c.b bVar) {
        this.f100137a = aVar;
        this.f100138b = i10;
        this.f100139c = str;
        this.f100140d = bVar;
    }

    public static Runnable a(a aVar, int i10, String str, com.tencent.liteav.txcvodplayer.b.c.b bVar) {
        return new c(aVar, i10, str, bVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        a.a(this.f100137a, this.f100138b, this.f100139c, this.f100140d);
    }
}
