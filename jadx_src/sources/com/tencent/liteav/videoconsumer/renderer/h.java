package com.tencent.liteav.videoconsumer.renderer;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f100599a;

    private h(f fVar) {
        this.f100599a = fVar;
    }

    public static Runnable a(f fVar) {
        return new h(fVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        f.c(this.f100599a);
    }
}
