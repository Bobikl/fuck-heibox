package com.tencent.liteav.videoconsumer.renderer;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class aa implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f100561a;

    private aa(u uVar) {
        this.f100561a = uVar;
    }

    public static Runnable a(u uVar) {
        return new aa(uVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        u.a(this.f100561a);
    }
}
