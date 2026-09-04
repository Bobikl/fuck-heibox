package com.google.common.primitives;

import com.google.common.base.w;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;
import okhttp3.t;

/* JADX INFO: loaded from: classes7.dex */
@s9.j
@o9.a
@com.google.common.primitives.b
@o9.b
public final class ImmutableDoubleArray implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ImmutableDoubleArray f59028e = new ImmutableDoubleArray(new double[0]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double[] f59029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient int f59030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f59031d;

    public static class AsList extends AbstractList<Double> implements RandomAccess, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ImmutableDoubleArray f59032b;

        private AsList(ImmutableDoubleArray immutableDoubleArray) {
            this.f59032b = immutableDoubleArray;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Double get(int i10) {
            return Double.valueOf(this.f59032b.m(i10));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@CheckForNull Object obj) {
            return indexOf(obj) >= 0;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof AsList) {
                return this.f59032b.equals(((AsList) obj).f59032b);
            }
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            if (size() != list.size()) {
                return false;
            }
            int i10 = this.f59032b.f59030c;
            for (Object obj2 : list) {
                if (obj2 instanceof Double) {
                    int i11 = i10 + 1;
                    if (ImmutableDoubleArray.e(this.f59032b.f59029b[i10], ((Double) obj2).doubleValue())) {
                        i10 = i11;
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            return this.f59032b.hashCode();
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@CheckForNull Object obj) {
            if (obj instanceof Double) {
                return this.f59032b.n(((Double) obj).doubleValue());
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@CheckForNull Object obj) {
            if (obj instanceof Double) {
                return this.f59032b.q(((Double) obj).doubleValue());
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f59032b.r();
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Double> subList(int i10, int i11) {
            return this.f59032b.B(i10, i11).f();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return this.f59032b.toString();
        }
    }

    @s9.a
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private double[] f59033a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f59034b = 0;

        b(int i10) {
            this.f59033a = new double[i10];
        }

        private void g(int i10) {
            int i11 = this.f59034b + i10;
            double[] dArr = this.f59033a;
            if (i11 > dArr.length) {
                this.f59033a = Arrays.copyOf(dArr, h(dArr.length, i11));
            }
        }

        private static int h(int i10, int i11) {
            if (i11 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int iHighestOneBit = i10 + (i10 >> 1) + 1;
            if (iHighestOneBit < i11) {
                iHighestOneBit = Integer.highestOneBit(i11 - 1) << 1;
            }
            if (iHighestOneBit < 0) {
                return Integer.MAX_VALUE;
            }
            return iHighestOneBit;
        }

        public b a(double d10) {
            g(1);
            double[] dArr = this.f59033a;
            int i10 = this.f59034b;
            dArr[i10] = d10;
            this.f59034b = i10 + 1;
            return this;
        }

        public b b(ImmutableDoubleArray immutableDoubleArray) {
            g(immutableDoubleArray.r());
            System.arraycopy(immutableDoubleArray.f59029b, immutableDoubleArray.f59030c, this.f59033a, this.f59034b, immutableDoubleArray.r());
            this.f59034b += immutableDoubleArray.r();
            return this;
        }

        public b c(Iterable<Double> iterable) {
            if (iterable instanceof Collection) {
                return d((Collection) iterable);
            }
            Iterator<Double> it = iterable.iterator();
            while (it.hasNext()) {
                a(it.next().doubleValue());
            }
            return this;
        }

        public b d(Collection<Double> collection) {
            g(collection.size());
            for (Double d10 : collection) {
                double[] dArr = this.f59033a;
                int i10 = this.f59034b;
                this.f59034b = i10 + 1;
                dArr[i10] = d10.doubleValue();
            }
            return this;
        }

        public b e(double[] dArr) {
            g(dArr.length);
            System.arraycopy(dArr, 0, this.f59033a, this.f59034b, dArr.length);
            this.f59034b += dArr.length;
            return this;
        }

        @s9.b
        public ImmutableDoubleArray f() {
            return this.f59034b == 0 ? ImmutableDoubleArray.f59028e : new ImmutableDoubleArray(this.f59033a, 0, this.f59034b);
        }
    }

    private ImmutableDoubleArray(double[] dArr) {
        this(dArr, 0, dArr.length);
    }

    private ImmutableDoubleArray(double[] dArr, int i10, int i11) {
        this.f59029b = dArr;
        this.f59030c = i10;
        this.f59031d = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean e(double d10, double d11) {
        return Double.doubleToLongBits(d10) == Double.doubleToLongBits(d11);
    }

    public static b g() {
        return new b(10);
    }

    public static b h(int i10) {
        w.k(i10 >= 0, "Invalid initialCapacity: %s", i10);
        return new b(i10);
    }

    public static ImmutableDoubleArray j(Iterable<Double> iterable) {
        return iterable instanceof Collection ? k((Collection) iterable) : g().c(iterable).f();
    }

    public static ImmutableDoubleArray k(Collection<Double> collection) {
        return collection.isEmpty() ? f59028e : new ImmutableDoubleArray(Doubles.z(collection));
    }

    public static ImmutableDoubleArray l(double[] dArr) {
        return dArr.length == 0 ? f59028e : new ImmutableDoubleArray(Arrays.copyOf(dArr, dArr.length));
    }

    private boolean p() {
        return this.f59030c > 0 || this.f59031d < this.f59029b.length;
    }

    public static ImmutableDoubleArray s() {
        return f59028e;
    }

    public static ImmutableDoubleArray t(double d10) {
        return new ImmutableDoubleArray(new double[]{d10});
    }

    public static ImmutableDoubleArray u(double d10, double d11) {
        return new ImmutableDoubleArray(new double[]{d10, d11});
    }

    public static ImmutableDoubleArray v(double d10, double d11, double d12) {
        return new ImmutableDoubleArray(new double[]{d10, d11, d12});
    }

    public static ImmutableDoubleArray w(double d10, double d11, double d12, double d13) {
        return new ImmutableDoubleArray(new double[]{d10, d11, d12, d13});
    }

    public static ImmutableDoubleArray x(double d10, double d11, double d12, double d13, double d14) {
        return new ImmutableDoubleArray(new double[]{d10, d11, d12, d13, d14});
    }

    public static ImmutableDoubleArray y(double d10, double d11, double d12, double d13, double d14, double d15) {
        return new ImmutableDoubleArray(new double[]{d10, d11, d12, d13, d14, d15});
    }

    public static ImmutableDoubleArray z(double d10, double... dArr) {
        w.e(dArr.length <= 2147483646, "the total number of elements must fit in an int");
        double[] dArr2 = new double[dArr.length + 1];
        dArr2[0] = d10;
        System.arraycopy(dArr, 0, dArr2, 1, dArr.length);
        return new ImmutableDoubleArray(dArr2);
    }

    Object A() {
        return o() ? f59028e : this;
    }

    public ImmutableDoubleArray B(int i10, int i11) {
        w.f0(i10, i11, r());
        if (i10 == i11) {
            return f59028e;
        }
        double[] dArr = this.f59029b;
        int i12 = this.f59030c;
        return new ImmutableDoubleArray(dArr, i10 + i12, i12 + i11);
    }

    public double[] C() {
        return Arrays.copyOfRange(this.f59029b, this.f59030c, this.f59031d);
    }

    public ImmutableDoubleArray D() {
        return p() ? new ImmutableDoubleArray(C()) : this;
    }

    Object E() {
        return D();
    }

    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableDoubleArray)) {
            return false;
        }
        ImmutableDoubleArray immutableDoubleArray = (ImmutableDoubleArray) obj;
        if (r() != immutableDoubleArray.r()) {
            return false;
        }
        for (int i10 = 0; i10 < r(); i10++) {
            if (!e(m(i10), immutableDoubleArray.m(i10))) {
                return false;
            }
        }
        return true;
    }

    public List<Double> f() {
        return new AsList();
    }

    public int hashCode() {
        int iJ = 1;
        for (int i10 = this.f59030c; i10 < this.f59031d; i10++) {
            iJ = (iJ * 31) + Doubles.j(this.f59029b[i10]);
        }
        return iJ;
    }

    public boolean i(double d10) {
        return n(d10) >= 0;
    }

    public double m(int i10) {
        w.C(i10, r());
        return this.f59029b[this.f59030c + i10];
    }

    public int n(double d10) {
        for (int i10 = this.f59030c; i10 < this.f59031d; i10++) {
            if (e(this.f59029b[i10], d10)) {
                return i10 - this.f59030c;
            }
        }
        return -1;
    }

    public boolean o() {
        return this.f59031d == this.f59030c;
    }

    public int q(double d10) {
        int i10 = this.f59031d;
        do {
            i10--;
            if (i10 < this.f59030c) {
                return -1;
            }
        } while (!e(this.f59029b[i10], d10));
        return i10 - this.f59030c;
    }

    public int r() {
        return this.f59031d - this.f59030c;
    }

    public String toString() {
        if (o()) {
            return t.f132643o;
        }
        StringBuilder sb2 = new StringBuilder(r() * 5);
        sb2.append('[');
        sb2.append(this.f59029b[this.f59030c]);
        int i10 = this.f59030c;
        while (true) {
            i10++;
            if (i10 >= this.f59031d) {
                sb2.append(']');
                return sb2.toString();
            }
            sb2.append(", ");
            sb2.append(this.f59029b[i10]);
        }
    }
}
