package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoEditer f103731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f103732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f103733c;

    private i(TXVideoEditer tXVideoEditer, long j10, long j11) {
        this.f103731a = tXVideoEditer;
        this.f103732b = j10;
        this.f103733c = j11;
    }

    public static Runnable a(TXVideoEditer tXVideoEditer, long j10, long j11) {
        return new i(tXVideoEditer, j10, j11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$setBGMStartTime$13(this.f103731a, this.f103732b, this.f103733c);
    }
}
