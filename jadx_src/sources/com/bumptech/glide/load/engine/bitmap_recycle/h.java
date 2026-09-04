package com.bumptech.glide.load.engine.bitmap_recycle;

import androidx.annotation.p0;
import com.bumptech.glide.load.engine.bitmap_recycle.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: GroupedLinkedMap.java */
/* JADX INFO: loaded from: classes6.dex */
public class h<K extends m, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a<K, V> f40981a = new a<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<K, a<K, V>> f40982b = new HashMap();

    /* JADX INFO: compiled from: GroupedLinkedMap.java */
    public static class a<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final K f40983a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<V> f40984b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        a<K, V> f40985c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        a<K, V> f40986d;

        a() {
            this(null);
        }

        a(K k10) {
            this.f40986d = this;
            this.f40985c = this;
            this.f40983a = k10;
        }

        public void a(V v10) {
            if (this.f40984b == null) {
                this.f40984b = new ArrayList();
            }
            this.f40984b.add(v10);
        }

        @p0
        public V b() {
            int iC = c();
            if (iC > 0) {
                return this.f40984b.remove(iC - 1);
            }
            return null;
        }

        public int c() {
            List<V> list = this.f40984b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }
    }

    h() {
    }

    private void b(a<K, V> aVar) {
        e(aVar);
        a<K, V> aVar2 = this.f40981a;
        aVar.f40986d = aVar2;
        aVar.f40985c = aVar2.f40985c;
        g(aVar);
    }

    private void c(a<K, V> aVar) {
        e(aVar);
        a<K, V> aVar2 = this.f40981a;
        aVar.f40986d = aVar2.f40986d;
        aVar.f40985c = aVar2;
        g(aVar);
    }

    private static <K, V> void e(a<K, V> aVar) {
        a<K, V> aVar2 = aVar.f40986d;
        aVar2.f40985c = aVar.f40985c;
        aVar.f40985c.f40986d = aVar2;
    }

    private static <K, V> void g(a<K, V> aVar) {
        aVar.f40985c.f40986d = aVar;
        aVar.f40986d.f40985c = aVar;
    }

    @p0
    public V a(K k10) {
        a<K, V> aVar = this.f40982b.get(k10);
        if (aVar == null) {
            aVar = new a<>(k10);
            this.f40982b.put(k10, aVar);
        } else {
            k10.a();
        }
        b(aVar);
        return aVar.b();
    }

    public void d(K k10, V v10) {
        a<K, V> aVar = this.f40982b.get(k10);
        if (aVar == null) {
            aVar = new a<>(k10);
            c(aVar);
            this.f40982b.put(k10, aVar);
        } else {
            k10.a();
        }
        aVar.a(v10);
    }

    @p0
    public V f() {
        for (a aVar = this.f40981a.f40986d; !aVar.equals(this.f40981a); aVar = aVar.f40986d) {
            V v10 = (V) aVar.b();
            if (v10 != null) {
                return v10;
            }
            e(aVar);
            this.f40982b.remove(aVar.f40983a);
            ((m) aVar.f40983a).a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("GroupedLinkedMap( ");
        boolean z10 = false;
        for (a aVar = this.f40981a.f40985c; !aVar.equals(this.f40981a); aVar = aVar.f40985c) {
            z10 = true;
            sb2.append('{');
            sb2.append(aVar.f40983a);
            sb2.append(':');
            sb2.append(aVar.c());
            sb2.append("}, ");
        }
        if (z10) {
            sb2.delete(sb2.length() - 2, sb2.length());
        }
        sb2.append(" )");
        return sb2.toString();
    }
}
