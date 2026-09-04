package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ek implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCMediaListSource f103552a;

    private ek(UGCMediaListSource uGCMediaListSource) {
        this.f103552a = uGCMediaListSource;
    }

    public static Runnable a(UGCMediaListSource uGCMediaListSource) {
        return new ek(uGCMediaListSource);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103552a.prePareNextUGCPixelFrameProvider();
    }
}
