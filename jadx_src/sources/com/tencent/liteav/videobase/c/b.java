package com.tencent.liteav.videobase.c;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f100291a;

    private b(a aVar) {
        this.f100291a = aVar;
    }

    public static Runnable a(a aVar) {
        return new b(aVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        a.a(this.f100291a);
    }
}
