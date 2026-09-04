package com.tencent.ugc;

import com.tencent.liteav.videobase.videobase.DisplayTarget;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class bu implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoEditer f103386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TXVideoEditConstants.TXPreviewParam f103387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final DisplayTarget f103388c;

    private bu(TXVideoEditer tXVideoEditer, TXVideoEditConstants.TXPreviewParam tXPreviewParam, DisplayTarget displayTarget) {
        this.f103386a = tXVideoEditer;
        this.f103387b = tXPreviewParam;
        this.f103388c = displayTarget;
    }

    public static Runnable a(TXVideoEditer tXVideoEditer, TXVideoEditConstants.TXPreviewParam tXPreviewParam, DisplayTarget displayTarget) {
        return new bu(tXVideoEditer, tXPreviewParam, displayTarget);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$null$42(this.f103386a, this.f103387b, this.f103388c);
    }
}
