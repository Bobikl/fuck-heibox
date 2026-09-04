package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class bl implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoEditer f103367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f103368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f103369c;

    private bl(TXVideoEditer tXVideoEditer, int i10, long j10) {
        this.f103367a = tXVideoEditer;
        this.f103368b = i10;
        this.f103369c = j10;
    }

    public static Runnable a(TXVideoEditer tXVideoEditer, int i10, long j10) {
        return new bl(tXVideoEditer, i10, j10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$handleWriteMP4Completed$64(this.f103367a, this.f103368b, this.f103369c);
    }
}
