package androidx.p001datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: DoubleArrayList.java */
/* JADX INFO: loaded from: classes6.dex */
public final class z extends c<Double> implements i1.b, RandomAccess, q2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final z f22740f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double[] f22741d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f22742e;

    static {
        z zVar = new z(new double[0], 0);
        f22740f = zVar;
        zVar.z0();
    }

    z() {
        this(new double[10], 0);
    }

    private z(double[] dArr, int i10) {
        this.f22741d = dArr;
        this.f22742e = i10;
    }

    private void g(int i10, double d10) {
        int i11;
        a();
        if (i10 < 0 || i10 > (i11 = this.f22742e)) {
            throw new IndexOutOfBoundsException(l(i10));
        }
        double[] dArr = this.f22741d;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[((i11 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.f22741d, i10, dArr2, i10 + 1, this.f22742e - i10);
            this.f22741d = dArr2;
        }
        this.f22741d[i10] = d10;
        this.f22742e++;
        ((AbstractList) this).modCount++;
    }

    public static z h() {
        return f22740f;
    }

    private void i(int i10) {
        if (i10 < 0 || i10 >= this.f22742e) {
            throw new IndexOutOfBoundsException(l(i10));
        }
    }

    private String l(int i10) {
        return "Index:" + i10 + ", Size:" + this.f22742e;
    }

    @Override // androidx.p001datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Double> collection) {
        a();
        i1.d(collection);
        if (!(collection instanceof z)) {
            return super.addAll(collection);
        }
        z zVar = (z) collection;
        int i10 = zVar.f22742e;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f22742e;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        double[] dArr = this.f22741d;
        if (i12 > dArr.length) {
            this.f22741d = Arrays.copyOf(dArr, i12);
        }
        System.arraycopy(zVar.f22741d, 0, this.f22741d, this.f22742e, zVar.f22742e);
        this.f22742e = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // androidx.p001datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Double d10) {
        g(i10, d10.doubleValue());
    }

    @Override // androidx.datastore.preferences.protobuf.i1.k, androidx.datastore.preferences.protobuf.i1.g
    /* JADX INFO: renamed from: d */
    public i1.k<Double> d2(int i10) {
        if (i10 >= this.f22742e) {
            return new z(Arrays.copyOf(this.f22741d, i10), this.f22742e);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.p001datastore.preferences.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean add(Double d10) {
        p0(d10.doubleValue());
        return true;
    }

    @Override // androidx.p001datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return super.equals(obj);
        }
        z zVar = (z) obj;
        if (this.f22742e != zVar.f22742e) {
            return false;
        }
        double[] dArr = zVar.f22741d;
        for (int i10 = 0; i10 < this.f22742e; i10++) {
            if (Double.doubleToLongBits(this.f22741d[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.i1.b
    public double getDouble(int i10) {
        i(i10);
        return this.f22741d[i10];
    }

    @Override // androidx.p001datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iS = 1;
        for (int i10 = 0; i10 < this.f22742e; i10++) {
            iS = (iS * 31) + i1.s(Double.doubleToLongBits(this.f22741d[i10]));
        }
        return iS;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Double get(int i10) {
        return Double.valueOf(getDouble(i10));
    }

    @Override // androidx.p001datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Double remove(int i10) {
        a();
        i(i10);
        double[] dArr = this.f22741d;
        double d10 = dArr[i10];
        int i11 = this.f22742e;
        if (i10 < i11 - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (i11 - i10) - 1);
        }
        this.f22742e--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // androidx.p001datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Double set(int i10, Double d10) {
        return Double.valueOf(setDouble(i10, d10.doubleValue()));
    }

    @Override // androidx.datastore.preferences.protobuf.i1.b
    public void p0(double d10) {
        a();
        int i10 = this.f22742e;
        double[] dArr = this.f22741d;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[((i10 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f22741d = dArr2;
        }
        double[] dArr3 = this.f22741d;
        int i11 = this.f22742e;
        this.f22742e = i11 + 1;
        dArr3[i11] = d10;
    }

    @Override // androidx.p001datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        a();
        for (int i10 = 0; i10 < this.f22742e; i10++) {
            if (obj.equals(Double.valueOf(this.f22741d[i10]))) {
                double[] dArr = this.f22741d;
                System.arraycopy(dArr, i10 + 1, dArr, i10, (this.f22742e - i10) - 1);
                this.f22742e--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f22741d;
        System.arraycopy(dArr, i11, dArr, i10, this.f22742e - i11);
        this.f22742e -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.i1.b
    public double setDouble(int i10, double d10) {
        a();
        i(i10);
        double[] dArr = this.f22741d;
        double d11 = dArr[i10];
        dArr[i10] = d10;
        return d11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f22742e;
    }
}
