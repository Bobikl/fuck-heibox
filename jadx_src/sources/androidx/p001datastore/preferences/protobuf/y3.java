package androidx.p001datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: UnmodifiableLazyStringList.java */
/* JADX INFO: loaded from: classes6.dex */
public class y3 extends AbstractList<String> implements n1, RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n1 f22734b;

    /* JADX INFO: compiled from: UnmodifiableLazyStringList.java */
    public class a implements ListIterator<String> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ListIterator<String> f22735b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f22736c;

        a(int i10) {
            this.f22736c = i10;
            this.f22735b = y3.this.f22734b.listIterator(i10);
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f22735b.next();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return this.f22735b.previous();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f22735b.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f22735b.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f22735b.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f22735b.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: compiled from: UnmodifiableLazyStringList.java */
    public class b implements Iterator<String> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Iterator<String> f22738b;

        b() {
            this.f22738b = y3.this.f22734b.iterator();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f22738b.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f22738b.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public y3(n1 n1Var) {
        this.f22734b = n1Var;
    }

    @Override // androidx.p001datastore.preferences.protobuf.n1
    public byte[] C(int i10) {
        return this.f22734b.C(i10);
    }

    @Override // androidx.p001datastore.preferences.protobuf.n1
    public boolean K(Collection<byte[]> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.p001datastore.preferences.protobuf.n1
    public void M0(int i10, ByteString byteString) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.p001datastore.preferences.protobuf.n1
    public List<byte[]> P() {
        return Collections.unmodifiableList(this.f22734b.P());
    }

    @Override // androidx.p001datastore.preferences.protobuf.n1
    public Object T1(int i10) {
        return this.f22734b.T1(i10);
    }

    @Override // androidx.p001datastore.preferences.protobuf.n1
    public void Y0(n1 n1Var) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get(int i10) {
        return this.f22734b.get(i10);
    }

    @Override // androidx.p001datastore.preferences.protobuf.u2
    public List<ByteString> d1() {
        return Collections.unmodifiableList(this.f22734b.d1());
    }

    @Override // androidx.p001datastore.preferences.protobuf.n1
    public void f0(ByteString byteString) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        return new b();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i10) {
        return new a(i10);
    }

    @Override // androidx.p001datastore.preferences.protobuf.n1
    public n1 n() {
        return this;
    }

    @Override // androidx.p001datastore.preferences.protobuf.n1
    public boolean o0(Collection<? extends ByteString> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.p001datastore.preferences.protobuf.n1
    public List<?> p() {
        return this.f22734b.p();
    }

    @Override // androidx.p001datastore.preferences.protobuf.n1
    public ByteString r(int i10) {
        return this.f22734b.r(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f22734b.size();
    }

    @Override // androidx.p001datastore.preferences.protobuf.n1
    public void y1(int i10, byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.p001datastore.preferences.protobuf.n1
    public void z(byte[] bArr) {
        throw new UnsupportedOperationException();
    }
}
