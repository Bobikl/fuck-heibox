package com.tencent.ugc;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ds implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCMediaListSource f103523a;

    private ds(UGCMediaListSource uGCMediaListSource) {
        this.f103523a = uGCMediaListSource;
    }

    public static Callable a(UGCMediaListSource uGCMediaListSource) {
        return new ds(uGCMediaListSource);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return Long.valueOf(this.f103523a.calculateTotalDurationOfClips());
    }
}
