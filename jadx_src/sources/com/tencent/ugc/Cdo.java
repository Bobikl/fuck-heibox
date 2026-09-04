package com.tencent.ugc;

import java.util.concurrent.FutureTask;

/* JADX INFO: renamed from: com.tencent.ugc.do, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class Cdo implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCMediaListSource f103512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f103513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FutureTask f103514c;

    private Cdo(UGCMediaListSource uGCMediaListSource, boolean z10, FutureTask futureTask) {
        this.f103512a = uGCMediaListSource;
        this.f103513b = z10;
        this.f103514c = futureTask;
    }

    public static Runnable a(UGCMediaListSource uGCMediaListSource, boolean z10, FutureTask futureTask) {
        return new Cdo(uGCMediaListSource, z10, futureTask);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCMediaListSource.lambda$setIsSplitScreenMode$4(this.f103512a, this.f103513b, this.f103514c);
    }
}
