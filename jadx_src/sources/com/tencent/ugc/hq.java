package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class hq implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final VideoDemuxerFFmpeg f103728a;

    private hq(VideoDemuxerFFmpeg videoDemuxerFFmpeg) {
        this.f103728a = videoDemuxerFFmpeg;
    }

    public static Runnable a(VideoDemuxerFFmpeg videoDemuxerFFmpeg) {
        return new hq(videoDemuxerFFmpeg);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103728a.getNextEncodeVideoFrameInternal();
    }
}
