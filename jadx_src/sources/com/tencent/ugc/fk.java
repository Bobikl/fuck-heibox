package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class fk implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCSingleFileAudioFrameProvider f103617a;

    private fk(UGCSingleFileAudioFrameProvider uGCSingleFileAudioFrameProvider) {
        this.f103617a = uGCSingleFileAudioFrameProvider;
    }

    public static Runnable a(UGCSingleFileAudioFrameProvider uGCSingleFileAudioFrameProvider) {
        return new fk(uGCSingleFileAudioFrameProvider);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103617a.DecodeOrAppendMuteFrame();
    }
}
