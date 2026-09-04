package com.umeng.socialize.a;

import java.lang.ref.WeakReference;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: UMAppScanner.java */
/* JADX INFO: loaded from: classes4.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static WeakReference<Future<?>> f106101a;

    public static void a() {
        Future<?> future;
        WeakReference<Future<?>> weakReference = f106101a;
        if (weakReference == null || (future = weakReference.get()) == null || future.isDone() || future.isCancelled()) {
            f106101a = new WeakReference<>(j.a(new g()));
        }
    }
}
