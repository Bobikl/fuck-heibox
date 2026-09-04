package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: UnmodifiableLazyStringList.java */
/* JADX INFO: loaded from: classes5.dex */
public class t extends AbstractList<String> implements RandomAccess, l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f127405b;

    /* JADX INFO: compiled from: UnmodifiableLazyStringList.java */
    public class a implements ListIterator<String> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ListIterator<String> f127406b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f127407c;

        a(int i10) {
            this.f127407c = i10;
            this.f127406b = t.this.f127405b.listIterator(i10);
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f127406b.next();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return this.f127406b.previous();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f127406b.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f127406b.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f127406b.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f127406b.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: compiled from: UnmodifiableLazyStringList.java */
    public class b implements Iterator<String> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Iterator<String> f127409b;

        b() {
            this.f127409b = t.this.f127405b.iterator();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f127409b.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f127409b.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public t(l lVar) {
        this.f127405b = lVar;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get(int i10) {
        return this.f127405b.get(i10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.l
    public void i1(d dVar) {
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

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.l
    public l n() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.l
    public List<?> p() {
        return this.f127405b.p();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.l
    public d r(int i10) {
        return this.f127405b.r(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f127405b.size();
    }
}
