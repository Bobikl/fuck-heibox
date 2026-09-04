package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class bo implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoEditer f103374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f103375b;

    private bo(TXVideoEditer tXVideoEditer, int i10) {
        this.f103374a = tXVideoEditer;
        this.f103375b = i10;
    }

    public static Runnable a(TXVideoEditer tXVideoEditer, int i10) {
        return new bo(tXVideoEditer, i10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103374a.handleProcessComplete(this.f103375b);
    }
}
