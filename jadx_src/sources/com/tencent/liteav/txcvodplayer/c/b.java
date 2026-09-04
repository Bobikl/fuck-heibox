package com.tencent.liteav.txcvodplayer.c;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f100132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f100133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f100134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f100135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.tencent.liteav.txcvodplayer.b.c.b f100136e;

    private b(a aVar, int i10, String str, String str2, com.tencent.liteav.txcvodplayer.b.c.b bVar) {
        this.f100132a = aVar;
        this.f100133b = i10;
        this.f100134c = str;
        this.f100135d = str2;
        this.f100136e = bVar;
    }

    public static Runnable a(a aVar, int i10, String str, String str2, com.tencent.liteav.txcvodplayer.b.c.b bVar) {
        return new b(aVar, i10, str, str2, bVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        a.a(this.f100132a, this.f100133b, this.f100134c, this.f100135d, this.f100136e);
    }
}
