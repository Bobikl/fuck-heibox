package com.tencent.liteav.txcvodplayer.c;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f100141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f100142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f100143c;

    private d(a aVar, String str, long j10) {
        this.f100141a = aVar;
        this.f100142b = str;
        this.f100143c = j10;
    }

    public static Runnable a(a aVar, String str, long j10) {
        return new d(aVar, str, j10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        a.a(this.f100141a, this.f100142b, this.f100143c);
    }
}
