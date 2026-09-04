package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class bn implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoEditer.TXVideoPreviewListener f103373a;

    private bn(TXVideoEditer.TXVideoPreviewListener tXVideoPreviewListener) {
        this.f103373a = tXVideoPreviewListener;
    }

    public static Runnable a(TXVideoEditer.TXVideoPreviewListener tXVideoPreviewListener) {
        return new bn(tXVideoPreviewListener);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103373a.onPreviewFinished();
    }
}
