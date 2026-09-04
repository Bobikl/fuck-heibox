package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class dv implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCMediaListSource f103528a;

    private dv(UGCMediaListSource uGCMediaListSource) {
        this.f103528a = uGCMediaListSource;
    }

    public static Runnable a(UGCMediaListSource uGCMediaListSource) {
        return new dv(uGCMediaListSource);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103528a.loadNextVideoFrameInternal(5L);
    }
}
