package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class cx implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoJoiner f103453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TXVideoJoiner.TXVideoJoinerListener f103454b;

    private cx(TXVideoJoiner tXVideoJoiner, TXVideoJoiner.TXVideoJoinerListener tXVideoJoinerListener) {
        this.f103453a = tXVideoJoiner;
        this.f103454b = tXVideoJoinerListener;
    }

    public static Runnable a(TXVideoJoiner tXVideoJoiner, TXVideoJoiner.TXVideoJoinerListener tXVideoJoinerListener) {
        return new cx(tXVideoJoiner, tXVideoJoinerListener);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103453a.mTXVideoJoinerListener = this.f103454b;
    }
}
