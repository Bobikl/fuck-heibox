package com.tencent.liteav.videoconsumer.renderer;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class r implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k.AnonymousClass1 f100628a;

    private r(k.AnonymousClass1 anonymousClass1) {
        this.f100628a = anonymousClass1;
    }

    public static Runnable a(k.AnonymousClass1 anonymousClass1) {
        return new r(anonymousClass1);
    }

    @Override // java.lang.Runnable
    public final void run() {
        k.n(k.this);
    }
}
