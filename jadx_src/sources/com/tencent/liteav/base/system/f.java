package com.tencent.liteav.base.system;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final f f99671a = new f();

    private f() {
    }

    public static Callable a() {
        return f99671a;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return a.c();
    }
}
