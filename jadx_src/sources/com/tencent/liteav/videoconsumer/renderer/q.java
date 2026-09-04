package com.tencent.liteav.videoconsumer.renderer;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class q implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f100627a;

    private q(k kVar) {
        this.f100627a = kVar;
    }

    public static Runnable a(k kVar) {
        return new q(kVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        k.a(this.f100627a);
    }
}
