package com.tencent.liteav.base.util;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runnable f99698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CountDownLatch f99699b;

    private c(Runnable runnable, CountDownLatch countDownLatch) {
        this.f99698a = runnable;
        this.f99699b = countDownLatch;
    }

    public static Runnable a(Runnable runnable, CountDownLatch countDownLatch) {
        return new c(runnable, countDownLatch);
    }

    @Override // java.lang.Runnable
    public final void run() {
        CustomHandler.lambda$runAndWaitDone$1(this.f99698a, this.f99699b);
    }
}
