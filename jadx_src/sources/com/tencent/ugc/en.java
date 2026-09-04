package com.tencent.ugc;

import java.util.List;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class en implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCMediaListSource f103557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f103558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FutureTask f103559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final FutureTask f103560d;

    private en(UGCMediaListSource uGCMediaListSource, List list, FutureTask futureTask, FutureTask futureTask2) {
        this.f103557a = uGCMediaListSource;
        this.f103558b = list;
        this.f103559c = futureTask;
        this.f103560d = futureTask2;
    }

    public static Runnable a(UGCMediaListSource uGCMediaListSource, List list, FutureTask futureTask, FutureTask futureTask2) {
        return new en(uGCMediaListSource, list, futureTask, futureTask2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCMediaListSource.lambda$setVideoSources$0(this.f103557a, this.f103558b, this.f103559c, this.f103560d);
    }
}
