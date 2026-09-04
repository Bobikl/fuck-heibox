package com.bumptech.glide.load.engine;

import android.os.Process;
import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: ActiveResources.java */
/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f40949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f40950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @j1
    final Map<com.bumptech.glide.load.c, d> f40951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ReferenceQueue<n<?>> f40952d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private n.a f40953e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile boolean f40954f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p0
    private volatile c f40955g;

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ActiveResources.java */
    public class ThreadFactoryC0325a implements ThreadFactory {

        /* JADX INFO: renamed from: com.bumptech.glide.load.engine.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ActiveResources.java */
        public class RunnableC0326a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Runnable f40956b;

            RunnableC0326a(Runnable runnable) {
                this.f40956b = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                Process.setThreadPriority(10);
                this.f40956b.run();
            }
        }

        ThreadFactoryC0325a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@n0 Runnable runnable) {
            return new Thread(new RunnableC0326a(runnable), "glide-active-resources");
        }
    }

    /* JADX INFO: compiled from: ActiveResources.java */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.b();
        }
    }

    /* JADX INFO: compiled from: ActiveResources.java */
    @j1
    public interface c {
        void a();
    }

    /* JADX INFO: compiled from: ActiveResources.java */
    @j1
    public static final class d extends WeakReference<n<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final com.bumptech.glide.load.c f40959a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final boolean f40960b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @p0
        s<?> f40961c;

        d(@n0 com.bumptech.glide.load.c cVar, @n0 n<?> nVar, @n0 ReferenceQueue<? super n<?>> referenceQueue, boolean z10) {
            super(nVar, referenceQueue);
            this.f40959a = (com.bumptech.glide.load.c) com.bumptech.glide.util.m.e(cVar);
            this.f40961c = (nVar.e() && z10) ? (s) com.bumptech.glide.util.m.e(nVar.d()) : null;
            this.f40960b = nVar.e();
        }

        void a() {
            this.f40961c = null;
            clear();
        }
    }

    a(boolean z10) {
        this(z10, Executors.newSingleThreadExecutor(new ThreadFactoryC0325a()));
    }

    @j1
    a(boolean z10, Executor executor) {
        this.f40951c = new HashMap();
        this.f40952d = new ReferenceQueue<>();
        this.f40949a = z10;
        this.f40950b = executor;
        executor.execute(new b());
    }

    synchronized void a(com.bumptech.glide.load.c cVar, n<?> nVar) {
        d dVarPut = this.f40951c.put(cVar, new d(cVar, nVar, this.f40952d, this.f40949a));
        if (dVarPut != null) {
            dVarPut.a();
        }
    }

    void b() {
        while (!this.f40954f) {
            try {
                c((d) this.f40952d.remove());
                c cVar = this.f40955g;
                if (cVar != null) {
                    cVar.a();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    void c(@n0 d dVar) {
        s<?> sVar;
        synchronized (this) {
            this.f40951c.remove(dVar.f40959a);
            if (dVar.f40960b && (sVar = dVar.f40961c) != null) {
                this.f40953e.c(dVar.f40959a, new n<>(sVar, true, false, dVar.f40959a, this.f40953e));
            }
        }
    }

    synchronized void d(com.bumptech.glide.load.c cVar) {
        d dVarRemove = this.f40951c.remove(cVar);
        if (dVarRemove != null) {
            dVarRemove.a();
        }
    }

    @p0
    synchronized n<?> e(com.bumptech.glide.load.c cVar) {
        d dVar = this.f40951c.get(cVar);
        if (dVar == null) {
            return null;
        }
        n<?> nVar = dVar.get();
        if (nVar == null) {
            c(dVar);
        }
        return nVar;
    }

    @j1
    void f(c cVar) {
        this.f40955g = cVar;
    }

    void g(n.a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.f40953e = aVar;
            }
        }
    }

    @j1
    void h() {
        this.f40954f = true;
        Executor executor = this.f40950b;
        if (executor instanceof ExecutorService) {
            com.bumptech.glide.util.f.c((ExecutorService) executor);
        }
    }
}
