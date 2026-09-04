package com.tencent.liteav.videoproducer.capture;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final VirtualDisplayManager f100768a;

    private f(VirtualDisplayManager virtualDisplayManager) {
        this.f100768a = virtualDisplayManager;
    }

    public static Runnable a(VirtualDisplayManager virtualDisplayManager) {
        return new f(virtualDisplayManager);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f100768a.a(false);
    }
}
