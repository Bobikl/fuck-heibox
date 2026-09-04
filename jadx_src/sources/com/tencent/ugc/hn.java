package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class hn implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final VideoDemuxerFFmpeg f103724a;

    private hn(VideoDemuxerFFmpeg videoDemuxerFFmpeg) {
        this.f103724a = videoDemuxerFFmpeg;
    }

    public static Runnable a(VideoDemuxerFFmpeg videoDemuxerFFmpeg) {
        return new hn(videoDemuxerFFmpeg);
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoDemuxerFFmpeg.lambda$close$1(this.f103724a);
    }
}
