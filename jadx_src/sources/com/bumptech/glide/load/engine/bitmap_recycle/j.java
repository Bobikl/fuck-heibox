package com.bumptech.glide.load.engine.bitmap_recycle;

import android.util.Log;
import androidx.annotation.j1;
import androidx.annotation.p0;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: LruArrayPool.java */
/* JADX INFO: loaded from: classes6.dex */
public final class j implements com.bumptech.glide.load.engine.bitmap_recycle.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f40988h = 4194304;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @j1
    static final int f40989i = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f40990j = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h<a, Object> f40991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f40992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<Class<?>, NavigableMap<Integer, Integer>> f40993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<Class<?>, com.bumptech.glide.load.engine.bitmap_recycle.a<?>> f40994e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f40995f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f40996g;

    /* JADX INFO: compiled from: LruArrayPool.java */
    public static final class a implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f40997a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f40998b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Class<?> f40999c;

        a(b bVar) {
            this.f40997a = bVar;
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.m
        public void a() {
            this.f40997a.c(this);
        }

        void b(int i10, Class<?> cls) {
            this.f40998b = i10;
            this.f40999c = cls;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f40998b == aVar.f40998b && this.f40999c == aVar.f40999c;
        }

        public int hashCode() {
            int i10 = this.f40998b * 31;
            Class<?> cls = this.f40999c;
            return i10 + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            return "Key{size=" + this.f40998b + "array=" + this.f40999c + '}';
        }
    }

    /* JADX INFO: compiled from: LruArrayPool.java */
    public static final class b extends d<a> {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.bumptech.glide.load.engine.bitmap_recycle.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a() {
            return new a(this);
        }

        a e(int i10, Class<?> cls) {
            a aVarB = b();
            aVarB.b(i10, cls);
            return aVarB;
        }
    }

    @j1
    public j() {
        this.f40991b = new h<>();
        this.f40992c = new b();
        this.f40993d = new HashMap();
        this.f40994e = new HashMap();
        this.f40995f = 4194304;
    }

    public j(int i10) {
        this.f40991b = new h<>();
        this.f40992c = new b();
        this.f40993d = new HashMap();
        this.f40994e = new HashMap();
        this.f40995f = i10;
    }

    private void f(int i10, Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMapN = n(cls);
        Integer num = navigableMapN.get(Integer.valueOf(i10));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapN.remove(Integer.valueOf(i10));
                return;
            } else {
                navigableMapN.put(Integer.valueOf(i10), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i10 + ", this: " + this);
    }

    private void g() {
        h(this.f40995f);
    }

    private void h(int i10) {
        while (this.f40996g > i10) {
            Object objF = this.f40991b.f();
            com.bumptech.glide.util.m.e(objF);
            com.bumptech.glide.load.engine.bitmap_recycle.a aVarI = i(objF);
            this.f40996g -= aVarI.a(objF) * aVarI.b();
            f(aVarI.a(objF), objF.getClass());
            if (Log.isLoggable(aVarI.getTag(), 2)) {
                Log.v(aVarI.getTag(), "evicted: " + aVarI.a(objF));
            }
        }
    }

    private <T> com.bumptech.glide.load.engine.bitmap_recycle.a<T> i(T t10) {
        return j(t10.getClass());
    }

    private <T> com.bumptech.glide.load.engine.bitmap_recycle.a<T> j(Class<T> cls) {
        com.bumptech.glide.load.engine.bitmap_recycle.a<T> gVar = (com.bumptech.glide.load.engine.bitmap_recycle.a) this.f40994e.get(cls);
        if (gVar == null) {
            if (cls.equals(int[].class)) {
                gVar = new i();
            } else {
                if (!cls.equals(byte[].class)) {
                    throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
                }
                gVar = new g();
            }
            this.f40994e.put(cls, gVar);
        }
        return gVar;
    }

    @p0
    private <T> T k(a aVar) {
        return (T) this.f40991b.a(aVar);
    }

    private <T> T m(a aVar, Class<T> cls) {
        com.bumptech.glide.load.engine.bitmap_recycle.a<T> aVarJ = j(cls);
        T t10 = (T) k(aVar);
        if (t10 != null) {
            this.f40996g -= aVarJ.a(t10) * aVarJ.b();
            f(aVarJ.a(t10), cls);
        }
        if (t10 != null) {
            return t10;
        }
        if (Log.isLoggable(aVarJ.getTag(), 2)) {
            Log.v(aVarJ.getTag(), "Allocated " + aVar.f40998b + " bytes");
        }
        return aVarJ.newArray(aVar.f40998b);
    }

    private NavigableMap<Integer, Integer> n(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.f40993d.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f40993d.put(cls, treeMap);
        return treeMap;
    }

    private boolean o() {
        int i10 = this.f40996g;
        return i10 == 0 || this.f40995f / i10 >= 2;
    }

    private boolean p(int i10) {
        return i10 <= this.f40995f / 2;
    }

    private boolean q(int i10, Integer num) {
        return num != null && (o() || num.intValue() <= i10 * 8);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.b
    public synchronized void a(int i10) {
        try {
            if (i10 >= 40) {
                b();
            } else if (i10 >= 20 || i10 == 15) {
                h(this.f40995f / 2);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.b
    public synchronized void b() {
        h(0);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.b
    public synchronized <T> T c(int i10, Class<T> cls) {
        Integer numCeilingKey;
        numCeilingKey = n(cls).ceilingKey(Integer.valueOf(i10));
        return (T) m(q(i10, numCeilingKey) ? this.f40992c.e(numCeilingKey.intValue(), cls) : this.f40992c.e(i10, cls), cls);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.b
    public synchronized <T> T d(int i10, Class<T> cls) {
        return (T) m(this.f40992c.e(i10, cls), cls);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.b
    @Deprecated
    public <T> void e(T t10, Class<T> cls) {
        put(t10);
    }

    int l() {
        int iIntValue = 0;
        for (Class<?> cls : this.f40993d.keySet()) {
            for (Integer num : this.f40993d.get(cls).keySet()) {
                iIntValue += num.intValue() * this.f40993d.get(cls).get(num).intValue() * j(cls).b();
            }
        }
        return iIntValue;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.b
    public synchronized <T> void put(T t10) {
        Class<?> cls = t10.getClass();
        com.bumptech.glide.load.engine.bitmap_recycle.a<T> aVarJ = j(cls);
        int iA = aVarJ.a(t10);
        int iB = aVarJ.b() * iA;
        if (p(iB)) {
            a aVarE = this.f40992c.e(iA, cls);
            this.f40991b.d(aVarE, t10);
            NavigableMap<Integer, Integer> navigableMapN = n(cls);
            Integer num = navigableMapN.get(Integer.valueOf(aVarE.f40998b));
            Integer numValueOf = Integer.valueOf(aVarE.f40998b);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapN.put(numValueOf, Integer.valueOf(iIntValue));
            this.f40996g += iB;
            g();
        }
    }
}
