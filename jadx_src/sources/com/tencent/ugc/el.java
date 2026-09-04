package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class el implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCMediaListSource f103553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f103554b;

    private el(UGCMediaListSource uGCMediaListSource, int i10) {
        this.f103553a = uGCMediaListSource;
        this.f103554b = i10;
    }

    public static Runnable a(UGCMediaListSource uGCMediaListSource, int i10) {
        return new el(uGCMediaListSource, i10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103553a.mTailWaterMarkDurationMs = ((long) this.f103554b) * 1000;
    }
}
