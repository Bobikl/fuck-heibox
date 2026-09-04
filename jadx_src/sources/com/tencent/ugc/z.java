package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class z implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoEditer f103964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f103965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f103966c;

    private z(TXVideoEditer tXVideoEditer, int i10, long j10) {
        this.f103964a = tXVideoEditer;
        this.f103965b = i10;
        this.f103966c = j10;
    }

    public static Runnable a(TXVideoEditer tXVideoEditer, int i10, long j10) {
        return new z(tXVideoEditer, i10, j10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$stopEffect$28(this.f103964a, this.f103965b, this.f103966c);
    }
}
