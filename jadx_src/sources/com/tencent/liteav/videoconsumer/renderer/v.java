package com.tencent.liteav.videoconsumer.renderer;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class v implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f100660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t f100661b = null;

    private v(u uVar) {
        this.f100660a = uVar;
    }

    public static Runnable a(u uVar) {
        return new v(uVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        u.a(this.f100660a, this.f100661b);
    }
}
