package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ac implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoEditer f103264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TXVideoEditer.TXVideoProcessListener f103265b;

    private ac(TXVideoEditer tXVideoEditer, TXVideoEditer.TXVideoProcessListener tXVideoProcessListener) {
        this.f103264a = tXVideoEditer;
        this.f103265b = tXVideoProcessListener;
    }

    public static Runnable a(TXVideoEditer tXVideoEditer, TXVideoEditer.TXVideoProcessListener tXVideoProcessListener) {
        return new ac(tXVideoEditer, tXVideoProcessListener);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$setVideoProcessListener$31(this.f103264a, this.f103265b);
    }
}
