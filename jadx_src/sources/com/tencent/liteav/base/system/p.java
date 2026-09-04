package com.tencent.liteav.base.system;

import android.os.Build;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class p implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p f99681a = new p();

    private p() {
    }

    public static Callable a() {
        return f99681a;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return Build.BOARD;
    }
}
