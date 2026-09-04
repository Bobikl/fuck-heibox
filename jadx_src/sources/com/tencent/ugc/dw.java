package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class dw implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCMediaListSource f103529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f103530b;

    private dw(UGCMediaListSource uGCMediaListSource, long j10) {
        this.f103529a = uGCMediaListSource;
        this.f103530b = j10;
    }

    public static Runnable a(UGCMediaListSource uGCMediaListSource, long j10) {
        return new dw(uGCMediaListSource, j10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCMediaListSource.lambda$setPlayEndTime$10(this.f103529a, this.f103530b);
    }
}
