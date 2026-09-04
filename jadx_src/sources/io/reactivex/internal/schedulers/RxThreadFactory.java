package io.reactivex.internal.schedulers;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes5.dex */
public final class RxThreadFactory extends AtomicLong implements ThreadFactory {
    private static final long serialVersionUID = -7789753024099756196L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f123636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f123637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f123638d;

    public static final class a extends Thread implements h {
        a(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    public RxThreadFactory(String str) {
        this(str, 5, false);
    }

    public RxThreadFactory(String str, int i10) {
        this(str, i10, false);
    }

    public RxThreadFactory(String str, int i10, boolean z10) {
        this.f123636b = str;
        this.f123637c = i10;
        this.f123638d = z10;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        String str = this.f123636b + '-' + incrementAndGet();
        Thread aVar = this.f123638d ? new a(runnable, str) : new Thread(runnable, str);
        aVar.setPriority(this.f123637c);
        aVar.setDaemon(true);
        return aVar;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public String toString() {
        return "RxThreadFactory[" + this.f123636b + "]";
    }
}
