package com.google.common.collect;

import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: TopKSelector.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b
@u
public final class v2<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f58206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Comparator<? super T> f58207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final T[] f58208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f58209d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @CheckForNull
    private T f58210e;

    private v2(Comparator<? super T> comparator, int i10) {
        this.f58207b = (Comparator) com.google.common.base.w.F(comparator, "comparator");
        this.f58206a = i10;
        com.google.common.base.w.k(i10 >= 0, "k (%s) must be >= 0", i10);
        com.google.common.base.w.k(i10 <= 1073741823, "k (%s) must be <= Integer.MAX_VALUE / 2", i10);
        this.f58208c = (T[]) new Object[com.google.common.math.f.d(i10, 2)];
        this.f58209d = 0;
        this.f58210e = null;
    }

    public static <T extends Comparable<? super T>> v2<T> a(int i10) {
        return b(i10, Ordering.z());
    }

    public static <T> v2<T> b(int i10, Comparator<? super T> comparator) {
        return new v2<>(Ordering.i(comparator).E(), i10);
    }

    public static <T extends Comparable<? super T>> v2<T> c(int i10) {
        return d(i10, Ordering.z());
    }

    public static <T> v2<T> d(int i10, Comparator<? super T> comparator) {
        return new v2<>(comparator, i10);
    }

    private int h(int i10, int i11, int i12) {
        Object objA = t1.a(this.f58208c[i12]);
        T[] tArr = this.f58208c;
        tArr[i12] = tArr[i11];
        int i13 = i10;
        while (i10 < i11) {
            if (this.f58207b.compare((Object) t1.a(this.f58208c[i10]), objA) < 0) {
                i(i13, i10);
                i13++;
            }
            i10++;
        }
        T[] tArr2 = this.f58208c;
        tArr2[i11] = tArr2[i13];
        tArr2[i13] = objA;
        return i13;
    }

    private void i(int i10, int i11) {
        T[] tArr = this.f58208c;
        T t10 = tArr[i10];
        tArr[i10] = tArr[i11];
        tArr[i11] = t10;
    }

    private void k() {
        int i10 = (this.f58206a * 2) - 1;
        int iP = com.google.common.math.f.p(i10 + 0, RoundingMode.CEILING) * 3;
        int iMax = 0;
        int i11 = 0;
        int i12 = 0;
        while (iMax < i10) {
            int iH = h(iMax, i10, ((iMax + i10) + 1) >>> 1);
            int i13 = this.f58206a;
            if (iH <= i13) {
                if (iH >= i13) {
                    break;
                }
                iMax = Math.max(iH, iMax + 1);
                i12 = iH;
            } else {
                i10 = iH - 1;
            }
            i11++;
            if (i11 >= iP) {
                Arrays.sort(this.f58208c, iMax, i10 + 1, this.f58207b);
                break;
            }
        }
        this.f58209d = this.f58206a;
        this.f58210e = (T) t1.a(this.f58208c[i12]);
        while (true) {
            i12++;
            if (i12 >= this.f58206a) {
                return;
            }
            if (this.f58207b.compare((Object) t1.a(this.f58208c[i12]), (Object) t1.a(this.f58210e)) > 0) {
                this.f58210e = this.f58208c[i12];
            }
        }
    }

    public void e(@x1 T t10) {
        int i10 = this.f58206a;
        if (i10 == 0) {
            return;
        }
        int i11 = this.f58209d;
        if (i11 == 0) {
            this.f58208c[0] = t10;
            this.f58210e = t10;
            this.f58209d = 1;
            return;
        }
        if (i11 < i10) {
            T[] tArr = this.f58208c;
            this.f58209d = i11 + 1;
            tArr[i11] = t10;
            if (this.f58207b.compare(t10, (Object) t1.a(this.f58210e)) > 0) {
                this.f58210e = t10;
                return;
            }
            return;
        }
        if (this.f58207b.compare(t10, (Object) t1.a(this.f58210e)) < 0) {
            T[] tArr2 = this.f58208c;
            int i12 = this.f58209d;
            int i13 = i12 + 1;
            this.f58209d = i13;
            tArr2[i12] = t10;
            if (i13 == this.f58206a * 2) {
                k();
            }
        }
    }

    public void f(Iterable<? extends T> iterable) {
        g(iterable.iterator());
    }

    public void g(Iterator<? extends T> it) {
        while (it.hasNext()) {
            e(it.next());
        }
    }

    public List<T> j() {
        Arrays.sort(this.f58208c, 0, this.f58209d, this.f58207b);
        int i10 = this.f58209d;
        int i11 = this.f58206a;
        if (i10 > i11) {
            T[] tArr = this.f58208c;
            Arrays.fill(tArr, i11, tArr.length, (Object) null);
            int i12 = this.f58206a;
            this.f58209d = i12;
            this.f58210e = this.f58208c[i12 - 1];
        }
        return Collections.unmodifiableList(Arrays.asList(Arrays.copyOf(this.f58208c, this.f58209d)));
    }
}
