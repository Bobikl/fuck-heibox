package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoEditer f103637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f103638b;

    private g(TXVideoEditer tXVideoEditer, boolean z10) {
        this.f103637a = tXVideoEditer;
        this.f103638b = z10;
    }

    public static Runnable a(TXVideoEditer tXVideoEditer, boolean z10) {
        return new g(tXVideoEditer, z10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$setBGMLoop$11(this.f103637a, this.f103638b);
    }
}
