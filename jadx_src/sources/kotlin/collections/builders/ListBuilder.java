package kotlin.collections.builders;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.collections.d;
import kotlin.collections.i;
import kotlin.collections.m;
import kotlin.jvm.internal.f0;
import nh.b;
import zh.e;
import zh.f;

/* JADX INFO: compiled from: ListBuilder.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class ListBuilder<E> extends d<E> implements List<E>, RandomAccess, Serializable, e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private E[] f124574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f124575c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f124576d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f124577e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.e
    private final ListBuilder<E> f124578f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.e
    private final ListBuilder<E> f124579g;

    /* JADX INFO: compiled from: ListBuilder.kt */
    public static final class a<E> implements ListIterator<E>, f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final ListBuilder<E> f124580b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f124581c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f124582d;

        public a(@dl.d ListBuilder<E> list, int i10) {
            f0.p(list, "list");
            this.f124580b = list;
            this.f124581c = i10;
            this.f124582d = -1;
        }

        @Override // java.util.ListIterator
        public void add(E e10) {
            ListBuilder<E> listBuilder = this.f124580b;
            int i10 = this.f124581c;
            this.f124581c = i10 + 1;
            listBuilder.add(i10, e10);
            this.f124582d = -1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f124581c < ((ListBuilder) this.f124580b).f124576d;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f124581c > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public E next() {
            if (this.f124581c >= ((ListBuilder) this.f124580b).f124576d) {
                throw new NoSuchElementException();
            }
            int i10 = this.f124581c;
            this.f124581c = i10 + 1;
            this.f124582d = i10;
            return (E) ((ListBuilder) this.f124580b).f124574b[((ListBuilder) this.f124580b).f124575c + this.f124582d];
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f124581c;
        }

        @Override // java.util.ListIterator
        public E previous() {
            int i10 = this.f124581c;
            if (i10 <= 0) {
                throw new NoSuchElementException();
            }
            int i11 = i10 - 1;
            this.f124581c = i11;
            this.f124582d = i11;
            return (E) ((ListBuilder) this.f124580b).f124574b[((ListBuilder) this.f124580b).f124575c + this.f124582d];
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f124581c - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            int i10 = this.f124582d;
            if (!(i10 != -1)) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
            }
            this.f124580b.remove(i10);
            this.f124581c = this.f124582d;
            this.f124582d = -1;
        }

        @Override // java.util.ListIterator
        public void set(E e10) {
            int i10 = this.f124582d;
            if (!(i10 != -1)) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
            }
            this.f124580b.set(i10, e10);
        }
    }

    public ListBuilder() {
        this(10);
    }

    public ListBuilder(int i10) {
        this(b.d(i10), 0, 0, false, null, null);
    }

    private ListBuilder(E[] eArr, int i10, int i11, boolean z10, ListBuilder<E> listBuilder, ListBuilder<E> listBuilder2) {
        this.f124574b = eArr;
        this.f124575c = i10;
        this.f124576d = i11;
        this.f124577e = z10;
        this.f124578f = listBuilder;
        this.f124579g = listBuilder2;
    }

    private final void A(int i10, int i11) {
        ListBuilder<E> listBuilder = this.f124578f;
        if (listBuilder != null) {
            listBuilder.A(i10, i11);
        } else {
            E[] eArr = this.f124574b;
            m.c1(eArr, eArr, i10, i10 + i11, this.f124576d);
            E[] eArr2 = this.f124574b;
            int i12 = this.f124576d;
            b.g(eArr2, i12 - i11, i12);
        }
        this.f124576d -= i11;
    }

    private final int B(int i10, int i11, Collection<? extends E> collection, boolean z10) {
        ListBuilder<E> listBuilder = this.f124578f;
        if (listBuilder != null) {
            int iB = listBuilder.B(i10, i11, collection, z10);
            this.f124576d -= iB;
            return iB;
        }
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            int i14 = i10 + i12;
            if (collection.contains(this.f124574b[i14]) == z10) {
                E[] eArr = this.f124574b;
                i12++;
                eArr[i13 + i10] = eArr[i14];
                i13++;
            } else {
                i12++;
            }
        }
        int i15 = i11 - i13;
        E[] eArr2 = this.f124574b;
        m.c1(eArr2, eArr2, i10 + i13, i11 + i10, this.f124576d);
        E[] eArr3 = this.f124574b;
        int i16 = this.f124576d;
        b.g(eArr3, i16 - i15, i16);
        this.f124576d -= i15;
        return i15;
    }

    private final Object D() throws NotSerializableException {
        if (x()) {
            return new SerializedCollection(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    private final void i(int i10, Collection<? extends E> collection, int i11) {
        ListBuilder<E> listBuilder = this.f124578f;
        if (listBuilder != null) {
            listBuilder.i(i10, collection, i11);
            this.f124574b = this.f124578f.f124574b;
            this.f124576d += i11;
        } else {
            w(i10, i11);
            Iterator<? extends E> it = collection.iterator();
            for (int i12 = 0; i12 < i11; i12++) {
                this.f124574b[i10 + i12] = it.next();
            }
        }
    }

    private final void j(int i10, E e10) {
        ListBuilder<E> listBuilder = this.f124578f;
        if (listBuilder == null) {
            w(i10, 1);
            this.f124574b[i10] = e10;
        } else {
            listBuilder.j(i10, e10);
            this.f124574b = this.f124578f.f124574b;
            this.f124576d++;
        }
    }

    private final void o() {
        if (x()) {
            throw new UnsupportedOperationException();
        }
    }

    private final boolean s(List<?> list) {
        return b.h(this.f124574b, this.f124575c, this.f124576d, list);
    }

    private final void u(int i10) {
        if (this.f124578f != null) {
            throw new IllegalStateException();
        }
        if (i10 < 0) {
            throw new OutOfMemoryError();
        }
        E[] eArr = this.f124574b;
        if (i10 > eArr.length) {
            this.f124574b = (E[]) b.e(this.f124574b, i.f124618e.a(eArr.length, i10));
        }
    }

    private final void v(int i10) {
        u(this.f124576d + i10);
    }

    private final void w(int i10, int i11) {
        v(i11);
        E[] eArr = this.f124574b;
        m.c1(eArr, eArr, i10 + i11, i10, this.f124575c + this.f124576d);
        this.f124576d += i11;
    }

    private final boolean x() {
        ListBuilder<E> listBuilder;
        return this.f124577e || ((listBuilder = this.f124579g) != null && listBuilder.f124577e);
    }

    private final E y(int i10) {
        ListBuilder<E> listBuilder = this.f124578f;
        if (listBuilder != null) {
            E eY = listBuilder.y(i10);
            this.f124576d--;
            return eY;
        }
        E[] eArr = this.f124574b;
        E e10 = eArr[i10];
        m.c1(eArr, eArr, i10, i10 + 1, this.f124575c + this.f124576d);
        b.f(this.f124574b, (this.f124575c + this.f124576d) - 1);
        this.f124576d--;
        return e10;
    }

    @Override // kotlin.collections.d
    public int a() {
        return this.f124576d;
    }

    @Override // kotlin.collections.d, java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        o();
        kotlin.collections.b.Companion.c(i10, this.f124576d);
        j(this.f124575c + i10, e10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        o();
        j(this.f124575c + this.f124576d, e10);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, @dl.d Collection<? extends E> elements) {
        f0.p(elements, "elements");
        o();
        kotlin.collections.b.Companion.c(i10, this.f124576d);
        int size = elements.size();
        i(this.f124575c + i10, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(@dl.d Collection<? extends E> elements) {
        f0.p(elements, "elements");
        o();
        int size = elements.size();
        i(this.f124575c + this.f124576d, elements, size);
        return size > 0;
    }

    @Override // kotlin.collections.d
    public E b(int i10) {
        o();
        kotlin.collections.b.Companion.b(i10, this.f124576d);
        return y(this.f124575c + i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        o();
        A(this.f124575c, this.f124576d);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(@dl.e Object obj) {
        return obj == this || ((obj instanceof List) && s((List) obj));
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        kotlin.collections.b.Companion.b(i10, this.f124576d);
        return this.f124574b[this.f124575c + i10];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        return b.i(this.f124574b, this.f124575c, this.f124576d);
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        for (int i10 = 0; i10 < this.f124576d; i10++) {
            if (f0.g(this.f124574b[this.f124575c + i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.f124576d == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @dl.d
    public Iterator<E> iterator() {
        return new a(this, 0);
    }

    @dl.d
    public final List<E> l() {
        if (this.f124578f != null) {
            throw new IllegalStateException();
        }
        o();
        this.f124577e = true;
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        for (int i10 = this.f124576d - 1; i10 >= 0; i10--) {
            if (f0.g(this.f124574b[this.f124575c + i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    @dl.d
    public ListIterator<E> listIterator() {
        return new a(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    @dl.d
    public ListIterator<E> listIterator(int i10) {
        kotlin.collections.b.Companion.c(i10, this.f124576d);
        return new a(this, i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        o();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            remove(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(@dl.d Collection<? extends Object> elements) {
        f0.p(elements, "elements");
        o();
        return B(this.f124575c, this.f124576d, elements, false) > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(@dl.d Collection<? extends Object> elements) {
        f0.p(elements, "elements");
        o();
        return B(this.f124575c, this.f124576d, elements, true) > 0;
    }

    @Override // kotlin.collections.d, java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        o();
        kotlin.collections.b.Companion.b(i10, this.f124576d);
        E[] eArr = this.f124574b;
        int i11 = this.f124575c;
        E e11 = eArr[i11 + i10];
        eArr[i11 + i10] = e10;
        return e11;
    }

    @Override // java.util.AbstractList, java.util.List
    @dl.d
    public List<E> subList(int i10, int i11) {
        kotlin.collections.b.Companion.d(i10, i11, this.f124576d);
        E[] eArr = this.f124574b;
        int i12 = this.f124575c + i10;
        int i13 = i11 - i10;
        boolean z10 = this.f124577e;
        ListBuilder<E> listBuilder = this.f124579g;
        return new ListBuilder(eArr, i12, i13, z10, this, listBuilder == null ? this : listBuilder);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @dl.d
    public Object[] toArray() {
        E[] eArr = this.f124574b;
        int i10 = this.f124575c;
        return m.M1(eArr, i10, this.f124576d + i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @dl.d
    public <T> T[] toArray(@dl.d T[] destination) {
        f0.p(destination, "destination");
        int length = destination.length;
        int i10 = this.f124576d;
        if (length < i10) {
            E[] eArr = this.f124574b;
            int i11 = this.f124575c;
            T[] tArr = (T[]) Arrays.copyOfRange(eArr, i11, i10 + i11, destination.getClass());
            f0.o(tArr, "copyOfRange(array, offse…h, destination.javaClass)");
            return tArr;
        }
        E[] eArr2 = this.f124574b;
        int i12 = this.f124575c;
        m.c1(eArr2, destination, 0, i12, i10 + i12);
        int length2 = destination.length;
        int i13 = this.f124576d;
        if (length2 > i13) {
            destination[i13] = null;
        }
        return destination;
    }

    @Override // java.util.AbstractCollection
    @dl.d
    public String toString() {
        return b.j(this.f124574b, this.f124575c, this.f124576d);
    }
}
