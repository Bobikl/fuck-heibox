package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoEditer f103687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f103688b;

    private h(TXVideoEditer tXVideoEditer, long j10) {
        this.f103687a = tXVideoEditer;
        this.f103688b = j10;
    }

    public static Runnable a(TXVideoEditer tXVideoEditer, long j10) {
        return new h(tXVideoEditer, j10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$setBGMAtVideoTime$12(this.f103687a, this.f103688b);
    }
}
