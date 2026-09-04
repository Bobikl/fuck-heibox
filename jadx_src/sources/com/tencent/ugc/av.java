package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class av implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoEditer f103308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TXVideoEditer.TXVideoGenerateListener f103309b;

    private av(TXVideoEditer tXVideoEditer, TXVideoEditer.TXVideoGenerateListener tXVideoGenerateListener) {
        this.f103308a = tXVideoEditer;
        this.f103309b = tXVideoGenerateListener;
    }

    public static Runnable a(TXVideoEditer tXVideoEditer, TXVideoEditer.TXVideoGenerateListener tXVideoGenerateListener) {
        return new av(tXVideoEditer, tXVideoGenerateListener);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$setVideoGenerateListener$49(this.f103308a, this.f103309b);
    }
}
