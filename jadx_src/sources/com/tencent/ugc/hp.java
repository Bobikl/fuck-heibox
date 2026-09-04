package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class hp implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final VideoDemuxerFFmpeg f103727a;

    private hp(VideoDemuxerFFmpeg videoDemuxerFFmpeg) {
        this.f103727a = videoDemuxerFFmpeg;
    }

    public static Runnable a(VideoDemuxerFFmpeg videoDemuxerFFmpeg) {
        return new hp(videoDemuxerFFmpeg);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103727a.getNextEncodeVideoFrameInternal();
    }
}
