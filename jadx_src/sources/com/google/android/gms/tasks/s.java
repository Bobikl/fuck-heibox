package com.google.android.gms.tasks;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* JADX INFO: loaded from: classes7.dex */
public final class s<T> implements t<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CountDownLatch f52793a = new CountDownLatch(1);

    private s() {
    }

    /* synthetic */ s(r rVar) {
    }

    public final void a() throws InterruptedException {
        this.f52793a.await();
    }

    public final boolean b(long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.f52793a.await(j10, timeUnit);
    }

    @Override // com.google.android.gms.tasks.d
    public final void onCanceled() {
        this.f52793a.countDown();
    }

    @Override // com.google.android.gms.tasks.f
    public final void onFailure(@androidx.annotation.n0 Exception exc) {
        this.f52793a.countDown();
    }

    @Override // com.google.android.gms.tasks.g
    public final void onSuccess(T t10) {
        this.f52793a.countDown();
    }
}
