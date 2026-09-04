package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ao implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoEditer f103297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TXVideoEditConstants.TXPreviewParam f103298b;

    private ao(TXVideoEditer tXVideoEditer, TXVideoEditConstants.TXPreviewParam tXPreviewParam) {
        this.f103297a = tXVideoEditer;
        this.f103298b = tXPreviewParam;
    }

    public static Runnable a(TXVideoEditer tXVideoEditer, TXVideoEditConstants.TXPreviewParam tXPreviewParam) {
        return new ao(tXVideoEditer, tXPreviewParam);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$initWithPreview$43(this.f103297a, this.f103298b);
    }
}
