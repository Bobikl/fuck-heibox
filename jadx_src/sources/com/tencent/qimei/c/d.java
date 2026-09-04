package com.tencent.qimei.c;

import androidx.annotation.n0;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: BeaconThreadFactory.java */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f101220a = new AtomicInteger(1);

    public String a() {
        return "qimei-thread-" + this.f101220a.getAndIncrement();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(@n0 Runnable runnable) {
        try {
            return new Thread(runnable, a());
        } catch (Exception e10) {
            com.tencent.qimei.n.a.a(e10);
            return null;
        } catch (OutOfMemoryError unused) {
            com.tencent.qimei.n.a.b("[task] memory not enough, create thread failed.", new Object[0]);
            return null;
        }
    }
}
