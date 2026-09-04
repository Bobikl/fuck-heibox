package androidx.p001datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: LongArrayList.java */
/* JADX INFO: loaded from: classes6.dex */
public final class r1 extends c<Long> implements i1.i, RandomAccess, q2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final r1 f22584f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long[] f22585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f22586e;

    static {
        r1 r1Var = new r1(new long[0], 0);
        f22584f = r1Var;
        r1Var.z0();
    }

    r1() {
        this(new long[10], 0);
    }

    private r1(long[] jArr, int i10) {
        this.f22585d = jArr;
        this.f22586e = i10;
    }

    private void g(int i10, long j10) {
        int i11;
        a();
        if (i10 < 0 || i10 > (i11 = this.f22586e)) {
            throw new IndexOutOfBoundsException(l(i10));
        }
        long[] jArr = this.f22585d;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[((i11 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f22585d, i10, jArr2, i10 + 1, this.f22586e - i10);
            this.f22585d = jArr2;
        }
        this.f22585d[i10] = j10;
        this.f22586e++;
        ((AbstractList) this).modCount++;
    }

    public static r1 h() {
        return f22584f;
    }

    private void i(int i10) {
        if (i10 < 0 || i10 >= this.f22586e) {
            throw new IndexOutOfBoundsException(l(i10));
        }
    }

    private String l(int i10) {
        return "Index:" + i10 + ", Size:" + this.f22586e;
    }

    @Override // androidx.p001datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Long> collection) {
        a();
        i1.d(collection);
        if (!(collection instanceof r1)) {
            return super.addAll(collection);
        }
        r1 r1Var = (r1) collection;
        int i10 = r1Var.f22586e;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f22586e;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.f22585d;
        if (i12 > jArr.length) {
            this.f22585d = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(r1Var.f22585d, 0, this.f22585d, this.f22586e, r1Var.f22586e);
        this.f22586e = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // androidx.p001datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Long l10) {
        g(i10, l10.longValue());
    }

    @Override // androidx.datastore.preferences.protobuf.i1.k, androidx.datastore.preferences.protobuf.i1.g
    /* JADX INFO: renamed from: d */
    public i1.k<Long> d2(int i10) {
        if (i10 >= this.f22586e) {
            return new r1(Arrays.copyOf(this.f22585d, i10), this.f22586e);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.p001datastore.preferences.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean add(Long l10) {
        j0(l10.longValue());
        return true;
    }

    @Override // androidx.p001datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1)) {
            return super.equals(obj);
        }
        r1 r1Var = (r1) obj;
        if (this.f22586e != r1Var.f22586e) {
            return false;
        }
        long[] jArr = r1Var.f22585d;
        for (int i10 = 0; i10 < this.f22586e; i10++) {
            if (this.f22585d[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.i1.i
    public long getLong(int i10) {
        i(i10);
        return this.f22585d[i10];
    }

    @Override // androidx.p001datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iS = 1;
        for (int i10 = 0; i10 < this.f22586e; i10++) {
            iS = (iS * 31) + i1.s(this.f22585d[i10]);
        }
        return iS;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Long get(int i10) {
        return Long.valueOf(getLong(i10));
    }

    @Override // androidx.datastore.preferences.protobuf.i1.i
    public void j0(long j10) {
        a();
        int i10 = this.f22586e;
        long[] jArr = this.f22585d;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[((i10 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f22585d = jArr2;
        }
        long[] jArr3 = this.f22585d;
        int i11 = this.f22586e;
        this.f22586e = i11 + 1;
        jArr3[i11] = j10;
    }

    @Override // androidx.p001datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Long remove(int i10) {
        a();
        i(i10);
        long[] jArr = this.f22585d;
        long j10 = jArr[i10];
        int i11 = this.f22586e;
        if (i10 < i11 - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.f22586e--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // androidx.p001datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Long set(int i10, Long l10) {
        return Long.valueOf(setLong(i10, l10.longValue()));
    }

    @Override // androidx.p001datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        a();
        for (int i10 = 0; i10 < this.f22586e; i10++) {
            if (obj.equals(Long.valueOf(this.f22585d[i10]))) {
                long[] jArr = this.f22585d;
                System.arraycopy(jArr, i10 + 1, jArr, i10, (this.f22586e - i10) - 1);
                this.f22586e--;
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
        long[] jArr = this.f22585d;
        System.arraycopy(jArr, i11, jArr, i10, this.f22586e - i11);
        this.f22586e -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.i1.i
    public long setLong(int i10, long j10) {
        a();
        i(i10);
        long[] jArr = this.f22585d;
        long j11 = jArr[i10];
        jArr[i10] = j10;
        return j11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f22586e;
    }
}
