package com.tencent.liteav.videoconsumer.renderer;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ac implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f100568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f100569b;

    private ac(u uVar, boolean z10) {
        this.f100568a = uVar;
        this.f100569b = z10;
    }

    public static Runnable a(u uVar, boolean z10) {
        return new ac(uVar, z10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        u.a(this.f100568a, this.f100569b);
    }
}
