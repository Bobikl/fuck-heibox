package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class gl implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCThumbnailGenerator f103655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final UGCThumbnailGenerator.UGCThumbnailGenerateParams f103656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TXVideoEditer.TXThumbnailListener f103657c;

    private gl(UGCThumbnailGenerator uGCThumbnailGenerator, UGCThumbnailGenerator.UGCThumbnailGenerateParams uGCThumbnailGenerateParams, TXVideoEditer.TXThumbnailListener tXThumbnailListener) {
        this.f103655a = uGCThumbnailGenerator;
        this.f103656b = uGCThumbnailGenerateParams;
        this.f103657c = tXThumbnailListener;
    }

    public static Runnable a(UGCThumbnailGenerator uGCThumbnailGenerator, UGCThumbnailGenerator.UGCThumbnailGenerateParams uGCThumbnailGenerateParams, TXVideoEditer.TXThumbnailListener tXThumbnailListener) {
        return new gl(uGCThumbnailGenerator, uGCThumbnailGenerateParams, tXThumbnailListener);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCThumbnailGenerator.lambda$start$3(this.f103655a, this.f103656b, this.f103657c);
    }
}
