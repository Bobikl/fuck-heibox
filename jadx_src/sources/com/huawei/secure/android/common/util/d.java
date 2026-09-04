package com.huawei.secure.android.common.util;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes7.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Handler f63109a = new Handler(Looper.getMainLooper());

    public static void a(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        f63109a.post(runnable);
    }
}
