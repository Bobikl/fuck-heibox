package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ap implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoEditer f103299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f103300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f103301c;

    private ap(TXVideoEditer tXVideoEditer, long j10, long j11) {
        this.f103299a = tXVideoEditer;
        this.f103300b = j10;
        this.f103301c = j11;
    }

    public static Runnable a(TXVideoEditer tXVideoEditer, long j10, long j11) {
        return new ap(tXVideoEditer, j10, j11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$startPlayFromTime$44(this.f103299a, this.f103300b, this.f103301c);
    }
}
