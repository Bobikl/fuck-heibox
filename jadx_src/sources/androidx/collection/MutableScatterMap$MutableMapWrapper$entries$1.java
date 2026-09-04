package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: compiled from: ScatterMap.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.t0({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$entries$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1850:1\n1726#2,3:1851\n363#3,6:1854\n373#3,3:1861\n376#3,9:1865\n363#3,6:1874\n373#3,3:1881\n376#3,9:1885\n633#3:1894\n634#3:1898\n636#3,2:1900\n638#3,4:1903\n642#3:1910\n643#3:1914\n644#3:1916\n645#3,4:1919\n651#3:1924\n652#3,8:1926\n1826#4:1860\n1688#4:1864\n1826#4:1880\n1688#4:1884\n1605#4,3:1895\n1619#4:1899\n1615#4:1902\n1795#4,3:1907\n1809#4,3:1911\n1733#4:1915\n1721#4:1917\n1715#4:1918\n1728#4:1923\n1818#4:1925\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$entries$1\n*L\n1358#1:1851,3\n1376#1:1854,6\n1376#1:1861,3\n1376#1:1865,9\n1398#1:1874,6\n1398#1:1881,3\n1398#1:1885,9\n1413#1:1894\n1413#1:1898\n1413#1:1900,2\n1413#1:1903,4\n1413#1:1910\n1413#1:1914\n1413#1:1916\n1413#1:1919,4\n1413#1:1924\n1413#1:1926,8\n1376#1:1860\n1376#1:1864\n1398#1:1880\n1398#1:1884\n1413#1:1895,3\n1413#1:1899\n1413#1:1902\n1413#1:1907,3\n1413#1:1911,3\n1413#1:1915\n1413#1:1917\n1413#1:1918\n1413#1:1923\n1413#1:1925\n*E\n"})
public final class MutableScatterMap$MutableMapWrapper$entries$1<K, V> implements Set<Map.Entry<K, V>>, zh.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ MutableScatterMap<K, V> f3425b;

    MutableScatterMap$MutableMapWrapper$entries$1(MutableScatterMap<K, V> mutableScatterMap) {
        this.f3425b = mutableScatterMap;
    }

    @Override // java.util.Set, java.util.Collection
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean add(@dl.d Map.Entry<K, V> element) {
        kotlin.jvm.internal.f0.p(element, "element");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(@dl.d Collection<? extends Map.Entry<K, V>> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        throw new UnsupportedOperationException();
    }

    public boolean b(@dl.d Map.Entry<K, V> element) {
        kotlin.jvm.internal.f0.p(element, "element");
        return kotlin.jvm.internal.f0.g(this.f3425b.p(element.getKey()), element.getValue());
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f3425b.K();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (kotlin.jvm.internal.w0.I(obj)) {
            return b((Map.Entry) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(@dl.d Collection<? extends Object> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        MutableScatterMap<K, V> mutableScatterMap = this.f3425b;
        if (elements.isEmpty()) {
            return true;
        }
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!kotlin.jvm.internal.f0.g(mutableScatterMap.p((K) entry.getKey()), entry.getValue())) {
                return false;
            }
        }
        return true;
    }

    public int e() {
        return this.f3425b.f3491e;
    }

    public boolean g(@dl.d Map.Entry<K, V> element) {
        int iNumberOfTrailingZeros;
        kotlin.jvm.internal.f0.p(element, "element");
        MutableScatterMap<K, V> mutableScatterMap = this.f3425b;
        K key = element.getKey();
        int iHashCode = (key != null ? key.hashCode() : 0) * h2.f3616j;
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = mutableScatterMap.f3490d;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = mutableScatterMap.f3487a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j11 = (((long) i11) * h2.f3617k) ^ j10;
            long j12 = (~j11) & (j11 - h2.f3617k) & (-9187201950435737472L);
            while (true) {
                if (j12 != 0) {
                    iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i13) & i12;
                    if (kotlin.jvm.internal.f0.g(mutableScatterMap.f3488b[iNumberOfTrailingZeros], key)) {
                        break loop0;
                    }
                    j12 &= j12 - 1;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
        if (iNumberOfTrailingZeros < 0 || !kotlin.jvm.internal.f0.g(this.f3425b.f3489c[iNumberOfTrailingZeros], element.getValue())) {
            return false;
        }
        this.f3425b.o0(iNumberOfTrailingZeros);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f3425b.x();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    @dl.d
    public Iterator<Map.Entry<K, V>> iterator() {
        return new MutableScatterMap$MutableMapWrapper$entries$1$iterator$1(this.f3425b);
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean remove(Object obj) {
        if (kotlin.jvm.internal.w0.I(obj)) {
            return g((Map.Entry) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(@dl.d Collection<? extends Object> elements) {
        boolean z10;
        kotlin.jvm.internal.f0.p(elements, "elements");
        MutableScatterMap<K, V> mutableScatterMap = this.f3425b;
        long[] jArr = mutableScatterMap.f3487a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            boolean z11 = false;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            int i13 = (i10 << 3) + i12;
                            Iterator<? extends Object> it = elements.iterator();
                            while (it.hasNext()) {
                                Map.Entry entry = (Map.Entry) it.next();
                                if (kotlin.jvm.internal.f0.g(entry.getKey(), mutableScatterMap.f3488b[i13]) && kotlin.jvm.internal.f0.g(entry.getValue(), mutableScatterMap.f3489c[i13])) {
                                    mutableScatterMap.o0(i13);
                                    z11 = true;
                                    break;
                                }
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        return z11;
                    }
                }
                if (i10 != length) {
                    i10++;
                } else {
                    z10 = z11;
                }
            }
        } else {
            z10 = false;
        }
        return z10;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(@dl.d Collection<? extends Object> elements) {
        boolean z10;
        boolean z11;
        kotlin.jvm.internal.f0.p(elements, "elements");
        MutableScatterMap<K, V> mutableScatterMap = this.f3425b;
        long[] jArr = mutableScatterMap.f3487a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            boolean z12 = false;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            int i13 = (i10 << 3) + i12;
                            Iterator<? extends Object> it = elements.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z11 = false;
                                    break;
                                }
                                Map.Entry entry = (Map.Entry) it.next();
                                if (kotlin.jvm.internal.f0.g(entry.getKey(), mutableScatterMap.f3488b[i13]) && kotlin.jvm.internal.f0.g(entry.getValue(), mutableScatterMap.f3489c[i13])) {
                                    z11 = true;
                                    break;
                                }
                            }
                            if (!z11) {
                                mutableScatterMap.o0(i13);
                                z12 = true;
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        return z12;
                    }
                }
                if (i10 != length) {
                    i10++;
                } else {
                    z10 = z12;
                }
            }
        } else {
            z10 = false;
        }
        return z10;
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return e();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.t.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.f0.p(array, "array");
        return (T[]) kotlin.jvm.internal.t.b(this, array);
    }
}
