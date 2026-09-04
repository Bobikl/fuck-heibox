package com.tencent.liteav.base.system;

import android.os.Build;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final o f99680a = new o();

    private o() {
    }

    public static Callable a() {
        return f99680a;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return Integer.valueOf(Build.VERSION.SDK_INT);
    }
}
