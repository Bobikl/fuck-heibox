package com.tencent.ugc;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ec implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCMediaListSource f103542a;

    private ec(UGCMediaListSource uGCMediaListSource) {
        this.f103542a = uGCMediaListSource;
    }

    public static Callable a(UGCMediaListSource uGCMediaListSource) {
        return new ec(uGCMediaListSource);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return Long.valueOf(this.f103542a.calculateTotalDurationOfClips());
    }
}
