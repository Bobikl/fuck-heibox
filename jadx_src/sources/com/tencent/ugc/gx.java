package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class gx implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCVideoProcessor f103682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TXVideoEditer.TXVideoCustomProcessListener f103683b;

    private gx(UGCVideoProcessor uGCVideoProcessor, TXVideoEditer.TXVideoCustomProcessListener tXVideoCustomProcessListener) {
        this.f103682a = uGCVideoProcessor;
        this.f103683b = tXVideoCustomProcessListener;
    }

    public static Runnable a(UGCVideoProcessor uGCVideoProcessor, TXVideoEditer.TXVideoCustomProcessListener tXVideoCustomProcessListener) {
        return new gx(uGCVideoProcessor, tXVideoCustomProcessListener);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103682a.mTXVideoCustomProcessListener = this.f103683b;
    }
}
