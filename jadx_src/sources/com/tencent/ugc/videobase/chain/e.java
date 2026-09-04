package com.tencent.ugc.videobase.chain;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runnable f103879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CountDownLatch f103880b;

    private e(Runnable runnable, CountDownLatch countDownLatch) {
        this.f103879a = runnable;
        this.f103880b = countDownLatch;
    }

    public static Runnable a(Runnable runnable, CountDownLatch countDownLatch) {
        return new e(runnable, countDownLatch);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXCGPUImageFilter.lambda$runOnDrawAndWaitDone$4(this.f103879a, this.f103880b);
    }
}
