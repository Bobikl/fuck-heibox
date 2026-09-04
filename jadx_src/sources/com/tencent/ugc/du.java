package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class du implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCMediaListSource f103527a;

    private du(UGCMediaListSource uGCMediaListSource) {
        this.f103527a = uGCMediaListSource;
    }

    public static Runnable a(UGCMediaListSource uGCMediaListSource) {
        return new du(uGCMediaListSource);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103527a.loadNextAudioFrameInternal(5L);
    }
}
