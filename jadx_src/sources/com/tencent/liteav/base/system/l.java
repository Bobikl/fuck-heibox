package com.tencent.liteav.base.system;

import android.os.Build;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final l f99677a = new l();

    private l() {
    }

    public static Callable a() {
        return f99677a;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return Build.MANUFACTURER;
    }
}
