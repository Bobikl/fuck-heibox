package com.tencent.ugc;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ej implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCMediaListSource f103551a;

    private ej(UGCMediaListSource uGCMediaListSource) {
        this.f103551a = uGCMediaListSource;
    }

    public static Callable a(UGCMediaListSource uGCMediaListSource) {
        return new ej(uGCMediaListSource);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return Long.valueOf(this.f103551a.calculateTotalDurationOfClips());
    }
}
