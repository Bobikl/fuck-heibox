package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ae implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoEditer f103272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f103273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f103274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f103275d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f103276e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final TXVideoEditer.TXThumbnailListener f103277f;

    private ae(TXVideoEditer tXVideoEditer, int i10, int i11, boolean z10, int i12, TXVideoEditer.TXThumbnailListener tXThumbnailListener) {
        this.f103272a = tXVideoEditer;
        this.f103273b = i10;
        this.f103274c = i11;
        this.f103275d = z10;
        this.f103276e = i12;
        this.f103277f = tXThumbnailListener;
    }

    public static Runnable a(TXVideoEditer tXVideoEditer, int i10, int i11, boolean z10, int i12, TXVideoEditer.TXThumbnailListener tXThumbnailListener) {
        return new ae(tXVideoEditer, i10, i11, z10, i12, tXThumbnailListener);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$getThumbnail$33(this.f103272a, this.f103273b, this.f103274c, this.f103275d, this.f103276e, this.f103277f);
    }
}
