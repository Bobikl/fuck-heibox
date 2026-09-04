package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.bumptech.glide.load.DataSource;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: SourceGenerator.java */
/* JADX INFO: loaded from: classes6.dex */
public class w implements e, e.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f41297i = "SourceGenerator";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f<?> f41298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e.a f41299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile int f41300d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile b f41301e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile Object f41302f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile com.bumptech.glide.load.model.o.a<?> f41303g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile c f41304h;

    /* JADX INFO: compiled from: SourceGenerator.java */
    public class a implements com.bumptech.glide.load.data.d.a<Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.bumptech.glide.load.model.o.a f41305b;

        a(com.bumptech.glide.load.model.o.a aVar) {
            this.f41305b = aVar;
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void e(@p0 Object obj) {
            if (w.this.g(this.f41305b)) {
                w.this.h(this.f41305b, obj);
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void f(@n0 Exception exc) {
            if (w.this.g(this.f41305b)) {
                w.this.i(this.f41305b, exc);
            }
        }
    }

    w(f<?> fVar, e.a aVar) {
        this.f41298b = fVar;
        this.f41299c = aVar;
    }

    private boolean e(Object obj) throws Throwable {
        long jB = com.bumptech.glide.util.i.b();
        boolean z10 = true;
        try {
            com.bumptech.glide.load.data.e<T> eVarO = this.f41298b.o(obj);
            Object objA = eVarO.a();
            com.bumptech.glide.load.a<X> aVarQ = this.f41298b.q(objA);
            d dVar = new d(aVarQ, objA, this.f41298b.k());
            c cVar = new c(this.f41303g.f41378a, this.f41298b.p());
            com.bumptech.glide.load.engine.cache.a aVarD = this.f41298b.d();
            aVarD.a(cVar, dVar);
            if (Log.isLoggable(f41297i, 2)) {
                Log.v(f41297i, "Finished encoding source to cache, key: " + cVar + ", data: " + obj + ", encoder: " + aVarQ + ", duration: " + com.bumptech.glide.util.i.a(jB));
            }
            if (aVarD.b(cVar) != null) {
                this.f41304h = cVar;
                this.f41301e = new b(Collections.singletonList(this.f41303g.f41378a), this.f41298b, this);
                this.f41303g.f41380c.b();
                return true;
            }
            if (Log.isLoggable(f41297i, 3)) {
                Log.d(f41297i, "Attempt to write: " + this.f41304h + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.f41299c.d(this.f41303g.f41378a, eVarO.a(), this.f41303g.f41380c, this.f41303g.f41380c.c(), this.f41303g.f41378a);
                return false;
            } catch (Throwable th2) {
                th = th2;
                if (!z10) {
                    this.f41303g.f41380c.b();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            z10 = false;
        }
    }

    private boolean f() {
        return this.f41300d < this.f41298b.g().size();
    }

    private void j(com.bumptech.glide.load.model.o.a<?> aVar) {
        this.f41303g.f41380c.d(this.f41298b.l(), new a(aVar));
    }

    @Override // com.bumptech.glide.load.engine.e
    public boolean a() {
        if (this.f41302f != null) {
            Object obj = this.f41302f;
            this.f41302f = null;
            try {
                if (!e(obj)) {
                    return true;
                }
            } catch (IOException e10) {
                if (Log.isLoggable(f41297i, 3)) {
                    Log.d(f41297i, "Failed to properly rewind or write data to cache", e10);
                }
            }
        }
        if (this.f41301e != null && this.f41301e.a()) {
            return true;
        }
        this.f41301e = null;
        this.f41303g = null;
        boolean z10 = false;
        while (!z10 && f()) {
            List<com.bumptech.glide.load.model.o.a<?>> listG = this.f41298b.g();
            int i10 = this.f41300d;
            this.f41300d = i10 + 1;
            this.f41303g = listG.get(i10);
            if (this.f41303g != null && (this.f41298b.e().c(this.f41303g.f41380c.c()) || this.f41298b.u(this.f41303g.f41380c.a()))) {
                j(this.f41303g);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.load.engine.e.a
    public void b(com.bumptech.glide.load.c cVar, Exception exc, com.bumptech.glide.load.data.d<?> dVar, DataSource dataSource) {
        this.f41299c.b(cVar, exc, dVar, this.f41303g.f41380c.c());
    }

    @Override // com.bumptech.glide.load.engine.e.a
    public void c() {
        throw new UnsupportedOperationException();
    }

    @Override // com.bumptech.glide.load.engine.e
    public void cancel() {
        com.bumptech.glide.load.model.o.a<?> aVar = this.f41303g;
        if (aVar != null) {
            aVar.f41380c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.engine.e.a
    public void d(com.bumptech.glide.load.c cVar, Object obj, com.bumptech.glide.load.data.d<?> dVar, DataSource dataSource, com.bumptech.glide.load.c cVar2) {
        this.f41299c.d(cVar, obj, dVar, this.f41303g.f41380c.c(), cVar);
    }

    boolean g(com.bumptech.glide.load.model.o.a<?> aVar) {
        com.bumptech.glide.load.model.o.a<?> aVar2 = this.f41303g;
        return aVar2 != null && aVar2 == aVar;
    }

    void h(com.bumptech.glide.load.model.o.a<?> aVar, Object obj) {
        h hVarE = this.f41298b.e();
        if (obj != null && hVarE.c(aVar.f41380c.c())) {
            this.f41302f = obj;
            this.f41299c.c();
        } else {
            e.a aVar2 = this.f41299c;
            com.bumptech.glide.load.c cVar = aVar.f41378a;
            com.bumptech.glide.load.data.d<?> dVar = aVar.f41380c;
            aVar2.d(cVar, obj, dVar, dVar.c(), this.f41304h);
        }
    }

    void i(com.bumptech.glide.load.model.o.a<?> aVar, @n0 Exception exc) {
        e.a aVar2 = this.f41299c;
        c cVar = this.f41304h;
        com.bumptech.glide.load.data.d<?> dVar = aVar.f41380c;
        aVar2.b(cVar, exc, dVar, dVar.c());
    }
}
