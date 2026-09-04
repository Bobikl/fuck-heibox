package com.tencent.rtmp.ui;

import android.graphics.Color;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXCloudVideoView f102113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f102114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f102115c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f102116d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f102117e;

    private b(TXCloudVideoView tXCloudVideoView, int i10, int i11, int i12, int i13) {
        this.f102113a = tXCloudVideoView;
        this.f102114b = i10;
        this.f102115c = i11;
        this.f102116d = i12;
        this.f102117e = i13;
    }

    public static Runnable a(TXCloudVideoView tXCloudVideoView, int i10, int i11, int i12, int i13) {
        return new b(tXCloudVideoView, i10, i11, i12, i13);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f102113a.setBackgroundColor(Color.argb(this.f102114b, this.f102115c, this.f102116d, this.f102117e));
    }
}
