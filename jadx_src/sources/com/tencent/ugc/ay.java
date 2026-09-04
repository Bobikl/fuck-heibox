package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ay implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoEditer f103315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TXVideoEditConstants.VideoFrameRateLevel f103316b;

    private ay(TXVideoEditer tXVideoEditer, TXVideoEditConstants.VideoFrameRateLevel videoFrameRateLevel) {
        this.f103315a = tXVideoEditer;
        this.f103316b = videoFrameRateLevel;
    }

    public static Runnable a(TXVideoEditer tXVideoEditer, TXVideoEditConstants.VideoFrameRateLevel videoFrameRateLevel) {
        return new ay(tXVideoEditer, videoFrameRateLevel);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$setVideoFrameRate$52(this.f103315a, this.f103316b);
    }
}
