package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class fl implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCSingleFileAudioFrameProvider f103618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f103619b;

    private fl(UGCSingleFileAudioFrameProvider uGCSingleFileAudioFrameProvider, long j10) {
        this.f103618a = uGCSingleFileAudioFrameProvider;
        this.f103619b = j10;
    }

    public static Runnable a(UGCSingleFileAudioFrameProvider uGCSingleFileAudioFrameProvider, long j10) {
        return new fl(uGCSingleFileAudioFrameProvider, j10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCSingleFileAudioFrameProvider uGCSingleFileAudioFrameProvider = this.f103618a;
        uGCSingleFileAudioFrameProvider.seekToInFileTime(uGCSingleFileAudioFrameProvider.timelineToFileTime(this.f103619b));
    }
}
