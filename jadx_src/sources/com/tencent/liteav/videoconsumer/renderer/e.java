package com.tencent.liteav.videoconsumer.renderer;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f100584a;

    private e(b bVar) {
        this.f100584a = bVar;
    }

    public static Runnable a(b bVar) {
        return new e(bVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        b.a(this.f100584a);
    }
}
