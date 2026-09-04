package com.tencent.ugc.encoder;

import com.tencent.ugc.videobase.common.EncodedVideoFrame;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCVideoEncodeController.AnonymousClass1 f103577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EncodedVideoFrame f103578b;

    private h(UGCVideoEncodeController.AnonymousClass1 anonymousClass1, EncodedVideoFrame encodedVideoFrame) {
        this.f103577a = anonymousClass1;
        this.f103578b = encodedVideoFrame;
    }

    public static Runnable a(UGCVideoEncodeController.AnonymousClass1 anonymousClass1, EncodedVideoFrame encodedVideoFrame) {
        return new h(anonymousClass1, encodedVideoFrame);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCVideoEncodeController.AnonymousClass1.a(this.f103577a, this.f103578b);
    }
}
