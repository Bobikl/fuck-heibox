package com.tencent.ugc;

import com.tencent.ugc.encoder.VideoEncodeParams;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class gq implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCVideoProcessor f103663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final VideoEncodeParams f103664b;

    private gq(UGCVideoProcessor uGCVideoProcessor, VideoEncodeParams videoEncodeParams) {
        this.f103663a = uGCVideoProcessor;
        this.f103664b = videoEncodeParams;
    }

    public static Runnable a(UGCVideoProcessor uGCVideoProcessor, VideoEncodeParams videoEncodeParams) {
        return new gq(uGCVideoProcessor, videoEncodeParams);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103663a.mVideoEncodeParams = this.f103664b;
    }
}
