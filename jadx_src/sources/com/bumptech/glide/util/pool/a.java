package com.bumptech.glide.util.pool;

import android.util.Log;
import androidx.annotation.n0;
import androidx.core.util.n;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: FactoryPools.java */
/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f42019a = "FactoryPools";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f42020b = 20;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final g<Object> f42021c = new C0347a();

    /* JADX INFO: renamed from: com.bumptech.glide.util.pool.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FactoryPools.java */
    public class C0347a implements g<Object> {
        C0347a() {
        }

        @Override // com.bumptech.glide.util.pool.a.g
        public void a(@n0 Object obj) {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: FactoryPools.java */
    public class b<T> implements d<List<T>> {
        b() {
        }

        @Override // com.bumptech.glide.util.pool.a.d
        @n0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public List<T> a() {
            return new ArrayList();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: FactoryPools.java */
    public class c<T> implements g<List<T>> {
        c() {
        }

        @Override // com.bumptech.glide.util.pool.a.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@n0 List<T> list) {
            list.clear();
        }
    }

    /* JADX INFO: compiled from: FactoryPools.java */
    public interface d<T> {
        T a();
    }

    /* JADX INFO: compiled from: FactoryPools.java */
    public static final class e<T> implements n.a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d<T> f42022a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final g<T> f42023b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final n.a<T> f42024c;

        e(@n0 n.a<T> aVar, @n0 d<T> dVar, @n0 g<T> gVar) {
            this.f42024c = aVar;
            this.f42022a = dVar;
            this.f42023b = gVar;
        }

        @Override // androidx.core.util.n.a
        public T a() {
            T tA = this.f42024c.a();
            if (tA == null) {
                tA = this.f42022a.a();
                if (Log.isLoggable(a.f42019a, 2)) {
                    Log.v(a.f42019a, "Created new " + tA.getClass());
                }
            }
            if (tA instanceof f) {
                ((f) tA).e().b(false);
            }
            return tA;
        }

        @Override // androidx.core.util.n.a
        public boolean b(@n0 T t10) {
            if (t10 instanceof f) {
                ((f) t10).e().b(true);
            }
            this.f42023b.a(t10);
            return this.f42024c.b(t10);
        }
    }

    /* JADX INFO: compiled from: FactoryPools.java */
    public interface f {
        @n0
        com.bumptech.glide.util.pool.c e();
    }

    /* JADX INFO: compiled from: FactoryPools.java */
    public interface g<T> {
        void a(@n0 T t10);
    }

    private a() {
    }

    @n0
    private static <T extends f> n.a<T> a(@n0 n.a<T> aVar, @n0 d<T> dVar) {
        return b(aVar, dVar, c());
    }

    @n0
    private static <T> n.a<T> b(@n0 n.a<T> aVar, @n0 d<T> dVar, @n0 g<T> gVar) {
        return new e(aVar, dVar, gVar);
    }

    @n0
    private static <T> g<T> c() {
        return (g<T>) f42021c;
    }

    @n0
    public static <T extends f> n.a<T> d(int i10, @n0 d<T> dVar) {
        return a(new n.b(i10), dVar);
    }

    @n0
    public static <T extends f> n.a<T> e(int i10, @n0 d<T> dVar) {
        return a(new n.c(i10), dVar);
    }

    @n0
    public static <T extends f> n.a<T> f(int i10, @n0 d<T> dVar, @n0 g<T> gVar) {
        return b(new n.c(i10), dVar, gVar);
    }

    @n0
    public static <T> n.a<List<T>> g() {
        return h(20);
    }

    @n0
    public static <T> n.a<List<T>> h(int i10) {
        return b(new n.c(i10), new b(), new c());
    }
}
