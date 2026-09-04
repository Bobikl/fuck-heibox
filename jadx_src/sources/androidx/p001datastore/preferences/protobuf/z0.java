package androidx.p001datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: FloatArrayList.java */
/* JADX INFO: loaded from: classes6.dex */
public final class z0 extends c<Float> implements i1.f, RandomAccess, q2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final z0 f22743f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float[] f22744d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f22745e;

    static {
        z0 z0Var = new z0(new float[0], 0);
        f22743f = z0Var;
        z0Var.z0();
    }

    z0() {
        this(new float[10], 0);
    }

    private z0(float[] fArr, int i10) {
        this.f22744d = fArr;
        this.f22745e = i10;
    }

    private void g(int i10, float f10) {
        int i11;
        a();
        if (i10 < 0 || i10 > (i11 = this.f22745e)) {
            throw new IndexOutOfBoundsException(l(i10));
        }
        float[] fArr = this.f22744d;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
        } else {
            float[] fArr2 = new float[((i11 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.f22744d, i10, fArr2, i10 + 1, this.f22745e - i10);
            this.f22744d = fArr2;
        }
        this.f22744d[i10] = f10;
        this.f22745e++;
        ((AbstractList) this).modCount++;
    }

    public static z0 h() {
        return f22743f;
    }

    private void i(int i10) {
        if (i10 < 0 || i10 >= this.f22745e) {
            throw new IndexOutOfBoundsException(l(i10));
        }
    }

    private String l(int i10) {
        return "Index:" + i10 + ", Size:" + this.f22745e;
    }

    @Override // androidx.p001datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Float> collection) {
        a();
        i1.d(collection);
        if (!(collection instanceof z0)) {
            return super.addAll(collection);
        }
        z0 z0Var = (z0) collection;
        int i10 = z0Var.f22745e;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f22745e;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        float[] fArr = this.f22744d;
        if (i12 > fArr.length) {
            this.f22744d = Arrays.copyOf(fArr, i12);
        }
        System.arraycopy(z0Var.f22744d, 0, this.f22744d, this.f22745e, z0Var.f22745e);
        this.f22745e = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // androidx.p001datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Float f10) {
        g(i10, f10.floatValue());
    }

    @Override // androidx.datastore.preferences.protobuf.i1.k, androidx.datastore.preferences.protobuf.i1.g
    /* JADX INFO: renamed from: d */
    public i1.k<Float> d2(int i10) {
        if (i10 >= this.f22745e) {
            return new z0(Arrays.copyOf(this.f22744d, i10), this.f22745e);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.p001datastore.preferences.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean add(Float f10) {
        x0(f10.floatValue());
        return true;
    }

    @Override // androidx.p001datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return super.equals(obj);
        }
        z0 z0Var = (z0) obj;
        if (this.f22745e != z0Var.f22745e) {
            return false;
        }
        float[] fArr = z0Var.f22744d;
        for (int i10 = 0; i10 < this.f22745e; i10++) {
            if (Float.floatToIntBits(this.f22744d[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.i1.f
    public float getFloat(int i10) {
        i(i10);
        return this.f22744d[i10];
    }

    @Override // androidx.p001datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iFloatToIntBits = 1;
        for (int i10 = 0; i10 < this.f22745e; i10++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f22744d[i10]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Float get(int i10) {
        return Float.valueOf(getFloat(i10));
    }

    @Override // androidx.p001datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Float remove(int i10) {
        a();
        i(i10);
        float[] fArr = this.f22744d;
        float f10 = fArr[i10];
        int i11 = this.f22745e;
        if (i10 < i11 - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (i11 - i10) - 1);
        }
        this.f22745e--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // androidx.p001datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Float set(int i10, Float f10) {
        return Float.valueOf(setFloat(i10, f10.floatValue()));
    }

    @Override // androidx.p001datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        a();
        for (int i10 = 0; i10 < this.f22745e; i10++) {
            if (obj.equals(Float.valueOf(this.f22744d[i10]))) {
                float[] fArr = this.f22744d;
                System.arraycopy(fArr, i10 + 1, fArr, i10, (this.f22745e - i10) - 1);
                this.f22745e--;
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
        float[] fArr = this.f22744d;
        System.arraycopy(fArr, i11, fArr, i10, this.f22745e - i11);
        this.f22745e -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.i1.f
    public float setFloat(int i10, float f10) {
        a();
        i(i10);
        float[] fArr = this.f22744d;
        float f11 = fArr[i10];
        fArr[i10] = f10;
        return f11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f22745e;
    }

    @Override // androidx.datastore.preferences.protobuf.i1.f
    public void x0(float f10) {
        a();
        int i10 = this.f22745e;
        float[] fArr = this.f22744d;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[((i10 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f22744d = fArr2;
        }
        float[] fArr3 = this.f22744d;
        int i11 = this.f22745e;
        this.f22745e = i11 + 1;
        fArr3[i11] = f10;
    }
}
