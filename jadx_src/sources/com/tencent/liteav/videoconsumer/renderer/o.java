package com.tencent.liteav.videoconsumer.renderer;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f100625a;

    private o(k kVar) {
        this.f100625a = kVar;
    }

    public static Runnable a(k kVar) {
        return new o(kVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        k.c(this.f100625a);
    }
}
