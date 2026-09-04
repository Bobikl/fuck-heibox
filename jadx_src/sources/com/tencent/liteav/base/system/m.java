package com.tencent.liteav.base.system;

import android.os.Build;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final m f99678a = new m();

    private m() {
    }

    public static Callable a() {
        return f99678a;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return Build.HARDWARE;
    }
}
