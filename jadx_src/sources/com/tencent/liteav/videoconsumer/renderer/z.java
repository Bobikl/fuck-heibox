package com.tencent.liteav.videoconsumer.renderer;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class z implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f100672a;

    private z(u uVar) {
        this.f100672a = uVar;
    }

    public static Runnable a(u uVar) {
        return new z(uVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        u.b(this.f100672a);
    }
}
