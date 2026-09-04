package com.tencent.liteav.videoconsumer.renderer;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class w implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f100662a;

    private w(u uVar) {
        this.f100662a = uVar;
    }

    public static Runnable a(u uVar) {
        return new w(uVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        u.c(this.f100662a);
    }
}
