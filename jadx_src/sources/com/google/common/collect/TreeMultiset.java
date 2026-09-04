package com.google.common.collect;

import com.google.common.primitives.Ints;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b(emulated = true)
@u
public final class TreeMultiset<E> extends h<E> implements Serializable {

    @o9.c
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient f<e<E>> f57982f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final transient GeneralRange<E> f57983g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final transient e<E> f57984h;

    public enum Aggregate {
        SIZE { // from class: com.google.common.collect.TreeMultiset.Aggregate.1
            @Override // com.google.common.collect.TreeMultiset.Aggregate
            int nodeAggregate(e<?> eVar) {
                return ((e) eVar).f57995b;
            }

            @Override // com.google.common.collect.TreeMultiset.Aggregate
            long treeAggregate(@CheckForNull e<?> eVar) {
                if (eVar == null) {
                    return 0L;
                }
                return ((e) eVar).f57997d;
            }
        },
        DISTINCT { // from class: com.google.common.collect.TreeMultiset.Aggregate.2
            @Override // com.google.common.collect.TreeMultiset.Aggregate
            int nodeAggregate(e<?> eVar) {
                return 1;
            }

            @Override // com.google.common.collect.TreeMultiset.Aggregate
            long treeAggregate(@CheckForNull e<?> eVar) {
                if (eVar == null) {
                    return 0L;
                }
                return ((e) eVar).f57996c;
            }
        };

        /* synthetic */ Aggregate(a aVar) {
            this();
        }

        abstract int nodeAggregate(e<?> eVar);

        abstract long treeAggregate(@CheckForNull e<?> eVar);
    }

    public class a extends Multisets.f<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f57985b;

        a(e eVar) {
            this.f57985b = eVar;
        }

        @Override // com.google.common.collect.s1.a
        @x1
        public E a() {
            return (E) this.f57985b.x();
        }

        @Override // com.google.common.collect.s1.a
        public int getCount() {
            int iW = this.f57985b.w();
            return iW == 0 ? TreeMultiset.this.E1(a()) : iW;
        }
    }

    public class b implements Iterator<s1.a<E>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @CheckForNull
        e<E> f57987b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @CheckForNull
        s1.a<E> f57988c;

        b() {
            this.f57987b = TreeMultiset.this.F();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public s1.a<E> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            TreeMultiset treeMultiset = TreeMultiset.this;
            e<E> eVar = this.f57987b;
            Objects.requireNonNull(eVar);
            s1.a<E> aVarL = treeMultiset.L(eVar);
            this.f57988c = aVarL;
            if (this.f57987b.L() == TreeMultiset.this.f57984h) {
                this.f57987b = null;
            } else {
                this.f57987b = this.f57987b.L();
            }
            return aVarL;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f57987b == null) {
                return false;
            }
            if (!TreeMultiset.this.f57983g.p(this.f57987b.x())) {
                return true;
            }
            this.f57987b = null;
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            com.google.common.base.w.h0(this.f57988c != null, "no calls to next() since the last call to remove()");
            TreeMultiset.this.I0(this.f57988c.a(), 0);
            this.f57988c = null;
        }
    }

    public class c implements Iterator<s1.a<E>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @CheckForNull
        e<E> f57990b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @CheckForNull
        s1.a<E> f57991c = null;

        c() {
            this.f57990b = TreeMultiset.this.G();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public s1.a<E> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Objects.requireNonNull(this.f57990b);
            s1.a<E> aVarL = TreeMultiset.this.L(this.f57990b);
            this.f57991c = aVarL;
            if (this.f57990b.z() == TreeMultiset.this.f57984h) {
                this.f57990b = null;
            } else {
                this.f57990b = this.f57990b.z();
            }
            return aVarL;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f57990b == null) {
                return false;
            }
            if (!TreeMultiset.this.f57983g.q(this.f57990b.x())) {
                return true;
            }
            this.f57990b = null;
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            com.google.common.base.w.h0(this.f57991c != null, "no calls to next() since the last call to remove()");
            TreeMultiset.this.I0(this.f57991c.a(), 0);
            this.f57991c = null;
        }
    }

    public static /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f57993a;

        static {
            int[] iArr = new int[BoundType.values().length];
            f57993a = iArr;
            try {
                iArr[BoundType.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57993a[BoundType.CLOSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static final class e<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @CheckForNull
        private final E f57994a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f57995b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f57996c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f57997d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f57998e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @CheckForNull
        private e<E> f57999f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @CheckForNull
        private e<E> f58000g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @CheckForNull
        private e<E> f58001h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @CheckForNull
        private e<E> f58002i;

        e() {
            this.f57994a = null;
            this.f57995b = 1;
        }

        e(@x1 E e10, int i10) {
            com.google.common.base.w.d(i10 > 0);
            this.f57994a = e10;
            this.f57995b = i10;
            this.f57997d = i10;
            this.f57996c = 1;
            this.f57998e = 1;
            this.f57999f = null;
            this.f58000g = null;
        }

        private e<E> A() {
            int iR = r();
            if (iR == -2) {
                Objects.requireNonNull(this.f58000g);
                if (this.f58000g.r() > 0) {
                    this.f58000g = this.f58000g.I();
                }
                return H();
            }
            if (iR != 2) {
                C();
                return this;
            }
            Objects.requireNonNull(this.f57999f);
            if (this.f57999f.r() < 0) {
                this.f57999f = this.f57999f.H();
            }
            return I();
        }

        private void B() {
            D();
            C();
        }

        private void C() {
            this.f57998e = Math.max(y(this.f57999f), y(this.f58000g)) + 1;
        }

        private void D() {
            this.f57996c = TreeMultiset.E(this.f57999f) + 1 + TreeMultiset.E(this.f58000g);
            this.f57997d = ((long) this.f57995b) + M(this.f57999f) + M(this.f58000g);
        }

        @CheckForNull
        private e<E> F(e<E> eVar) {
            e<E> eVar2 = this.f58000g;
            if (eVar2 == null) {
                return this.f57999f;
            }
            this.f58000g = eVar2.F(eVar);
            this.f57996c--;
            this.f57997d -= (long) eVar.f57995b;
            return A();
        }

        @CheckForNull
        private e<E> G(e<E> eVar) {
            e<E> eVar2 = this.f57999f;
            if (eVar2 == null) {
                return this.f58000g;
            }
            this.f57999f = eVar2.G(eVar);
            this.f57996c--;
            this.f57997d -= (long) eVar.f57995b;
            return A();
        }

        private e<E> H() {
            com.google.common.base.w.g0(this.f58000g != null);
            e<E> eVar = this.f58000g;
            this.f58000g = eVar.f57999f;
            eVar.f57999f = this;
            eVar.f57997d = this.f57997d;
            eVar.f57996c = this.f57996c;
            B();
            eVar.C();
            return eVar;
        }

        private e<E> I() {
            com.google.common.base.w.g0(this.f57999f != null);
            e<E> eVar = this.f57999f;
            this.f57999f = eVar.f58000g;
            eVar.f58000g = this;
            eVar.f57997d = this.f57997d;
            eVar.f57996c = this.f57996c;
            B();
            eVar.C();
            return eVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public e<E> L() {
            e<E> eVar = this.f58002i;
            Objects.requireNonNull(eVar);
            return eVar;
        }

        private static long M(@CheckForNull e<?> eVar) {
            if (eVar == null) {
                return 0L;
            }
            return ((e) eVar).f57997d;
        }

        private e<E> p(@x1 E e10, int i10) {
            this.f57999f = new e<>(e10, i10);
            TreeMultiset.J(z(), this.f57999f, this);
            this.f57998e = Math.max(2, this.f57998e);
            this.f57996c++;
            this.f57997d += (long) i10;
            return this;
        }

        private e<E> q(@x1 E e10, int i10) {
            e<E> eVar = new e<>(e10, i10);
            this.f58000g = eVar;
            TreeMultiset.J(this, eVar, L());
            this.f57998e = Math.max(2, this.f57998e);
            this.f57996c++;
            this.f57997d += (long) i10;
            return this;
        }

        private int r() {
            return y(this.f57999f) - y(this.f58000g);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        @CheckForNull
        public e<E> s(Comparator<? super E> comparator, @x1 E e10) {
            int iCompare = comparator.compare(e10, x());
            if (iCompare < 0) {
                e<E> eVar = this.f57999f;
                return eVar == null ? this : (e) com.google.common.base.q.a(eVar.s(comparator, e10), this);
            }
            if (iCompare == 0) {
                return this;
            }
            e<E> eVar2 = this.f58000g;
            if (eVar2 == null) {
                return null;
            }
            return eVar2.s(comparator, e10);
        }

        @CheckForNull
        private e<E> u() {
            int i10 = this.f57995b;
            this.f57995b = 0;
            TreeMultiset.I(z(), L());
            e<E> eVar = this.f57999f;
            if (eVar == null) {
                return this.f58000g;
            }
            e<E> eVar2 = this.f58000g;
            if (eVar2 == null) {
                return eVar;
            }
            if (eVar.f57998e >= eVar2.f57998e) {
                e<E> eVarZ = z();
                eVarZ.f57999f = this.f57999f.F(eVarZ);
                eVarZ.f58000g = this.f58000g;
                eVarZ.f57996c = this.f57996c - 1;
                eVarZ.f57997d = this.f57997d - ((long) i10);
                return eVarZ.A();
            }
            e<E> eVarL = L();
            eVarL.f58000g = this.f58000g.G(eVarL);
            eVarL.f57999f = this.f57999f;
            eVarL.f57996c = this.f57996c - 1;
            eVarL.f57997d = this.f57997d - ((long) i10);
            return eVarL.A();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        @CheckForNull
        public e<E> v(Comparator<? super E> comparator, @x1 E e10) {
            int iCompare = comparator.compare(e10, x());
            if (iCompare > 0) {
                e<E> eVar = this.f58000g;
                return eVar == null ? this : (e) com.google.common.base.q.a(eVar.v(comparator, e10), this);
            }
            if (iCompare == 0) {
                return this;
            }
            e<E> eVar2 = this.f57999f;
            if (eVar2 == null) {
                return null;
            }
            return eVar2.v(comparator, e10);
        }

        private static int y(@CheckForNull e<?> eVar) {
            if (eVar == null) {
                return 0;
            }
            return ((e) eVar).f57998e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public e<E> z() {
            e<E> eVar = this.f58001h;
            Objects.requireNonNull(eVar);
            return eVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @CheckForNull
        e<E> E(Comparator<? super E> comparator, @x1 E e10, int i10, int[] iArr) {
            int iCompare = comparator.compare(e10, x());
            if (iCompare < 0) {
                e<E> eVar = this.f57999f;
                if (eVar == null) {
                    iArr[0] = 0;
                    return this;
                }
                this.f57999f = eVar.E(comparator, e10, i10, iArr);
                int i11 = iArr[0];
                if (i11 > 0) {
                    if (i10 >= i11) {
                        this.f57996c--;
                        this.f57997d -= (long) i11;
                    } else {
                        this.f57997d -= (long) i10;
                    }
                }
                return i11 == 0 ? this : A();
            }
            if (iCompare <= 0) {
                int i12 = this.f57995b;
                iArr[0] = i12;
                if (i10 >= i12) {
                    return u();
                }
                this.f57995b = i12 - i10;
                this.f57997d -= (long) i10;
                return this;
            }
            e<E> eVar2 = this.f58000g;
            if (eVar2 == null) {
                iArr[0] = 0;
                return this;
            }
            this.f58000g = eVar2.E(comparator, e10, i10, iArr);
            int i13 = iArr[0];
            if (i13 > 0) {
                if (i10 >= i13) {
                    this.f57996c--;
                    this.f57997d -= (long) i13;
                } else {
                    this.f57997d -= (long) i10;
                }
            }
            return A();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @CheckForNull
        e<E> J(Comparator<? super E> comparator, @x1 E e10, int i10, int i11, int[] iArr) {
            int iCompare = comparator.compare(e10, x());
            if (iCompare < 0) {
                e<E> eVar = this.f57999f;
                if (eVar == null) {
                    iArr[0] = 0;
                    return (i10 != 0 || i11 <= 0) ? this : p(e10, i11);
                }
                this.f57999f = eVar.J(comparator, e10, i10, i11, iArr);
                int i12 = iArr[0];
                if (i12 == i10) {
                    if (i11 == 0 && i12 != 0) {
                        this.f57996c--;
                    } else if (i11 > 0 && i12 == 0) {
                        this.f57996c++;
                    }
                    this.f57997d += (long) (i11 - i12);
                }
                return A();
            }
            if (iCompare <= 0) {
                int i13 = this.f57995b;
                iArr[0] = i13;
                if (i10 == i13) {
                    if (i11 == 0) {
                        return u();
                    }
                    this.f57997d += (long) (i11 - i13);
                    this.f57995b = i11;
                }
                return this;
            }
            e<E> eVar2 = this.f58000g;
            if (eVar2 == null) {
                iArr[0] = 0;
                return (i10 != 0 || i11 <= 0) ? this : q(e10, i11);
            }
            this.f58000g = eVar2.J(comparator, e10, i10, i11, iArr);
            int i14 = iArr[0];
            if (i14 == i10) {
                if (i11 == 0 && i14 != 0) {
                    this.f57996c--;
                } else if (i11 > 0 && i14 == 0) {
                    this.f57996c++;
                }
                this.f57997d += (long) (i11 - i14);
            }
            return A();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @CheckForNull
        e<E> K(Comparator<? super E> comparator, @x1 E e10, int i10, int[] iArr) {
            int iCompare = comparator.compare(e10, x());
            if (iCompare < 0) {
                e<E> eVar = this.f57999f;
                if (eVar == null) {
                    iArr[0] = 0;
                    return i10 > 0 ? p(e10, i10) : this;
                }
                this.f57999f = eVar.K(comparator, e10, i10, iArr);
                if (i10 == 0 && iArr[0] != 0) {
                    this.f57996c--;
                } else if (i10 > 0 && iArr[0] == 0) {
                    this.f57996c++;
                }
                this.f57997d += (long) (i10 - iArr[0]);
                return A();
            }
            if (iCompare <= 0) {
                int i11 = this.f57995b;
                iArr[0] = i11;
                if (i10 == 0) {
                    return u();
                }
                this.f57997d += (long) (i10 - i11);
                this.f57995b = i10;
                return this;
            }
            e<E> eVar2 = this.f58000g;
            if (eVar2 == null) {
                iArr[0] = 0;
                return i10 > 0 ? q(e10, i10) : this;
            }
            this.f58000g = eVar2.K(comparator, e10, i10, iArr);
            if (i10 == 0 && iArr[0] != 0) {
                this.f57996c--;
            } else if (i10 > 0 && iArr[0] == 0) {
                this.f57996c++;
            }
            this.f57997d += (long) (i10 - iArr[0]);
            return A();
        }

        /* JADX WARN: Multi-variable type inference failed */
        e<E> o(Comparator<? super E> comparator, @x1 E e10, int i10, int[] iArr) {
            int iCompare = comparator.compare(e10, x());
            if (iCompare < 0) {
                e<E> eVar = this.f57999f;
                if (eVar == null) {
                    iArr[0] = 0;
                    return p(e10, i10);
                }
                int i11 = eVar.f57998e;
                e<E> eVarO = eVar.o(comparator, e10, i10, iArr);
                this.f57999f = eVarO;
                if (iArr[0] == 0) {
                    this.f57996c++;
                }
                this.f57997d += (long) i10;
                return eVarO.f57998e == i11 ? this : A();
            }
            if (iCompare <= 0) {
                int i12 = this.f57995b;
                iArr[0] = i12;
                long j10 = i10;
                com.google.common.base.w.d(((long) i12) + j10 <= 2147483647L);
                this.f57995b += i10;
                this.f57997d += j10;
                return this;
            }
            e<E> eVar2 = this.f58000g;
            if (eVar2 == null) {
                iArr[0] = 0;
                return q(e10, i10);
            }
            int i13 = eVar2.f57998e;
            e<E> eVarO2 = eVar2.o(comparator, e10, i10, iArr);
            this.f58000g = eVarO2;
            if (iArr[0] == 0) {
                this.f57996c++;
            }
            this.f57997d += (long) i10;
            return eVarO2.f57998e == i13 ? this : A();
        }

        /* JADX WARN: Multi-variable type inference failed */
        int t(Comparator<? super E> comparator, @x1 E e10) {
            int iCompare = comparator.compare(e10, x());
            if (iCompare < 0) {
                e<E> eVar = this.f57999f;
                if (eVar == null) {
                    return 0;
                }
                return eVar.t(comparator, e10);
            }
            if (iCompare <= 0) {
                return this.f57995b;
            }
            e<E> eVar2 = this.f58000g;
            if (eVar2 == null) {
                return 0;
            }
            return eVar2.t(comparator, e10);
        }

        public String toString() {
            return Multisets.k(x(), w()).toString();
        }

        int w() {
            return this.f57995b;
        }

        @x1
        E x() {
            return (E) t1.a(this.f57994a);
        }
    }

    public static final class f<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @CheckForNull
        private T f58003a;

        private f() {
        }

        /* synthetic */ f(a aVar) {
            this();
        }

        public void a(@CheckForNull T t10, @CheckForNull T t11) {
            if (this.f58003a != t10) {
                throw new ConcurrentModificationException();
            }
            this.f58003a = t11;
        }

        void b() {
            this.f58003a = null;
        }

        @CheckForNull
        public T c() {
            return this.f58003a;
        }
    }

    TreeMultiset(f<e<E>> fVar, GeneralRange<E> generalRange, e<E> eVar) {
        super(generalRange.b());
        this.f57982f = fVar;
        this.f57983g = generalRange;
        this.f57984h = eVar;
    }

    TreeMultiset(Comparator<? super E> comparator) {
        super(comparator);
        this.f57983g = GeneralRange.a(comparator);
        e<E> eVar = new e<>();
        this.f57984h = eVar;
        I(eVar, eVar);
        this.f57982f = new f<>(null);
    }

    public static <E extends Comparable> TreeMultiset<E> A() {
        return new TreeMultiset<>(Ordering.z());
    }

    public static <E extends Comparable> TreeMultiset<E> B(Iterable<? extends E> iterable) {
        TreeMultiset<E> treeMultisetA = A();
        l1.a(treeMultisetA, iterable);
        return treeMultisetA;
    }

    public static <E> TreeMultiset<E> D(@CheckForNull Comparator<? super E> comparator) {
        return comparator == null ? new TreeMultiset<>(Ordering.z()) : new TreeMultiset<>(comparator);
    }

    static int E(@CheckForNull e<?> eVar) {
        if (eVar == null) {
            return 0;
        }
        return ((e) eVar).f57996c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @CheckForNull
    public e<E> F() {
        e<E> eVarL;
        e<E> eVarC = this.f57982f.c();
        if (eVarC == null) {
            return null;
        }
        if (this.f57983g.j()) {
            Object objA = t1.a(this.f57983g.g());
            eVarL = eVarC.s(comparator(), objA);
            if (eVarL == null) {
                return null;
            }
            if (this.f57983g.f() == BoundType.OPEN && comparator().compare(objA, eVarL.x()) == 0) {
                eVarL = eVarL.L();
            }
        } else {
            eVarL = this.f57984h.L();
        }
        if (eVarL == this.f57984h || !this.f57983g.c(eVarL.x())) {
            return null;
        }
        return eVarL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @CheckForNull
    public e<E> G() {
        e<E> eVarZ;
        e<E> eVarC = this.f57982f.c();
        if (eVarC == null) {
            return null;
        }
        if (this.f57983g.k()) {
            Object objA = t1.a(this.f57983g.i());
            eVarZ = eVarC.v(comparator(), objA);
            if (eVarZ == null) {
                return null;
            }
            if (this.f57983g.h() == BoundType.OPEN && comparator().compare(objA, eVarZ.x()) == 0) {
                eVarZ = eVarZ.z();
            }
        } else {
            eVarZ = this.f57984h.z();
        }
        if (eVarZ == this.f57984h || !this.f57983g.c(eVarZ.x())) {
            return null;
        }
        return eVarZ;
    }

    @o9.c
    private void H(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        g2.a(h.class, "comparator").b(this, comparator);
        g2.a(TreeMultiset.class, com.google.android.exoplayer2.source.rtsp.k0.f48802q).b(this, GeneralRange.a(comparator));
        g2.a(TreeMultiset.class, "rootReference").b(this, new f(null));
        e eVar = new e();
        g2.a(TreeMultiset.class, "header").b(this, eVar);
        I(eVar, eVar);
        g2.f(this, objectInputStream);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> void I(e<T> eVar, e<T> eVar2) {
        ((e) eVar).f58002i = eVar2;
        ((e) eVar2).f58001h = eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> void J(e<T> eVar, e<T> eVar2, e<T> eVar3) {
        I(eVar, eVar2);
        I(eVar2, eVar3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public s1.a<E> L(e<E> eVar) {
        return new a(eVar);
    }

    @o9.c
    private void N(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(c().comparator());
        g2.k(this, objectOutputStream);
    }

    private long w(Aggregate aggregate, @CheckForNull e<E> eVar) {
        long jTreeAggregate;
        long jW;
        if (eVar == null) {
            return 0L;
        }
        int iCompare = comparator().compare(t1.a(this.f57983g.i()), eVar.x());
        if (iCompare > 0) {
            return w(aggregate, ((e) eVar).f58000g);
        }
        if (iCompare == 0) {
            int i10 = d.f57993a[this.f57983g.h().ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    return aggregate.treeAggregate(((e) eVar).f58000g);
                }
                throw new AssertionError();
            }
            jTreeAggregate = aggregate.nodeAggregate(eVar);
            jW = aggregate.treeAggregate(((e) eVar).f58000g);
        } else {
            jTreeAggregate = aggregate.treeAggregate(((e) eVar).f58000g) + ((long) aggregate.nodeAggregate(eVar));
            jW = w(aggregate, ((e) eVar).f57999f);
        }
        return jTreeAggregate + jW;
    }

    private long x(Aggregate aggregate, @CheckForNull e<E> eVar) {
        long jTreeAggregate;
        long jX;
        if (eVar == null) {
            return 0L;
        }
        int iCompare = comparator().compare(t1.a(this.f57983g.g()), eVar.x());
        if (iCompare < 0) {
            return x(aggregate, ((e) eVar).f57999f);
        }
        if (iCompare == 0) {
            int i10 = d.f57993a[this.f57983g.f().ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    return aggregate.treeAggregate(((e) eVar).f57999f);
                }
                throw new AssertionError();
            }
            jTreeAggregate = aggregate.nodeAggregate(eVar);
            jX = aggregate.treeAggregate(((e) eVar).f57999f);
        } else {
            jTreeAggregate = aggregate.treeAggregate(((e) eVar).f57999f) + ((long) aggregate.nodeAggregate(eVar));
            jX = x(aggregate, ((e) eVar).f58000g);
        }
        return jTreeAggregate + jX;
    }

    private long y(Aggregate aggregate) {
        e<E> eVarC = this.f57982f.c();
        long jTreeAggregate = aggregate.treeAggregate(eVarC);
        if (this.f57983g.j()) {
            jTreeAggregate -= x(aggregate, eVarC);
        }
        return this.f57983g.k() ? jTreeAggregate - w(aggregate, eVarC) : jTreeAggregate;
    }

    @Override // com.google.common.collect.s1
    public int E1(@CheckForNull Object obj) {
        try {
            e<E> eVarC = this.f57982f.c();
            if (this.f57983g.c(obj) && eVarC != null) {
                return eVarC.t(comparator(), obj);
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    @Override // com.google.common.collect.o2
    public o2<E> F1(@x1 E e10, BoundType boundType) {
        return new TreeMultiset(this.f57982f, this.f57983g.l(GeneralRange.d(comparator(), e10, boundType)), this.f57984h);
    }

    @Override // com.google.common.collect.d, com.google.common.collect.s1
    @s9.a
    public int I0(@x1 E e10, int i10) {
        n.b(i10, "count");
        if (!this.f57983g.c(e10)) {
            com.google.common.base.w.d(i10 == 0);
            return 0;
        }
        e<E> eVarC = this.f57982f.c();
        if (eVarC == null) {
            if (i10 > 0) {
                c0(e10, i10);
            }
            return 0;
        }
        int[] iArr = new int[1];
        this.f57982f.a(eVarC, eVarC.K(comparator(), e10, i10, iArr));
        return iArr[0];
    }

    @Override // com.google.common.collect.h, com.google.common.collect.d, com.google.common.collect.s1
    public /* bridge */ /* synthetic */ NavigableSet c() {
        return super.c();
    }

    @Override // com.google.common.collect.d, com.google.common.collect.s1
    @s9.a
    public int c0(@x1 E e10, int i10) {
        n.b(i10, "occurrences");
        if (i10 == 0) {
            return E1(e10);
        }
        com.google.common.base.w.d(this.f57983g.c(e10));
        e<E> eVarC = this.f57982f.c();
        if (eVarC != null) {
            int[] iArr = new int[1];
            this.f57982f.a(eVarC, eVarC.o(comparator(), e10, i10, iArr));
            return iArr[0];
        }
        comparator().compare(e10, e10);
        e<E> eVar = new e<>(e10, i10);
        e<E> eVar2 = this.f57984h;
        J(eVar2, eVar, eVar2);
        this.f57982f.a(eVarC, eVar);
        return 0;
    }

    @Override // com.google.common.collect.d, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        if (this.f57983g.j() || this.f57983g.k()) {
            Iterators.h(h());
            return;
        }
        e<E> eVarL = this.f57984h.L();
        while (true) {
            e<E> eVar = this.f57984h;
            if (eVarL == eVar) {
                I(eVar, eVar);
                this.f57982f.b();
                return;
            }
            e<E> eVarL2 = eVarL.L();
            ((e) eVarL).f57995b = 0;
            ((e) eVarL).f57999f = null;
            ((e) eVarL).f58000g = null;
            ((e) eVarL).f58001h = null;
            ((e) eVarL).f58002i = null;
            eVarL = eVarL2;
        }
    }

    @Override // com.google.common.collect.h, com.google.common.collect.o2, com.google.common.collect.j2
    public /* bridge */ /* synthetic */ Comparator comparator() {
        return super.comparator();
    }

    @Override // com.google.common.collect.d, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.s1
    public /* bridge */ /* synthetic */ boolean contains(@CheckForNull Object obj) {
        return super.contains(obj);
    }

    @Override // com.google.common.collect.d
    int e() {
        return Ints.x(y(Aggregate.DISTINCT));
    }

    @Override // com.google.common.collect.h, com.google.common.collect.o2
    public /* bridge */ /* synthetic */ o2 e0() {
        return super.e0();
    }

    @Override // com.google.common.collect.d, com.google.common.collect.s1
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.o2
    @CheckForNull
    public /* bridge */ /* synthetic */ s1.a firstEntry() {
        return super.firstEntry();
    }

    @Override // com.google.common.collect.d
    Iterator<E> g() {
        return Multisets.h(h());
    }

    @Override // com.google.common.collect.d, com.google.common.collect.s1
    @s9.a
    public boolean g0(@x1 E e10, int i10, int i11) {
        n.b(i11, "newCount");
        n.b(i10, "oldCount");
        com.google.common.base.w.d(this.f57983g.c(e10));
        e<E> eVarC = this.f57982f.c();
        if (eVarC != null) {
            int[] iArr = new int[1];
            this.f57982f.a(eVarC, eVarC.J(comparator(), e10, i10, i11, iArr));
            return iArr[0] == i10;
        }
        if (i10 != 0) {
            return false;
        }
        if (i11 > 0) {
            c0(e10, i11);
        }
        return true;
    }

    @Override // com.google.common.collect.d
    Iterator<s1.a<E>> h() {
        return new b();
    }

    @Override // com.google.common.collect.d, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.s1
    public Iterator<E> iterator() {
        return Multisets.n(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.h, com.google.common.collect.o2
    public /* bridge */ /* synthetic */ o2 j1(@x1 Object obj, BoundType boundType, @x1 Object obj2, BoundType boundType2) {
        return super.j1(obj, boundType, obj2, boundType2);
    }

    @Override // com.google.common.collect.h
    Iterator<s1.a<E>> l() {
        return new c();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.o2
    @CheckForNull
    public /* bridge */ /* synthetic */ s1.a lastEntry() {
        return super.lastEntry();
    }

    @Override // com.google.common.collect.o2
    public o2<E> m0(@x1 E e10, BoundType boundType) {
        return new TreeMultiset(this.f57982f, this.f57983g.l(GeneralRange.r(comparator(), e10, boundType)), this.f57984h);
    }

    @Override // com.google.common.collect.d, com.google.common.collect.s1
    @s9.a
    public int n1(@CheckForNull Object obj, int i10) {
        n.b(i10, "occurrences");
        if (i10 == 0) {
            return E1(obj);
        }
        e<E> eVarC = this.f57982f.c();
        int[] iArr = new int[1];
        try {
            if (this.f57983g.c(obj) && eVarC != null) {
                this.f57982f.a(eVarC, eVarC.E(comparator(), obj, i10, iArr));
                return iArr[0];
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    @Override // com.google.common.collect.h, com.google.common.collect.o2
    @CheckForNull
    public /* bridge */ /* synthetic */ s1.a pollFirstEntry() {
        return super.pollFirstEntry();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.o2
    @CheckForNull
    public /* bridge */ /* synthetic */ s1.a pollLastEntry() {
        return super.pollLastEntry();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.s1
    public int size() {
        return Ints.x(y(Aggregate.SIZE));
    }
}
