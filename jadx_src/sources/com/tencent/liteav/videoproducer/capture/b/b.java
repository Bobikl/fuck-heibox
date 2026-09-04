package com.tencent.liteav.videoproducer.capture.b;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f100758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f100759b;

    private b(a aVar, int i10) {
        this.f100758a = aVar;
        this.f100759b = i10;
    }

    public static Runnable a(a aVar, int i10) {
        return new b(aVar, i10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        a.a(this.f100758a, this.f100759b);
    }
}
