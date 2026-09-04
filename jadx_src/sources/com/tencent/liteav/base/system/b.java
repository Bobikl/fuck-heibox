package com.tencent.liteav.base.system;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b f99667a = new b();

    private b() {
    }

    public static Callable a() {
        return f99667a;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return a.d();
    }
}
