package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class gy implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCVideoProcessor f103684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final UGCVideoProcessor.VideoProcessListener f103685b;

    private gy(UGCVideoProcessor uGCVideoProcessor, UGCVideoProcessor.VideoProcessListener videoProcessListener) {
        this.f103684a = uGCVideoProcessor;
        this.f103685b = videoProcessListener;
    }

    public static Runnable a(UGCVideoProcessor uGCVideoProcessor, UGCVideoProcessor.VideoProcessListener videoProcessListener) {
        return new gy(uGCVideoProcessor, videoProcessListener);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103684a.mVideoProcessListener = this.f103685b;
    }
}
