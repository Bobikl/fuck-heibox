package com.tencent.liteav.base.util;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class r implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m.a f99732a;

    private r(m.a aVar) {
        this.f99732a = aVar;
    }

    public static Runnable a(m.a aVar) {
        return new r(aVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        m.a aVar = this.f99732a;
        m.this.f99717a.execute(aVar.f99721b);
    }
}
