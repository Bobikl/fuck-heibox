package com.tencent.liteav.base.system;

import android.os.Build;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final h f99673a = new h();

    private h() {
    }

    public static Callable a() {
        return f99673a;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return Build.SUPPORTED_ABIS;
    }
}
