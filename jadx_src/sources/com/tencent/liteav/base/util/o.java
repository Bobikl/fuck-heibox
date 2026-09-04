package com.tencent.liteav.base.util;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runnable f99726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CountDownLatch f99727b;

    private o(Runnable runnable, CountDownLatch countDownLatch) {
        this.f99726a = runnable;
        this.f99727b = countDownLatch;
    }

    public static Runnable a(Runnable runnable, CountDownLatch countDownLatch) {
        return new o(runnable, countDownLatch);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = this.f99726a;
        CountDownLatch countDownLatch = this.f99727b;
        runnable.run();
        countDownLatch.countDown();
    }
}
