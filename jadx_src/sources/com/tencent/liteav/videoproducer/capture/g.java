package com.tencent.liteav.videoproducer.capture;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final VirtualDisplayManager f100769a;

    private g(VirtualDisplayManager virtualDisplayManager) {
        this.f100769a = virtualDisplayManager;
    }

    public static Runnable a(VirtualDisplayManager virtualDisplayManager) {
        return new g(virtualDisplayManager);
    }

    @Override // java.lang.Runnable
    public final void run() {
        VirtualDisplayManager.a(this.f100769a);
    }
}
