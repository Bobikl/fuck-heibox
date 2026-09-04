package com.tencent.liteav.base.system;

import android.os.Build;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final k f99676a = new k();

    private k() {
    }

    public static Callable a() {
        return f99676a;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return Build.BRAND;
    }
}
