package com.tencent.liteav.videoconsumer.renderer;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f100601a;

    private j(f fVar) {
        this.f100601a = fVar;
    }

    public static Runnable a(f fVar) {
        return new j(fVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f100601a.b();
    }
}
