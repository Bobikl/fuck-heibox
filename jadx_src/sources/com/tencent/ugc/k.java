package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoEditer f103736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f103737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f103738c;

    private k(TXVideoEditer tXVideoEditer, long j10, long j11) {
        this.f103736a = tXVideoEditer;
        this.f103737b = j10;
        this.f103738c = j11;
    }

    public static Runnable a(TXVideoEditer tXVideoEditer, long j10, long j11) {
        return new k(tXVideoEditer, j10, j11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$setBGMFadeInOutDuration$15(this.f103736a, this.f103737b, this.f103738c);
    }
}
