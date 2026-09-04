package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ei implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCMediaListSource f103550a;

    private ei(UGCMediaListSource uGCMediaListSource) {
        this.f103550a = uGCMediaListSource;
    }

    public static Runnable a(UGCMediaListSource uGCMediaListSource) {
        return new ei(uGCMediaListSource);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103550a.prePareNextUGCPixelFrameProvider();
    }
}
