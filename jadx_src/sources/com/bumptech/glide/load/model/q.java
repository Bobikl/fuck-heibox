package com.bumptech.glide.load.model;

import androidx.annotation.n0;
import androidx.annotation.p0;
import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: ModelLoaderRegistry.java */
/* JADX INFO: loaded from: classes6.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f41381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f41382b;

    /* JADX INFO: compiled from: ModelLoaderRegistry.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<Class<?>, C0337a<?>> f41383a = new HashMap();

        /* JADX INFO: renamed from: com.bumptech.glide.load.model.q$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ModelLoaderRegistry.java */
        public static class C0337a<Model> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final List<o<Model, ?>> f41384a;

            public C0337a(List<o<Model, ?>> list) {
                this.f41384a = list;
            }
        }

        a() {
        }

        public void a() {
            this.f41383a.clear();
        }

        @p0
        public <Model> List<o<Model, ?>> b(Class<Model> cls) {
            C0337a<?> c0337a = this.f41383a.get(cls);
            if (c0337a == null) {
                return null;
            }
            return (List<o<Model, ?>>) c0337a.f41384a;
        }

        public <Model> void c(Class<Model> cls, List<o<Model, ?>> list) {
            if (this.f41383a.put(cls, new C0337a<>(list)) == null) {
                return;
            }
            throw new IllegalStateException("Already cached loaders for model: " + cls);
        }
    }

    public q(@n0 androidx.core.util.n.a<List<Throwable>> aVar) {
        this(new s(aVar));
    }

    private q(@n0 s sVar) {
        this.f41382b = new a();
        this.f41381a = sVar;
    }

    @n0
    private static <A> Class<A> c(@n0 A a10) {
        return (Class<A>) a10.getClass();
    }

    @n0
    private synchronized <A> List<o<A, ?>> f(@n0 Class<A> cls) {
        List<o<A, ?>> listB;
        listB = this.f41382b.b(cls);
        if (listB == null) {
            listB = Collections.unmodifiableList(this.f41381a.e(cls));
            this.f41382b.c(cls, listB);
        }
        return listB;
    }

    private <Model, Data> void j(@n0 List<p<? extends Model, ? extends Data>> list) {
        Iterator<p<? extends Model, ? extends Data>> it = list.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }

    public synchronized <Model, Data> void a(@n0 Class<Model> cls, @n0 Class<Data> cls2, @n0 p<? extends Model, ? extends Data> pVar) {
        this.f41381a.b(cls, cls2, pVar);
        this.f41382b.a();
    }

    public synchronized <Model, Data> o<Model, Data> b(@n0 Class<Model> cls, @n0 Class<Data> cls2) {
        return this.f41381a.d(cls, cls2);
    }

    @n0
    public synchronized List<Class<?>> d(@n0 Class<?> cls) {
        return this.f41381a.g(cls);
    }

    @n0
    public <A> List<o<A, ?>> e(@n0 A a10) {
        List<o<A, ?>> listF = f(c(a10));
        if (listF.isEmpty()) {
            throw new Registry.NoModelLoaderAvailableException(a10);
        }
        int size = listF.size();
        List<o<A, ?>> listEmptyList = Collections.emptyList();
        boolean z10 = true;
        for (int i10 = 0; i10 < size; i10++) {
            o<A, ?> oVar = listF.get(i10);
            if (oVar.b(a10)) {
                if (z10) {
                    listEmptyList = new ArrayList<>(size - i10);
                    z10 = false;
                }
                listEmptyList.add(oVar);
            }
        }
        if (listEmptyList.isEmpty()) {
            throw new Registry.NoModelLoaderAvailableException(a10, listF);
        }
        return listEmptyList;
    }

    public synchronized <Model, Data> void g(@n0 Class<Model> cls, @n0 Class<Data> cls2, @n0 p<? extends Model, ? extends Data> pVar) {
        this.f41381a.i(cls, cls2, pVar);
        this.f41382b.a();
    }

    public synchronized <Model, Data> void h(@n0 Class<Model> cls, @n0 Class<Data> cls2) {
        j(this.f41381a.j(cls, cls2));
        this.f41382b.a();
    }

    public synchronized <Model, Data> void i(@n0 Class<Model> cls, @n0 Class<Data> cls2, @n0 p<? extends Model, ? extends Data> pVar) {
        j(this.f41381a.k(cls, cls2, pVar));
        this.f41382b.a();
    }
}
