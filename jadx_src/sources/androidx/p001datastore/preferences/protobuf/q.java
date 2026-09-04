package androidx.p001datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: BooleanArrayList.java */
/* JADX INFO: loaded from: classes6.dex */
public final class q extends c<Boolean> implements i1.a, RandomAccess, q2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final q f22579f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean[] f22580d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f22581e;

    static {
        q qVar = new q(new boolean[0], 0);
        f22579f = qVar;
        qVar.z0();
    }

    q() {
        this(new boolean[10], 0);
    }

    private q(boolean[] zArr, int i10) {
        this.f22580d = zArr;
        this.f22581e = i10;
    }

    private void g(int i10, boolean z10) {
        int i11;
        a();
        if (i10 < 0 || i10 > (i11 = this.f22581e)) {
            throw new IndexOutOfBoundsException(l(i10));
        }
        boolean[] zArr = this.f22580d;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[((i11 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.f22580d, i10, zArr2, i10 + 1, this.f22581e - i10);
            this.f22580d = zArr2;
        }
        this.f22580d[i10] = z10;
        this.f22581e++;
        ((AbstractList) this).modCount++;
    }

    public static q h() {
        return f22579f;
    }

    private void i(int i10) {
        if (i10 < 0 || i10 >= this.f22581e) {
            throw new IndexOutOfBoundsException(l(i10));
        }
    }

    private String l(int i10) {
        return "Index:" + i10 + ", Size:" + this.f22581e;
    }

    @Override // androidx.datastore.preferences.protobuf.i1.a
    public void M(boolean z10) {
        a();
        int i10 = this.f22581e;
        boolean[] zArr = this.f22580d;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[((i10 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f22580d = zArr2;
        }
        boolean[] zArr3 = this.f22580d;
        int i11 = this.f22581e;
        this.f22581e = i11 + 1;
        zArr3[i11] = z10;
    }

    @Override // androidx.p001datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Boolean> collection) {
        a();
        i1.d(collection);
        if (!(collection instanceof q)) {
            return super.addAll(collection);
        }
        q qVar = (q) collection;
        int i10 = qVar.f22581e;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f22581e;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        boolean[] zArr = this.f22580d;
        if (i12 > zArr.length) {
            this.f22580d = Arrays.copyOf(zArr, i12);
        }
        System.arraycopy(qVar.f22580d, 0, this.f22580d, this.f22581e, qVar.f22581e);
        this.f22581e = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // androidx.p001datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Boolean bool) {
        g(i10, bool.booleanValue());
    }

    @Override // androidx.datastore.preferences.protobuf.i1.k, androidx.datastore.preferences.protobuf.i1.g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public i1.k<Boolean> d2(int i10) {
        if (i10 >= this.f22581e) {
            return new q(Arrays.copyOf(this.f22580d, i10), this.f22581e);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.p001datastore.preferences.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean add(Boolean bool) {
        M(bool.booleanValue());
        return true;
    }

    @Override // androidx.p001datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return super.equals(obj);
        }
        q qVar = (q) obj;
        if (this.f22581e != qVar.f22581e) {
            return false;
        }
        boolean[] zArr = qVar.f22580d;
        for (int i10 = 0; i10 < this.f22581e; i10++) {
            if (this.f22580d[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.i1.a
    public boolean getBoolean(int i10) {
        i(i10);
        return this.f22580d[i10];
    }

    @Override // androidx.p001datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iK = 1;
        for (int i10 = 0; i10 < this.f22581e; i10++) {
            iK = (iK * 31) + i1.k(this.f22580d[i10]);
        }
        return iK;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Boolean get(int i10) {
        return Boolean.valueOf(getBoolean(i10));
    }

    @Override // androidx.p001datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Boolean remove(int i10) {
        a();
        i(i10);
        boolean[] zArr = this.f22580d;
        boolean z10 = zArr[i10];
        int i11 = this.f22581e;
        if (i10 < i11 - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (i11 - i10) - 1);
        }
        this.f22581e--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // androidx.p001datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Boolean set(int i10, Boolean bool) {
        return Boolean.valueOf(setBoolean(i10, bool.booleanValue()));
    }

    @Override // androidx.p001datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        a();
        for (int i10 = 0; i10 < this.f22581e; i10++) {
            if (obj.equals(Boolean.valueOf(this.f22580d[i10]))) {
                boolean[] zArr = this.f22580d;
                System.arraycopy(zArr, i10 + 1, zArr, i10, (this.f22581e - i10) - 1);
                this.f22581e--;
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
        boolean[] zArr = this.f22580d;
        System.arraycopy(zArr, i11, zArr, i10, this.f22581e - i11);
        this.f22581e -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.i1.a
    public boolean setBoolean(int i10, boolean z10) {
        a();
        i(i10);
        boolean[] zArr = this.f22580d;
        boolean z11 = zArr[i10];
        zArr[i10] = z10;
        return z11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f22581e;
    }
}
