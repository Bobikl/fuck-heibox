package com.tencent.ugc.decoder;

import com.tencent.ugc.videobase.frame.PixelFrame;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class r implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCVideoDecodeController.a f103497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PixelFrame f103498b;

    private r(UGCVideoDecodeController.a aVar, PixelFrame pixelFrame) {
        this.f103497a = aVar;
        this.f103498b = pixelFrame;
    }

    public static Runnable a(UGCVideoDecodeController.a aVar, PixelFrame pixelFrame) {
        return new r(aVar, pixelFrame);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCVideoDecodeController.a.a(this.f103497a, this.f103498b);
    }
}
