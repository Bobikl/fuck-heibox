package io.reactivex.android.schedulers;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import io.reactivex.disposables.c;
import io.reactivex.h0;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: HandlerScheduler.java */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends h0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f119521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f119522d;

    /* JADX INFO: compiled from: HandlerScheduler.java */
    public static final class a extends h0.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Handler f119523b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f119524c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private volatile boolean f119525d;

        a(Handler handler, boolean z10) {
            this.f119523b = handler;
            this.f119524c = z10;
        }

        @Override // io.reactivex.h0.c
        @SuppressLint({"NewApi"})
        public io.reactivex.disposables.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
            if (runnable == null) {
                throw new NullPointerException("run == null");
            }
            if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            }
            if (this.f119525d) {
                return c.a();
            }
            RunnableC1093b runnableC1093b = new RunnableC1093b(this.f119523b, io.reactivex.plugins.a.b0(runnable));
            Message messageObtain = Message.obtain(this.f119523b, runnableC1093b);
            messageObtain.obj = this;
            if (this.f119524c) {
                messageObtain.setAsynchronous(true);
            }
            this.f119523b.sendMessageDelayed(messageObtain, timeUnit.toMillis(j10));
            if (!this.f119525d) {
                return runnableC1093b;
            }
            this.f119523b.removeCallbacks(runnableC1093b);
            return c.a();
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f119525d = true;
            this.f119523b.removeCallbacksAndMessages(this);
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f119525d;
        }
    }

    /* JADX INFO: renamed from: io.reactivex.android.schedulers.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: HandlerScheduler.java */
    public static final class RunnableC1093b implements Runnable, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Handler f119526b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Runnable f119527c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private volatile boolean f119528d;

        RunnableC1093b(Handler handler, Runnable runnable) {
            this.f119526b = handler;
            this.f119527c = runnable;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f119526b.removeCallbacks(this);
            this.f119528d = true;
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f119528d;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f119527c.run();
            } catch (Throwable th2) {
                io.reactivex.plugins.a.Y(th2);
            }
        }
    }

    b(Handler handler, boolean z10) {
        this.f119521c = handler;
        this.f119522d = z10;
    }

    @Override // io.reactivex.h0
    public h0.c c() {
        return new a(this.f119521c, this.f119522d);
    }

    @Override // io.reactivex.h0
    public io.reactivex.disposables.b g(Runnable runnable, long j10, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        RunnableC1093b runnableC1093b = new RunnableC1093b(this.f119521c, io.reactivex.plugins.a.b0(runnable));
        this.f119521c.postDelayed(runnableC1093b, timeUnit.toMillis(j10));
        return runnableC1093b;
    }
}
