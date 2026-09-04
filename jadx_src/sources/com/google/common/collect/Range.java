package com.google.common.collect;

import java.io.Serializable;
import java.lang.Comparable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b
@u
public final class Range<C extends Comparable> extends RangeGwtSerializationDependencies implements com.google.common.base.x<C>, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Range<Comparable> f57774d = new Range<>(Cut.c(), Cut.a());
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Cut<C> f57775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Cut<C> f57776c;

    public static class RangeLexOrdering extends Ordering<Range<?>> implements Serializable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final Ordering<Range<?>> f57777d = new RangeLexOrdering();
        private static final long serialVersionUID = 0;

        private RangeLexOrdering() {
        }

        @Override // com.google.common.collect.Ordering, java.util.Comparator
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public int compare(Range<?> range, Range<?> range2) {
            return r.n().i(range.f57775b, range2.f57775b).i(range.f57776c, range2.f57776c).m();
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f57778a;

        static {
            int[] iArr = new int[BoundType.values().length];
            f57778a = iArr;
            try {
                iArr[BoundType.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57778a[BoundType.CLOSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class b implements com.google.common.base.n<Range, Cut> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final b f57779b = new b();

        b() {
        }

        @Override // com.google.common.base.n
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cut apply(Range range) {
            return range.f57775b;
        }
    }

    public static class c implements com.google.common.base.n<Range, Cut> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final c f57780b = new c();

        c() {
        }

        @Override // com.google.common.base.n
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cut apply(Range range) {
            return range.f57776c;
        }
    }

    private Range(Cut<C> cut, Cut<C> cut2) {
        this.f57775b = (Cut) com.google.common.base.w.E(cut);
        this.f57776c = (Cut) com.google.common.base.w.E(cut2);
        if (cut.compareTo(cut2) > 0 || cut == Cut.a() || cut2 == Cut.c()) {
            String strValueOf = String.valueOf(G(cut, cut2));
            throw new IllegalArgumentException(strValueOf.length() != 0 ? "Invalid range: ".concat(strValueOf) : new String("Invalid range: "));
        }
    }

    public static <C extends Comparable<?>> Range<C> A(C c10, C c11) {
        return k(Cut.b(c10), Cut.b(c11));
    }

    public static <C extends Comparable<?>> Range<C> B(C c10, BoundType boundType, C c11, BoundType boundType2) {
        com.google.common.base.w.E(boundType);
        com.google.common.base.w.E(boundType2);
        BoundType boundType3 = BoundType.OPEN;
        return k(boundType == boundType3 ? Cut.b(c10) : Cut.d(c10), boundType2 == boundType3 ? Cut.d(c11) : Cut.b(c11));
    }

    static <C extends Comparable<?>> Ordering<Range<C>> C() {
        return (Ordering<Range<C>>) RangeLexOrdering.f57777d;
    }

    public static <C extends Comparable<?>> Range<C> E(C c10) {
        return f(c10, c10);
    }

    private static String G(Cut<?> cut, Cut<?> cut2) {
        StringBuilder sb2 = new StringBuilder(16);
        cut.g(sb2);
        sb2.append("..");
        cut2.h(sb2);
        return sb2.toString();
    }

    public static <C extends Comparable<?>> Range<C> H(C c10, BoundType boundType) {
        int i10 = a.f57778a[boundType.ordinal()];
        if (i10 == 1) {
            return v(c10);
        }
        if (i10 == 2) {
            return d(c10);
        }
        throw new AssertionError();
    }

    static <C extends Comparable<?>> com.google.common.base.n<Range<C>, Cut<C>> I() {
        return c.f57780b;
    }

    public static <C extends Comparable<?>> Range<C> a() {
        return (Range<C>) f57774d;
    }

    public static <C extends Comparable<?>> Range<C> c(C c10) {
        return k(Cut.d(c10), Cut.a());
    }

    public static <C extends Comparable<?>> Range<C> d(C c10) {
        return k(Cut.c(), Cut.b(c10));
    }

    public static <C extends Comparable<?>> Range<C> f(C c10, C c11) {
        return k(Cut.d(c10), Cut.b(c11));
    }

    public static <C extends Comparable<?>> Range<C> g(C c10, C c11) {
        return k(Cut.d(c10), Cut.d(c11));
    }

    static int h(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }

    static <C extends Comparable<?>> Range<C> k(Cut<C> cut, Cut<C> cut2) {
        return new Range<>(cut, cut2);
    }

    public static <C extends Comparable<?>> Range<C> l(C c10, BoundType boundType) {
        int i10 = a.f57778a[boundType.ordinal()];
        if (i10 == 1) {
            return p(c10);
        }
        if (i10 == 2) {
            return c(c10);
        }
        throw new AssertionError();
    }

    public static <C extends Comparable<?>> Range<C> m(Iterable<C> iterable) {
        com.google.common.base.w.E(iterable);
        if (iterable instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) iterable;
            Comparator comparator = sortedSet.comparator();
            if (Ordering.z().equals(comparator) || comparator == null) {
                return f((Comparable) sortedSet.first(), (Comparable) sortedSet.last());
            }
        }
        Iterator<C> it = iterable.iterator();
        Comparable comparable = (Comparable) com.google.common.base.w.E(it.next());
        Comparable comparable2 = comparable;
        while (it.hasNext()) {
            Comparable comparable3 = (Comparable) com.google.common.base.w.E(it.next());
            comparable = (Comparable) Ordering.z().w(comparable, comparable3);
            comparable2 = (Comparable) Ordering.z().s(comparable2, comparable3);
        }
        return f(comparable, comparable2);
    }

    public static <C extends Comparable<?>> Range<C> p(C c10) {
        return k(Cut.b(c10), Cut.a());
    }

    public static <C extends Comparable<?>> Range<C> v(C c10) {
        return k(Cut.c(), Cut.d(c10));
    }

    static <C extends Comparable<?>> com.google.common.base.n<Range<C>, Cut<C>> w() {
        return b.f57779b;
    }

    public static <C extends Comparable<?>> Range<C> z(C c10, C c11) {
        return k(Cut.b(c10), Cut.d(c11));
    }

    Object D() {
        return equals(f57774d) ? a() : this;
    }

    public Range<C> F(Range<C> range) {
        int iCompareTo = this.f57775b.compareTo(range.f57775b);
        int iCompareTo2 = this.f57776c.compareTo(range.f57776c);
        if (iCompareTo <= 0 && iCompareTo2 >= 0) {
            return this;
        }
        if (iCompareTo < 0 || iCompareTo2 > 0) {
            return k(iCompareTo <= 0 ? this.f57775b : range.f57775b, iCompareTo2 >= 0 ? this.f57776c : range.f57776c);
        }
        return range;
    }

    public BoundType J() {
        return this.f57776c.n();
    }

    public C K() {
        return (C) this.f57776c.i();
    }

    @Override // com.google.common.base.x
    @Deprecated
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean apply(C c10) {
        return i(c10);
    }

    public Range<C> e(DiscreteDomain<C> discreteDomain) {
        com.google.common.base.w.E(discreteDomain);
        Cut<C> cutE = this.f57775b.e(discreteDomain);
        Cut<C> cutE2 = this.f57776c.e(discreteDomain);
        return (cutE == this.f57775b && cutE2 == this.f57776c) ? this : k(cutE, cutE2);
    }

    @Override // com.google.common.base.x
    public boolean equals(@CheckForNull Object obj) {
        if (!(obj instanceof Range)) {
            return false;
        }
        Range range = (Range) obj;
        return this.f57775b.equals(range.f57775b) && this.f57776c.equals(range.f57776c);
    }

    public int hashCode() {
        return (this.f57775b.hashCode() * 31) + this.f57776c.hashCode();
    }

    public boolean i(C c10) {
        com.google.common.base.w.E(c10);
        return this.f57775b.k(c10) && !this.f57776c.k(c10);
    }

    public boolean j(Iterable<? extends C> iterable) {
        if (l1.C(iterable)) {
            return true;
        }
        if (iterable instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) iterable;
            Comparator comparator = sortedSet.comparator();
            if (Ordering.z().equals(comparator) || comparator == null) {
                return i((Comparable) sortedSet.first()) && i((Comparable) sortedSet.last());
            }
        }
        Iterator<? extends C> it = iterable.iterator();
        while (it.hasNext()) {
            if (!i(it.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean n(Range<C> range) {
        return this.f57775b.compareTo(range.f57775b) <= 0 && this.f57776c.compareTo(range.f57776c) >= 0;
    }

    public Range<C> o(Range<C> range) {
        if (this.f57775b.compareTo(range.f57776c) >= 0 || range.f57775b.compareTo(this.f57776c) >= 0) {
            boolean z10 = this.f57775b.compareTo(range.f57775b) < 0;
            Range<C> range2 = z10 ? this : range;
            if (!z10) {
                range = this;
            }
            return k(range2.f57776c, range.f57775b);
        }
        String strValueOf = String.valueOf(this);
        String strValueOf2 = String.valueOf(range);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 39 + strValueOf2.length());
        sb2.append("Ranges have a nonempty intersection: ");
        sb2.append(strValueOf);
        sb2.append(", ");
        sb2.append(strValueOf2);
        throw new IllegalArgumentException(sb2.toString());
    }

    public boolean q() {
        return this.f57775b != Cut.c();
    }

    public boolean r() {
        return this.f57776c != Cut.a();
    }

    public Range<C> s(Range<C> range) {
        int iCompareTo = this.f57775b.compareTo(range.f57775b);
        int iCompareTo2 = this.f57776c.compareTo(range.f57776c);
        if (iCompareTo >= 0 && iCompareTo2 <= 0) {
            return this;
        }
        if (iCompareTo <= 0 && iCompareTo2 >= 0) {
            return range;
        }
        Cut<C> cut = iCompareTo >= 0 ? this.f57775b : range.f57775b;
        Cut<C> cut2 = iCompareTo2 <= 0 ? this.f57776c : range.f57776c;
        com.google.common.base.w.y(cut.compareTo(cut2) <= 0, "intersection is undefined for disconnected ranges %s and %s", this, range);
        return k(cut, cut2);
    }

    public boolean t(Range<C> range) {
        return this.f57775b.compareTo(range.f57776c) <= 0 && range.f57775b.compareTo(this.f57776c) <= 0;
    }

    public String toString() {
        return G(this.f57775b, this.f57776c);
    }

    public boolean u() {
        return this.f57775b.equals(this.f57776c);
    }

    public BoundType x() {
        return this.f57775b.m();
    }

    public C y() {
        return (C) this.f57775b.i();
    }
}
