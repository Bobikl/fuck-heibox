package com.tencent.liteav.base.system;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final e f99670a = new e();

    private e() {
    }

    public static Callable a() {
        return f99670a;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return a.b();
    }
}
