package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class bj implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoEditer f103364a;

    private bj(TXVideoEditer tXVideoEditer) {
        this.f103364a = tXVideoEditer;
    }

    public static Runnable a(TXVideoEditer tXVideoEditer) {
        return new bj(tXVideoEditer);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103364a.mVideoProcessor.refreshOneFrame();
    }
}
