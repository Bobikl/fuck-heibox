package com.tencent.ugc;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class bv implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoEditer f103389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final UGCThumbnailGenerator f103390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f103391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f103392d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f103393e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Bitmap f103394f;

    private bv(TXVideoEditer tXVideoEditer, UGCThumbnailGenerator uGCThumbnailGenerator, boolean z10, int i10, long j10, Bitmap bitmap) {
        this.f103389a = tXVideoEditer;
        this.f103390b = uGCThumbnailGenerator;
        this.f103391c = z10;
        this.f103392d = i10;
        this.f103393e = j10;
        this.f103394f = bitmap;
    }

    public static Runnable a(TXVideoEditer tXVideoEditer, UGCThumbnailGenerator uGCThumbnailGenerator, boolean z10, int i10, long j10, Bitmap bitmap) {
        return new bv(tXVideoEditer, uGCThumbnailGenerator, z10, i10, j10, bitmap);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103389a.handleThumbnailGeneratedDuringProcessing(this.f103390b, this.f103391c, this.f103392d, this.f103393e, this.f103394f);
    }
}
