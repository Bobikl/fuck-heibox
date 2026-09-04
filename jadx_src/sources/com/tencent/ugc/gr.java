package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class gr implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCVideoProcessor f103665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final UGCVideoProcessor.VideoEncodedFrameListener f103666b;

    private gr(UGCVideoProcessor uGCVideoProcessor, UGCVideoProcessor.VideoEncodedFrameListener videoEncodedFrameListener) {
        this.f103665a = uGCVideoProcessor;
        this.f103666b = videoEncodedFrameListener;
    }

    public static Runnable a(UGCVideoProcessor uGCVideoProcessor, UGCVideoProcessor.VideoEncodedFrameListener videoEncodedFrameListener) {
        return new gr(uGCVideoProcessor, videoEncodedFrameListener);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103665a.mVideoEncodedFrameListener = this.f103666b;
    }
}
