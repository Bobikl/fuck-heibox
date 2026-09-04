package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class u implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoEditer f103860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f103861b;

    private u(TXVideoEditer tXVideoEditer, boolean z10) {
        this.f103860a = tXVideoEditer;
        this.f103861b = z10;
    }

    public static Runnable a(TXVideoEditer tXVideoEditer, boolean z10) {
        return new u(tXVideoEditer, z10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$setReverse$24(this.f103860a, this.f103861b);
    }
}
