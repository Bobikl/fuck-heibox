package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ai implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoEditer.TXVideoProcessListener f103283a;

    private ai(TXVideoEditer.TXVideoProcessListener tXVideoProcessListener) {
        this.f103283a = tXVideoProcessListener;
    }

    public static Runnable a(TXVideoEditer.TXVideoProcessListener tXVideoProcessListener) {
        return new ai(tXVideoProcessListener);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$processVideoInternal$36(this.f103283a);
    }
}
