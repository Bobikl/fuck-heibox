package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ag implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoEditer f103280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TXVideoEditer.TXThumbnailListener f103281b;

    private ag(TXVideoEditer tXVideoEditer, TXVideoEditer.TXThumbnailListener tXThumbnailListener) {
        this.f103280a = tXVideoEditer;
        this.f103281b = tXThumbnailListener;
    }

    public static Runnable a(TXVideoEditer tXVideoEditer, TXVideoEditer.TXThumbnailListener tXThumbnailListener) {
        return new ag(tXVideoEditer, tXThumbnailListener);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$setThumbnailListener$35(this.f103280a, this.f103281b);
    }
}
