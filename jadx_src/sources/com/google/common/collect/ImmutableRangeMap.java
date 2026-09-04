package com.google.common.collect;

import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.a
@o9.c
@u
public class ImmutableRangeMap<K extends Comparable<?>, V> implements b2<K, V>, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ImmutableRangeMap<Comparable<?>, Object> f57346d = new ImmutableRangeMap<>(ImmutableList.B(), ImmutableList.B());
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient ImmutableList<Range<K>> f57347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient ImmutableList<V> f57348c;

    public static class SerializedForm<K extends Comparable<?>, V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ImmutableMap<Range<K>, V> f57355b;

        SerializedForm(ImmutableMap<Range<K>, V> immutableMap) {
            this.f57355b = immutableMap;
        }

        Object a() {
            a aVar = new a();
            b3<Map.Entry<Range<K>, V>> it = this.f57355b.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<Range<K>, V> next = it.next();
                aVar.c(next.getKey(), next.getValue());
            }
            return aVar.a();
        }

        Object b() {
            return this.f57355b.isEmpty() ? ImmutableRangeMap.p() : a();
        }
    }

    @s9.f
    public static final class a<K extends Comparable<?>, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<Map.Entry<Range<K>, V>> f57356a = Lists.q();

        public ImmutableRangeMap<K, V> a() {
            Collections.sort(this.f57356a, Range.C().C());
            ImmutableList.a aVar = new ImmutableList.a(this.f57356a.size());
            ImmutableList.a aVar2 = new ImmutableList.a(this.f57356a.size());
            for (int i10 = 0; i10 < this.f57356a.size(); i10++) {
                Range<K> key = this.f57356a.get(i10).getKey();
                if (i10 > 0) {
                    Range<K> key2 = this.f57356a.get(i10 - 1).getKey();
                    if (key.t(key2) && !key.s(key2).u()) {
                        String strValueOf = String.valueOf(key2);
                        String strValueOf2 = String.valueOf(key);
                        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 47 + strValueOf2.length());
                        sb2.append("Overlapping ranges: range ");
                        sb2.append(strValueOf);
                        sb2.append(" overlaps with entry ");
                        sb2.append(strValueOf2);
                        throw new IllegalArgumentException(sb2.toString());
                    }
                }
                aVar.a(key);
                aVar2.a(this.f57356a.get(i10).getValue());
            }
            return new ImmutableRangeMap<>(aVar.e(), aVar2.e());
        }

        @s9.a
        a<K, V> b(a<K, V> aVar) {
            this.f57356a.addAll(aVar.f57356a);
            return this;
        }

        @s9.a
        public a<K, V> c(Range<K> range, V v10) {
            com.google.common.base.w.E(range);
            com.google.common.base.w.E(v10);
            com.google.common.base.w.u(!range.u(), "Range must not be empty, but was %s", range);
            this.f57356a.add(Maps.O(range, v10));
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @s9.a
        public a<K, V> d(b2<K, ? extends V> b2Var) {
            for (Map.Entry entry : b2Var.e().entrySet()) {
                c((Range) entry.getKey(), entry.getValue());
            }
            return this;
        }
    }

    ImmutableRangeMap(ImmutableList<Range<K>> immutableList, ImmutableList<V> immutableList2) {
        this.f57347b = immutableList;
        this.f57348c = immutableList2;
    }

    public static <K extends Comparable<?>, V> a<K, V> n() {
        return new a<>();
    }

    public static <K extends Comparable<?>, V> ImmutableRangeMap<K, V> o(b2<K, ? extends V> b2Var) {
        if (b2Var instanceof ImmutableRangeMap) {
            return (ImmutableRangeMap) b2Var;
        }
        Map<Range<K>, ? extends V> mapE = b2Var.e();
        ImmutableList.a aVar = new ImmutableList.a(mapE.size());
        ImmutableList.a aVar2 = new ImmutableList.a(mapE.size());
        for (Map.Entry entry : mapE.entrySet()) {
            aVar.a((Range) entry.getKey());
            aVar2.a(entry.getValue());
        }
        return new ImmutableRangeMap<>(aVar.e(), aVar2.e());
    }

    public static <K extends Comparable<?>, V> ImmutableRangeMap<K, V> p() {
        return (ImmutableRangeMap<K, V>) f57346d;
    }

    public static <K extends Comparable<?>, V> ImmutableRangeMap<K, V> q(Range<K> range, V v10) {
        return new ImmutableRangeMap<>(ImmutableList.D(range), ImmutableList.D(v10));
    }

    @Override // com.google.common.collect.b2
    @s9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final void b(Range<K> range) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.b2
    public Range<K> c() {
        if (this.f57347b.isEmpty()) {
            throw new NoSuchElementException();
        }
        Range<K> range = this.f57347b.get(0);
        ImmutableList<Range<K>> immutableList = this.f57347b;
        return Range.k(range.f57775b, immutableList.get(immutableList.size() - 1).f57776c);
    }

    @Override // com.google.common.collect.b2
    @s9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.b2
    public boolean equals(@CheckForNull Object obj) {
        if (obj instanceof b2) {
            return e().equals(((b2) obj).e());
        }
        return false;
    }

    @Override // com.google.common.collect.b2
    @CheckForNull
    public Map.Entry<Range<K>, V> f(K k10) {
        int iA = SortedLists.a(this.f57347b, Range.w(), Cut.d(k10), SortedLists.KeyPresentBehavior.ANY_PRESENT, SortedLists.KeyAbsentBehavior.NEXT_LOWER);
        if (iA == -1) {
            return null;
        }
        Range<K> range = this.f57347b.get(iA);
        if (range.i(k10)) {
            return Maps.O(range, this.f57348c.get(iA));
        }
        return null;
    }

    @Override // com.google.common.collect.b2
    @s9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final void h(b2<K, V> b2Var) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.b2
    public int hashCode() {
        return e().hashCode();
    }

    @Override // com.google.common.collect.b2
    @s9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final void i(Range<K> range, V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.b2
    @CheckForNull
    public V j(K k10) {
        int iA = SortedLists.a(this.f57347b, Range.w(), Cut.d(k10), SortedLists.KeyPresentBehavior.ANY_PRESENT, SortedLists.KeyAbsentBehavior.NEXT_LOWER);
        if (iA != -1 && this.f57347b.get(iA).i(k10)) {
            return this.f57348c.get(iA);
        }
        return null;
    }

    @Override // com.google.common.collect.b2
    @s9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final void k(Range<K> range, V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.b2
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public ImmutableMap<Range<K>, V> g() {
        return this.f57347b.isEmpty() ? ImmutableMap.v() : new ImmutableSortedMap(new RegularImmutableSortedSet(this.f57347b.U(), Range.C().E()), this.f57348c.U());
    }

    @Override // com.google.common.collect.b2
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public ImmutableMap<Range<K>, V> e() {
        return this.f57347b.isEmpty() ? ImmutableMap.v() : new ImmutableSortedMap(new RegularImmutableSortedSet(this.f57347b, Range.C()), this.f57348c);
    }

    @Override // com.google.common.collect.b2
    /* JADX INFO: renamed from: r */
    public ImmutableRangeMap<K, V> d(final Range<K> range) {
        if (((Range) com.google.common.base.w.E(range)).u()) {
            return p();
        }
        if (this.f57347b.isEmpty() || range.n(c())) {
            return this;
        }
        ImmutableList<Range<K>> immutableList = this.f57347b;
        com.google.common.base.n nVarI = Range.I();
        Comparable comparable = range.f57775b;
        SortedLists.KeyPresentBehavior keyPresentBehavior = SortedLists.KeyPresentBehavior.FIRST_AFTER;
        SortedLists.KeyAbsentBehavior keyAbsentBehavior = SortedLists.KeyAbsentBehavior.NEXT_HIGHER;
        final int iA = SortedLists.a(immutableList, nVarI, comparable, keyPresentBehavior, keyAbsentBehavior);
        int iA2 = SortedLists.a(this.f57347b, Range.w(), range.f57776c, SortedLists.KeyPresentBehavior.ANY_PRESENT, keyAbsentBehavior);
        if (iA >= iA2) {
            return p();
        }
        final int i10 = iA2 - iA;
        return (ImmutableRangeMap<K, V>) new ImmutableRangeMap<K, V>(this, new ImmutableList<Range<K>>() { // from class: com.google.common.collect.ImmutableRangeMap.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.List
            /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
            public Range<K> get(int i11) {
                com.google.common.base.w.C(i11, i10);
                return (i11 == 0 || i11 == i10 + (-1)) ? ((Range) ImmutableRangeMap.this.f57347b.get(i11 + iA)).s(range) : (Range) ImmutableRangeMap.this.f57347b.get(i11 + iA);
            }

            @Override // com.google.common.collect.ImmutableCollection
            boolean i() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return i10;
            }
        }, this.f57348c.subList(iA, iA2)) { // from class: com.google.common.collect.ImmutableRangeMap.2
            @Override // com.google.common.collect.ImmutableRangeMap, com.google.common.collect.b2
            public /* bridge */ /* synthetic */ Map e() {
                return super.e();
            }

            @Override // com.google.common.collect.ImmutableRangeMap, com.google.common.collect.b2
            public /* bridge */ /* synthetic */ Map g() {
                return super.g();
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.google.common.collect.ImmutableRangeMap, com.google.common.collect.b2
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public ImmutableRangeMap<K, V> d(Range<K> range2) {
                return range.t(range2) ? this.d(range2.s(range)) : ImmutableRangeMap.p();
            }
        };
    }

    Object s() {
        return new SerializedForm(e());
    }

    @Override // com.google.common.collect.b2
    public String toString() {
        return e().toString();
    }
}
