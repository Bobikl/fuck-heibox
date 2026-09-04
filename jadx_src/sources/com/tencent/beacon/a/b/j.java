package com.tencent.beacon.a.b;

import androidx.annotation.n0;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: BeaconThreadFactory.java */
/* JADX INFO: loaded from: classes4.dex */
public final class j implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicInteger f98775a = new AtomicInteger(1);

    public String a() {
        return "beacon-thread-" + this.f98775a.getAndIncrement();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(@n0 Runnable runnable) {
        try {
            return new Thread(runnable, a());
        } catch (Exception e10) {
            com.tencent.beacon.base.util.c.a(e10);
            return null;
        } catch (OutOfMemoryError unused) {
            com.tencent.beacon.base.util.c.b("[task] memory not enough, create thread failed.", new Object[0]);
            return null;
        }
    }
}
