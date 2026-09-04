package androidx.arch.core.internal;

import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.huawei.hms.framework.common.ContainerUtils;
import com.meituan.robust.Constants;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: SafeIterableMap.java */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    c<K, V> f3007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c<K, V> f3008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final WeakHashMap<f<K, V>, Boolean> f3009d = new WeakHashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f3010e = 0;

    /* JADX INFO: compiled from: SafeIterableMap.java */
    public static class a<K, V> extends e<K, V> {
        a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // androidx.arch.core.internal.b.e
        c<K, V> b(c<K, V> cVar) {
            return cVar.f3014e;
        }

        @Override // androidx.arch.core.internal.b.e
        c<K, V> c(c<K, V> cVar) {
            return cVar.f3013d;
        }
    }

    /* JADX INFO: renamed from: androidx.arch.core.internal.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SafeIterableMap.java */
    public static class C0019b<K, V> extends e<K, V> {
        C0019b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // androidx.arch.core.internal.b.e
        c<K, V> b(c<K, V> cVar) {
            return cVar.f3013d;
        }

        @Override // androidx.arch.core.internal.b.e
        c<K, V> c(c<K, V> cVar) {
            return cVar.f3014e;
        }
    }

    /* JADX INFO: compiled from: SafeIterableMap.java */
    public static class c<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @n0
        final K f3011b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @n0
        final V f3012c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        c<K, V> f3013d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        c<K, V> f3014e;

        c(@n0 K k10, @n0 V v10) {
            this.f3011b = k10;
            this.f3012c = v10;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f3011b.equals(cVar.f3011b) && this.f3012c.equals(cVar.f3012c);
        }

        @Override // java.util.Map.Entry
        @n0
        public K getKey() {
            return this.f3011b;
        }

        @Override // java.util.Map.Entry
        @n0
        public V getValue() {
            return this.f3012c;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f3011b.hashCode() ^ this.f3012c.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f3011b + ContainerUtils.KEY_VALUE_DELIMITER + this.f3012c;
        }
    }

    /* JADX INFO: compiled from: SafeIterableMap.java */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public class d extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private c<K, V> f3015b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f3016c = true;

        d() {
        }

        @Override // androidx.arch.core.internal.b.f
        void a(@n0 c<K, V> cVar) {
            c<K, V> cVar2 = this.f3015b;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f3014e;
                this.f3015b = cVar3;
                this.f3016c = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (this.f3016c) {
                this.f3016c = false;
                this.f3015b = b.this.f3007b;
            } else {
                c<K, V> cVar = this.f3015b;
                this.f3015b = cVar != null ? cVar.f3013d : null;
            }
            return this.f3015b;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f3016c) {
                return b.this.f3007b != null;
            }
            c<K, V> cVar = this.f3015b;
            return (cVar == null || cVar.f3013d == null) ? false : true;
        }
    }

    /* JADX INFO: compiled from: SafeIterableMap.java */
    public static abstract class e<K, V> extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        c<K, V> f3018b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        c<K, V> f3019c;

        e(c<K, V> cVar, c<K, V> cVar2) {
            this.f3018b = cVar2;
            this.f3019c = cVar;
        }

        private c<K, V> e() {
            c<K, V> cVar = this.f3019c;
            c<K, V> cVar2 = this.f3018b;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return c(cVar);
        }

        @Override // androidx.arch.core.internal.b.f
        public void a(@n0 c<K, V> cVar) {
            if (this.f3018b == cVar && cVar == this.f3019c) {
                this.f3019c = null;
                this.f3018b = null;
            }
            c<K, V> cVar2 = this.f3018b;
            if (cVar2 == cVar) {
                this.f3018b = b(cVar2);
            }
            if (this.f3019c == cVar) {
                this.f3019c = e();
            }
        }

        abstract c<K, V> b(c<K, V> cVar);

        abstract c<K, V> c(c<K, V> cVar);

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.f3019c;
            this.f3019c = e();
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f3019c != null;
        }
    }

    /* JADX INFO: compiled from: SafeIterableMap.java */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static abstract class f<K, V> {
        abstract void a(@n0 c<K, V> cVar);
    }

    @p0
    public Map.Entry<K, V> a() {
        return this.f3007b;
    }

    @p0
    protected c<K, V> b(K k10) {
        c<K, V> cVar = this.f3007b;
        while (cVar != null && !cVar.f3011b.equals(k10)) {
            cVar = cVar.f3013d;
        }
        return cVar;
    }

    @n0
    public Iterator<Map.Entry<K, V>> descendingIterator() {
        C0019b c0019b = new C0019b(this.f3008c, this.f3007b);
        this.f3009d.put(c0019b, Boolean.FALSE);
        return c0019b;
    }

    @n0
    public b<K, V>.d e() {
        b<K, V>.d dVar = new d();
        this.f3009d.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    @p0
    public Map.Entry<K, V> g() {
        return this.f3008c;
    }

    c<K, V> h(@n0 K k10, @n0 V v10) {
        c<K, V> cVar = new c<>(k10, v10);
        this.f3010e++;
        c<K, V> cVar2 = this.f3008c;
        if (cVar2 == null) {
            this.f3007b = cVar;
            this.f3008c = cVar;
            return cVar;
        }
        cVar2.f3013d = cVar;
        cVar.f3014e = cVar2;
        this.f3008c = cVar;
        return cVar;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += it.next().hashCode();
        }
        return iHashCode;
    }

    public V i(@n0 K k10, @n0 V v10) {
        c<K, V> cVarB = b(k10);
        if (cVarB != null) {
            return cVarB.f3012c;
        }
        h(k10, v10);
        return null;
    }

    @Override // java.lang.Iterable
    @n0
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f3007b, this.f3008c);
        this.f3009d.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public V j(@n0 K k10) {
        c<K, V> cVarB = b(k10);
        if (cVarB == null) {
            return null;
        }
        this.f3010e--;
        if (!this.f3009d.isEmpty()) {
            Iterator<f<K, V>> it = this.f3009d.keySet().iterator();
            while (it.hasNext()) {
                it.next().a(cVarB);
            }
        }
        c<K, V> cVar = cVarB.f3014e;
        if (cVar != null) {
            cVar.f3013d = cVarB.f3013d;
        } else {
            this.f3007b = cVarB.f3013d;
        }
        c<K, V> cVar2 = cVarB.f3013d;
        if (cVar2 != null) {
            cVar2.f3014e = cVar;
        } else {
            this.f3008c = cVar;
        }
        cVarB.f3013d = null;
        cVarB.f3014e = null;
        return cVarB.f3012c;
    }

    public int size() {
        return this.f3010e;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Constants.ARRAY_TYPE);
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb2.append(it.next().toString());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
