package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* JADX INFO: Add missing generic type declarations: [V] */
/* JADX INFO: compiled from: ScatterMap.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.t0({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$values$1\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1850:1\n363#2,6:1851\n373#2,3:1858\n376#2,9:1862\n363#2,6:1871\n373#2,3:1878\n376#2,9:1882\n363#2,6:1891\n373#2,3:1898\n376#2,9:1902\n1826#3:1857\n1688#3:1861\n1826#3:1877\n1688#3:1881\n1826#3:1897\n1688#3:1901\n1726#4,3:1911\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$values$1\n*L\n1546#1:1851,6\n1546#1:1858,3\n1546#1:1862,9\n1557#1:1871,6\n1557#1:1878,3\n1557#1:1882,9\n1567#1:1891,6\n1567#1:1898,3\n1567#1:1902,9\n1546#1:1857\n1546#1:1861\n1557#1:1877\n1557#1:1881\n1567#1:1897\n1567#1:1901\n1577#1:1911,3\n*E\n"})
public final class MutableScatterMap$MutableMapWrapper$values$1<V> implements Collection<V>, zh.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ MutableScatterMap<K, V> f3454b;

    MutableScatterMap$MutableMapWrapper$values$1(MutableScatterMap<K, V> mutableScatterMap) {
        this.f3454b = mutableScatterMap;
    }

    public int a() {
        return this.f3454b.f3491e;
    }

    @Override // java.util.Collection
    public boolean add(V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean addAll(@dl.d Collection<? extends V> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public void clear() {
        this.f3454b.K();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return this.f3454b.h((V) obj);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // java.util.Collection
    public boolean containsAll(@dl.d Collection<? extends Object> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        MutableScatterMap<K, V> mutableScatterMap = this.f3454b;
        if (elements.isEmpty()) {
            return true;
        }
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            if (!mutableScatterMap.h((V) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f3454b.x();
    }

    @Override // java.util.Collection, java.lang.Iterable
    @dl.d
    public Iterator<V> iterator() {
        return new MutableScatterMap$MutableMapWrapper$values$1$iterator$1(this.f3454b);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x004f A[LOOP:0: B:5:0x000b->B:21:0x004f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x0052 A[SYNTHETIC] */
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
    @Override // java.util.Collection
    public boolean remove(Object obj) {
        MutableScatterMap<K, V> mutableScatterMap = this.f3454b;
        long[] jArr = mutableScatterMap.f3487a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            int i13 = (i10 << 3) + i12;
                            if (kotlin.jvm.internal.f0.g(mutableScatterMap.f3489c[i13], obj)) {
                                mutableScatterMap.o0(i13);
                                return true;
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i11 == 8) {
                        if (i10 != length) {
                            i10++;
                        }
                    }
                } else if (i10 != length) {
                    i10++;
                }
            }
        }
        return false;
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
    @Override // java.util.Collection
    public boolean removeAll(@dl.d Collection<? extends Object> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        MutableScatterMap<K, V> mutableScatterMap = this.f3454b;
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
                            if (CollectionsKt___CollectionsKt.R1(elements, mutableScatterMap.f3489c[i13])) {
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
    @Override // java.util.Collection
    public boolean retainAll(@dl.d Collection<? extends Object> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        MutableScatterMap<K, V> mutableScatterMap = this.f3454b;
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
                            if (!CollectionsKt___CollectionsKt.R1(elements, mutableScatterMap.f3489c[i13])) {
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

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return a();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.t.a(this);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.f0.p(array, "array");
        return (T[]) kotlin.jvm.internal.t.b(this, array);
    }
}
