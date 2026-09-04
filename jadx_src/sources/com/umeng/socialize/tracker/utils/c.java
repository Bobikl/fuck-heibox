package com.umeng.socialize.tracker.utils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: TaskPool.java */
/* JADX INFO: loaded from: classes4.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f106394a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ExecutorService f106395b = Executors.newFixedThreadPool(1);

    public static void a(Runnable runnable) {
        if (runnable != null) {
            f106395b.execute(runnable);
        }
    }
}
