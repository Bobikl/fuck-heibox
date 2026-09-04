package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class eh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCMediaListSource f103549a;

    private eh(UGCMediaListSource uGCMediaListSource) {
        this.f103549a = uGCMediaListSource;
    }

    public static Runnable a(UGCMediaListSource uGCMediaListSource) {
        return new eh(uGCMediaListSource);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103549a.loadNextVideoFrameInternal(5L);
    }
}
