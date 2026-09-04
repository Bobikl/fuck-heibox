package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: AbstractIdleService.java */
/* JADX INFO: loaded from: classes7.dex */
@u
@o9.c
public abstract class d implements Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.common.base.c0<String> f59388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Service f59389b;

    /* JADX INFO: compiled from: AbstractIdleService.java */
    public class a implements Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            y0.n((String) d.this.f59388a.get(), runnable).start();
        }
    }

    /* JADX INFO: compiled from: AbstractIdleService.java */
    public final class b extends g {

        /* JADX INFO: compiled from: AbstractIdleService.java */
        public class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    d.this.m();
                    b.this.u();
                } catch (Throwable th2) {
                    b.this.t(th2);
                }
            }
        }

        /* JADX INFO: renamed from: com.google.common.util.concurrent.d$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AbstractIdleService.java */
        public class RunnableC0488b implements Runnable {
            RunnableC0488b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    d.this.l();
                    b.this.v();
                } catch (Throwable th2) {
                    b.this.t(th2);
                }
            }
        }

        private b() {
        }

        /* synthetic */ b(d dVar, a aVar) {
            this();
        }

        @Override // com.google.common.util.concurrent.g
        protected final void m() {
            y0.q(d.this.j(), d.this.f59388a).execute(new a());
        }

        @Override // com.google.common.util.concurrent.g
        protected final void n() {
            y0.q(d.this.j(), d.this.f59388a).execute(new RunnableC0488b());
        }

        @Override // com.google.common.util.concurrent.g
        public String toString() {
            return d.this.toString();
        }
    }

    /* JADX INFO: compiled from: AbstractIdleService.java */
    public final class c implements com.google.common.base.c0<String> {
        private c() {
        }

        /* synthetic */ c(d dVar, a aVar) {
            this();
        }

        @Override // com.google.common.base.c0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String get() {
            String strK = d.this.k();
            String strValueOf = String.valueOf(d.this.h());
            StringBuilder sb2 = new StringBuilder(String.valueOf(strK).length() + 1 + strValueOf.length());
            sb2.append(strK);
            sb2.append(" ");
            sb2.append(strValueOf);
            return sb2.toString();
        }
    }

    protected d() {
        a aVar = null;
        this.f59388a = new c(this, aVar);
        this.f59389b = new b(this, aVar);
    }

    @Override // com.google.common.util.concurrent.Service
    public final void a(Service.a aVar, Executor executor) {
        this.f59389b.a(aVar, executor);
    }

    @Override // com.google.common.util.concurrent.Service
    public final void b(long j10, TimeUnit timeUnit) throws TimeoutException {
        this.f59389b.b(j10, timeUnit);
    }

    @Override // com.google.common.util.concurrent.Service
    public final void c(long j10, TimeUnit timeUnit) throws TimeoutException {
        this.f59389b.c(j10, timeUnit);
    }

    @Override // com.google.common.util.concurrent.Service
    public final void d() {
        this.f59389b.d();
    }

    @Override // com.google.common.util.concurrent.Service
    public final Throwable e() {
        return this.f59389b.e();
    }

    @Override // com.google.common.util.concurrent.Service
    public final void f() {
        this.f59389b.f();
    }

    @Override // com.google.common.util.concurrent.Service
    @s9.a
    public final Service g() {
        this.f59389b.g();
        return this;
    }

    @Override // com.google.common.util.concurrent.Service
    public final Service.State h() {
        return this.f59389b.h();
    }

    @Override // com.google.common.util.concurrent.Service
    public final boolean isRunning() {
        return this.f59389b.isRunning();
    }

    protected Executor j() {
        return new a();
    }

    protected String k() {
        return getClass().getSimpleName();
    }

    protected abstract void l() throws Exception;

    protected abstract void m() throws Exception;

    @Override // com.google.common.util.concurrent.Service
    @s9.a
    public final Service stopAsync() {
        this.f59389b.stopAsync();
        return this;
    }

    public String toString() {
        String strK = k();
        String strValueOf = String.valueOf(h());
        StringBuilder sb2 = new StringBuilder(String.valueOf(strK).length() + 3 + strValueOf.length());
        sb2.append(strK);
        sb2.append(" [");
        sb2.append(strValueOf);
        sb2.append("]");
        return sb2.toString();
    }
}
