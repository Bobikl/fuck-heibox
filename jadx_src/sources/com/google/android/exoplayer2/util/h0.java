package com.google.android.exoplayer2.util;

import java.lang.Exception;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: RunnableFutureTask.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class h0<R, E extends Exception> implements RunnableFuture<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f51408b = new h();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h f51409c = new h();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f51410d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.p0
    private Exception f51411e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.p0
    private R f51412f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.p0
    private Thread f51413g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f51414h;

    protected h0() {
    }

    @p0
    private R e() throws ExecutionException {
        if (this.f51414h) {
            throw new CancellationException();
        }
        if (this.f51411e == null) {
            return this.f51412f;
        }
        throw new ExecutionException(this.f51411e);
    }

    public final void a() {
        this.f51409c.c();
    }

    public final void b() {
        this.f51408b.c();
    }

    protected void c() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        synchronized (this.f51410d) {
            if (!this.f51414h && !this.f51409c.e()) {
                this.f51414h = true;
                c();
                Thread thread = this.f51413g;
                if (thread == null) {
                    this.f51408b.f();
                    this.f51409c.f();
                } else if (z10) {
                    thread.interrupt();
                }
                return true;
            }
            return false;
        }
    }

    @p0
    protected abstract R d() throws Exception;

    @Override // java.util.concurrent.Future
    @p0
    public final R get() throws ExecutionException, InterruptedException {
        this.f51409c.a();
        return e();
    }

    @Override // java.util.concurrent.Future
    @p0
    public final R get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (this.f51409c.b(TimeUnit.MILLISECONDS.convert(j10, timeUnit))) {
            return e();
        }
        throw new TimeoutException();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f51414h;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f51409c.e();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        synchronized (this.f51410d) {
            if (this.f51414h) {
                return;
            }
            this.f51413g = Thread.currentThread();
            this.f51408b.f();
            try {
                try {
                    this.f51412f = d();
                    synchronized (this.f51410d) {
                        this.f51409c.f();
                        this.f51413g = null;
                        Thread.interrupted();
                    }
                } catch (Exception e10) {
                    this.f51411e = e10;
                    synchronized (this.f51410d) {
                        this.f51409c.f();
                        this.f51413g = null;
                        Thread.interrupted();
                    }
                }
            } catch (Throwable th2) {
                synchronized (this.f51410d) {
                    this.f51409c.f();
                    this.f51413g = null;
                    Thread.interrupted();
                    throw th2;
                }
            }
        }
    }
}
