package com.bumptech.glide.load.model;

import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: MultiModelLoaderFactory.java */
/* JADX INFO: loaded from: classes6.dex */
public class s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final c f41394e = new c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final o<Object, Object> f41395f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<b<?, ?>> f41396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f41397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<b<?, ?>> f41398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.core.util.n.a<List<Throwable>> f41399d;

    /* JADX INFO: compiled from: MultiModelLoaderFactory.java */
    public static class a implements o<Object, Object> {
        a() {
        }

        @Override // com.bumptech.glide.load.model.o
        @p0
        public o.a<Object> a(@n0 Object obj, int i10, int i11, @n0 com.bumptech.glide.load.f fVar) {
            return null;
        }

        @Override // com.bumptech.glide.load.model.o
        public boolean b(@n0 Object obj) {
            return false;
        }
    }

    /* JADX INFO: compiled from: MultiModelLoaderFactory.java */
    public static class b<Model, Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class<Model> f41400a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Class<Data> f41401b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final p<? extends Model, ? extends Data> f41402c;

        public b(@n0 Class<Model> cls, @n0 Class<Data> cls2, @n0 p<? extends Model, ? extends Data> pVar) {
            this.f41400a = cls;
            this.f41401b = cls2;
            this.f41402c = pVar;
        }

        public boolean a(@n0 Class<?> cls) {
            return this.f41400a.isAssignableFrom(cls);
        }

        public boolean b(@n0 Class<?> cls, @n0 Class<?> cls2) {
            return a(cls) && this.f41401b.isAssignableFrom(cls2);
        }
    }

    /* JADX INFO: compiled from: MultiModelLoaderFactory.java */
    public static class c {
        c() {
        }

        @n0
        public <Model, Data> r<Model, Data> a(@n0 List<o<Model, Data>> list, @n0 androidx.core.util.n.a<List<Throwable>> aVar) {
            return new r<>(list, aVar);
        }
    }

    public s(@n0 androidx.core.util.n.a<List<Throwable>> aVar) {
        this(aVar, f41394e);
    }

    @j1
    s(@n0 androidx.core.util.n.a<List<Throwable>> aVar, @n0 c cVar) {
        this.f41396a = new ArrayList();
        this.f41398c = new HashSet();
        this.f41399d = aVar;
        this.f41397b = cVar;
    }

    private <Model, Data> void a(@n0 Class<Model> cls, @n0 Class<Data> cls2, @n0 p<? extends Model, ? extends Data> pVar, boolean z10) {
        b<?, ?> bVar = new b<>(cls, cls2, pVar);
        List<b<?, ?>> list = this.f41396a;
        list.add(z10 ? list.size() : 0, bVar);
    }

    @n0
    private <Model, Data> o<Model, Data> c(@n0 b<?, ?> bVar) {
        return (o) com.bumptech.glide.util.m.e(bVar.f41402c.d(this));
    }

    @n0
    private static <Model, Data> o<Model, Data> f() {
        return (o<Model, Data>) f41395f;
    }

    @n0
    private <Model, Data> p<Model, Data> h(@n0 b<?, ?> bVar) {
        return (p<Model, Data>) bVar.f41402c;
    }

    synchronized <Model, Data> void b(@n0 Class<Model> cls, @n0 Class<Data> cls2, @n0 p<? extends Model, ? extends Data> pVar) {
        a(cls, cls2, pVar, true);
    }

    @n0
    public synchronized <Model, Data> o<Model, Data> d(@n0 Class<Model> cls, @n0 Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z10 = false;
            for (b<?, ?> bVar : this.f41396a) {
                if (this.f41398c.contains(bVar)) {
                    z10 = true;
                } else if (bVar.b(cls, cls2)) {
                    this.f41398c.add(bVar);
                    arrayList.add(c(bVar));
                    this.f41398c.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                return this.f41397b.a(arrayList, this.f41399d);
            }
            if (arrayList.size() == 1) {
                return (o) arrayList.get(0);
            }
            if (!z10) {
                throw new Registry.NoModelLoaderAvailableException((Class<?>) cls, (Class<?>) cls2);
            }
            return f();
        } catch (Throwable th2) {
            this.f41398c.clear();
            throw th2;
        }
    }

    @n0
    synchronized <Model> List<o<Model, ?>> e(@n0 Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b<?, ?> bVar : this.f41396a) {
                if (!this.f41398c.contains(bVar) && bVar.a(cls)) {
                    this.f41398c.add(bVar);
                    arrayList.add(c(bVar));
                    this.f41398c.remove(bVar);
                }
            }
        } catch (Throwable th2) {
            this.f41398c.clear();
            throw th2;
        }
        return arrayList;
    }

    @n0
    synchronized List<Class<?>> g(@n0 Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b<?, ?> bVar : this.f41396a) {
            if (!arrayList.contains(bVar.f41401b) && bVar.a(cls)) {
                arrayList.add(bVar.f41401b);
            }
        }
        return arrayList;
    }

    synchronized <Model, Data> void i(@n0 Class<Model> cls, @n0 Class<Data> cls2, @n0 p<? extends Model, ? extends Data> pVar) {
        a(cls, cls2, pVar, false);
    }

    @n0
    synchronized <Model, Data> List<p<? extends Model, ? extends Data>> j(@n0 Class<Model> cls, @n0 Class<Data> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<b<?, ?>> it = this.f41396a.iterator();
        while (it.hasNext()) {
            b<?, ?> next = it.next();
            if (next.b(cls, cls2)) {
                it.remove();
                arrayList.add(h(next));
            }
        }
        return arrayList;
    }

    @n0
    synchronized <Model, Data> List<p<? extends Model, ? extends Data>> k(@n0 Class<Model> cls, @n0 Class<Data> cls2, @n0 p<? extends Model, ? extends Data> pVar) {
        List<p<? extends Model, ? extends Data>> listJ;
        listJ = j(cls, cls2);
        b(cls, cls2, pVar);
        return listJ;
    }
}
