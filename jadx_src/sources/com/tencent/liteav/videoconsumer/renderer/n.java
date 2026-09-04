package com.tencent.liteav.videoconsumer.renderer;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f100623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f100624b;

    private n(k kVar, boolean z10) {
        this.f100623a = kVar;
        this.f100624b = z10;
    }

    public static Runnable a(k kVar, boolean z10) {
        return new n(kVar, z10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        k.a(this.f100623a, this.f100624b);
    }
}
