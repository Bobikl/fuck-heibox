package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class cs implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoJoiner f103447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TXVideoJoiner.TXVideoPreviewListener f103448b;

    private cs(TXVideoJoiner tXVideoJoiner, TXVideoJoiner.TXVideoPreviewListener tXVideoPreviewListener) {
        this.f103447a = tXVideoJoiner;
        this.f103448b = tXVideoPreviewListener;
    }

    public static Runnable a(TXVideoJoiner tXVideoJoiner, TXVideoJoiner.TXVideoPreviewListener tXVideoPreviewListener) {
        return new cs(tXVideoJoiner, tXVideoPreviewListener);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103447a.mTXVideoPreviewListener = this.f103448b;
    }
}
