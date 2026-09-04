package com.tencent.liteav.base.util;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class q implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m.a f99730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Runnable f99731b;

    private q(m.a aVar, Runnable runnable) {
        this.f99730a = aVar;
        this.f99731b = runnable;
    }

    public static Runnable a(m.a aVar, Runnable runnable) {
        return new q(aVar, runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        m.a aVar = this.f99730a;
        this.f99731b.run();
        synchronized (m.this) {
            m.this.f99719c.remove(aVar);
        }
    }
}
