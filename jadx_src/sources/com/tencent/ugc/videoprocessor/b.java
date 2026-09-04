package com.tencent.ugc.videoprocessor;

import android.graphics.Bitmap;
import com.tencent.ugc.TXVideoEditConstants;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WatermarkProcessor f103938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Bitmap f103939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TXVideoEditConstants.TXRect f103940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f103941d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f103942e;

    private b(WatermarkProcessor watermarkProcessor, Bitmap bitmap, TXVideoEditConstants.TXRect tXRect, long j10, int i10) {
        this.f103938a = watermarkProcessor;
        this.f103939b = bitmap;
        this.f103940c = tXRect;
        this.f103941d = j10;
        this.f103942e = i10;
    }

    public static Runnable a(WatermarkProcessor watermarkProcessor, Bitmap bitmap, TXVideoEditConstants.TXRect tXRect, long j10, int i10) {
        return new b(watermarkProcessor, bitmap, tXRect, j10, i10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103938a.setTailWaterMarkInternal(this.f103939b, this.f103940c, this.f103941d, this.f103942e);
    }
}
