package com.umeng.message.proguard;

import java.lang.ref.WeakReference;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes4.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static WeakReference<Future<?>> f105831a;

    public static synchronized void a() {
        Future<?> future;
        WeakReference<Future<?>> weakReference = f105831a;
        if (weakReference == null || (future = weakReference.get()) == null || future.isDone() || future.isCancelled()) {
            f105831a = new WeakReference<>(b.b(new m()));
        }
    }
}
