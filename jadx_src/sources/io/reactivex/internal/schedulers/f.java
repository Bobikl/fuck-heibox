package io.reactivex.internal.schedulers;

import io.reactivex.h0;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: NewThreadScheduler.java */
/* JADX INFO: loaded from: classes5.dex */
public final class f extends h0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final ThreadFactory f123718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f123715d = "RxNewThreadScheduler";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f123717f = "rx2.newthread-priority";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final RxThreadFactory f123716e = new RxThreadFactory(f123715d, Math.max(1, Math.min(10, Integer.getInteger(f123717f, 5).intValue())));

    public f() {
        this(f123716e);
    }

    public f(ThreadFactory threadFactory) {
        this.f123718c = threadFactory;
    }

    @Override // io.reactivex.h0
    @jh.e
    public h0.c c() {
        return new g(this.f123718c);
    }
}
