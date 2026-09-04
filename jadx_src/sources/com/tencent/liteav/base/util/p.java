package com.tencent.liteav.base.util;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class p implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runnable f99728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CountDownLatch f99729b;

    private p(Runnable runnable, CountDownLatch countDownLatch) {
        this.f99728a = runnable;
        this.f99729b = countDownLatch;
    }

    public static Runnable a(Runnable runnable, CountDownLatch countDownLatch) {
        return new p(runnable, countDownLatch);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = this.f99728a;
        CountDownLatch countDownLatch = this.f99729b;
        runnable.run();
        countDownLatch.countDown();
    }
}
