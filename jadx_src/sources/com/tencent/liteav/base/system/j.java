package com.tencent.liteav.base.system;

import android.os.Build;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final j f99675a = new j();

    private j() {
    }

    public static Callable a() {
        return f99675a;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return Build.MODEL;
    }
}
