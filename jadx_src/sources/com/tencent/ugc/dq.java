package com.tencent.ugc;

import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class dq implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCMediaListSource f103516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f103517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f103518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final FutureTask f103519d;

    private dq(UGCMediaListSource uGCMediaListSource, long j10, long j11, FutureTask futureTask) {
        this.f103516a = uGCMediaListSource;
        this.f103517b = j10;
        this.f103518c = j11;
        this.f103519d = futureTask;
    }

    public static Runnable a(UGCMediaListSource uGCMediaListSource, long j10, long j11, FutureTask futureTask) {
        return new dq(uGCMediaListSource, j10, j11, futureTask);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCMediaListSource.lambda$setVideoSourceRange$5(this.f103516a, this.f103517b, this.f103518c, this.f103519d);
    }
}
