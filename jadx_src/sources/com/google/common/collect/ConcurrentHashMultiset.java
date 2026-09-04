package com.google.common.collect;

import com.google.common.primitives.Ints;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.c
@u
public final class ConcurrentHashMultiset<E> extends com.google.common.collect.d<E> implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient ConcurrentMap<E, AtomicInteger> f57154d;

    public class a extends a1<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set f57155b;

        a(ConcurrentHashMultiset concurrentHashMultiset, Set set) {
            this.f57155b = set;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.a1, com.google.common.collect.h0
        public Set<E> H0() {
            return this.f57155b;
        }

        @Override // com.google.common.collect.h0, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            return obj != null && o.j(this.f57155b, obj);
        }

        @Override // com.google.common.collect.h0, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return O0(collection);
        }

        @Override // com.google.common.collect.h0, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object obj) {
            return obj != null && o.k(this.f57155b, obj);
        }

        @Override // com.google.common.collect.h0, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return S0(collection);
        }
    }

    public class b extends AbstractIterator<s1.a<E>> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Iterator<Map.Entry<E, AtomicInteger>> f57156d;

        b() {
            this.f57156d = ConcurrentHashMultiset.this.f57154d.entrySet().iterator();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.AbstractIterator
        @CheckForNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public s1.a<E> a() {
            while (this.f57156d.hasNext()) {
                Map.Entry<E, AtomicInteger> next = this.f57156d.next();
                int i10 = next.getValue().get();
                if (i10 != 0) {
                    return Multisets.k(next.getKey(), i10);
                }
            }
            return b();
        }
    }

    public class c extends o0<s1.a<E>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @CheckForNull
        private s1.a<E> f57158b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Iterator f57159c;

        c(Iterator it) {
            this.f57159c = it;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.o0, com.google.common.collect.y0
        public Iterator<s1.a<E>> H0() {
            return this.f57159c;
        }

        @Override // com.google.common.collect.o0, java.util.Iterator
        /* JADX INFO: renamed from: J0, reason: merged with bridge method [inline-methods] */
        public s1.a<E> next() {
            s1.a<E> aVar = (s1.a) super.next();
            this.f57158b = aVar;
            return aVar;
        }

        @Override // com.google.common.collect.o0, java.util.Iterator
        public void remove() {
            com.google.common.base.w.h0(this.f57158b != null, "no calls to next() since the last call to remove()");
            ConcurrentHashMultiset.this.I0(this.f57158b.a(), 0);
            this.f57158b = null;
        }
    }

    public class d extends com.google.common.collect.d<E>.b {
        private d() {
            super();
        }

        /* synthetic */ d(ConcurrentHashMultiset concurrentHashMultiset, a aVar) {
            this();
        }

        private List<s1.a<E>> j() {
            ArrayList arrayListV = Lists.v(size());
            Iterators.a(arrayListV, iterator());
            return arrayListV;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.d.b, com.google.common.collect.Multisets.i
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public ConcurrentHashMultiset<E> h() {
            return ConcurrentHashMultiset.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return j().toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) j().toArray(tArr);
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final g2.b<ConcurrentHashMultiset> f57162a = g2.a(ConcurrentHashMultiset.class, "countMap");

        private e() {
        }
    }

    @o9.d
    ConcurrentHashMultiset(ConcurrentMap<E, AtomicInteger> concurrentMap) {
        com.google.common.base.w.u(concurrentMap.isEmpty(), "the backing map (%s) must be empty", concurrentMap);
        this.f57154d = concurrentMap;
    }

    public static <E> ConcurrentHashMultiset<E> j() {
        return new ConcurrentHashMultiset<>(new ConcurrentHashMap());
    }

    public static <E> ConcurrentHashMultiset<E> l(Iterable<? extends E> iterable) {
        ConcurrentHashMultiset<E> concurrentHashMultisetJ = j();
        l1.a(concurrentHashMultisetJ, iterable);
        return concurrentHashMultisetJ;
    }

    @o9.a
    public static <E> ConcurrentHashMultiset<E> m(ConcurrentMap<E, AtomicInteger> concurrentMap) {
        return new ConcurrentHashMultiset<>(concurrentMap);
    }

    private void o(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        e.f57162a.b(this, (ConcurrentMap) objectInputStream.readObject());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private List<E> s() {
        ArrayList arrayListV = Lists.v(size());
        for (s1.a aVar : entrySet()) {
            Object objA = aVar.a();
            for (int count = aVar.getCount(); count > 0; count--) {
                arrayListV.add(objA);
            }
        }
        return arrayListV;
    }

    private void t(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f57154d);
    }

    @Override // com.google.common.collect.s1
    public int E1(@CheckForNull Object obj) {
        AtomicInteger atomicInteger = (AtomicInteger) Maps.p0(this.f57154d, obj);
        if (atomicInteger == null) {
            return 0;
        }
        return atomicInteger.get();
    }

    @Override // com.google.common.collect.d, com.google.common.collect.s1
    @s9.a
    public int I0(E e10, int i10) {
        AtomicInteger atomicIntegerPutIfAbsent;
        AtomicInteger atomicInteger;
        com.google.common.base.w.E(e10);
        n.b(i10, "count");
        do {
            atomicIntegerPutIfAbsent = (AtomicInteger) Maps.p0(this.f57154d, e10);
            if (atomicIntegerPutIfAbsent != null || (i10 != 0 && (atomicIntegerPutIfAbsent = this.f57154d.putIfAbsent(e10, new AtomicInteger(i10))) != null)) {
                while (true) {
                    int i11 = atomicIntegerPutIfAbsent.get();
                    if (i11 == 0) {
                        break;
                    }
                    if (atomicIntegerPutIfAbsent.compareAndSet(i11, i10)) {
                        if (i10 == 0) {
                            this.f57154d.remove(e10, atomicIntegerPutIfAbsent);
                        }
                        return i11;
                    }
                }
                if (i10 != 0) {
                    atomicInteger = new AtomicInteger(i10);
                    if (this.f57154d.putIfAbsent(e10, atomicInteger) == null) {
                        break;
                    }
                } else {
                    return 0;
                }
            } else {
                return 0;
            }
        } while (!this.f57154d.replace(e10, atomicIntegerPutIfAbsent, atomicInteger));
        return 0;
    }

    @Override // com.google.common.collect.d
    Set<E> a() {
        return new a(this, this.f57154d.keySet());
    }

    @Override // com.google.common.collect.d
    @Deprecated
    public Set<s1.a<E>> b() {
        return new d(this, null);
    }

    @Override // com.google.common.collect.d, com.google.common.collect.s1
    public /* bridge */ /* synthetic */ Set c() {
        return super.c();
    }

    @Override // com.google.common.collect.d, com.google.common.collect.s1
    @s9.a
    public int c0(E e10, int i10) {
        AtomicInteger atomicIntegerPutIfAbsent;
        int i11;
        AtomicInteger atomicInteger;
        com.google.common.base.w.E(e10);
        if (i10 == 0) {
            return E1(e10);
        }
        n.d(i10, "occurrences");
        do {
            atomicIntegerPutIfAbsent = (AtomicInteger) Maps.p0(this.f57154d, e10);
            if (atomicIntegerPutIfAbsent == null && (atomicIntegerPutIfAbsent = this.f57154d.putIfAbsent(e10, new AtomicInteger(i10))) == null) {
                return 0;
            }
            do {
                i11 = atomicIntegerPutIfAbsent.get();
                if (i11 == 0) {
                    atomicInteger = new AtomicInteger(i10);
                    if (this.f57154d.putIfAbsent(e10, atomicInteger) == null) {
                        break;
                    }
                } else {
                    try {
                    } catch (ArithmeticException unused) {
                        StringBuilder sb2 = new StringBuilder(65);
                        sb2.append("Overflow adding ");
                        sb2.append(i10);
                        sb2.append(" occurrences to a count of ");
                        sb2.append(i11);
                        throw new IllegalArgumentException(sb2.toString());
                    }
                }
            } while (!atomicIntegerPutIfAbsent.compareAndSet(i11, com.google.common.math.f.c(i11, i10)));
            return i11;
        } while (!this.f57154d.replace(e10, atomicIntegerPutIfAbsent, atomicInteger));
        return 0;
    }

    @Override // com.google.common.collect.d, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f57154d.clear();
    }

    @Override // com.google.common.collect.d, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.s1
    public /* bridge */ /* synthetic */ boolean contains(@CheckForNull Object obj) {
        return super.contains(obj);
    }

    @Override // com.google.common.collect.d
    int e() {
        return this.f57154d.size();
    }

    @Override // com.google.common.collect.d, com.google.common.collect.s1
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.d
    Iterator<E> g() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.d, com.google.common.collect.s1
    @s9.a
    public boolean g0(E e10, int i10, int i11) {
        com.google.common.base.w.E(e10);
        n.b(i10, "oldCount");
        n.b(i11, "newCount");
        AtomicInteger atomicInteger = (AtomicInteger) Maps.p0(this.f57154d, e10);
        if (atomicInteger == null) {
            if (i10 != 0) {
                return false;
            }
            return i11 == 0 || this.f57154d.putIfAbsent(e10, new AtomicInteger(i11)) == null;
        }
        int i12 = atomicInteger.get();
        if (i12 == i10) {
            if (i12 == 0) {
                if (i11 == 0) {
                    this.f57154d.remove(e10, atomicInteger);
                    return true;
                }
                AtomicInteger atomicInteger2 = new AtomicInteger(i11);
                return this.f57154d.putIfAbsent(e10, atomicInteger2) == null || this.f57154d.replace(e10, atomicInteger, atomicInteger2);
            }
            if (atomicInteger.compareAndSet(i12, i11)) {
                if (i11 == 0) {
                    this.f57154d.remove(e10, atomicInteger);
                }
                return true;
            }
        }
        return false;
    }

    @Override // com.google.common.collect.d
    Iterator<s1.a<E>> h() {
        return new c(new b());
    }

    @Override // com.google.common.collect.d, java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f57154d.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.s1
    public Iterator<E> iterator() {
        return Multisets.n(this);
    }

    @Override // com.google.common.collect.d, com.google.common.collect.s1
    @s9.a
    public int n1(@CheckForNull Object obj, int i10) {
        int i11;
        int iMax;
        if (i10 == 0) {
            return E1(obj);
        }
        n.d(i10, "occurrences");
        AtomicInteger atomicInteger = (AtomicInteger) Maps.p0(this.f57154d, obj);
        if (atomicInteger == null) {
            return 0;
        }
        do {
            i11 = atomicInteger.get();
            if (i11 == 0) {
                return 0;
            }
            iMax = Math.max(0, i11 - i10);
        } while (!atomicInteger.compareAndSet(i11, iMax));
        if (iMax == 0) {
            this.f57154d.remove(obj, atomicInteger);
        }
        return i11;
    }

    @s9.a
    public boolean q(@CheckForNull Object obj, int i10) {
        int i11;
        int i12;
        if (i10 == 0) {
            return true;
        }
        n.d(i10, "occurrences");
        AtomicInteger atomicInteger = (AtomicInteger) Maps.p0(this.f57154d, obj);
        if (atomicInteger == null) {
            return false;
        }
        do {
            i11 = atomicInteger.get();
            if (i11 < i10) {
                return false;
            }
            i12 = i11 - i10;
        } while (!atomicInteger.compareAndSet(i11, i12));
        if (i12 == 0) {
            this.f57154d.remove(obj, atomicInteger);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.s1
    public int size() {
        Iterator<AtomicInteger> it = this.f57154d.values().iterator();
        long j10 = 0;
        while (it.hasNext()) {
            j10 += (long) it.next().get();
        }
        return Ints.x(j10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray() {
        return s().toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) s().toArray(tArr);
    }
}
