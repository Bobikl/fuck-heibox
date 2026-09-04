package com.tencent.liteav.base.system;

import android.os.Build;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final n f99679a = new n();

    private n() {
    }

    public static Callable a() {
        return f99679a;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return Build.VERSION.RELEASE;
    }
}
