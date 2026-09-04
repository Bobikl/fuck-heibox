package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class hr implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final VideoDemuxerFFmpeg f103729a;

    private hr(VideoDemuxerFFmpeg videoDemuxerFFmpeg) {
        this.f103729a = videoDemuxerFFmpeg;
    }

    public static Runnable a(VideoDemuxerFFmpeg videoDemuxerFFmpeg) {
        return new hr(videoDemuxerFFmpeg);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103729a.getNextEncodeVideoFrameInternal();
    }
}
