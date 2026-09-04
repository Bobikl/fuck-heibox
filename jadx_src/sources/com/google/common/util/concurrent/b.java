package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: AbstractExecutionThreadService.java */
/* JADX INFO: loaded from: classes7.dex */
@u
@o9.c
public abstract class b implements Service {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f59382b = Logger.getLogger(b.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Service f59383a = new a();

    /* JADX INFO: compiled from: AbstractExecutionThreadService.java */
    public class a extends g {

        /* JADX INFO: renamed from: com.google.common.util.concurrent.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AbstractExecutionThreadService.java */
        public class C0485a implements com.google.common.base.c0<String> {
            C0485a() {
            }

            @Override // com.google.common.base.c0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public String get() {
                return b.this.l();
            }
        }

        /* JADX INFO: renamed from: com.google.common.util.concurrent.b$a$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AbstractExecutionThreadService.java */
        public class RunnableC0486b implements Runnable {
            RunnableC0486b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    b.this.n();
                    a.this.u();
                    if (a.this.isRunning()) {
                        try {
                            b.this.k();
                        } catch (Throwable th2) {
                            try {
                                b.this.m();
                            } catch (Exception e10) {
                                b.f59382b.log(Level.WARNING, "Error while attempting to shut down the service after failure.", (Throwable) e10);
                            }
                            a.this.t(th2);
                            return;
                        }
                    }
                    b.this.m();
                    a.this.v();
                } catch (Throwable th3) {
                    a.this.t(th3);
                }
            }
        }

        a() {
        }

        @Override // com.google.common.util.concurrent.g
        protected final void m() {
            y0.q(b.this.j(), new C0485a()).execute(new RunnableC0486b());
        }

        @Override // com.google.common.util.concurrent.g
        protected void n() {
            b.this.o();
        }

        @Override // com.google.common.util.concurrent.g
        public String toString() {
            return b.this.toString();
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AbstractExecutionThreadService.java */
    public class ExecutorC0487b implements Executor {
        ExecutorC0487b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            y0.n(b.this.l(), runnable).start();
        }
    }

    protected b() {
    }

    @Override // com.google.common.util.concurrent.Service
    public final void a(Service.a aVar, Executor executor) {
        this.f59383a.a(aVar, executor);
    }

    @Override // com.google.common.util.concurrent.Service
    public final void b(long j10, TimeUnit timeUnit) throws TimeoutException {
        this.f59383a.b(j10, timeUnit);
    }

    @Override // com.google.common.util.concurrent.Service
    public final void c(long j10, TimeUnit timeUnit) throws TimeoutException {
        this.f59383a.c(j10, timeUnit);
    }

    @Override // com.google.common.util.concurrent.Service
    public final void d() {
        this.f59383a.d();
    }

    @Override // com.google.common.util.concurrent.Service
    public final Throwable e() {
        return this.f59383a.e();
    }

    @Override // com.google.common.util.concurrent.Service
    public final void f() {
        this.f59383a.f();
    }

    @Override // com.google.common.util.concurrent.Service
    @s9.a
    public final Service g() {
        this.f59383a.g();
        return this;
    }

    @Override // com.google.common.util.concurrent.Service
    public final Service.State h() {
        return this.f59383a.h();
    }

    @Override // com.google.common.util.concurrent.Service
    public final boolean isRunning() {
        return this.f59383a.isRunning();
    }

    protected Executor j() {
        return new ExecutorC0487b();
    }

    protected abstract void k() throws Exception;

    protected String l() {
        return getClass().getSimpleName();
    }

    protected void m() throws Exception {
    }

    protected void n() throws Exception {
    }

    @o9.a
    protected void o() {
    }

    @Override // com.google.common.util.concurrent.Service
    @s9.a
    public final Service stopAsync() {
        this.f59383a.stopAsync();
        return this;
    }

    public String toString() {
        String strL = l();
        String strValueOf = String.valueOf(h());
        StringBuilder sb2 = new StringBuilder(String.valueOf(strL).length() + 3 + strValueOf.length());
        sb2.append(strL);
        sb2.append(" [");
        sb2.append(strValueOf);
        sb2.append("]");
        return sb2.toString();
    }
}
