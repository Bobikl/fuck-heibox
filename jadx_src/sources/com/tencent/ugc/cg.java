package com.tencent.ugc;

import android.graphics.Bitmap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class cg implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoEditer.AnonymousClass5 f103417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TXVideoEditer.TXThumbnailListener f103418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f103419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f103420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Bitmap f103421e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f103422f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final UGCThumbnailGenerator f103423g;

    private cg(TXVideoEditer.AnonymousClass5 anonymousClass5, TXVideoEditer.TXThumbnailListener tXThumbnailListener, int i10, long j10, Bitmap bitmap, List list, UGCThumbnailGenerator uGCThumbnailGenerator) {
        this.f103417a = anonymousClass5;
        this.f103418b = tXThumbnailListener;
        this.f103419c = i10;
        this.f103420d = j10;
        this.f103421e = bitmap;
        this.f103422f = list;
        this.f103423g = uGCThumbnailGenerator;
    }

    public static Runnable a(TXVideoEditer.AnonymousClass5 anonymousClass5, TXVideoEditer.TXThumbnailListener tXThumbnailListener, int i10, long j10, Bitmap bitmap, List list, UGCThumbnailGenerator uGCThumbnailGenerator) {
        return new cg(anonymousClass5, tXThumbnailListener, i10, j10, bitmap, list, uGCThumbnailGenerator);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.AnonymousClass5.a(this.f103417a, this.f103418b, this.f103419c, this.f103420d, this.f103421e, this.f103422f, this.f103423g);
    }
}
