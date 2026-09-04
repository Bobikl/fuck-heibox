package com.tencent.ugc;

import java.util.List;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ea implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCMediaListSource f103537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f103538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FutureTask f103539c;

    private ea(UGCMediaListSource uGCMediaListSource, List list, FutureTask futureTask) {
        this.f103537a = uGCMediaListSource;
        this.f103538b = list;
        this.f103539c = futureTask;
    }

    public static Runnable a(UGCMediaListSource uGCMediaListSource, List list, FutureTask futureTask) {
        return new ea(uGCMediaListSource, list, futureTask);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCMediaListSource.lambda$setRepeatPlay$12(this.f103537a, this.f103538b, this.f103539c);
    }
}
