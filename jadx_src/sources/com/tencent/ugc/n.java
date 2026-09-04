package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoEditer f103746a;

    private n(TXVideoEditer tXVideoEditer) {
        this.f103746a = tXVideoEditer;
    }

    public static Runnable a(TXVideoEditer tXVideoEditer) {
        return new n(tXVideoEditer);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$new$0(this.f103746a);
    }
}
