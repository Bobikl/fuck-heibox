package com.igexin.a.a.d;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final AtomicInteger f63280a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f63281b;

    public j(h hVar) {
        this.f63281b = hVar;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        return new Thread(runnable, "TS-pool-" + this.f63280a.incrementAndGet());
    }
}
