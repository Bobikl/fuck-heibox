package com.tencent.liteav.base.system;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final d f99669a = new d();

    private d() {
    }

    public static Callable a() {
        return f99669a;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return a.a();
    }
}
