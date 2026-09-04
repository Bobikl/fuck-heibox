package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* JADX INFO: compiled from: AbstractList.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.u0(version = "1.1")
public abstract class b<E> extends AbstractCollection<E> implements List<E>, zh.a {

    @dl.d
    public static final a Companion = new a(null);

    /* JADX INFO: compiled from: AbstractList.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        public final void a(int i10, int i11, int i12) {
            if (i10 < 0 || i11 > i12) {
                throw new IndexOutOfBoundsException("startIndex: " + i10 + ", endIndex: " + i11 + ", size: " + i12);
            }
            if (i10 <= i11) {
                return;
            }
            throw new IllegalArgumentException("startIndex: " + i10 + " > endIndex: " + i11);
        }

        public final void b(int i10, int i11) {
            if (i10 < 0 || i10 >= i11) {
                throw new IndexOutOfBoundsException("index: " + i10 + ", size: " + i11);
            }
        }

        public final void c(int i10, int i11) {
            if (i10 < 0 || i10 > i11) {
                throw new IndexOutOfBoundsException("index: " + i10 + ", size: " + i11);
            }
        }

        public final void d(int i10, int i11, int i12) {
            if (i10 < 0 || i11 > i12) {
                throw new IndexOutOfBoundsException("fromIndex: " + i10 + ", toIndex: " + i11 + ", size: " + i12);
            }
            if (i10 <= i11) {
                return;
            }
            throw new IllegalArgumentException("fromIndex: " + i10 + " > toIndex: " + i11);
        }

        public final boolean e(@dl.d Collection<?> c10, @dl.d Collection<?> other) {
            kotlin.jvm.internal.f0.p(c10, "c");
            kotlin.jvm.internal.f0.p(other, "other");
            if (c10.size() != other.size()) {
                return false;
            }
            Iterator<?> it = other.iterator();
            Iterator<?> it2 = c10.iterator();
            while (it2.hasNext()) {
                if (!kotlin.jvm.internal.f0.g(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final int f(@dl.d Collection<?> c10) {
            kotlin.jvm.internal.f0.p(c10, "c");
            Iterator<?> it = c10.iterator();
            int iHashCode = 1;
            while (it.hasNext()) {
                Object next = it.next();
                iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
            }
            return iHashCode;
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AbstractList.kt */
    public class C1125b implements Iterator<E>, zh.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f124567b;

        public C1125b() {
        }

        protected final int a() {
            return this.f124567b;
        }

        protected final void b(int i10) {
            this.f124567b = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f124567b < b.this.size();
        }

        @Override // java.util.Iterator
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            b<E> bVar = b.this;
            int i10 = this.f124567b;
            this.f124567b = i10 + 1;
            return bVar.get(i10);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: compiled from: AbstractList.kt */
    public class c extends b<E>.C1125b implements ListIterator<E>, zh.a {
        public c(int i10) {
            super();
            b.Companion.c(i10, b.this.size());
            b(i10);
        }

        @Override // java.util.ListIterator
        public void add(E e10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return a() > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return a();
        }

        @Override // java.util.ListIterator
        public E previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            b<E> bVar = b.this;
            b(a() - 1);
            return bVar.get(a());
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return a() - 1;
        }

        @Override // java.util.ListIterator
        public void set(E e10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: compiled from: AbstractList.kt */
    public static final class d<E> extends b<E> implements RandomAccess {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final b<E> f124570b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f124571c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f124572d;

        /* JADX WARN: Multi-variable type inference failed */
        public d(@dl.d b<? extends E> list, int i10, int i11) {
            kotlin.jvm.internal.f0.p(list, "list");
            this.f124570b = list;
            this.f124571c = i10;
            b.Companion.d(i10, i11, list.size());
            this.f124572d = i11 - i10;
        }

        @Override // kotlin.collections.b, java.util.List
        public E get(int i10) {
            b.Companion.b(i10, this.f124572d);
            return this.f124570b.get(this.f124571c + i10);
        }

        @Override // kotlin.collections.b, kotlin.collections.AbstractCollection
        /* JADX INFO: renamed from: getSize */
        public int getF140741e() {
            return this.f124572d;
        }
    }

    protected b() {
    }

    @Override // java.util.List
    public void add(int i10, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(@dl.e Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            return Companion.e(this, (Collection) obj);
        }
        return false;
    }

    public abstract E get(int i10);

    @Override // kotlin.collections.AbstractCollection
    /* JADX INFO: renamed from: getSize */
    public abstract int getF140741e();

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return Companion.f(this);
    }

    public int indexOf(E e10) {
        Iterator<E> it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (kotlin.jvm.internal.f0.g(it.next(), e10)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @dl.d
    public Iterator<E> iterator() {
        return new C1125b();
    }

    public int lastIndexOf(E e10) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (kotlin.jvm.internal.f0.g(listIterator.previous(), e10)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @dl.d
    public ListIterator<E> listIterator() {
        return new c(0);
    }

    @dl.d
    public ListIterator<E> listIterator(int i10) {
        return new c(i10);
    }

    @Override // java.util.List
    public E remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public E set(int i10, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @dl.d
    public List<E> subList(int i10, int i11) {
        return new d(this, i10, i11);
    }
}
