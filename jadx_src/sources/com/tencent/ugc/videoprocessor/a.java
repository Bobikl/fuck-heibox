package com.tencent.ugc.videoprocessor;

import android.graphics.Bitmap;
import com.tencent.ugc.TXVideoEditConstants;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WatermarkProcessor f103935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Bitmap f103936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TXVideoEditConstants.TXRect f103937c;

    private a(WatermarkProcessor watermarkProcessor, Bitmap bitmap, TXVideoEditConstants.TXRect tXRect) {
        this.f103935a = watermarkProcessor;
        this.f103936b = bitmap;
        this.f103937c = tXRect;
    }

    public static Runnable a(WatermarkProcessor watermarkProcessor, Bitmap bitmap, TXVideoEditConstants.TXRect tXRect) {
        return new a(watermarkProcessor, bitmap, tXRect);
    }

    @Override // java.lang.Runnable
    public final void run() {
        WatermarkProcessor.lambda$setWaterMark$0(this.f103935a, this.f103936b, this.f103937c);
    }
}
