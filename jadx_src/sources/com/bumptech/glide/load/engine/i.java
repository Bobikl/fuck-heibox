package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: Engine.java */
/* JADX INFO: loaded from: classes6.dex */
public class i implements k, com.bumptech.glide.load.engine.cache.j.a, n.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f41158j = 150;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f41160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f41161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.cache.j f41162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f41163d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final v f41164e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c f41165f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final a f41166g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.a f41167h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f41157i = "Engine";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final boolean f41159k = Log.isLoggable(f41157i, 2);

    /* JADX INFO: compiled from: Engine.java */
    @j1
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final DecodeJob.e f41168a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final androidx.core.util.n.a<DecodeJob<?>> f41169b = com.bumptech.glide.util.pool.a.e(150, new C0332a());

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f41170c;

        /* JADX INFO: renamed from: com.bumptech.glide.load.engine.i$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Engine.java */
        public class C0332a implements com.bumptech.glide.util.pool.a.d<DecodeJob<?>> {
            C0332a() {
            }

            @Override // com.bumptech.glide.util.pool.a.d
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public DecodeJob<?> a() {
                a aVar = a.this;
                return new DecodeJob<>(aVar.f41168a, aVar.f41169b);
            }
        }

        a(DecodeJob.e eVar) {
            this.f41168a = eVar;
        }

        <R> DecodeJob<R> a(com.bumptech.glide.d dVar, Object obj, l lVar, com.bumptech.glide.load.c cVar, int i10, int i11, Class<?> cls, Class<R> cls2, Priority priority, h hVar, Map<Class<?>, com.bumptech.glide.load.i<?>> map, boolean z10, boolean z11, boolean z12, com.bumptech.glide.load.f fVar, DecodeJob.b<R> bVar) {
            DecodeJob decodeJob = (DecodeJob) com.bumptech.glide.util.m.e(this.f41169b.a());
            int i12 = this.f41170c;
            this.f41170c = i12 + 1;
            return decodeJob.n(dVar, obj, lVar, cVar, i10, i11, cls, cls2, priority, hVar, map, z10, z11, z12, fVar, bVar, i12);
        }
    }

    /* JADX INFO: compiled from: Engine.java */
    @j1
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final com.bumptech.glide.load.engine.executor.a f41172a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final com.bumptech.glide.load.engine.executor.a f41173b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final com.bumptech.glide.load.engine.executor.a f41174c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final com.bumptech.glide.load.engine.executor.a f41175d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final k f41176e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final n.a f41177f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final androidx.core.util.n.a<j<?>> f41178g = com.bumptech.glide.util.pool.a.e(150, new a());

        /* JADX INFO: compiled from: Engine.java */
        public class a implements com.bumptech.glide.util.pool.a.d<j<?>> {
            a() {
            }

            @Override // com.bumptech.glide.util.pool.a.d
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public j<?> a() {
                b bVar = b.this;
                return new j<>(bVar.f41172a, bVar.f41173b, bVar.f41174c, bVar.f41175d, bVar.f41176e, bVar.f41177f, bVar.f41178g);
            }
        }

        b(com.bumptech.glide.load.engine.executor.a aVar, com.bumptech.glide.load.engine.executor.a aVar2, com.bumptech.glide.load.engine.executor.a aVar3, com.bumptech.glide.load.engine.executor.a aVar4, k kVar, n.a aVar5) {
            this.f41172a = aVar;
            this.f41173b = aVar2;
            this.f41174c = aVar3;
            this.f41175d = aVar4;
            this.f41176e = kVar;
            this.f41177f = aVar5;
        }

        <R> j<R> a(com.bumptech.glide.load.c cVar, boolean z10, boolean z11, boolean z12, boolean z13) {
            return ((j) com.bumptech.glide.util.m.e(this.f41178g.a())).l(cVar, z10, z11, z12, z13);
        }

        @j1
        void b() {
            com.bumptech.glide.util.f.c(this.f41172a);
            com.bumptech.glide.util.f.c(this.f41173b);
            com.bumptech.glide.util.f.c(this.f41174c);
            com.bumptech.glide.util.f.c(this.f41175d);
        }
    }

    /* JADX INFO: compiled from: Engine.java */
    public static class c implements DecodeJob.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.bumptech.glide.load.engine.cache.a.InterfaceC0327a f41180a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile com.bumptech.glide.load.engine.cache.a f41181b;

        c(com.bumptech.glide.load.engine.cache.a.InterfaceC0327a interfaceC0327a) {
            this.f41180a = interfaceC0327a;
        }

        @Override // com.bumptech.glide.load.engine.DecodeJob.e
        public com.bumptech.glide.load.engine.cache.a a() {
            if (this.f41181b == null) {
                synchronized (this) {
                    if (this.f41181b == null) {
                        this.f41181b = this.f41180a.build();
                    }
                    if (this.f41181b == null) {
                        this.f41181b = new com.bumptech.glide.load.engine.cache.b();
                    }
                }
            }
            return this.f41181b;
        }

        @j1
        synchronized void b() {
            if (this.f41181b == null) {
                return;
            }
            this.f41181b.clear();
        }
    }

    /* JADX INFO: compiled from: Engine.java */
    public class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final j<?> f41182a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.bumptech.glide.request.i f41183b;

        d(com.bumptech.glide.request.i iVar, j<?> jVar) {
            this.f41183b = iVar;
            this.f41182a = jVar;
        }

        public void a() {
            synchronized (i.this) {
                this.f41182a.s(this.f41183b);
            }
        }
    }

    @j1
    i(com.bumptech.glide.load.engine.cache.j jVar, com.bumptech.glide.load.engine.cache.a.InterfaceC0327a interfaceC0327a, com.bumptech.glide.load.engine.executor.a aVar, com.bumptech.glide.load.engine.executor.a aVar2, com.bumptech.glide.load.engine.executor.a aVar3, com.bumptech.glide.load.engine.executor.a aVar4, p pVar, m mVar, com.bumptech.glide.load.engine.a aVar5, b bVar, a aVar6, v vVar, boolean z10) {
        this.f41162c = jVar;
        c cVar = new c(interfaceC0327a);
        this.f41165f = cVar;
        com.bumptech.glide.load.engine.a aVar7 = aVar5 == null ? new com.bumptech.glide.load.engine.a(z10) : aVar5;
        this.f41167h = aVar7;
        aVar7.g(this);
        this.f41161b = mVar == null ? new m() : mVar;
        this.f41160a = pVar == null ? new p() : pVar;
        this.f41163d = bVar == null ? new b(aVar, aVar2, aVar3, aVar4, this, this) : bVar;
        this.f41166g = aVar6 == null ? new a(cVar) : aVar6;
        this.f41164e = vVar == null ? new v() : vVar;
        jVar.g(this);
    }

    public i(com.bumptech.glide.load.engine.cache.j jVar, com.bumptech.glide.load.engine.cache.a.InterfaceC0327a interfaceC0327a, com.bumptech.glide.load.engine.executor.a aVar, com.bumptech.glide.load.engine.executor.a aVar2, com.bumptech.glide.load.engine.executor.a aVar3, com.bumptech.glide.load.engine.executor.a aVar4, boolean z10) {
        this(jVar, interfaceC0327a, aVar, aVar2, aVar3, aVar4, null, null, null, null, null, null, z10);
    }

    private n<?> f(com.bumptech.glide.load.c cVar) {
        s<?> sVarF = this.f41162c.f(cVar);
        if (sVarF == null) {
            return null;
        }
        return sVarF instanceof n ? (n) sVarF : new n<>(sVarF, true, true, cVar, this);
    }

    @p0
    private n<?> h(com.bumptech.glide.load.c cVar) {
        n<?> nVarE = this.f41167h.e(cVar);
        if (nVarE != null) {
            nVarE.c();
        }
        return nVarE;
    }

    private n<?> i(com.bumptech.glide.load.c cVar) {
        n<?> nVarF = f(cVar);
        if (nVarF != null) {
            nVarF.c();
            this.f41167h.a(cVar, nVarF);
        }
        return nVarF;
    }

    @p0
    private n<?> j(l lVar, boolean z10, long j10) {
        if (!z10) {
            return null;
        }
        n<?> nVarH = h(lVar);
        if (nVarH != null) {
            if (f41159k) {
                k("Loaded resource from active resources", j10, lVar);
            }
            return nVarH;
        }
        n<?> nVarI = i(lVar);
        if (nVarI == null) {
            return null;
        }
        if (f41159k) {
            k("Loaded resource from cache", j10, lVar);
        }
        return nVarI;
    }

    private static void k(String str, long j10, com.bumptech.glide.load.c cVar) {
        Log.v(f41157i, str + " in " + com.bumptech.glide.util.i.a(j10) + "ms, key: " + cVar);
    }

    private <R> d n(com.bumptech.glide.d dVar, Object obj, com.bumptech.glide.load.c cVar, int i10, int i11, Class<?> cls, Class<R> cls2, Priority priority, h hVar, Map<Class<?>, com.bumptech.glide.load.i<?>> map, boolean z10, boolean z11, com.bumptech.glide.load.f fVar, boolean z12, boolean z13, boolean z14, boolean z15, com.bumptech.glide.request.i iVar, Executor executor, l lVar, long j10) {
        j<?> jVarA = this.f41160a.a(lVar, z15);
        if (jVarA != null) {
            jVarA.a(iVar, executor);
            if (f41159k) {
                k("Added to existing load", j10, lVar);
            }
            return new d(iVar, jVarA);
        }
        j<R> jVarA2 = this.f41163d.a(lVar, z12, z13, z14, z15);
        DecodeJob<R> decodeJobA = this.f41166g.a(dVar, obj, lVar, cVar, i10, i11, cls, cls2, priority, hVar, map, z10, z11, z15, fVar, jVarA2);
        this.f41160a.d(lVar, jVarA2);
        jVarA2.a(iVar, executor);
        jVarA2.t(decodeJobA);
        if (f41159k) {
            k("Started new load", j10, lVar);
        }
        return new d(iVar, jVarA2);
    }

    @Override // com.bumptech.glide.load.engine.k
    public synchronized void a(j<?> jVar, com.bumptech.glide.load.c cVar, n<?> nVar) {
        if (nVar != null) {
            if (nVar.e()) {
                this.f41167h.a(cVar, nVar);
            }
        }
        this.f41160a.e(cVar, jVar);
    }

    @Override // com.bumptech.glide.load.engine.k
    public synchronized void b(j<?> jVar, com.bumptech.glide.load.c cVar) {
        this.f41160a.e(cVar, jVar);
    }

    @Override // com.bumptech.glide.load.engine.n.a
    public void c(com.bumptech.glide.load.c cVar, n<?> nVar) {
        this.f41167h.d(cVar);
        if (nVar.e()) {
            this.f41162c.e(cVar, nVar);
        } else {
            this.f41164e.a(nVar, false);
        }
    }

    @Override // com.bumptech.glide.load.engine.cache.j.a
    public void d(@n0 s<?> sVar) {
        this.f41164e.a(sVar, true);
    }

    public void e() {
        this.f41165f.a().clear();
    }

    public <R> d g(com.bumptech.glide.d dVar, Object obj, com.bumptech.glide.load.c cVar, int i10, int i11, Class<?> cls, Class<R> cls2, Priority priority, h hVar, Map<Class<?>, com.bumptech.glide.load.i<?>> map, boolean z10, boolean z11, com.bumptech.glide.load.f fVar, boolean z12, boolean z13, boolean z14, boolean z15, com.bumptech.glide.request.i iVar, Executor executor) {
        long jB = f41159k ? com.bumptech.glide.util.i.b() : 0L;
        l lVarA = this.f41161b.a(obj, cVar, i10, i11, map, cls, cls2, fVar);
        synchronized (this) {
            n<?> nVarJ = j(lVarA, z12, jB);
            if (nVarJ == null) {
                return n(dVar, obj, cVar, i10, i11, cls, cls2, priority, hVar, map, z10, z11, fVar, z12, z13, z14, z15, iVar, executor, lVarA, jB);
            }
            iVar.c(nVarJ, DataSource.MEMORY_CACHE, false);
            return null;
        }
    }

    public void l(s<?> sVar) {
        if (!(sVar instanceof n)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((n) sVar).f();
    }

    @j1
    public void m() {
        this.f41163d.b();
        this.f41165f.b();
        this.f41167h.h();
    }
}
