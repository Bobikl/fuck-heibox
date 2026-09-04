package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class al implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoEditer f103289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f103290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f103291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f103292d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final TXVideoEditer.TXVideoProcessListener f103293e;

    private al(TXVideoEditer tXVideoEditer, int i10, long j10, int i11, TXVideoEditer.TXVideoProcessListener tXVideoProcessListener) {
        this.f103289a = tXVideoEditer;
        this.f103290b = i10;
        this.f103291c = j10;
        this.f103292d = i11;
        this.f103293e = tXVideoProcessListener;
    }

    public static Runnable a(TXVideoEditer tXVideoEditer, int i10, long j10, int i11, TXVideoEditer.TXVideoProcessListener tXVideoProcessListener) {
        return new al(tXVideoEditer, i10, j10, i11, tXVideoProcessListener);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer tXVideoEditer = this.f103289a;
        int i10 = this.f103290b;
        this.f103293e.onProcessProgress(i10 == 0 ? tXVideoEditer.calculateProgress(this.f103291c) : (this.f103292d * 1.0f) / i10);
    }
}
