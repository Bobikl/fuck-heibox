package com.heytap.mcssdk.utils;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: ThreadUtil.java */
/* JADX INFO: loaded from: classes7.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ExecutorService f59980a = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Handler f59981b = new Handler(Looper.getMainLooper());

    public static void a(Runnable runnable) {
        f59980a.execute(runnable);
    }

    public static void b(Runnable runnable) {
        f59981b.post(runnable);
    }
}
