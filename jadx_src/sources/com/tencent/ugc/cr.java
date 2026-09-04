package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class cr implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoJoiner f103445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TXVideoEditConstants.TXPreviewParam f103446b;

    private cr(TXVideoJoiner tXVideoJoiner, TXVideoEditConstants.TXPreviewParam tXPreviewParam) {
        this.f103445a = tXVideoJoiner;
        this.f103446b = tXPreviewParam;
    }

    public static Runnable a(TXVideoJoiner tXVideoJoiner, TXVideoEditConstants.TXPreviewParam tXPreviewParam) {
        return new cr(tXVideoJoiner, tXPreviewParam);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoJoiner.lambda$initWithPreview$1(this.f103445a, this.f103446b);
    }
}
