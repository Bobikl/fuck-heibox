package com.tencent.liteav.videoconsumer.renderer;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class af implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f100575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.tencent.liteav.base.util.l f100576b;

    private af(u uVar, com.tencent.liteav.base.util.l lVar) {
        this.f100575a = uVar;
        this.f100576b = lVar;
    }

    public static Runnable a(u uVar, com.tencent.liteav.base.util.l lVar) {
        return new af(uVar, lVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        u.a(this.f100575a, this.f100576b);
    }
}
