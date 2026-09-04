package androidx.work.impl.utils;

import androidx.annotation.j1;
import androidx.annotation.n0;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: SerialExecutorImpl.java */
/* JADX INFO: loaded from: classes6.dex */
public class v implements androidx.work.impl.utils.taskexecutor.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f29384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.b0("mLock")
    private Runnable f29385d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayDeque<a> f29383b = new ArrayDeque<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Object f29386e = new Object();

    /* JADX INFO: compiled from: SerialExecutorImpl.java */
    public static class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final v f29387b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Runnable f29388c;

        a(@n0 v vVar, @n0 Runnable runnable) {
            this.f29387b = vVar;
            this.f29388c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f29388c.run();
                synchronized (this.f29387b.f29386e) {
                    this.f29387b.b();
                }
            } catch (Throwable th2) {
                synchronized (this.f29387b.f29386e) {
                    this.f29387b.b();
                    throw th2;
                }
            }
        }
    }

    public v(@n0 Executor executor) {
        this.f29384c = executor;
    }

    @Override // androidx.work.impl.utils.taskexecutor.a
    public boolean W() {
        boolean z10;
        synchronized (this.f29386e) {
            z10 = !this.f29383b.isEmpty();
        }
        return z10;
    }

    @j1
    @n0
    public Executor a() {
        return this.f29384c;
    }

    @androidx.annotation.b0("mLock")
    void b() {
        a aVarPoll = this.f29383b.poll();
        this.f29385d = aVarPoll;
        if (aVarPoll != null) {
            this.f29384c.execute(aVarPoll);
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(@n0 Runnable runnable) {
        synchronized (this.f29386e) {
            this.f29383b.add(new a(this, runnable));
            if (this.f29385d == null) {
                b();
            }
        }
    }
}
