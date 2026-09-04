package com.tencent.ugc;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ho implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final VideoDemuxerFFmpeg f103725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f103726b;

    private ho(VideoDemuxerFFmpeg videoDemuxerFFmpeg, long j10) {
        this.f103725a = videoDemuxerFFmpeg;
        this.f103726b = j10;
    }

    public static Callable a(VideoDemuxerFFmpeg videoDemuxerFFmpeg, long j10) {
        return new ho(videoDemuxerFFmpeg, j10);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return VideoDemuxerFFmpeg.lambda$seek$2(this.f103725a, this.f103726b);
    }
}
