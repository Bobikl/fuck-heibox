package com.tencent.liteav.audio2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f99545a;

    private f(e eVar) {
        this.f99545a = eVar;
    }

    public static Runnable a(e eVar) {
        return new f(eVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        e.a(this.f99545a);
    }
}
