package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ew implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCMultiFileAudioFrameProvider f103590a;

    private ew(UGCMultiFileAudioFrameProvider uGCMultiFileAudioFrameProvider) {
        this.f103590a = uGCMultiFileAudioFrameProvider;
    }

    public static Runnable a(UGCMultiFileAudioFrameProvider uGCMultiFileAudioFrameProvider) {
        return new ew(uGCMultiFileAudioFrameProvider);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103590a.readFrameToQueue();
    }
}
