package com.tencent.liteav.audio2;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f99546a;

    private g(e eVar) {
        this.f99546a = eVar;
    }

    public static Executor a(e eVar) {
        return new g(eVar);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f99546a.f99542h.a(runnable);
    }
}
