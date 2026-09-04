package com.bytedance.realx.video;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class o implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CountDownLatch f42215b;

    @Override // java.lang.Runnable
    public final void run() {
        this.f42215b.countDown();
    }
}
