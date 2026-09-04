package com.tencent.ugc;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class dz implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCMediaListSource f103534a;

    private dz(UGCMediaListSource uGCMediaListSource) {
        this.f103534a = uGCMediaListSource;
    }

    public static Callable a(UGCMediaListSource uGCMediaListSource) {
        return new dz(uGCMediaListSource);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return Long.valueOf(this.f103534a.calculateTotalDurationOfClips());
    }
}
