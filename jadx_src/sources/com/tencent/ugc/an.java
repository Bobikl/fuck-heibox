package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class an implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoEditer f103295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TXVideoEditer.TXVideoPreviewListener f103296b;

    private an(TXVideoEditer tXVideoEditer, TXVideoEditer.TXVideoPreviewListener tXVideoPreviewListener) {
        this.f103295a = tXVideoEditer;
        this.f103296b = tXVideoPreviewListener;
    }

    public static Runnable a(TXVideoEditer tXVideoEditer, TXVideoEditer.TXVideoPreviewListener tXVideoPreviewListener) {
        return new an(tXVideoEditer, tXVideoPreviewListener);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$setTXVideoPreviewListener$41(this.f103295a, this.f103296b);
    }
}
