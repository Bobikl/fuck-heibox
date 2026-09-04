package com.google.common.util.concurrent;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: AbstractScheduledService.java */
/* JADX INFO: loaded from: classes7.dex */
@u
@o9.c
public abstract class f implements Service {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f59400b = Logger.getLogger(f.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.common.util.concurrent.g f59401a = new g(this, null);

    /* JADX INFO: compiled from: AbstractScheduledService.java */
    public class a extends Service.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ScheduledExecutorService f59402a;

        a(f fVar, ScheduledExecutorService scheduledExecutorService) {
            this.f59402a = scheduledExecutorService;
        }

        @Override // com.google.common.util.concurrent.Service.a
        public void a(Service.State state, Throwable th2) {
            this.f59402a.shutdown();
        }

        @Override // com.google.common.util.concurrent.Service.a
        public void e(Service.State state) {
            this.f59402a.shutdown();
        }
    }

    /* JADX INFO: compiled from: AbstractScheduledService.java */
    public class b implements ThreadFactory {
        b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return y0.n(f.this.n(), runnable);
        }
    }

    /* JADX INFO: compiled from: AbstractScheduledService.java */
    public interface c {
        void cancel(boolean z10);

        boolean isCancelled();
    }

    /* JADX INFO: compiled from: AbstractScheduledService.java */
    public static abstract class d extends AbstractC0490f {

        /* JADX INFO: compiled from: AbstractScheduledService.java */
        public final class a implements Callable<Void> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Runnable f59404b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final ScheduledExecutorService f59405c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final com.google.common.util.concurrent.g f59406d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final ReentrantLock f59407e = new ReentrantLock();

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            @CheckForNull
            @t9.a("lock")
            private c f59408f;

            a(com.google.common.util.concurrent.g gVar, ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
                this.f59404b = runnable;
                this.f59405c = scheduledExecutorService;
                this.f59406d = gVar;
            }

            @t9.a("lock")
            private c b(b bVar) {
                c cVar = this.f59408f;
                if (cVar == null) {
                    c cVar2 = new c(this.f59407e, d(bVar));
                    this.f59408f = cVar2;
                    return cVar2;
                }
                if (!cVar.f59413b.isCancelled()) {
                    this.f59408f.f59413b = d(bVar);
                }
                return this.f59408f;
            }

            private ScheduledFuture<Void> d(b bVar) {
                return this.f59405c.schedule(this, bVar.f59410a, bVar.f59411b);
            }

            @Override // java.util.concurrent.Callable
            @CheckForNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Void call() throws Exception {
                this.f59404b.run();
                c();
                return null;
            }

            @s9.a
            public c c() {
                c eVar;
                try {
                    b bVarD = d.this.d();
                    Throwable th2 = null;
                    this.f59407e.lock();
                    try {
                        eVar = b(bVarD);
                    } catch (Throwable th3) {
                        th2 = th3;
                        try {
                            eVar = new e(j0.k());
                        } catch (Throwable th4) {
                            this.f59407e.unlock();
                            throw th4;
                        }
                    }
                    this.f59407e.unlock();
                    if (th2 != null) {
                        this.f59406d.t(th2);
                    }
                    return eVar;
                } catch (Throwable th5) {
                    this.f59406d.t(th5);
                    return new e(j0.k());
                }
            }
        }

        /* JADX INFO: compiled from: AbstractScheduledService.java */
        public static final class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final long f59410a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final TimeUnit f59411b;

            public b(long j10, TimeUnit timeUnit) {
                this.f59410a = j10;
                this.f59411b = (TimeUnit) com.google.common.base.w.E(timeUnit);
            }
        }

        /* JADX INFO: compiled from: AbstractScheduledService.java */
        public static final class c implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final ReentrantLock f59412a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @t9.a("lock")
            private Future<Void> f59413b;

            c(ReentrantLock reentrantLock, Future<Void> future) {
                this.f59412a = reentrantLock;
                this.f59413b = future;
            }

            @Override // com.google.common.util.concurrent.f.c
            public void cancel(boolean z10) {
                this.f59412a.lock();
                try {
                    this.f59413b.cancel(z10);
                } finally {
                    this.f59412a.unlock();
                }
            }

            @Override // com.google.common.util.concurrent.f.c
            public boolean isCancelled() {
                this.f59412a.lock();
                try {
                    return this.f59413b.isCancelled();
                } finally {
                    this.f59412a.unlock();
                }
            }
        }

        public d() {
            super(null);
        }

        @Override // com.google.common.util.concurrent.f.AbstractC0490f
        final c c(com.google.common.util.concurrent.g gVar, ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
            return new a(gVar, scheduledExecutorService, runnable).c();
        }

        protected abstract b d() throws Exception;
    }

    /* JADX INFO: compiled from: AbstractScheduledService.java */
    public static final class e implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Future<?> f59414a;

        e(Future<?> future) {
            this.f59414a = future;
        }

        @Override // com.google.common.util.concurrent.f.c
        public void cancel(boolean z10) {
            this.f59414a.cancel(z10);
        }

        @Override // com.google.common.util.concurrent.f.c
        public boolean isCancelled() {
            return this.f59414a.isCancelled();
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.f$f, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AbstractScheduledService.java */
    public static abstract class AbstractC0490f {

        /* JADX INFO: renamed from: com.google.common.util.concurrent.f$f$a */
        /* JADX INFO: compiled from: AbstractScheduledService.java */
        public class a extends AbstractC0490f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ long f59415a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f59416b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ TimeUnit f59417c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(long j10, long j11, TimeUnit timeUnit) {
                super(null);
                this.f59415a = j10;
                this.f59416b = j11;
                this.f59417c = timeUnit;
            }

            @Override // com.google.common.util.concurrent.f.AbstractC0490f
            public c c(com.google.common.util.concurrent.g gVar, ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
                return new e(scheduledExecutorService.scheduleWithFixedDelay(runnable, this.f59415a, this.f59416b, this.f59417c));
            }
        }

        /* JADX INFO: renamed from: com.google.common.util.concurrent.f$f$b */
        /* JADX INFO: compiled from: AbstractScheduledService.java */
        public class b extends AbstractC0490f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ long f59418a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f59419b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ TimeUnit f59420c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(long j10, long j11, TimeUnit timeUnit) {
                super(null);
                this.f59418a = j10;
                this.f59419b = j11;
                this.f59420c = timeUnit;
            }

            @Override // com.google.common.util.concurrent.f.AbstractC0490f
            public c c(com.google.common.util.concurrent.g gVar, ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
                return new e(scheduledExecutorService.scheduleAtFixedRate(runnable, this.f59418a, this.f59419b, this.f59420c));
            }
        }

        private AbstractC0490f() {
        }

        /* synthetic */ AbstractC0490f(a aVar) {
            this();
        }

        public static AbstractC0490f a(long j10, long j11, TimeUnit timeUnit) {
            com.google.common.base.w.E(timeUnit);
            com.google.common.base.w.p(j11 > 0, "delay must be > 0, found %s", j11);
            return new a(j10, j11, timeUnit);
        }

        public static AbstractC0490f b(long j10, long j11, TimeUnit timeUnit) {
            com.google.common.base.w.E(timeUnit);
            com.google.common.base.w.p(j11 > 0, "period must be > 0, found %s", j11);
            return new b(j10, j11, timeUnit);
        }

        abstract c c(com.google.common.util.concurrent.g gVar, ScheduledExecutorService scheduledExecutorService, Runnable runnable);
    }

    /* JADX INFO: compiled from: AbstractScheduledService.java */
    public final class g extends com.google.common.util.concurrent.g {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        @CheckForNull
        private volatile c f59421p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        @CheckForNull
        private volatile ScheduledExecutorService f59422q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final ReentrantLock f59423r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final Runnable f59424s;

        /* JADX INFO: compiled from: AbstractScheduledService.java */
        public class a implements com.google.common.base.c0<String> {
            a() {
            }

            @Override // com.google.common.base.c0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public String get() {
                String strN = f.this.n();
                String strValueOf = String.valueOf(g.this.h());
                StringBuilder sb2 = new StringBuilder(String.valueOf(strN).length() + 1 + strValueOf.length());
                sb2.append(strN);
                sb2.append(" ");
                sb2.append(strValueOf);
                return sb2.toString();
            }
        }

        /* JADX INFO: compiled from: AbstractScheduledService.java */
        public class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                g.this.f59423r.lock();
                try {
                    f.this.p();
                    g gVar = g.this;
                    gVar.f59421p = f.this.m().c(f.this.f59401a, g.this.f59422q, g.this.f59424s);
                    g.this.u();
                } catch (Throwable th2) {
                    try {
                        g.this.t(th2);
                        if (g.this.f59421p != null) {
                            g.this.f59421p.cancel(false);
                        }
                    } finally {
                        g.this.f59423r.unlock();
                    }
                }
            }
        }

        /* JADX INFO: compiled from: AbstractScheduledService.java */
        public class c implements Runnable {
            c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    g.this.f59423r.lock();
                    try {
                        if (g.this.h() != Service.State.STOPPING) {
                            g.this.f59423r.unlock();
                            return;
                        }
                        f.this.o();
                        g.this.f59423r.unlock();
                        g.this.v();
                    } catch (Throwable th2) {
                        g.this.f59423r.unlock();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    g.this.t(th3);
                }
            }
        }

        /* JADX INFO: compiled from: AbstractScheduledService.java */
        public class d implements Runnable {
            d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                g.this.f59423r.lock();
                try {
                    c cVar = g.this.f59421p;
                    Objects.requireNonNull(cVar);
                    if (cVar.isCancelled()) {
                        g.this.f59423r.unlock();
                        return;
                    }
                    f.this.l();
                } catch (Throwable th2) {
                    try {
                        try {
                            f.this.o();
                        } catch (Exception e10) {
                            f.f59400b.log(Level.WARNING, "Error while attempting to shut down the service after failure.", (Throwable) e10);
                        }
                        g.this.t(th2);
                        c cVar2 = g.this.f59421p;
                        Objects.requireNonNull(cVar2);
                        cVar2.cancel(false);
                    } finally {
                        g.this.f59423r.unlock();
                    }
                }
            }
        }

        private g() {
            this.f59423r = new ReentrantLock();
            this.f59424s = new d();
        }

        /* synthetic */ g(f fVar, a aVar) {
            this();
        }

        @Override // com.google.common.util.concurrent.g
        protected final void m() {
            this.f59422q = y0.s(f.this.k(), new a());
            this.f59422q.execute(new b());
        }

        @Override // com.google.common.util.concurrent.g
        protected final void n() {
            Objects.requireNonNull(this.f59421p);
            Objects.requireNonNull(this.f59422q);
            this.f59421p.cancel(false);
            this.f59422q.execute(new c());
        }

        @Override // com.google.common.util.concurrent.g
        public String toString() {
            return f.this.toString();
        }
    }

    protected f() {
    }

    @Override // com.google.common.util.concurrent.Service
    public final void a(Service.a aVar, Executor executor) {
        this.f59401a.a(aVar, executor);
    }

    @Override // com.google.common.util.concurrent.Service
    public final void b(long j10, TimeUnit timeUnit) throws TimeoutException {
        this.f59401a.b(j10, timeUnit);
    }

    @Override // com.google.common.util.concurrent.Service
    public final void c(long j10, TimeUnit timeUnit) throws TimeoutException {
        this.f59401a.c(j10, timeUnit);
    }

    @Override // com.google.common.util.concurrent.Service
    public final void d() {
        this.f59401a.d();
    }

    @Override // com.google.common.util.concurrent.Service
    public final Throwable e() {
        return this.f59401a.e();
    }

    @Override // com.google.common.util.concurrent.Service
    public final void f() {
        this.f59401a.f();
    }

    @Override // com.google.common.util.concurrent.Service
    @s9.a
    public final Service g() {
        this.f59401a.g();
        return this;
    }

    @Override // com.google.common.util.concurrent.Service
    public final Service.State h() {
        return this.f59401a.h();
    }

    @Override // com.google.common.util.concurrent.Service
    public final boolean isRunning() {
        return this.f59401a.isRunning();
    }

    protected ScheduledExecutorService k() {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new b());
        a(new a(this, scheduledExecutorServiceNewSingleThreadScheduledExecutor), y0.c());
        return scheduledExecutorServiceNewSingleThreadScheduledExecutor;
    }

    protected abstract void l() throws Exception;

    protected abstract AbstractC0490f m();

    protected String n() {
        return getClass().getSimpleName();
    }

    protected void o() throws Exception {
    }

    protected void p() throws Exception {
    }

    @Override // com.google.common.util.concurrent.Service
    @s9.a
    public final Service stopAsync() {
        this.f59401a.stopAsync();
        return this;
    }

    public String toString() {
        String strN = n();
        String strValueOf = String.valueOf(h());
        StringBuilder sb2 = new StringBuilder(String.valueOf(strN).length() + 3 + strValueOf.length());
        sb2.append(strN);
        sb2.append(" [");
        sb2.append(strValueOf);
        sb2.append("]");
        return sb2.toString();
    }
}
