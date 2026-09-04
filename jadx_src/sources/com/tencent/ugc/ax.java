package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ax implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoEditer f103313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f103314b;

    private ax(TXVideoEditer tXVideoEditer, int i10) {
        this.f103313a = tXVideoEditer;
        this.f103314b = i10;
    }

    public static Runnable a(TXVideoEditer tXVideoEditer, int i10) {
        return new ax(tXVideoEditer, i10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$setVideoBitrate$51(this.f103313a, this.f103314b);
    }
}
