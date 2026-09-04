package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ef implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCMediaListSource f103547a;

    private ef(UGCMediaListSource uGCMediaListSource) {
        this.f103547a = uGCMediaListSource;
    }

    public static Runnable a(UGCMediaListSource uGCMediaListSource) {
        return new ef(uGCMediaListSource);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103547a.loadNextAudioFrameInternal(5L);
    }
}
