package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class aw implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoEditer f103310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f103311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f103312c;

    private aw(TXVideoEditer tXVideoEditer, long j10, long j11) {
        this.f103310a = tXVideoEditer;
        this.f103311b = j10;
        this.f103312c = j11;
    }

    public static Runnable a(TXVideoEditer tXVideoEditer, long j10, long j11) {
        return new aw(tXVideoEditer, j10, j11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$setCutFromTime$50(this.f103310a, this.f103311b, this.f103312c);
    }
}
