package com.tencent.liteav.base.system;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final g f99672a = new g();

    private g() {
    }

    public static Callable a() {
        return f99672a;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return q.a(LiteavSystemInfo.sAppPackageName.a());
    }
}
