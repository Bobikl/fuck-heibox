package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class aj implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoEditer f103284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TXVideoEditer.TXVideoCustomProcessListener f103285b;

    private aj(TXVideoEditer tXVideoEditer, TXVideoEditer.TXVideoCustomProcessListener tXVideoCustomProcessListener) {
        this.f103284a = tXVideoEditer;
        this.f103285b = tXVideoCustomProcessListener;
    }

    public static Runnable a(TXVideoEditer tXVideoEditer, TXVideoEditer.TXVideoCustomProcessListener tXVideoCustomProcessListener) {
        return new aj(tXVideoEditer, tXVideoCustomProcessListener);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$setCustomVideoProcessListener$2(this.f103284a, this.f103285b);
    }
}
