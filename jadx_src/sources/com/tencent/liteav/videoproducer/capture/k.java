package com.tencent.liteav.videoproducer.capture;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final VirtualDisplayManager f100780a;

    private k(VirtualDisplayManager virtualDisplayManager) {
        this.f100780a = virtualDisplayManager;
    }

    public static Runnable a(VirtualDisplayManager virtualDisplayManager) {
        return new k(virtualDisplayManager);
    }

    @Override // java.lang.Runnable
    public final void run() {
        VirtualDisplayManager.d(this.f100780a);
    }
}
