package com.google.common.collect;

import com.google.common.primitives.Ints;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.a
@o9.c
@u
public final class ImmutableRangeSet<C extends Comparable> extends f<C> implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ImmutableRangeSet<Comparable<?>> f57357d = new ImmutableRangeSet<>(ImmutableList.B());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ImmutableRangeSet<Comparable<?>> f57358e = new ImmutableRangeSet<>(ImmutableList.D(Range.a()));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient ImmutableList<Range<C>> f57359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @CheckForNull
    @t9.b
    private transient ImmutableRangeSet<C> f57360c;

    public final class AsSet extends ImmutableSortedSet<C> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final DiscreteDomain<C> f57365i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @CheckForNull
        private transient Integer f57366j;

        public class a extends AbstractIterator<C> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final Iterator<Range<C>> f57368d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Iterator<C> f57369e = Iterators.u();

            a() {
                this.f57368d = ImmutableRangeSet.this.f57359b.iterator();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.AbstractIterator
            @CheckForNull
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public C a() {
                while (!this.f57369e.hasNext()) {
                    if (!this.f57368d.hasNext()) {
                        return (C) b();
                    }
                    this.f57369e = ContiguousSet.Z0(this.f57368d.next(), AsSet.this.f57365i).iterator();
                }
                return this.f57369e.next();
            }
        }

        public class b extends AbstractIterator<C> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final Iterator<Range<C>> f57371d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Iterator<C> f57372e = Iterators.u();

            b() {
                this.f57371d = ImmutableRangeSet.this.f57359b.U().iterator();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.AbstractIterator
            @CheckForNull
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public C a() {
                while (!this.f57372e.hasNext()) {
                    if (!this.f57371d.hasNext()) {
                        return (C) b();
                    }
                    this.f57372e = ContiguousSet.Z0(this.f57371d.next(), AsSet.this.f57365i).descendingIterator();
                }
                return this.f57372e.next();
            }
        }

        AsSet(DiscreteDomain<C> discreteDomain) {
            super(Ordering.z());
            this.f57365i = discreteDomain;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableSortedSet
        /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
        public ImmutableSortedSet<C> v0(C c10, boolean z10) {
            return W0(Range.H(c10, BoundType.forBoolean(z10)));
        }

        ImmutableSortedSet<C> W0(Range<C> range) {
            return ImmutableRangeSet.this.k(range).v(this.f57365i);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableSortedSet
        /* JADX INFO: renamed from: X0, reason: merged with bridge method [inline-methods] */
        public ImmutableSortedSet<C> O0(C c10, boolean z10, C c11, boolean z11) {
            return (z10 || z11 || Range.h(c10, c11) != 0) ? W0(Range.B(c10, BoundType.forBoolean(z10), c11, BoundType.forBoolean(z11))) : ImmutableSortedSet.y0();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableSortedSet
        /* JADX INFO: renamed from: Z0, reason: merged with bridge method [inline-methods] */
        public ImmutableSortedSet<C> R0(C c10, boolean z10) {
            return W0(Range.l(c10, BoundType.forBoolean(z10)));
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            if (obj == null) {
                return false;
            }
            try {
                return ImmutableRangeSet.this.a((Comparable) obj);
            } catch (ClassCastException unused) {
                return false;
            }
        }

        @Override // com.google.common.collect.ImmutableCollection
        boolean i() {
            return ImmutableRangeSet.this.f57359b.i();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableSortedSet
        int indexOf(@CheckForNull Object obj) {
            if (!contains(obj)) {
                return -1;
            }
            Objects.requireNonNull(obj);
            Comparable comparable = (Comparable) obj;
            long size = 0;
            b3 it = ImmutableRangeSet.this.f57359b.iterator();
            while (it.hasNext()) {
                Range range = (Range) it.next();
                if (range.i(comparable)) {
                    return Ints.x(size + ((long) ContiguousSet.Z0(range, this.f57365i).indexOf(comparable)));
                }
                size += (long) ContiguousSet.Z0(range, this.f57365i).size();
            }
            throw new AssertionError("impossible");
        }

        @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.j2
        /* JADX INFO: renamed from: j */
        public b3<C> iterator() {
            return new a();
        }

        @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        Object l() {
            return new AsSetSerializedForm(ImmutableRangeSet.this.f57359b, this.f57365i);
        }

        @Override // com.google.common.collect.ImmutableSortedSet
        ImmutableSortedSet<C> n0() {
            return new DescendingImmutableSortedSet(this);
        }

        @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
        @o9.c("NavigableSet")
        /* JADX INFO: renamed from: q0 */
        public b3<C> descendingIterator() {
            return new b();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Integer numValueOf = this.f57366j;
            if (numValueOf == null) {
                long size = 0;
                b3 it = ImmutableRangeSet.this.f57359b.iterator();
                while (it.hasNext()) {
                    size += (long) ContiguousSet.Z0((Range) it.next(), this.f57365i).size();
                    if (size >= 2147483647L) {
                        break;
                    }
                }
                numValueOf = Integer.valueOf(Ints.x(size));
                this.f57366j = numValueOf;
            }
            return numValueOf.intValue();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return ImmutableRangeSet.this.f57359b.toString();
        }
    }

    public static class AsSetSerializedForm<C extends Comparable> implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ImmutableList<Range<C>> f57374b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final DiscreteDomain<C> f57375c;

        AsSetSerializedForm(ImmutableList<Range<C>> immutableList, DiscreteDomain<C> discreteDomain) {
            this.f57374b = immutableList;
            this.f57375c = discreteDomain;
        }

        Object a() {
            return new ImmutableRangeSet(this.f57374b).v(this.f57375c);
        }
    }

    public final class ComplementRanges extends ImmutableList<Range<C>> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f57376d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f57377e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f57378f;

        /* JADX WARN: Multi-variable type inference failed */
        ComplementRanges() {
            boolean zQ = ((Range) ImmutableRangeSet.this.f57359b.get(0)).q();
            this.f57376d = zQ;
            boolean zR = ((Range) l1.w(ImmutableRangeSet.this.f57359b)).r();
            this.f57377e = zR;
            int size = ImmutableRangeSet.this.f57359b.size() - 1;
            size = zQ ? size + 1 : size;
            this.f57378f = zR ? size + 1 : size;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
        public Range<C> get(int i10) {
            Cut<C> cutC;
            com.google.common.base.w.C(i10, this.f57378f);
            if (this.f57376d) {
                cutC = i10 == 0 ? Cut.c() : ((Range) ImmutableRangeSet.this.f57359b.get(i10 - 1)).f57776c;
            } else {
                cutC = ((Range) ImmutableRangeSet.this.f57359b.get(i10)).f57776c;
            }
            return Range.k(cutC, (this.f57377e && i10 == this.f57378f + (-1)) ? Cut.a() : ((Range) ImmutableRangeSet.this.f57359b.get(i10 + (!this.f57376d ? 1 : 0))).f57775b);
        }

        @Override // com.google.common.collect.ImmutableCollection
        boolean i() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f57378f;
        }
    }

    public static final class SerializedForm<C extends Comparable> implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ImmutableList<Range<C>> f57380b;

        SerializedForm(ImmutableList<Range<C>> immutableList) {
            this.f57380b = immutableList;
        }

        Object a() {
            if (this.f57380b.isEmpty()) {
                return ImmutableRangeSet.E();
            }
            return this.f57380b.equals(ImmutableList.D(Range.a())) ? ImmutableRangeSet.s() : new ImmutableRangeSet(this.f57380b);
        }
    }

    public static class a<C extends Comparable<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<Range<C>> f57381a = Lists.q();

        @s9.a
        public a<C> a(Range<C> range) {
            com.google.common.base.w.u(!range.u(), "range must not be empty, but was %s", range);
            this.f57381a.add(range);
            return this;
        }

        @s9.a
        public a<C> b(c2<C> c2Var) {
            return c(c2Var.m());
        }

        @s9.a
        public a<C> c(Iterable<Range<C>> iterable) {
            Iterator<Range<C>> it = iterable.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            return this;
        }

        public ImmutableRangeSet<C> d() {
            ImmutableList.a aVar = new ImmutableList.a(this.f57381a.size());
            Collections.sort(this.f57381a, Range.C());
            y1 y1VarT = Iterators.T(this.f57381a.iterator());
            while (y1VarT.hasNext()) {
                Range rangeF = (Range) y1VarT.next();
                while (y1VarT.hasNext()) {
                    Range<C> range = (Range) y1VarT.peek();
                    if (!rangeF.t(range)) {
                        break;
                    }
                    com.google.common.base.w.y(rangeF.s(range).u(), "Overlapping ranges not permitted but found %s overlapping %s", rangeF, range);
                    rangeF = rangeF.F((Range) y1VarT.next());
                }
                aVar.a(rangeF);
            }
            ImmutableList immutableListE = aVar.e();
            if (immutableListE.isEmpty()) {
                return ImmutableRangeSet.E();
            }
            return (immutableListE.size() == 1 && ((Range) l1.z(immutableListE)).equals(Range.a())) ? ImmutableRangeSet.s() : new ImmutableRangeSet<>(immutableListE);
        }

        @s9.a
        a<C> e(a<C> aVar) {
            c(aVar.f57381a);
            return this;
        }
    }

    ImmutableRangeSet(ImmutableList<Range<C>> immutableList) {
        this.f57359b = immutableList;
    }

    private ImmutableRangeSet(ImmutableList<Range<C>> immutableList, ImmutableRangeSet<C> immutableRangeSet) {
        this.f57359b = immutableList;
        this.f57360c = immutableRangeSet;
    }

    private ImmutableList<Range<C>> B(final Range<C> range) {
        if (this.f57359b.isEmpty() || range.u()) {
            return ImmutableList.B();
        }
        if (range.n(c())) {
            return this.f57359b;
        }
        final int iA = range.q() ? SortedLists.a(this.f57359b, Range.I(), range.f57775b, SortedLists.KeyPresentBehavior.FIRST_AFTER, SortedLists.KeyAbsentBehavior.NEXT_HIGHER) : 0;
        final int iA2 = (range.r() ? SortedLists.a(this.f57359b, Range.w(), range.f57776c, SortedLists.KeyPresentBehavior.FIRST_PRESENT, SortedLists.KeyAbsentBehavior.NEXT_HIGHER) : this.f57359b.size()) - iA;
        return iA2 == 0 ? ImmutableList.B() : (ImmutableList<Range<C>>) new ImmutableList<Range<C>>() { // from class: com.google.common.collect.ImmutableRangeSet.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.List
            /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
            public Range<C> get(int i10) {
                com.google.common.base.w.C(i10, iA2);
                return (i10 == 0 || i10 == iA2 + (-1)) ? ((Range) ImmutableRangeSet.this.f57359b.get(i10 + iA)).s(range) : (Range) ImmutableRangeSet.this.f57359b.get(i10 + iA);
            }

            @Override // com.google.common.collect.ImmutableCollection
            boolean i() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return iA2;
            }
        };
    }

    public static <C extends Comparable> ImmutableRangeSet<C> E() {
        return f57357d;
    }

    public static <C extends Comparable> ImmutableRangeSet<C> F(Range<C> range) {
        com.google.common.base.w.E(range);
        if (range.u()) {
            return E();
        }
        return range.equals(Range.a()) ? s() : new ImmutableRangeSet<>(ImmutableList.D(range));
    }

    public static <C extends Comparable<?>> ImmutableRangeSet<C> I(Iterable<Range<C>> iterable) {
        return y(TreeRangeSet.u(iterable));
    }

    static <C extends Comparable> ImmutableRangeSet<C> s() {
        return f57358e;
    }

    public static <C extends Comparable<?>> a<C> w() {
        return new a<>();
    }

    public static <C extends Comparable> ImmutableRangeSet<C> y(c2<C> c2Var) {
        com.google.common.base.w.E(c2Var);
        if (c2Var.isEmpty()) {
            return E();
        }
        if (c2Var.i(Range.a())) {
            return s();
        }
        if (c2Var instanceof ImmutableRangeSet) {
            ImmutableRangeSet<C> immutableRangeSet = (ImmutableRangeSet) c2Var;
            if (!immutableRangeSet.D()) {
                return immutableRangeSet;
            }
        }
        return new ImmutableRangeSet<>(ImmutableList.v(c2Var.m()));
    }

    public static <C extends Comparable<?>> ImmutableRangeSet<C> z(Iterable<Range<C>> iterable) {
        return new a().c(iterable).d();
    }

    public ImmutableRangeSet<C> A(c2<C> c2Var) {
        TreeRangeSet treeRangeSetT = TreeRangeSet.t(this);
        treeRangeSetT.n(c2Var);
        return y(treeRangeSetT);
    }

    public ImmutableRangeSet<C> C(c2<C> c2Var) {
        TreeRangeSet treeRangeSetT = TreeRangeSet.t(this);
        treeRangeSetT.n(c2Var.d());
        return y(treeRangeSetT);
    }

    boolean D() {
        return this.f57359b.i();
    }

    @Override // com.google.common.collect.c2
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public ImmutableRangeSet<C> k(Range<C> range) {
        if (!isEmpty()) {
            Range<C> rangeC = c();
            if (range.n(rangeC)) {
                return this;
            }
            if (range.t(rangeC)) {
                return new ImmutableRangeSet<>(B(range));
            }
        }
        return E();
    }

    public ImmutableRangeSet<C> H(c2<C> c2Var) {
        return I(l1.f(m(), c2Var.m()));
    }

    Object J() {
        return new SerializedForm(this.f57359b);
    }

    @Override // com.google.common.collect.f, com.google.common.collect.c2
    public /* bridge */ /* synthetic */ boolean a(Comparable comparable) {
        return super.a(comparable);
    }

    @Override // com.google.common.collect.f, com.google.common.collect.c2
    @s9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public void b(Range<C> range) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.c2
    public Range<C> c() {
        if (this.f57359b.isEmpty()) {
            throw new NoSuchElementException();
        }
        Cut<C> cut = this.f57359b.get(0).f57775b;
        ImmutableList<Range<C>> immutableList = this.f57359b;
        return Range.k(cut, immutableList.get(immutableList.size() - 1).f57776c);
    }

    @Override // com.google.common.collect.f, com.google.common.collect.c2
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // com.google.common.collect.f, com.google.common.collect.c2
    public boolean e(Range<C> range) {
        int iB = SortedLists.b(this.f57359b, Range.w(), range.f57775b, Ordering.z(), SortedLists.KeyPresentBehavior.ANY_PRESENT, SortedLists.KeyAbsentBehavior.NEXT_HIGHER);
        if (iB < this.f57359b.size() && this.f57359b.get(iB).t(range) && !this.f57359b.get(iB).s(range).u()) {
            return true;
        }
        if (iB > 0) {
            int i10 = iB - 1;
            if (this.f57359b.get(i10).t(range) && !this.f57359b.get(i10).s(range).u()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.common.collect.f, com.google.common.collect.c2
    public /* bridge */ /* synthetic */ boolean equals(@CheckForNull Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.f, com.google.common.collect.c2
    @s9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public void f(Iterable<Range<C>> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.f, com.google.common.collect.c2
    public /* bridge */ /* synthetic */ boolean g(c2 c2Var) {
        return super.g(c2Var);
    }

    @Override // com.google.common.collect.f, com.google.common.collect.c2
    @CheckForNull
    public Range<C> h(C c10) {
        int iB = SortedLists.b(this.f57359b, Range.w(), Cut.d(c10), Ordering.z(), SortedLists.KeyPresentBehavior.ANY_PRESENT, SortedLists.KeyAbsentBehavior.NEXT_LOWER);
        if (iB == -1) {
            return null;
        }
        Range<C> range = this.f57359b.get(iB);
        if (range.i(c10)) {
            return range;
        }
        return null;
    }

    @Override // com.google.common.collect.f, com.google.common.collect.c2
    public boolean i(Range<C> range) {
        int iB = SortedLists.b(this.f57359b, Range.w(), range.f57775b, Ordering.z(), SortedLists.KeyPresentBehavior.ANY_PRESENT, SortedLists.KeyAbsentBehavior.NEXT_LOWER);
        return iB != -1 && this.f57359b.get(iB).n(range);
    }

    @Override // com.google.common.collect.f, com.google.common.collect.c2
    public boolean isEmpty() {
        return this.f57359b.isEmpty();
    }

    @Override // com.google.common.collect.f, com.google.common.collect.c2
    public /* bridge */ /* synthetic */ boolean j(Iterable iterable) {
        return super.j(iterable);
    }

    @Override // com.google.common.collect.f, com.google.common.collect.c2
    @s9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public void n(c2<C> c2Var) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.f, com.google.common.collect.c2
    @s9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public void o(Range<C> range) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.f, com.google.common.collect.c2
    @s9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public void p(Iterable<Range<C>> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.f, com.google.common.collect.c2
    @s9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public void q(c2<C> c2Var) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.c2
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public ImmutableSet<Range<C>> l() {
        return this.f57359b.isEmpty() ? ImmutableSet.D() : new RegularImmutableSortedSet(this.f57359b.U(), Range.C().E());
    }

    @Override // com.google.common.collect.c2
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public ImmutableSet<Range<C>> m() {
        return this.f57359b.isEmpty() ? ImmutableSet.D() : new RegularImmutableSortedSet(this.f57359b, Range.C());
    }

    public ImmutableSortedSet<C> v(DiscreteDomain<C> discreteDomain) {
        com.google.common.base.w.E(discreteDomain);
        if (isEmpty()) {
            return ImmutableSortedSet.y0();
        }
        Range<C> rangeE = c().e(discreteDomain);
        if (!rangeE.q()) {
            throw new IllegalArgumentException("Neither the DiscreteDomain nor this range set are bounded below");
        }
        if (!rangeE.r()) {
            try {
                discreteDomain.e();
            } catch (NoSuchElementException unused) {
                throw new IllegalArgumentException("Neither the DiscreteDomain nor this range set are bounded above");
            }
        }
        return new AsSet(discreteDomain);
    }

    @Override // com.google.common.collect.c2
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public ImmutableRangeSet<C> d() {
        ImmutableRangeSet<C> immutableRangeSet = this.f57360c;
        if (immutableRangeSet != null) {
            return immutableRangeSet;
        }
        if (this.f57359b.isEmpty()) {
            ImmutableRangeSet<C> immutableRangeSetS = s();
            this.f57360c = immutableRangeSetS;
            return immutableRangeSetS;
        }
        if (this.f57359b.size() == 1 && this.f57359b.get(0).equals(Range.a())) {
            ImmutableRangeSet<C> immutableRangeSetE = E();
            this.f57360c = immutableRangeSetE;
            return immutableRangeSetE;
        }
        ImmutableRangeSet<C> immutableRangeSet2 = new ImmutableRangeSet<>(new ComplementRanges(), this);
        this.f57360c = immutableRangeSet2;
        return immutableRangeSet2;
    }
}
