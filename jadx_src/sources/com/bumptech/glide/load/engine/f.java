package com.bumptech.glide.load.engine;

import com.bumptech.glide.Priority;
import com.bumptech.glide.Registry;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: DecodeHelper.java */
/* JADX INFO: loaded from: classes6.dex */
public final class f<Transcode> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<com.bumptech.glide.load.model.o.a<?>> f41128a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<com.bumptech.glide.load.c> f41129b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.bumptech.glide.d f41130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f41131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f41132e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f41133f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Class<?> f41134g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private DecodeJob.e f41135h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.bumptech.glide.load.f f41136i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Map<Class<?>, com.bumptech.glide.load.i<?>> f41137j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Class<Transcode> f41138k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f41139l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f41140m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private com.bumptech.glide.load.c f41141n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Priority f41142o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private h f41143p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f41144q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f41145r;

    f() {
    }

    void a() {
        this.f41130c = null;
        this.f41131d = null;
        this.f41141n = null;
        this.f41134g = null;
        this.f41138k = null;
        this.f41136i = null;
        this.f41142o = null;
        this.f41137j = null;
        this.f41143p = null;
        this.f41128a.clear();
        this.f41139l = false;
        this.f41129b.clear();
        this.f41140m = false;
    }

    com.bumptech.glide.load.engine.bitmap_recycle.b b() {
        return this.f41130c.b();
    }

    List<com.bumptech.glide.load.c> c() {
        if (!this.f41140m) {
            this.f41140m = true;
            this.f41129b.clear();
            List<com.bumptech.glide.load.model.o.a<?>> listG = g();
            int size = listG.size();
            for (int i10 = 0; i10 < size; i10++) {
                com.bumptech.glide.load.model.o.a<?> aVar = listG.get(i10);
                if (!this.f41129b.contains(aVar.f41378a)) {
                    this.f41129b.add(aVar.f41378a);
                }
                for (int i11 = 0; i11 < aVar.f41379b.size(); i11++) {
                    if (!this.f41129b.contains(aVar.f41379b.get(i11))) {
                        this.f41129b.add(aVar.f41379b.get(i11));
                    }
                }
            }
        }
        return this.f41129b;
    }

    com.bumptech.glide.load.engine.cache.a d() {
        return this.f41135h.a();
    }

    h e() {
        return this.f41143p;
    }

    int f() {
        return this.f41133f;
    }

    List<com.bumptech.glide.load.model.o.a<?>> g() {
        if (!this.f41139l) {
            this.f41139l = true;
            this.f41128a.clear();
            List listI = this.f41130c.i().i(this.f41131d);
            int size = listI.size();
            for (int i10 = 0; i10 < size; i10++) {
                com.bumptech.glide.load.model.o.a<?> aVarA = ((com.bumptech.glide.load.model.o) listI.get(i10)).a(this.f41131d, this.f41132e, this.f41133f, this.f41136i);
                if (aVarA != null) {
                    this.f41128a.add(aVarA);
                }
            }
        }
        return this.f41128a;
    }

    <Data> q<Data, ?, Transcode> h(Class<Data> cls) {
        return this.f41130c.i().h(cls, this.f41134g, this.f41138k);
    }

    Class<?> i() {
        return this.f41131d.getClass();
    }

    List<com.bumptech.glide.load.model.o<File, ?>> j(File file) throws Registry.NoModelLoaderAvailableException {
        return this.f41130c.i().i(file);
    }

    com.bumptech.glide.load.f k() {
        return this.f41136i;
    }

    Priority l() {
        return this.f41142o;
    }

    List<Class<?>> m() {
        return this.f41130c.i().j(this.f41131d.getClass(), this.f41134g, this.f41138k);
    }

    <Z> com.bumptech.glide.load.h<Z> n(s<Z> sVar) {
        return this.f41130c.i().k(sVar);
    }

    <T> com.bumptech.glide.load.data.e<T> o(T t10) {
        return this.f41130c.i().l(t10);
    }

    com.bumptech.glide.load.c p() {
        return this.f41141n;
    }

    <X> com.bumptech.glide.load.a<X> q(X x10) throws Registry.NoSourceEncoderAvailableException {
        return this.f41130c.i().m(x10);
    }

    Class<?> r() {
        return this.f41138k;
    }

    <Z> com.bumptech.glide.load.i<Z> s(Class<Z> cls) {
        com.bumptech.glide.load.i<Z> iVar = (com.bumptech.glide.load.i) this.f41137j.get(cls);
        if (iVar == null) {
            for (Map.Entry<Class<?>, com.bumptech.glide.load.i<?>> entry : this.f41137j.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    iVar = (com.bumptech.glide.load.i) entry.getValue();
                    break;
                }
            }
        }
        if (iVar != null) {
            return iVar;
        }
        if (!this.f41137j.isEmpty() || !this.f41144q) {
            return com.bumptech.glide.load.resource.c.c();
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    int t() {
        return this.f41132e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    boolean u(Class<?> cls) {
        return h(cls) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    <R> void v(com.bumptech.glide.d dVar, Object obj, com.bumptech.glide.load.c cVar, int i10, int i11, h hVar, Class<?> cls, Class<R> cls2, Priority priority, com.bumptech.glide.load.f fVar, Map<Class<?>, com.bumptech.glide.load.i<?>> map, boolean z10, boolean z11, DecodeJob.e eVar) {
        this.f41130c = dVar;
        this.f41131d = obj;
        this.f41141n = cVar;
        this.f41132e = i10;
        this.f41133f = i11;
        this.f41143p = hVar;
        this.f41134g = cls;
        this.f41135h = eVar;
        this.f41138k = cls2;
        this.f41142o = priority;
        this.f41136i = fVar;
        this.f41137j = map;
        this.f41144q = z10;
        this.f41145r = z11;
    }

    boolean w(s<?> sVar) {
        return this.f41130c.i().n(sVar);
    }

    boolean x() {
        return this.f41145r;
    }

    boolean y(com.bumptech.glide.load.c cVar) {
        List<com.bumptech.glide.load.model.o.a<?>> listG = g();
        int size = listG.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (listG.get(i10).f41378a.equals(cVar)) {
                return true;
            }
        }
        return false;
    }
}
