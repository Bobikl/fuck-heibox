package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class bm implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoEditer f103370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f103371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TXVideoEditer.TXVideoPreviewListener f103372c;

    private bm(TXVideoEditer tXVideoEditer, int i10, TXVideoEditer.TXVideoPreviewListener tXVideoPreviewListener) {
        this.f103370a = tXVideoEditer;
        this.f103371b = i10;
        this.f103372c = tXVideoPreviewListener;
    }

    public static Runnable a(TXVideoEditer tXVideoEditer, int i10, TXVideoEditer.TXVideoPreviewListener tXVideoPreviewListener) {
        return new bm(tXVideoEditer, i10, tXVideoPreviewListener);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$notifyPreviewProgress$65(this.f103370a, this.f103371b, this.f103372c);
    }
}
