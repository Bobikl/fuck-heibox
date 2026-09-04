package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class hm implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final VideoDemuxerFFmpeg f103722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f103723b;

    private hm(VideoDemuxerFFmpeg videoDemuxerFFmpeg, String str) {
        this.f103722a = videoDemuxerFFmpeg;
        this.f103723b = str;
    }

    public static Runnable a(VideoDemuxerFFmpeg videoDemuxerFFmpeg, String str) {
        return new hm(videoDemuxerFFmpeg, str);
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoDemuxerFFmpeg.lambda$open$0(this.f103722a, this.f103723b);
    }
}
