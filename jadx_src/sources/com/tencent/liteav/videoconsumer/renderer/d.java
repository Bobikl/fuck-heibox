package com.tencent.liteav.videoconsumer.renderer;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f100583a;

    private d(b bVar) {
        this.f100583a = bVar;
    }

    public static Runnable a(b bVar) {
        return new d(bVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        b.b(this.f100583a);
    }
}
