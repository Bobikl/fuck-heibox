package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ee implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCMediaListSource f103546a;

    private ee(UGCMediaListSource uGCMediaListSource) {
        this.f103546a = uGCMediaListSource;
    }

    public static Runnable a(UGCMediaListSource uGCMediaListSource) {
        return new ee(uGCMediaListSource);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103546a.loadNextAudioFrameInternal(5L);
    }
}
