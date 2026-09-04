package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* JADX INFO: Add missing generic type declarations: [K] */
/* JADX INFO: compiled from: ScatterMap.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.t0({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$keys$1\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1850:1\n363#2,6:1851\n373#2,3:1858\n376#2,9:1862\n363#2,6:1871\n373#2,3:1878\n376#2,9:1882\n633#2:1891\n634#2:1895\n636#2,2:1897\n638#2,4:1900\n642#2:1907\n643#2:1911\n644#2:1913\n645#2,4:1916\n651#2:1921\n652#2,8:1923\n1826#3:1857\n1688#3:1861\n1826#3:1877\n1688#3:1881\n1605#3,3:1892\n1619#3:1896\n1615#3:1899\n1795#3,3:1904\n1809#3,3:1908\n1733#3:1912\n1721#3:1914\n1715#3:1915\n1728#3:1920\n1818#3:1922\n1726#4,3:1931\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$keys$1\n*L\n1466#1:1851,6\n1466#1:1858,3\n1466#1:1862,9\n1477#1:1871,6\n1477#1:1878,3\n1477#1:1882,9\n1487#1:1891\n1487#1:1895\n1487#1:1897,2\n1487#1:1900,4\n1487#1:1907\n1487#1:1911\n1487#1:1913\n1487#1:1916,4\n1487#1:1921\n1487#1:1923,8\n1466#1:1857\n1466#1:1861\n1477#1:1877\n1477#1:1881\n1487#1:1892,3\n1487#1:1896\n1487#1:1899\n1487#1:1904,3\n1487#1:1908,3\n1487#1:1912\n1487#1:1914\n1487#1:1915\n1487#1:1920\n1487#1:1922\n1496#1:1931,3\n*E\n"})
public final class MutableScatterMap$MutableMapWrapper$keys$1<K> implements Set<K>, zh.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ MutableScatterMap<K, V> f3441b;

    MutableScatterMap$MutableMapWrapper$keys$1(MutableScatterMap<K, V> mutableScatterMap) {
        this.f3441b = mutableScatterMap;
    }

    public int a() {
        return this.f3441b.f3491e;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(K k10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(@dl.d Collection<? extends K> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f3441b.K();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.f3441b.g((K) obj);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(@dl.d Collection<? extends Object> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        MutableScatterMap<K, V> mutableScatterMap = this.f3441b;
        if (elements.isEmpty()) {
            return true;
        }
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            if (!mutableScatterMap.g((K) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f3441b.x();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    @dl.d
    public Iterator<K> iterator() {
        return new MutableScatterMap$MutableMapWrapper$keys$1$iterator$1(this.f3441b);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        int iNumberOfTrailingZeros;
        ScatterMap scatterMap = this.f3441b;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * h2.f3616j;
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = scatterMap.f3490d;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = scatterMap.f3487a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j11 = (((long) i11) * h2.f3617k) ^ j10;
            long j12 = (~j11) & (j11 - h2.f3617k) & (-9187201950435737472L);
            while (true) {
                if (j12 != 0) {
                    iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i13) & i12;
                    if (kotlin.jvm.internal.f0.g(scatterMap.f3488b[iNumberOfTrailingZeros], obj)) {
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
        if (iNumberOfTrailingZeros < 0) {
            return false;
        }
        this.f3441b.o0(iNumberOfTrailingZeros);
        return true;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(@dl.d Collection<? extends Object> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        MutableScatterMap<K, V> mutableScatterMap = this.f3441b;
        long[] jArr = mutableScatterMap.f3487a;
        int length = jArr.length - 2;
        boolean z10 = false;
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
                            if (CollectionsKt___CollectionsKt.R1(elements, mutableScatterMap.f3488b[i13])) {
                                mutableScatterMap.o0(i13);
                                z11 = true;
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
        }
        return z10;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(@dl.d Collection<? extends Object> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        MutableScatterMap<K, V> mutableScatterMap = this.f3441b;
        long[] jArr = mutableScatterMap.f3487a;
        int length = jArr.length - 2;
        boolean z10 = false;
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
                            if (!CollectionsKt___CollectionsKt.R1(elements, mutableScatterMap.f3488b[i13])) {
                                mutableScatterMap.o0(i13);
                                z11 = true;
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
        }
        return z10;
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return a();
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
