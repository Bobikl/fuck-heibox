package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class x implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoEditer f103959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f103960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f103961c;

    private x(TXVideoEditer tXVideoEditer, int i10, long j10) {
        this.f103959a = tXVideoEditer;
        this.f103960b = i10;
        this.f103961c = j10;
    }

    public static Runnable a(TXVideoEditer tXVideoEditer, int i10, long j10) {
        return new x(tXVideoEditer, i10, j10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$startEffect$27(this.f103959a, this.f103960b, this.f103961c);
    }
}
