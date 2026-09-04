package com.tencent.ugc;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ak implements TXVideoEditer.TXThumbnailListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoEditer f103286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final UGCThumbnailGenerator f103287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f103288c;

    private ak(TXVideoEditer tXVideoEditer, UGCThumbnailGenerator uGCThumbnailGenerator, boolean z10) {
        this.f103286a = tXVideoEditer;
        this.f103287b = uGCThumbnailGenerator;
        this.f103288c = z10;
    }

    public static TXVideoEditer.TXThumbnailListener a(TXVideoEditer tXVideoEditer, UGCThumbnailGenerator uGCThumbnailGenerator, boolean z10) {
        return new ak(tXVideoEditer, uGCThumbnailGenerator, z10);
    }

    @Override // com.tencent.ugc.TXVideoEditer.TXThumbnailListener
    public final void onThumbnail(int i10, long j10, Bitmap bitmap) {
        TXVideoEditer tXVideoEditer = this.f103286a;
        tXVideoEditer.mSequenceTaskRunner.a(bv.a(tXVideoEditer, this.f103287b, this.f103288c, i10, j10, bitmap));
    }
}
