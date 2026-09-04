package androidx.p001datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: AbstractProtobufList.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class c<E> extends AbstractList<E> implements i1.k<E> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static final int f22400c = 10;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f22401b = true;

    c() {
    }

    protected void a() {
        if (!this.f22401b) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        a();
        super.add(i10, e10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        a();
        return super.add(e10);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection<? extends E> collection) {
        a();
        return super.addAll(i10, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        a();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        a();
        super.clear();
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i10 = 0; i10 < size; i10++) {
            if (!get(i10).equals(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i10 = 0; i10 < size; i10++) {
            iHashCode = (iHashCode * 31) + get(i10).hashCode();
        }
        return iHashCode;
    }

    @Override // androidx.datastore.preferences.protobuf.i1.k
    public boolean l1() {
        return this.f22401b;
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i10) {
        a();
        return (E) super.remove(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        a();
        return super.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> collection) {
        a();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<?> collection) {
        a();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        a();
        return (E) super.set(i10, e10);
    }

    @Override // androidx.datastore.preferences.protobuf.i1.k
    public final void z0() {
        this.f22401b = false;
    }
}
