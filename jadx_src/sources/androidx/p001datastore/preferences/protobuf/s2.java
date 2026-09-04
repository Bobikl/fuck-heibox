package androidx.p001datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: compiled from: ProtobufArrayList.java */
/* JADX INFO: loaded from: classes6.dex */
public final class s2<E> extends c<E> implements RandomAccess {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final s2<Object> f22602f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private E[] f22603d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f22604e;

    static {
        s2<Object> s2Var = new s2<>(new Object[0], 0);
        f22602f = s2Var;
        s2Var.z0();
    }

    s2() {
        this(new Object[10], 0);
    }

    private s2(E[] eArr, int i10) {
        this.f22603d = eArr;
        this.f22604e = i10;
    }

    private static <E> E[] b(int i10) {
        return (E[]) new Object[i10];
    }

    public static <E> s2<E> e() {
        return (s2<E>) f22602f;
    }

    private void g(int i10) {
        if (i10 < 0 || i10 >= this.f22604e) {
            throw new IndexOutOfBoundsException(h(i10));
        }
    }

    private String h(int i10) {
        return "Index:" + i10 + ", Size:" + this.f22604e;
    }

    @Override // androidx.p001datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        int i11;
        a();
        if (i10 < 0 || i10 > (i11 = this.f22604e)) {
            throw new IndexOutOfBoundsException(h(i10));
        }
        E[] eArr = this.f22603d;
        if (i11 < eArr.length) {
            System.arraycopy(eArr, i10, eArr, i10 + 1, i11 - i10);
        } else {
            E[] eArr2 = (E[]) b(((i11 * 3) / 2) + 1);
            System.arraycopy(this.f22603d, 0, eArr2, 0, i10);
            System.arraycopy(this.f22603d, i10, eArr2, i10 + 1, this.f22604e - i10);
            this.f22603d = eArr2;
        }
        this.f22603d[i10] = e10;
        this.f22604e++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.p001datastore.preferences.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        a();
        int i10 = this.f22604e;
        E[] eArr = this.f22603d;
        if (i10 == eArr.length) {
            this.f22603d = (E[]) Arrays.copyOf(eArr, ((i10 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f22603d;
        int i11 = this.f22604e;
        this.f22604e = i11 + 1;
        eArr2[i11] = e10;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        g(i10);
        return this.f22603d[i10];
    }

    @Override // androidx.datastore.preferences.protobuf.i1.k, androidx.datastore.preferences.protobuf.i1.g
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public s2<E> d(int i10) {
        if (i10 >= this.f22604e) {
            return new s2<>(Arrays.copyOf(this.f22603d, i10), this.f22604e);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.p001datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    public E remove(int i10) {
        a();
        g(i10);
        E[] eArr = this.f22603d;
        E e10 = eArr[i10];
        int i11 = this.f22604e;
        if (i10 < i11 - 1) {
            System.arraycopy(eArr, i10 + 1, eArr, i10, (i11 - i10) - 1);
        }
        this.f22604e--;
        ((AbstractList) this).modCount++;
        return e10;
    }

    @Override // androidx.p001datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        a();
        g(i10);
        E[] eArr = this.f22603d;
        E e11 = eArr[i10];
        eArr[i10] = e10;
        ((AbstractList) this).modCount++;
        return e11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f22604e;
    }
}
