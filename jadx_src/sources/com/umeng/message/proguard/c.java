package com.umeng.message.proguard;

import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Future<?> f105786a;

    public final c a() {
        this.f105786a = b();
        return this;
    }

    protected abstract Future<?> b();

    public final void c() {
        Future<?> future = this.f105786a;
        if (future != null) {
            try {
                if (!future.isCancelled() && !future.isDone()) {
                    future.cancel(false);
                }
            } catch (Throwable unused) {
            }
        }
        this.f105786a = null;
    }

    public final boolean d() {
        Future<?> future = this.f105786a;
        return (future == null || future.isDone()) ? false : true;
    }
}
