package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class eu implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCMultiFileAudioFrameProvider f103587a;

    private eu(UGCMultiFileAudioFrameProvider uGCMultiFileAudioFrameProvider) {
        this.f103587a = uGCMultiFileAudioFrameProvider;
    }

    public static Runnable a(UGCMultiFileAudioFrameProvider uGCMultiFileAudioFrameProvider) {
        return new eu(uGCMultiFileAudioFrameProvider);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCMultiFileAudioFrameProvider.lambda$stop$1(this.f103587a);
    }
}
