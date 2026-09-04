package io.reactivex.internal.util;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: BlockingIgnoringReceiver.java */
/* JADX INFO: loaded from: classes5.dex */
public final class d extends CountDownLatch implements kh.g<Throwable>, kh.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Throwable f123869b;

    public d() {
        super(1);
    }

    @Override // kh.g
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void accept(Throwable th2) {
        this.f123869b = th2;
        countDown();
    }

    @Override // kh.a
    public void run() {
        countDown();
    }
}
