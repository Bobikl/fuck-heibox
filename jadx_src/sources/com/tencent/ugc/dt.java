package com.tencent.ugc;

import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class dt implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCMediaListSource f103524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f103525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FutureTask f103526c;

    private dt(UGCMediaListSource uGCMediaListSource, int i10, FutureTask futureTask) {
        this.f103524a = uGCMediaListSource;
        this.f103525b = i10;
        this.f103526c = futureTask;
    }

    public static Runnable a(UGCMediaListSource uGCMediaListSource, int i10, FutureTask futureTask) {
        return new dt(uGCMediaListSource, i10, futureTask);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCMediaListSource.lambda$setPictureTransition$7(this.f103524a, this.f103525b, this.f103526c);
    }
}
