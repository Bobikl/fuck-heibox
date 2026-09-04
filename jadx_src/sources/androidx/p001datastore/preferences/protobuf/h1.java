package androidx.p001datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: IntArrayList.java */
/* JADX INFO: loaded from: classes6.dex */
public final class h1 extends c<Integer> implements i1.g, RandomAccess, q2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final h1 f22451f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int[] f22452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f22453e;

    static {
        h1 h1Var = new h1(new int[0], 0);
        f22451f = h1Var;
        h1Var.z0();
    }

    h1() {
        this(new int[10], 0);
    }

    private h1(int[] iArr, int i10) {
        this.f22452d = iArr;
        this.f22453e = i10;
    }

    private void g(int i10, int i11) {
        int i12;
        a();
        if (i10 < 0 || i10 > (i12 = this.f22453e)) {
            throw new IndexOutOfBoundsException(l(i10));
        }
        int[] iArr = this.f22452d;
        if (i12 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i12 - i10);
        } else {
            int[] iArr2 = new int[((i12 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f22452d, i10, iArr2, i10 + 1, this.f22453e - i10);
            this.f22452d = iArr2;
        }
        this.f22452d[i10] = i11;
        this.f22453e++;
        ((AbstractList) this).modCount++;
    }

    public static h1 h() {
        return f22451f;
    }

    private void i(int i10) {
        if (i10 < 0 || i10 >= this.f22453e) {
            throw new IndexOutOfBoundsException(l(i10));
        }
    }

    private String l(int i10) {
        return "Index:" + i10 + ", Size:" + this.f22453e;
    }

    @Override // androidx.p001datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Integer> collection) {
        a();
        i1.d(collection);
        if (!(collection instanceof h1)) {
            return super.addAll(collection);
        }
        h1 h1Var = (h1) collection;
        int i10 = h1Var.f22453e;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f22453e;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f22452d;
        if (i12 > iArr.length) {
            this.f22452d = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(h1Var.f22452d, 0, this.f22452d, this.f22453e, h1Var.f22453e);
        this.f22453e = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // androidx.p001datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Integer num) {
        g(i10, num.intValue());
    }

    @Override // androidx.datastore.preferences.protobuf.i1.k, androidx.datastore.preferences.protobuf.i1.g
    /* JADX INFO: renamed from: d */
    public i1.k<Integer> d2(int i10) {
        if (i10 >= this.f22453e) {
            return new h1(Arrays.copyOf(this.f22452d, i10), this.f22453e);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.p001datastore.preferences.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean add(Integer num) {
        t1(num.intValue());
        return true;
    }

    @Override // androidx.p001datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return super.equals(obj);
        }
        h1 h1Var = (h1) obj;
        if (this.f22453e != h1Var.f22453e) {
            return false;
        }
        int[] iArr = h1Var.f22452d;
        for (int i10 = 0; i10 < this.f22453e; i10++) {
            if (this.f22452d[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.i1.g
    public int getInt(int i10) {
        i(i10);
        return this.f22452d[i10];
    }

    @Override // androidx.p001datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f22453e; i11++) {
            i10 = (i10 * 31) + this.f22452d[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Integer get(int i10) {
        return Integer.valueOf(getInt(i10));
    }

    @Override // androidx.p001datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Integer remove(int i10) {
        a();
        i(i10);
        int[] iArr = this.f22452d;
        int i11 = iArr[i10];
        int i12 = this.f22453e;
        if (i10 < i12 - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i12 - i10) - 1);
        }
        this.f22453e--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // androidx.p001datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Integer set(int i10, Integer num) {
        return Integer.valueOf(setInt(i10, num.intValue()));
    }

    @Override // androidx.p001datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        a();
        for (int i10 = 0; i10 < this.f22453e; i10++) {
            if (obj.equals(Integer.valueOf(this.f22452d[i10]))) {
                int[] iArr = this.f22452d;
                System.arraycopy(iArr, i10 + 1, iArr, i10, (this.f22453e - i10) - 1);
                this.f22453e--;
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
        int[] iArr = this.f22452d;
        System.arraycopy(iArr, i11, iArr, i10, this.f22453e - i11);
        this.f22453e -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.i1.g
    public int setInt(int i10, int i11) {
        a();
        i(i10);
        int[] iArr = this.f22452d;
        int i12 = iArr[i10];
        iArr[i10] = i11;
        return i12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f22453e;
    }

    @Override // androidx.datastore.preferences.protobuf.i1.g
    public void t1(int i10) {
        a();
        int i11 = this.f22453e;
        int[] iArr = this.f22452d;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f22452d = iArr2;
        }
        int[] iArr3 = this.f22452d;
        int i12 = this.f22453e;
        this.f22453e = i12 + 1;
        iArr3[i12] = i10;
    }
}
