package com.google.common.collect;

import com.google.common.primitives.Booleans;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b
@u
public abstract class Cut<C extends Comparable> implements Comparable<Cut<C>>, Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final C f57165b;

    public static final class AboveAll extends Cut<Comparable<?>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final AboveAll f57166c = new AboveAll();
        private static final long serialVersionUID = 0;

        private AboveAll() {
            super("");
        }

        private Object r() {
            return f57166c;
        }

        @Override // com.google.common.collect.Cut, java.lang.Comparable
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public int compareTo(Cut<Comparable<?>> cut) {
            return cut == this ? 0 : 1;
        }

        @Override // com.google.common.collect.Cut
        void g(StringBuilder sb2) {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.Cut
        void h(StringBuilder sb2) {
            sb2.append("+∞)");
        }

        @Override // com.google.common.collect.Cut
        public int hashCode() {
            return System.identityHashCode(this);
        }

        @Override // com.google.common.collect.Cut
        Comparable<?> i() {
            throw new IllegalStateException("range unbounded on this side");
        }

        @Override // com.google.common.collect.Cut
        Comparable<?> j(DiscreteDomain<Comparable<?>> discreteDomain) {
            return discreteDomain.e();
        }

        @Override // com.google.common.collect.Cut
        boolean k(Comparable<?> comparable) {
            return false;
        }

        @Override // com.google.common.collect.Cut
        Comparable<?> l(DiscreteDomain<Comparable<?>> discreteDomain) {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.Cut
        BoundType m() {
            throw new AssertionError("this statement should be unreachable");
        }

        @Override // com.google.common.collect.Cut
        BoundType n() {
            throw new IllegalStateException();
        }

        @Override // com.google.common.collect.Cut
        Cut<Comparable<?>> o(BoundType boundType, DiscreteDomain<Comparable<?>> discreteDomain) {
            throw new AssertionError("this statement should be unreachable");
        }

        @Override // com.google.common.collect.Cut
        Cut<Comparable<?>> p(BoundType boundType, DiscreteDomain<Comparable<?>> discreteDomain) {
            throw new IllegalStateException();
        }

        public String toString() {
            return "+∞";
        }
    }

    public static final class AboveValue<C extends Comparable> extends Cut<C> {
        private static final long serialVersionUID = 0;

        AboveValue(C c10) {
            super((Comparable) com.google.common.base.w.E(c10));
        }

        @Override // com.google.common.collect.Cut, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return super.compareTo((Cut) obj);
        }

        @Override // com.google.common.collect.Cut
        Cut<C> e(DiscreteDomain<C> discreteDomain) {
            Comparable comparableL = l(discreteDomain);
            return comparableL != null ? Cut.d(comparableL) : Cut.a();
        }

        @Override // com.google.common.collect.Cut
        void g(StringBuilder sb2) {
            sb2.append('(');
            sb2.append(this.f57165b);
        }

        @Override // com.google.common.collect.Cut
        void h(StringBuilder sb2) {
            sb2.append(this.f57165b);
            sb2.append(']');
        }

        @Override // com.google.common.collect.Cut
        public int hashCode() {
            return ~this.f57165b.hashCode();
        }

        @Override // com.google.common.collect.Cut
        C j(DiscreteDomain<C> discreteDomain) {
            return this.f57165b;
        }

        @Override // com.google.common.collect.Cut
        boolean k(C c10) {
            return Range.h(this.f57165b, c10) < 0;
        }

        @Override // com.google.common.collect.Cut
        @CheckForNull
        C l(DiscreteDomain<C> discreteDomain) {
            return (C) discreteDomain.g(this.f57165b);
        }

        @Override // com.google.common.collect.Cut
        BoundType m() {
            return BoundType.OPEN;
        }

        @Override // com.google.common.collect.Cut
        BoundType n() {
            return BoundType.CLOSED;
        }

        @Override // com.google.common.collect.Cut
        Cut<C> o(BoundType boundType, DiscreteDomain<C> discreteDomain) {
            int i10 = a.f57168a[boundType.ordinal()];
            if (i10 == 1) {
                Comparable comparableG = discreteDomain.g(this.f57165b);
                return comparableG == null ? Cut.c() : Cut.d(comparableG);
            }
            if (i10 == 2) {
                return this;
            }
            throw new AssertionError();
        }

        @Override // com.google.common.collect.Cut
        Cut<C> p(BoundType boundType, DiscreteDomain<C> discreteDomain) {
            int i10 = a.f57168a[boundType.ordinal()];
            if (i10 == 1) {
                return this;
            }
            if (i10 != 2) {
                throw new AssertionError();
            }
            Comparable comparableG = discreteDomain.g(this.f57165b);
            return comparableG == null ? Cut.a() : Cut.d(comparableG);
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f57165b);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 2);
            sb2.append("/");
            sb2.append(strValueOf);
            sb2.append("\\");
            return sb2.toString();
        }
    }

    public static final class BelowAll extends Cut<Comparable<?>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final BelowAll f57167c = new BelowAll();
        private static final long serialVersionUID = 0;

        private BelowAll() {
            super("");
        }

        private Object r() {
            return f57167c;
        }

        @Override // com.google.common.collect.Cut
        Cut<Comparable<?>> e(DiscreteDomain<Comparable<?>> discreteDomain) {
            try {
                return Cut.d(discreteDomain.f());
            } catch (NoSuchElementException unused) {
                return this;
            }
        }

        @Override // com.google.common.collect.Cut, java.lang.Comparable
        /* JADX INFO: renamed from: f */
        public int compareTo(Cut<Comparable<?>> cut) {
            return cut == this ? 0 : -1;
        }

        @Override // com.google.common.collect.Cut
        void g(StringBuilder sb2) {
            sb2.append("(-∞");
        }

        @Override // com.google.common.collect.Cut
        void h(StringBuilder sb2) {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.Cut
        public int hashCode() {
            return System.identityHashCode(this);
        }

        @Override // com.google.common.collect.Cut
        Comparable<?> i() {
            throw new IllegalStateException("range unbounded on this side");
        }

        @Override // com.google.common.collect.Cut
        Comparable<?> j(DiscreteDomain<Comparable<?>> discreteDomain) {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.Cut
        boolean k(Comparable<?> comparable) {
            return true;
        }

        @Override // com.google.common.collect.Cut
        Comparable<?> l(DiscreteDomain<Comparable<?>> discreteDomain) {
            return discreteDomain.f();
        }

        @Override // com.google.common.collect.Cut
        BoundType m() {
            throw new IllegalStateException();
        }

        @Override // com.google.common.collect.Cut
        BoundType n() {
            throw new AssertionError("this statement should be unreachable");
        }

        @Override // com.google.common.collect.Cut
        Cut<Comparable<?>> o(BoundType boundType, DiscreteDomain<Comparable<?>> discreteDomain) {
            throw new IllegalStateException();
        }

        @Override // com.google.common.collect.Cut
        Cut<Comparable<?>> p(BoundType boundType, DiscreteDomain<Comparable<?>> discreteDomain) {
            throw new AssertionError("this statement should be unreachable");
        }

        public String toString() {
            return "-∞";
        }
    }

    public static final class BelowValue<C extends Comparable> extends Cut<C> {
        private static final long serialVersionUID = 0;

        BelowValue(C c10) {
            super((Comparable) com.google.common.base.w.E(c10));
        }

        @Override // com.google.common.collect.Cut, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return super.compareTo((Cut) obj);
        }

        @Override // com.google.common.collect.Cut
        void g(StringBuilder sb2) {
            sb2.append('[');
            sb2.append(this.f57165b);
        }

        @Override // com.google.common.collect.Cut
        void h(StringBuilder sb2) {
            sb2.append(this.f57165b);
            sb2.append(')');
        }

        @Override // com.google.common.collect.Cut
        public int hashCode() {
            return this.f57165b.hashCode();
        }

        @Override // com.google.common.collect.Cut
        @CheckForNull
        C j(DiscreteDomain<C> discreteDomain) {
            return (C) discreteDomain.i(this.f57165b);
        }

        @Override // com.google.common.collect.Cut
        boolean k(C c10) {
            return Range.h(this.f57165b, c10) <= 0;
        }

        @Override // com.google.common.collect.Cut
        C l(DiscreteDomain<C> discreteDomain) {
            return this.f57165b;
        }

        @Override // com.google.common.collect.Cut
        BoundType m() {
            return BoundType.CLOSED;
        }

        @Override // com.google.common.collect.Cut
        BoundType n() {
            return BoundType.OPEN;
        }

        @Override // com.google.common.collect.Cut
        Cut<C> o(BoundType boundType, DiscreteDomain<C> discreteDomain) {
            int i10 = a.f57168a[boundType.ordinal()];
            if (i10 == 1) {
                return this;
            }
            if (i10 != 2) {
                throw new AssertionError();
            }
            Comparable comparableI = discreteDomain.i(this.f57165b);
            return comparableI == null ? Cut.c() : new AboveValue(comparableI);
        }

        @Override // com.google.common.collect.Cut
        Cut<C> p(BoundType boundType, DiscreteDomain<C> discreteDomain) {
            int i10 = a.f57168a[boundType.ordinal()];
            if (i10 == 1) {
                Comparable comparableI = discreteDomain.i(this.f57165b);
                return comparableI == null ? Cut.a() : new AboveValue(comparableI);
            }
            if (i10 == 2) {
                return this;
            }
            throw new AssertionError();
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f57165b);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 2);
            sb2.append("\\");
            sb2.append(strValueOf);
            sb2.append("/");
            return sb2.toString();
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f57168a;

        static {
            int[] iArr = new int[BoundType.values().length];
            f57168a = iArr;
            try {
                iArr[BoundType.CLOSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57168a[BoundType.OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    Cut(C c10) {
        this.f57165b = c10;
    }

    static <C extends Comparable> Cut<C> a() {
        return AboveAll.f57166c;
    }

    static <C extends Comparable> Cut<C> b(C c10) {
        return new AboveValue(c10);
    }

    static <C extends Comparable> Cut<C> c() {
        return BelowAll.f57167c;
    }

    static <C extends Comparable> Cut<C> d(C c10) {
        return new BelowValue(c10);
    }

    Cut<C> e(DiscreteDomain<C> discreteDomain) {
        return this;
    }

    public boolean equals(@CheckForNull Object obj) {
        if (!(obj instanceof Cut)) {
            return false;
        }
        try {
            return compareTo((Cut) obj) == 0;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: f */
    public int compareTo(Cut<C> cut) {
        if (cut == c()) {
            return 1;
        }
        if (cut == a()) {
            return -1;
        }
        int iH = Range.h(this.f57165b, cut.f57165b);
        return iH != 0 ? iH : Booleans.d(this instanceof AboveValue, cut instanceof AboveValue);
    }

    abstract void g(StringBuilder sb2);

    abstract void h(StringBuilder sb2);

    public abstract int hashCode();

    C i() {
        return this.f57165b;
    }

    @CheckForNull
    abstract C j(DiscreteDomain<C> discreteDomain);

    abstract boolean k(C c10);

    @CheckForNull
    abstract C l(DiscreteDomain<C> discreteDomain);

    abstract BoundType m();

    abstract BoundType n();

    abstract Cut<C> o(BoundType boundType, DiscreteDomain<C> discreteDomain);

    abstract Cut<C> p(BoundType boundType, DiscreteDomain<C> discreteDomain);
}
