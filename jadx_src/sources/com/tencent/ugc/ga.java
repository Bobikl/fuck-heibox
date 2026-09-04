package com.tencent.ugc;

import com.tencent.ugc.videobase.frame.PixelFrame;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ga implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCSingleFilePixelFrameProvider.AnonymousClass1 f103639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PixelFrame f103640b;

    private ga(UGCSingleFilePixelFrameProvider.AnonymousClass1 anonymousClass1, PixelFrame pixelFrame) {
        this.f103639a = anonymousClass1;
        this.f103640b = pixelFrame;
    }

    public static Runnable a(UGCSingleFilePixelFrameProvider.AnonymousClass1 anonymousClass1, PixelFrame pixelFrame) {
        return new ga(anonymousClass1, pixelFrame);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCSingleFilePixelFrameProvider.this.onDecodeFrameInternal(this.f103640b);
    }
}
