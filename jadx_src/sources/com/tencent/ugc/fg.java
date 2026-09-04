package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class fg implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCSingleFileAudioFrameProvider f103613a;

    private fg(UGCSingleFileAudioFrameProvider uGCSingleFileAudioFrameProvider) {
        this.f103613a = uGCSingleFileAudioFrameProvider;
    }

    public static Runnable a(UGCSingleFileAudioFrameProvider uGCSingleFileAudioFrameProvider) {
        return new fg(uGCSingleFileAudioFrameProvider);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103613a.DecodeOrAppendMuteFrame();
    }
}
