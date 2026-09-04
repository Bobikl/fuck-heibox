package com.google.common.collect;

import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collection;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b(emulated = true)
@u
public final class RegularContiguousSet<C extends Comparable> extends ContiguousSet<C> {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Range<C> f57781j;

    @o9.c
    public static final class SerializedForm<C extends Comparable> implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Range<C> f57783b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final DiscreteDomain<C> f57784c;

        private SerializedForm(Range<C> range, DiscreteDomain<C> discreteDomain) {
            this.f57783b = range;
            this.f57784c = discreteDomain;
        }

        /* synthetic */ SerializedForm(Range range, DiscreteDomain discreteDomain, a aVar) {
            this(range, discreteDomain);
        }

        private Object a() {
            return new RegularContiguousSet(this.f57783b, this.f57784c);
        }
    }

    public class a extends g<C> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final C f57785c;

        a(Comparable comparable) {
            super(comparable);
            this.f57785c = (C) RegularContiguousSet.this.last();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.g
        @CheckForNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C a(C c10) {
            if (RegularContiguousSet.s1(c10, this.f57785c)) {
                return null;
            }
            return (C) RegularContiguousSet.this.f57163i.g(c10);
        }
    }

    public class b extends g<C> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final C f57787c;

        b(Comparable comparable) {
            super(comparable);
            this.f57787c = (C) RegularContiguousSet.this.first();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.g
        @CheckForNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C a(C c10) {
            if (RegularContiguousSet.s1(c10, this.f57787c)) {
                return null;
            }
            return (C) RegularContiguousSet.this.f57163i.i(c10);
        }
    }

    RegularContiguousSet(Range<C> range, DiscreteDomain<C> discreteDomain) {
        super(discreteDomain);
        this.f57781j = range;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean s1(Comparable<?> comparable, @CheckForNull Comparable<?> comparable2) {
        return comparable2 != null && Range.h(comparable, comparable2) == 0;
    }

    private ContiguousSet<C> v1(Range<C> range) {
        return this.f57781j.t(range) ? ContiguousSet.Z0(this.f57781j.s(range), this.f57163i) : new EmptyContiguousSet(this.f57163i);
    }

    @Override // com.google.common.collect.ImmutableSet
    ImmutableList<C> A() {
        return this.f57163i.f57190b ? new ImmutableAsList<C>() { // from class: com.google.common.collect.RegularContiguousSet.3
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.ImmutableAsList
            /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
            public ImmutableSortedSet<C> Z() {
                return RegularContiguousSet.this;
            }

            @Override // java.util.List
            /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
            public C get(int i10) {
                com.google.common.base.w.C(i10, size());
                RegularContiguousSet regularContiguousSet = RegularContiguousSet.this;
                return (C) regularContiguousSet.f57163i.h(regularContiguousSet.first(), i10);
            }
        } : super.A();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    /* JADX INFO: renamed from: c1 */
    public ContiguousSet<C> v0(C c10, boolean z10) {
        return v1(Range.H(c10, BoundType.forBoolean(z10)));
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return this.f57781j.i((Comparable) obj);
        } catch (ClassCastException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        return o.b(this, collection);
    }

    @Override // com.google.common.collect.ContiguousSet
    public ContiguousSet<C> e1(ContiguousSet<C> contiguousSet) {
        com.google.common.base.w.E(contiguousSet);
        com.google.common.base.w.d(this.f57163i.equals(contiguousSet.f57163i));
        if (contiguousSet.isEmpty()) {
            return contiguousSet;
        }
        Comparable comparable = (Comparable) Ordering.z().s(first(), contiguousSet.first());
        Comparable comparable2 = (Comparable) Ordering.z().w(last(), contiguousSet.last());
        return comparable.compareTo(comparable2) <= 0 ? ContiguousSet.Z0(Range.f(comparable, comparable2), this.f57163i) : new EmptyContiguousSet(this.f57163i);
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RegularContiguousSet) {
            RegularContiguousSet regularContiguousSet = (RegularContiguousSet) obj;
            if (this.f57163i.equals(regularContiguousSet.f57163i)) {
                return first().equals(regularContiguousSet.first()) && last().equals(regularContiguousSet.last());
            }
        }
        return super.equals(obj);
    }

    @Override // com.google.common.collect.ContiguousSet
    public Range<C> f1() {
        BoundType boundType = BoundType.CLOSED;
        return g1(boundType, boundType);
    }

    @Override // com.google.common.collect.ContiguousSet
    public Range<C> g1(BoundType boundType, BoundType boundType2) {
        return Range.k(this.f57781j.f57775b.o(boundType, this.f57163i), this.f57781j.f57776c.p(boundType2, this.f57163i));
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public int hashCode() {
        return Sets.k(this);
    }

    @Override // com.google.common.collect.ImmutableCollection
    boolean i() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    @o9.c
    int indexOf(@CheckForNull Object obj) {
        if (!contains(obj)) {
            return -1;
        }
        DiscreteDomain<C> discreteDomain = this.f57163i;
        Comparable comparableFirst = first();
        Objects.requireNonNull(obj);
        return (int) discreteDomain.b(comparableFirst, (Comparable) obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.j2
    /* JADX INFO: renamed from: j */
    public b3<C> iterator() {
        return new a(first());
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    @o9.c
    Object l() {
        return new SerializedForm(this.f57781j, this.f57163i, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    /* JADX INFO: renamed from: m1 */
    public ContiguousSet<C> O0(C c10, boolean z10, C c11, boolean z11) {
        return (c10.compareTo(c11) != 0 || z10 || z11) ? v1(Range.B(c10, BoundType.forBoolean(z10), c11, BoundType.forBoolean(z11))) : new EmptyContiguousSet(this.f57163i);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @o9.c
    /* JADX INFO: renamed from: q0 */
    public b3<C> descendingIterator() {
        return new b(last());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    /* JADX INFO: renamed from: q1 */
    public ContiguousSet<C> R0(C c10, boolean z10) {
        return v1(Range.l(c10, BoundType.forBoolean(z10)));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        long jB = this.f57163i.b(first(), last());
        if (jB >= 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return ((int) jB) + 1;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    /* JADX INFO: renamed from: u1, reason: merged with bridge method [inline-methods] */
    public C first() {
        Comparable comparableL = this.f57781j.f57775b.l(this.f57163i);
        Objects.requireNonNull(comparableL);
        return (C) comparableL;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    /* JADX INFO: renamed from: w1, reason: merged with bridge method [inline-methods] */
    public C last() {
        Comparable comparableJ = this.f57781j.f57776c.j(this.f57163i);
        Objects.requireNonNull(comparableJ);
        return (C) comparableJ;
    }
}
