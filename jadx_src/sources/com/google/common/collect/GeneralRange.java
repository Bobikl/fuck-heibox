package com.google.common.collect;

import java.io.Serializable;
import java.util.Comparator;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b(serializable = true)
@u
public final class GeneralRange<T> implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Comparator<? super T> f57217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f57218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @CheckForNull
    private final T f57219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final BoundType f57220e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f57221f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @CheckForNull
    private final T f57222g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final BoundType f57223h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @CheckForNull
    private transient GeneralRange<T> f57224i;

    private GeneralRange(Comparator<? super T> comparator, boolean z10, @CheckForNull T t10, BoundType boundType, boolean z11, @CheckForNull T t11, BoundType boundType2) {
        this.f57217b = (Comparator) com.google.common.base.w.E(comparator);
        this.f57218c = z10;
        this.f57221f = z11;
        this.f57219d = t10;
        this.f57220e = (BoundType) com.google.common.base.w.E(boundType);
        this.f57222g = t11;
        this.f57223h = (BoundType) com.google.common.base.w.E(boundType2);
        if (z10) {
            comparator.compare((Object) t1.a(t10), (Object) t1.a(t10));
        }
        if (z11) {
            comparator.compare((Object) t1.a(t11), (Object) t1.a(t11));
        }
        if (z10 && z11) {
            int iCompare = comparator.compare((Object) t1.a(t10), (Object) t1.a(t11));
            boolean z12 = true;
            com.google.common.base.w.y(iCompare <= 0, "lowerEndpoint (%s) > upperEndpoint (%s)", t10, t11);
            if (iCompare == 0) {
                BoundType boundType3 = BoundType.OPEN;
                if (boundType == boundType3 && boundType2 == boundType3) {
                    z12 = false;
                }
                com.google.common.base.w.d(z12);
            }
        }
    }

    static <T> GeneralRange<T> a(Comparator<? super T> comparator) {
        BoundType boundType = BoundType.OPEN;
        return new GeneralRange<>(comparator, false, null, boundType, false, null, boundType);
    }

    static <T> GeneralRange<T> d(Comparator<? super T> comparator, @x1 T t10, BoundType boundType) {
        return new GeneralRange<>(comparator, true, t10, boundType, false, null, BoundType.OPEN);
    }

    static <T extends Comparable> GeneralRange<T> e(Range<T> range) {
        return new GeneralRange<>(Ordering.z(), range.q(), range.q() ? range.y() : null, range.q() ? range.x() : BoundType.OPEN, range.r(), range.r() ? range.K() : null, range.r() ? range.J() : BoundType.OPEN);
    }

    static <T> GeneralRange<T> n(Comparator<? super T> comparator, @x1 T t10, BoundType boundType, @x1 T t11, BoundType boundType2) {
        return new GeneralRange<>(comparator, true, t10, boundType, true, t11, boundType2);
    }

    static <T> GeneralRange<T> r(Comparator<? super T> comparator, @x1 T t10, BoundType boundType) {
        return new GeneralRange<>(comparator, false, null, BoundType.OPEN, true, t10, boundType);
    }

    Comparator<? super T> b() {
        return this.f57217b;
    }

    boolean c(@x1 T t10) {
        return (q(t10) || p(t10)) ? false : true;
    }

    public boolean equals(@CheckForNull Object obj) {
        if (!(obj instanceof GeneralRange)) {
            return false;
        }
        GeneralRange generalRange = (GeneralRange) obj;
        return this.f57217b.equals(generalRange.f57217b) && this.f57218c == generalRange.f57218c && this.f57221f == generalRange.f57221f && f().equals(generalRange.f()) && h().equals(generalRange.h()) && com.google.common.base.s.a(g(), generalRange.g()) && com.google.common.base.s.a(i(), generalRange.i());
    }

    BoundType f() {
        return this.f57220e;
    }

    @CheckForNull
    T g() {
        return this.f57219d;
    }

    BoundType h() {
        return this.f57223h;
    }

    public int hashCode() {
        return com.google.common.base.s.b(this.f57217b, g(), f(), i(), h());
    }

    @CheckForNull
    T i() {
        return this.f57222g;
    }

    boolean j() {
        return this.f57218c;
    }

    boolean k() {
        return this.f57221f;
    }

    GeneralRange<T> l(GeneralRange<T> generalRange) {
        int iCompare;
        int iCompare2;
        T t10;
        BoundType boundType;
        BoundType boundType2;
        int iCompare3;
        BoundType boundType3;
        com.google.common.base.w.E(generalRange);
        com.google.common.base.w.d(this.f57217b.equals(generalRange.f57217b));
        boolean z10 = this.f57218c;
        T tG = g();
        BoundType boundTypeF = f();
        if (!j()) {
            z10 = generalRange.f57218c;
            tG = generalRange.g();
            boundTypeF = generalRange.f();
        } else if (generalRange.j() && ((iCompare = this.f57217b.compare(g(), generalRange.g())) < 0 || (iCompare == 0 && generalRange.f() == BoundType.OPEN))) {
            tG = generalRange.g();
            boundTypeF = generalRange.f();
        }
        boolean z11 = z10;
        boolean z12 = this.f57221f;
        T tI = i();
        BoundType boundTypeH = h();
        if (!k()) {
            z12 = generalRange.f57221f;
            tI = generalRange.i();
            boundTypeH = generalRange.h();
        } else if (generalRange.k() && ((iCompare2 = this.f57217b.compare(i(), generalRange.i())) > 0 || (iCompare2 == 0 && generalRange.h() == BoundType.OPEN))) {
            tI = generalRange.i();
            boundTypeH = generalRange.h();
        }
        boolean z13 = z12;
        T t11 = tI;
        if (z11 && z13 && ((iCompare3 = this.f57217b.compare(tG, t11)) > 0 || (iCompare3 == 0 && boundTypeF == (boundType3 = BoundType.OPEN) && boundTypeH == boundType3))) {
            boundType = BoundType.OPEN;
            boundType2 = BoundType.CLOSED;
            t10 = t11;
        } else {
            t10 = tG;
            boundType = boundTypeF;
            boundType2 = boundTypeH;
        }
        return new GeneralRange<>(this.f57217b, z11, t10, boundType, z13, t11, boundType2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    boolean m() {
        return (k() && q(t1.a(i()))) || (j() && p(t1.a(g())));
    }

    GeneralRange<T> o() {
        GeneralRange<T> generalRange = this.f57224i;
        if (generalRange != null) {
            return generalRange;
        }
        GeneralRange<T> generalRange2 = new GeneralRange<>(Ordering.i(this.f57217b).E(), this.f57221f, i(), h(), this.f57218c, g(), f());
        generalRange2.f57224i = this;
        this.f57224i = generalRange2;
        return generalRange2;
    }

    boolean p(@x1 T t10) {
        if (!k()) {
            return false;
        }
        int iCompare = this.f57217b.compare(t10, t1.a(i()));
        return ((iCompare == 0) & (h() == BoundType.OPEN)) | (iCompare > 0);
    }

    boolean q(@x1 T t10) {
        if (!j()) {
            return false;
        }
        int iCompare = this.f57217b.compare(t10, t1.a(g()));
        return ((iCompare == 0) & (f() == BoundType.OPEN)) | (iCompare < 0);
    }

    public String toString() {
        String strValueOf = String.valueOf(this.f57217b);
        BoundType boundType = this.f57220e;
        BoundType boundType2 = BoundType.CLOSED;
        char c10 = boundType == boundType2 ? '[' : '(';
        String strValueOf2 = String.valueOf(this.f57218c ? this.f57219d : "-∞");
        String strValueOf3 = String.valueOf(this.f57221f ? this.f57222g : "∞");
        char c11 = this.f57223h == boundType2 ? ']' : ')';
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 4 + strValueOf2.length() + strValueOf3.length());
        sb2.append(strValueOf);
        sb2.append(":");
        sb2.append(c10);
        sb2.append(strValueOf2);
        sb2.append(',');
        sb2.append(strValueOf3);
        sb2.append(c11);
        return sb2.toString();
    }
}
