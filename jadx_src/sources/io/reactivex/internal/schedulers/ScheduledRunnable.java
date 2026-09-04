package io.reactivex.internal.schedulers;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes5.dex */
public final class ScheduledRunnable extends AtomicReferenceArray<Object> implements Runnable, Callable<Object>, io.reactivex.disposables.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Object f123639c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final Object f123640d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final Object f123641e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final Object f123642f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final int f123643g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final int f123644h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final int f123645i = 2;
    private static final long serialVersionUID = -6120223772001106981L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Runnable f123646b;

    public ScheduledRunnable(Runnable runnable, io.reactivex.internal.disposables.a aVar) {
        super(3);
        this.f123646b = runnable;
        lazySet(0, aVar);
    }

    public void a(Future<?> future) {
        Object obj;
        do {
            obj = get(1);
            if (obj == f123642f) {
                return;
            }
            if (obj == f123640d) {
                future.cancel(false);
                return;
            } else if (obj == f123641e) {
                future.cancel(true);
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        run();
        return null;
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        while (true) {
            Object obj5 = get(1);
            if (obj5 == f123642f || obj5 == (obj3 = f123640d) || obj5 == (obj4 = f123641e)) {
                break;
            }
            boolean z10 = get(2) != Thread.currentThread();
            if (z10) {
                obj3 = obj4;
            }
            if (compareAndSet(1, obj5, obj3)) {
                if (obj5 == null) {
                    break;
                }
                ((Future) obj5).cancel(z10);
                break;
            }
        }
        do {
            obj = get(0);
            if (obj == f123642f || obj == (obj2 = f123639c) || obj == null) {
                return;
            }
        } while (!compareAndSet(0, obj, obj2));
        ((io.reactivex.internal.disposables.a) obj).b(this);
    }

    @Override // io.reactivex.disposables.b
    public boolean isDisposed() {
        Object obj = get(0);
        return obj == f123639c || obj == f123642f;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj;
        Object obj2;
        lazySet(2, Thread.currentThread());
        try {
            this.f123646b.run();
        } catch (Throwable th2) {
            try {
                io.reactivex.plugins.a.Y(th2);
            } finally {
                lazySet(2, null);
                Object obj3 = get(0);
                if (obj3 != f123639c && compareAndSet(0, obj3, f123642f) && obj3 != null) {
                    ((io.reactivex.internal.disposables.a) obj3).b(this);
                }
                do {
                    obj = get(1);
                    if (obj == f123640d || obj == f123641e) {
                        break;
                    }
                } while (!compareAndSet(1, obj, f123642f));
            }
        }
        lazySet(2, null);
        Object obj4 = get(0);
        if (obj4 != f123639c && compareAndSet(0, obj4, f123642f) && obj4 != null) {
            ((io.reactivex.internal.disposables.a) obj4).b(this);
        }
        do {
            obj = get(1);
            Object obj5 = f123640d;
            if (obj == obj5) {
                return;
            } else {
                if (obj == obj2) {
                    return;
                }
            }
        } while (!compareAndSet(1, obj, f123642f));
    }
}
