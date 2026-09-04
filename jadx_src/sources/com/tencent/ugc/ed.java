package com.tencent.ugc;

import java.util.List;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ed implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCMediaListSource f103543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f103544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FutureTask f103545c;

    private ed(UGCMediaListSource uGCMediaListSource, List list, FutureTask futureTask) {
        this.f103543a = uGCMediaListSource;
        this.f103544b = list;
        this.f103545c = futureTask;
    }

    public static Runnable a(UGCMediaListSource uGCMediaListSource, List list, FutureTask futureTask) {
        return new ed(uGCMediaListSource, list, futureTask);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCMediaListSource.lambda$setSpeedList$14(this.f103543a, this.f103544b, this.f103545c);
    }
}
