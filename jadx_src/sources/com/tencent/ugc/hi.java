package com.tencent.ugc;

import com.tencent.ugc.videobase.common.EncodedVideoFrame;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class hi implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCVideoProcessor.b f103710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EncodedVideoFrame f103711b;

    private hi(UGCVideoProcessor.b bVar, EncodedVideoFrame encodedVideoFrame) {
        this.f103710a = bVar;
        this.f103711b = encodedVideoFrame;
    }

    public static Runnable a(UGCVideoProcessor.b bVar, EncodedVideoFrame encodedVideoFrame) {
        return new hi(bVar, encodedVideoFrame);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCVideoProcessor.b.a(this.f103710a, this.f103711b);
    }
}
