package com.tencent.liteav.videoconsumer.renderer;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f100600a;

    private i(f fVar) {
        this.f100600a = fVar;
    }

    public static Runnable a(f fVar) {
        return new i(fVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        f.b(this.f100600a);
    }
}
