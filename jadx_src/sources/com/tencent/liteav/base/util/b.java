package com.tencent.liteav.base.util;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runnable f99696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CountDownLatch f99697b;

    private b(Runnable runnable, CountDownLatch countDownLatch) {
        this.f99696a = runnable;
        this.f99697b = countDownLatch;
    }

    public static Runnable a(Runnable runnable, CountDownLatch countDownLatch) {
        return new b(runnable, countDownLatch);
    }

    @Override // java.lang.Runnable
    public final void run() {
        CustomHandler.lambda$runAndWaitDone$0(this.f99696a, this.f99697b);
    }
}
