package com.tencent.ugc;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ad implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoEditer f103266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f103267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f103268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f103269d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f103270e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final TXVideoEditer.TXThumbnailListener f103271f;

    private ad(TXVideoEditer tXVideoEditer, List list, int i10, int i11, boolean z10, TXVideoEditer.TXThumbnailListener tXThumbnailListener) {
        this.f103266a = tXVideoEditer;
        this.f103267b = list;
        this.f103268c = i10;
        this.f103269d = i11;
        this.f103270e = z10;
        this.f103271f = tXThumbnailListener;
    }

    public static Runnable a(TXVideoEditer tXVideoEditer, List list, int i10, int i11, boolean z10, TXVideoEditer.TXThumbnailListener tXThumbnailListener) {
        return new ad(tXVideoEditer, list, i10, i11, z10, tXThumbnailListener);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103266a.doGetThumbnail(this.f103267b, this.f103268c, this.f103269d, this.f103270e, this.f103271f);
    }
}
