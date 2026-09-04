package com.bumptech.glide.load.engine;

import androidx.annotation.b0;
import androidx.annotation.j1;
import androidx.annotation.n0;
import com.bumptech.glide.load.DataSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: EngineJob.java */
/* JADX INFO: loaded from: classes6.dex */
public class j<R> implements DecodeJob.b<R>, com.bumptech.glide.util.pool.a.f {
    private static final c A = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final e f41185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.util.pool.c f41186c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final n.a f41187d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final androidx.core.util.n.a<j<?>> f41188e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c f41189f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final k f41190g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.executor.a f41191h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.executor.a f41192i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.executor.a f41193j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.executor.a f41194k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final AtomicInteger f41195l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private com.bumptech.glide.load.c f41196m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f41197n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f41198o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f41199p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f41200q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private s<?> f41201r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    DataSource f41202s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f41203t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    GlideException f41204u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f41205v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    n<?> f41206w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private DecodeJob<R> f41207x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private volatile boolean f41208y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f41209z;

    /* JADX INFO: compiled from: EngineJob.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.bumptech.glide.request.i f41210b;

        a(com.bumptech.glide.request.i iVar) {
            this.f41210b = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f41210b.g()) {
                synchronized (j.this) {
                    if (j.this.f41185b.b(this.f41210b)) {
                        j.this.f(this.f41210b);
                    }
                    j.this.i();
                }
            }
        }
    }

    /* JADX INFO: compiled from: EngineJob.java */
    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.bumptech.glide.request.i f41212b;

        b(com.bumptech.glide.request.i iVar) {
            this.f41212b = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f41212b.g()) {
                synchronized (j.this) {
                    if (j.this.f41185b.b(this.f41212b)) {
                        j.this.f41206w.c();
                        j.this.g(this.f41212b);
                        j.this.s(this.f41212b);
                    }
                    j.this.i();
                }
            }
        }
    }

    /* JADX INFO: compiled from: EngineJob.java */
    @j1
    public static class c {
        c() {
        }

        public <R> n<R> a(s<R> sVar, boolean z10, com.bumptech.glide.load.c cVar, n.a aVar) {
            return new n<>(sVar, z10, true, cVar, aVar);
        }
    }

    /* JADX INFO: compiled from: EngineJob.java */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final com.bumptech.glide.request.i f41214a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Executor f41215b;

        d(com.bumptech.glide.request.i iVar, Executor executor) {
            this.f41214a = iVar;
            this.f41215b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f41214a.equals(((d) obj).f41214a);
            }
            return false;
        }

        public int hashCode() {
            return this.f41214a.hashCode();
        }
    }

    /* JADX INFO: compiled from: EngineJob.java */
    public static final class e implements Iterable<d> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<d> f41216b;

        e() {
            this(new ArrayList(2));
        }

        e(List<d> list) {
            this.f41216b = list;
        }

        private static d g(com.bumptech.glide.request.i iVar) {
            return new d(iVar, com.bumptech.glide.util.f.a());
        }

        void a(com.bumptech.glide.request.i iVar, Executor executor) {
            this.f41216b.add(new d(iVar, executor));
        }

        boolean b(com.bumptech.glide.request.i iVar) {
            return this.f41216b.contains(g(iVar));
        }

        void clear() {
            this.f41216b.clear();
        }

        e e() {
            return new e(new ArrayList(this.f41216b));
        }

        void h(com.bumptech.glide.request.i iVar) {
            this.f41216b.remove(g(iVar));
        }

        boolean isEmpty() {
            return this.f41216b.isEmpty();
        }

        @Override // java.lang.Iterable
        @n0
        public Iterator<d> iterator() {
            return this.f41216b.iterator();
        }

        int size() {
            return this.f41216b.size();
        }
    }

    j(com.bumptech.glide.load.engine.executor.a aVar, com.bumptech.glide.load.engine.executor.a aVar2, com.bumptech.glide.load.engine.executor.a aVar3, com.bumptech.glide.load.engine.executor.a aVar4, k kVar, n.a aVar5, androidx.core.util.n.a<j<?>> aVar6) {
        this(aVar, aVar2, aVar3, aVar4, kVar, aVar5, aVar6, A);
    }

    @j1
    j(com.bumptech.glide.load.engine.executor.a aVar, com.bumptech.glide.load.engine.executor.a aVar2, com.bumptech.glide.load.engine.executor.a aVar3, com.bumptech.glide.load.engine.executor.a aVar4, k kVar, n.a aVar5, androidx.core.util.n.a<j<?>> aVar6, c cVar) {
        this.f41185b = new e();
        this.f41186c = com.bumptech.glide.util.pool.c.a();
        this.f41195l = new AtomicInteger();
        this.f41191h = aVar;
        this.f41192i = aVar2;
        this.f41193j = aVar3;
        this.f41194k = aVar4;
        this.f41190g = kVar;
        this.f41187d = aVar5;
        this.f41188e = aVar6;
        this.f41189f = cVar;
    }

    private com.bumptech.glide.load.engine.executor.a j() {
        if (this.f41198o) {
            return this.f41193j;
        }
        return this.f41199p ? this.f41194k : this.f41192i;
    }

    private boolean n() {
        return this.f41205v || this.f41203t || this.f41208y;
    }

    private synchronized void r() {
        if (this.f41196m == null) {
            throw new IllegalArgumentException();
        }
        this.f41185b.clear();
        this.f41196m = null;
        this.f41206w = null;
        this.f41201r = null;
        this.f41205v = false;
        this.f41208y = false;
        this.f41203t = false;
        this.f41209z = false;
        this.f41207x.y(false);
        this.f41207x = null;
        this.f41204u = null;
        this.f41202s = null;
        this.f41188e.b(this);
    }

    synchronized void a(com.bumptech.glide.request.i iVar, Executor executor) {
        this.f41186c.c();
        this.f41185b.a(iVar, executor);
        boolean z10 = true;
        if (this.f41203t) {
            k(1);
            executor.execute(new b(iVar));
        } else if (this.f41205v) {
            k(1);
            executor.execute(new a(iVar));
        } else {
            if (this.f41208y) {
                z10 = false;
            }
            com.bumptech.glide.util.m.b(z10, "Cannot add callbacks to a cancelled EngineJob");
        }
    }

    @Override // com.bumptech.glide.load.engine.DecodeJob.b
    public void b(GlideException glideException) {
        synchronized (this) {
            this.f41204u = glideException;
        }
        o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.load.engine.DecodeJob.b
    public void c(s<R> sVar, DataSource dataSource, boolean z10) {
        synchronized (this) {
            this.f41201r = sVar;
            this.f41202s = dataSource;
            this.f41209z = z10;
        }
        p();
    }

    @Override // com.bumptech.glide.load.engine.DecodeJob.b
    public void d(DecodeJob<?> decodeJob) {
        j().execute(decodeJob);
    }

    @Override // com.bumptech.glide.util.pool.a.f
    @n0
    public com.bumptech.glide.util.pool.c e() {
        return this.f41186c;
    }

    @b0("this")
    void f(com.bumptech.glide.request.i iVar) {
        try {
            iVar.b(this.f41204u);
        } catch (Throwable th2) {
            throw new CallbackException(th2);
        }
    }

    @b0("this")
    void g(com.bumptech.glide.request.i iVar) {
        try {
            iVar.c(this.f41206w, this.f41202s, this.f41209z);
        } catch (Throwable th2) {
            throw new CallbackException(th2);
        }
    }

    void h() {
        if (n()) {
            return;
        }
        this.f41208y = true;
        this.f41207x.a();
        this.f41190g.b(this, this.f41196m);
    }

    void i() {
        n<?> nVar;
        synchronized (this) {
            this.f41186c.c();
            com.bumptech.glide.util.m.b(n(), "Not yet complete!");
            int iDecrementAndGet = this.f41195l.decrementAndGet();
            com.bumptech.glide.util.m.b(iDecrementAndGet >= 0, "Can't decrement below 0");
            if (iDecrementAndGet == 0) {
                nVar = this.f41206w;
                r();
            } else {
                nVar = null;
            }
        }
        if (nVar != null) {
            nVar.f();
        }
    }

    synchronized void k(int i10) {
        n<?> nVar;
        com.bumptech.glide.util.m.b(n(), "Not yet complete!");
        if (this.f41195l.getAndAdd(i10) == 0 && (nVar = this.f41206w) != null) {
            nVar.c();
        }
    }

    @j1
    synchronized j<R> l(com.bumptech.glide.load.c cVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f41196m = cVar;
        this.f41197n = z10;
        this.f41198o = z11;
        this.f41199p = z12;
        this.f41200q = z13;
        return this;
    }

    synchronized boolean m() {
        return this.f41208y;
    }

    void o() {
        synchronized (this) {
            this.f41186c.c();
            if (this.f41208y) {
                r();
                return;
            }
            if (this.f41185b.isEmpty()) {
                throw new IllegalStateException("Received an exception without any callbacks to notify");
            }
            if (this.f41205v) {
                throw new IllegalStateException("Already failed once");
            }
            this.f41205v = true;
            com.bumptech.glide.load.c cVar = this.f41196m;
            e eVarE = this.f41185b.e();
            k(eVarE.size() + 1);
            this.f41190g.a(this, cVar, null);
            for (d dVar : eVarE) {
                dVar.f41215b.execute(new a(dVar.f41214a));
            }
            i();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    void p() {
        synchronized (this) {
            this.f41186c.c();
            if (this.f41208y) {
                this.f41201r.recycle();
                r();
                return;
            }
            if (this.f41185b.isEmpty()) {
                throw new IllegalStateException("Received a resource without any callbacks to notify");
            }
            if (this.f41203t) {
                throw new IllegalStateException("Already have resource");
            }
            this.f41206w = this.f41189f.a(this.f41201r, this.f41197n, this.f41196m, this.f41187d);
            this.f41203t = true;
            e eVarE = this.f41185b.e();
            k(eVarE.size() + 1);
            this.f41190g.a(this, this.f41196m, this.f41206w);
            for (d dVar : eVarE) {
                dVar.f41215b.execute(new b(dVar.f41214a));
            }
            i();
        }
    }

    boolean q() {
        return this.f41200q;
    }

    synchronized void s(com.bumptech.glide.request.i iVar) {
        this.f41186c.c();
        this.f41185b.h(iVar);
        if (this.f41185b.isEmpty()) {
            h();
            if ((this.f41203t || this.f41205v) && this.f41195l.get() == 0) {
                r();
            }
        }
    }

    public synchronized void t(DecodeJob<R> decodeJob) {
        this.f41207x = decodeJob;
        (decodeJob.L() ? this.f41191h : j()).execute(decodeJob);
    }
}
