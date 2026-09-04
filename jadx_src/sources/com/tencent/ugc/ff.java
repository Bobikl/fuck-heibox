package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ff implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCSingleFileAudioFrameProvider f103612a;

    private ff(UGCSingleFileAudioFrameProvider uGCSingleFileAudioFrameProvider) {
        this.f103612a = uGCSingleFileAudioFrameProvider;
    }

    public static Runnable a(UGCSingleFileAudioFrameProvider uGCSingleFileAudioFrameProvider) {
        return new ff(uGCSingleFileAudioFrameProvider);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCSingleFileAudioFrameProvider.lambda$initialize$0(this.f103612a);
    }
}
