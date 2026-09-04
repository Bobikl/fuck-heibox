package io.reactivex.android;

import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: MainThreadDisposable.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a implements io.reactivex.disposables.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f119515b = new AtomicBoolean();

    /* JADX INFO: renamed from: io.reactivex.android.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: MainThreadDisposable.java */
    public class RunnableC1091a implements Runnable {
        RunnableC1091a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.a();
        }
    }

    public static void b() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("Expected to be called on the main thread but was " + Thread.currentThread().getName());
    }

    protected abstract void a();

    @Override // io.reactivex.disposables.b
    public final void dispose() {
        if (this.f119515b.compareAndSet(false, true)) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                a();
            } else {
                io.reactivex.android.schedulers.a.c().f(new RunnableC1091a());
            }
        }
    }

    @Override // io.reactivex.disposables.b
    public final boolean isDisposed() {
        return this.f119515b.get();
    }
}
