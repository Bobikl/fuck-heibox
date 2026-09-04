package com.tencent.liteav.videoconsumer.renderer;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class p implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f100626a;

    private p(k kVar) {
        this.f100626a = kVar;
    }

    public static Runnable a(k kVar) {
        return new p(kVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        k.b(this.f100626a);
    }
}
