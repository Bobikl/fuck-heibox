package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class af implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoEditer f103278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TXVideoEditConstants.TXThumbnail f103279b;

    private af(TXVideoEditer tXVideoEditer, TXVideoEditConstants.TXThumbnail tXThumbnail) {
        this.f103278a = tXVideoEditer;
        this.f103279b = tXThumbnail;
    }

    public static Runnable a(TXVideoEditer tXVideoEditer, TXVideoEditConstants.TXThumbnail tXThumbnail) {
        return new af(tXVideoEditer, tXThumbnail);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$setThumbnail$34(this.f103278a, this.f103279b);
    }
}
