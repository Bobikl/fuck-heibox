package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ev implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCMultiFileAudioFrameProvider f103588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f103589b;

    private ev(UGCMultiFileAudioFrameProvider uGCMultiFileAudioFrameProvider, long j10) {
        this.f103588a = uGCMultiFileAudioFrameProvider;
        this.f103589b = j10;
    }

    public static Runnable a(UGCMultiFileAudioFrameProvider uGCMultiFileAudioFrameProvider, long j10) {
        return new ev(uGCMultiFileAudioFrameProvider, j10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCMultiFileAudioFrameProvider.lambda$seekTo$2(this.f103588a, this.f103589b);
    }
}
