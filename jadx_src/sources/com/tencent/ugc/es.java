package com.tencent.ugc;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class es implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCMediaListSource f103585a;

    private es(UGCMediaListSource uGCMediaListSource) {
        this.f103585a = uGCMediaListSource;
    }

    public static Callable a(UGCMediaListSource uGCMediaListSource) {
        return new es(uGCMediaListSource);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return Long.valueOf(this.f103585a.calculateTotalDurationOfClips());
    }
}
