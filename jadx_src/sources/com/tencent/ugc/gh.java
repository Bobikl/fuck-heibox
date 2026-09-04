package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class gh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCMediaListSource f103648a;

    private gh(UGCMediaListSource uGCMediaListSource) {
        this.f103648a = uGCMediaListSource;
    }

    public static Runnable a(UGCMediaListSource uGCMediaListSource) {
        return new gh(uGCMediaListSource);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103648a.initialize();
    }
}
