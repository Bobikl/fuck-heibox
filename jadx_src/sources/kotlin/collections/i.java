package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.b2;
import kotlin.e2;

/* JADX INFO: compiled from: ArrayDeque.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.u0(version = "1.4")
@e2(markerClass = {kotlin.q.class})
public final class i<E> extends d<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    public static final a f124618e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private static final Object[] f124619f = new Object[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f124620g = 2147483639;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f124621h = 10;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f124622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private Object[] f124623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f124624d;

    /* JADX INFO: compiled from: ArrayDeque.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        public final int a(int i10, int i11) {
            int i12 = i10 + (i10 >> 1);
            if (i12 - i11 < 0) {
                i12 = i11;
            }
            if (i12 - i.f124620g <= 0) {
                return i12;
            }
            if (i11 > i.f124620g) {
                return Integer.MAX_VALUE;
            }
            return i.f124620g;
        }
    }

    public i() {
        this.f124623c = f124619f;
    }

    public i(int i10) {
        Object[] objArr;
        if (i10 == 0) {
            objArr = f124619f;
        } else {
            if (i10 <= 0) {
                throw new IllegalArgumentException("Illegal Capacity: " + i10);
            }
            objArr = new Object[i10];
        }
        this.f124623c = objArr;
    }

    public i(@dl.d Collection<? extends E> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        Object[] array = elements.toArray(new Object[0]);
        this.f124623c = array;
        this.f124624d = array.length;
        if (array.length == 0) {
            this.f124623c = f124619f;
        }
    }

    private final void e(int i10, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.f124623c.length;
        while (i10 < length && it.hasNext()) {
            this.f124623c[i10] = it.next();
            i10++;
        }
        int i11 = this.f124622b;
        for (int i12 = 0; i12 < i11 && it.hasNext(); i12++) {
            this.f124623c[i12] = it.next();
        }
        this.f124624d = size() + collection.size();
    }

    private final void g(int i10) {
        Object[] objArr = new Object[i10];
        Object[] objArr2 = this.f124623c;
        m.c1(objArr2, objArr, 0, this.f124622b, objArr2.length);
        Object[] objArr3 = this.f124623c;
        int length = objArr3.length;
        int i11 = this.f124622b;
        m.c1(objArr3, objArr, length - i11, 0, i11);
        this.f124622b = 0;
        this.f124623c = objArr;
    }

    private final int h(int i10) {
        return i10 == 0 ? ArraysKt___ArraysKt.Xe(this.f124623c) : i10 - 1;
    }

    private final void i(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f124623c;
        if (i10 <= objArr.length) {
            return;
        }
        if (objArr == f124619f) {
            this.f124623c = new Object[fi.u.u(i10, 10)];
        } else {
            g(f124618e.a(objArr.length, i10));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean j(yh.l<? super E, Boolean> lVar) {
        int iY;
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty()) {
            if ((this.f124623c.length == 0) == false) {
                int iY2 = y(this.f124622b + size());
                int i10 = this.f124622b;
                if (i10 < iY2) {
                    iY = i10;
                    while (i10 < iY2) {
                        Object obj = this.f124623c[i10];
                        if (lVar.invoke(obj).booleanValue()) {
                            this.f124623c[iY] = obj;
                            iY++;
                        } else {
                            z10 = true;
                        }
                        i10++;
                    }
                    m.n2(this.f124623c, null, iY, iY2);
                } else {
                    int length = this.f124623c.length;
                    boolean z11 = false;
                    int i11 = i10;
                    while (i10 < length) {
                        Object[] objArr = this.f124623c;
                        Object obj2 = objArr[i10];
                        objArr[i10] = null;
                        if (lVar.invoke(obj2).booleanValue()) {
                            this.f124623c[i11] = obj2;
                            i11++;
                        } else {
                            z11 = true;
                        }
                        i10++;
                    }
                    iY = y(i11);
                    for (int i12 = 0; i12 < iY2; i12++) {
                        Object[] objArr2 = this.f124623c;
                        Object obj3 = objArr2[i12];
                        objArr2[i12] = null;
                        if (lVar.invoke(obj3).booleanValue()) {
                            this.f124623c[iY] = obj3;
                            iY = o(iY);
                        } else {
                            z11 = true;
                        }
                    }
                    z10 = z11;
                }
                if (z10) {
                    this.f124624d = x(iY - this.f124622b);
                }
            }
        }
        return z10;
    }

    private final int o(int i10) {
        if (i10 == ArraysKt___ArraysKt.Xe(this.f124623c)) {
            return 0;
        }
        return i10 + 1;
    }

    @sh.f
    private final E s(int i10) {
        return (E) this.f124623c[i10];
    }

    @sh.f
    private final int u(int i10) {
        return y(this.f124622b + i10);
    }

    private final int x(int i10) {
        return i10 < 0 ? i10 + this.f124623c.length : i10;
    }

    private final int y(int i10) {
        Object[] objArr = this.f124623c;
        return i10 >= objArr.length ? i10 - objArr.length : i10;
    }

    @dl.e
    public final E A() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    @dl.e
    public final E B() {
        if (isEmpty()) {
            return null;
        }
        return removeLast();
    }

    @dl.d
    public final Object[] D() {
        return toArray();
    }

    @dl.d
    public final <T> T[] E(@dl.d T[] array) {
        kotlin.jvm.internal.f0.p(array, "array");
        return (T[]) toArray(array);
    }

    @Override // kotlin.collections.d
    public int a() {
        return this.f124624d;
    }

    @Override // kotlin.collections.d, java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        b.Companion.c(i10, size());
        if (i10 == size()) {
            addLast(e10);
            return;
        }
        if (i10 == 0) {
            addFirst(e10);
            return;
        }
        i(size() + 1);
        int iY = y(this.f124622b + i10);
        if (i10 < ((size() + 1) >> 1)) {
            int iH = h(iY);
            int iH2 = h(this.f124622b);
            int i11 = this.f124622b;
            if (iH >= i11) {
                Object[] objArr = this.f124623c;
                objArr[iH2] = objArr[i11];
                m.c1(objArr, objArr, i11, i11 + 1, iH + 1);
            } else {
                Object[] objArr2 = this.f124623c;
                m.c1(objArr2, objArr2, i11 - 1, i11, objArr2.length);
                Object[] objArr3 = this.f124623c;
                objArr3[objArr3.length - 1] = objArr3[0];
                m.c1(objArr3, objArr3, 0, 1, iH + 1);
            }
            this.f124623c[iH] = e10;
            this.f124622b = iH2;
        } else {
            int iY2 = y(this.f124622b + size());
            if (iY < iY2) {
                Object[] objArr4 = this.f124623c;
                m.c1(objArr4, objArr4, iY + 1, iY, iY2);
            } else {
                Object[] objArr5 = this.f124623c;
                m.c1(objArr5, objArr5, 1, 0, iY2);
                Object[] objArr6 = this.f124623c;
                objArr6[0] = objArr6[objArr6.length - 1];
                m.c1(objArr6, objArr6, iY + 1, iY, objArr6.length - 1);
            }
            this.f124623c[iY] = e10;
        }
        this.f124624d = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        addLast(e10);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, @dl.d Collection<? extends E> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        b.Companion.c(i10, size());
        if (elements.isEmpty()) {
            return false;
        }
        if (i10 == size()) {
            return addAll(elements);
        }
        i(size() + elements.size());
        int iY = y(this.f124622b + size());
        int iY2 = y(this.f124622b + i10);
        int size = elements.size();
        if (i10 < ((size() + 1) >> 1)) {
            int i11 = this.f124622b;
            int length = i11 - size;
            if (iY2 < i11) {
                Object[] objArr = this.f124623c;
                m.c1(objArr, objArr, length, i11, objArr.length);
                if (size >= iY2) {
                    Object[] objArr2 = this.f124623c;
                    m.c1(objArr2, objArr2, objArr2.length - size, 0, iY2);
                } else {
                    Object[] objArr3 = this.f124623c;
                    m.c1(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f124623c;
                    m.c1(objArr4, objArr4, 0, size, iY2);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.f124623c;
                m.c1(objArr5, objArr5, length, i11, iY2);
            } else {
                Object[] objArr6 = this.f124623c;
                length += objArr6.length;
                int i12 = iY2 - i11;
                int length2 = objArr6.length - length;
                if (length2 >= i12) {
                    m.c1(objArr6, objArr6, length, i11, iY2);
                } else {
                    m.c1(objArr6, objArr6, length, i11, i11 + length2);
                    Object[] objArr7 = this.f124623c;
                    m.c1(objArr7, objArr7, 0, this.f124622b + length2, iY2);
                }
            }
            this.f124622b = length;
            e(x(iY2 - size), elements);
        } else {
            int i13 = iY2 + size;
            if (iY2 < iY) {
                int i14 = size + iY;
                Object[] objArr8 = this.f124623c;
                if (i14 <= objArr8.length) {
                    m.c1(objArr8, objArr8, i13, iY2, iY);
                } else if (i13 >= objArr8.length) {
                    m.c1(objArr8, objArr8, i13 - objArr8.length, iY2, iY);
                } else {
                    int length3 = iY - (i14 - objArr8.length);
                    m.c1(objArr8, objArr8, 0, length3, iY);
                    Object[] objArr9 = this.f124623c;
                    m.c1(objArr9, objArr9, i13, iY2, length3);
                }
            } else {
                Object[] objArr10 = this.f124623c;
                m.c1(objArr10, objArr10, size, 0, iY);
                Object[] objArr11 = this.f124623c;
                if (i13 >= objArr11.length) {
                    m.c1(objArr11, objArr11, i13 - objArr11.length, iY2, objArr11.length);
                } else {
                    m.c1(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f124623c;
                    m.c1(objArr12, objArr12, i13, iY2, objArr12.length - size);
                }
            }
            e(iY2, elements);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(@dl.d Collection<? extends E> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        i(size() + elements.size());
        e(y(this.f124622b + size()), elements);
        return true;
    }

    public final void addFirst(E e10) {
        i(size() + 1);
        int iH = h(this.f124622b);
        this.f124622b = iH;
        this.f124623c[iH] = e10;
        this.f124624d = size() + 1;
    }

    public final void addLast(E e10) {
        i(size() + 1);
        this.f124623c[y(this.f124622b + size())] = e10;
        this.f124624d = size() + 1;
    }

    @Override // kotlin.collections.d
    public E b(int i10) {
        b.Companion.b(i10, size());
        if (i10 == CollectionsKt__CollectionsKt.G(this)) {
            return removeLast();
        }
        if (i10 == 0) {
            return removeFirst();
        }
        int iY = y(this.f124622b + i10);
        E e10 = (E) this.f124623c[iY];
        if (i10 < (size() >> 1)) {
            int i11 = this.f124622b;
            if (iY >= i11) {
                Object[] objArr = this.f124623c;
                m.c1(objArr, objArr, i11 + 1, i11, iY);
            } else {
                Object[] objArr2 = this.f124623c;
                m.c1(objArr2, objArr2, 1, 0, iY);
                Object[] objArr3 = this.f124623c;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i12 = this.f124622b;
                m.c1(objArr3, objArr3, i12 + 1, i12, objArr3.length - 1);
            }
            Object[] objArr4 = this.f124623c;
            int i13 = this.f124622b;
            objArr4[i13] = null;
            this.f124622b = o(i13);
        } else {
            int iY2 = y(this.f124622b + CollectionsKt__CollectionsKt.G(this));
            if (iY <= iY2) {
                Object[] objArr5 = this.f124623c;
                m.c1(objArr5, objArr5, iY, iY + 1, iY2 + 1);
            } else {
                Object[] objArr6 = this.f124623c;
                m.c1(objArr6, objArr6, iY, iY + 1, objArr6.length);
                Object[] objArr7 = this.f124623c;
                objArr7[objArr7.length - 1] = objArr7[0];
                m.c1(objArr7, objArr7, 0, 1, iY2 + 1);
            }
            this.f124623c[iY2] = null;
        }
        this.f124624d = size() - 1;
        return e10;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        int iY = y(this.f124622b + size());
        int i10 = this.f124622b;
        if (i10 < iY) {
            m.n2(this.f124623c, null, i10, iY);
        } else if (!isEmpty()) {
            Object[] objArr = this.f124623c;
            m.n2(objArr, null, this.f124622b, objArr.length);
            m.n2(this.f124623c, null, 0, iY);
        }
        this.f124622b = 0;
        this.f124624d = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final E first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.f124623c[this.f124622b];
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        b.Companion.b(i10, size());
        return (E) this.f124623c[y(this.f124622b + i10)];
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int i10;
        int iY = y(this.f124622b + size());
        int length = this.f124622b;
        if (length < iY) {
            while (length < iY) {
                if (kotlin.jvm.internal.f0.g(obj, this.f124623c[length])) {
                    i10 = this.f124622b;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iY) {
            return -1;
        }
        int length2 = this.f124623c.length;
        while (length < length2) {
            if (kotlin.jvm.internal.f0.g(obj, this.f124623c[length])) {
                i10 = this.f124622b;
            } else {
                length++;
            }
        }
        for (int i11 = 0; i11 < iY; i11++) {
            if (kotlin.jvm.internal.f0.g(obj, this.f124623c[i11])) {
                length = i11 + this.f124623c.length;
                i10 = this.f124622b;
            }
        }
        return -1;
        return length - i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    @dl.e
    public final E l() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.f124623c[this.f124622b];
    }

    public final E last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.f124623c[y(this.f124622b + CollectionsKt__CollectionsKt.G(this))];
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int iXe;
        int i10;
        int iY = y(this.f124622b + size());
        int i11 = this.f124622b;
        if (i11 < iY) {
            iXe = iY - 1;
            if (i11 <= iXe) {
                while (!kotlin.jvm.internal.f0.g(obj, this.f124623c[iXe])) {
                    if (iXe != i11) {
                        iXe--;
                    }
                }
                i10 = this.f124622b;
                return iXe - i10;
            }
            return -1;
        }
        if (i11 > iY) {
            for (int i12 = iY - 1; -1 < i12; i12--) {
                if (kotlin.jvm.internal.f0.g(obj, this.f124623c[i12])) {
                    iXe = i12 + this.f124623c.length;
                    i10 = this.f124622b;
                    return iXe - i10;
                }
            }
            iXe = ArraysKt___ArraysKt.Xe(this.f124623c);
            int i13 = this.f124622b;
            if (i13 <= iXe) {
                while (!kotlin.jvm.internal.f0.g(obj, this.f124623c[iXe])) {
                    if (iXe != i13) {
                        iXe--;
                    }
                }
                i10 = this.f124622b;
                return iXe - i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(@dl.d Collection<? extends Object> elements) {
        int iY;
        kotlin.jvm.internal.f0.p(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty()) {
            if ((this.f124623c.length == 0) == false) {
                int iY2 = y(this.f124622b + size());
                int i10 = this.f124622b;
                if (i10 < iY2) {
                    iY = i10;
                    while (i10 < iY2) {
                        Object obj = this.f124623c[i10];
                        if (!elements.contains(obj)) {
                            this.f124623c[iY] = obj;
                            iY++;
                        } else {
                            z10 = true;
                        }
                        i10++;
                    }
                    m.n2(this.f124623c, null, iY, iY2);
                } else {
                    int length = this.f124623c.length;
                    boolean z11 = false;
                    int i11 = i10;
                    while (i10 < length) {
                        Object[] objArr = this.f124623c;
                        Object obj2 = objArr[i10];
                        objArr[i10] = null;
                        if (!elements.contains(obj2)) {
                            this.f124623c[i11] = obj2;
                            i11++;
                        } else {
                            z11 = true;
                        }
                        i10++;
                    }
                    iY = y(i11);
                    for (int i12 = 0; i12 < iY2; i12++) {
                        Object[] objArr2 = this.f124623c;
                        Object obj3 = objArr2[i12];
                        objArr2[i12] = null;
                        if (!elements.contains(obj3)) {
                            this.f124623c[iY] = obj3;
                            iY = o(iY);
                        } else {
                            z11 = true;
                        }
                    }
                    z10 = z11;
                }
                if (z10) {
                    this.f124624d = x(iY - this.f124622b);
                }
            }
        }
        return z10;
    }

    public final E removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        Object[] objArr = this.f124623c;
        int i10 = this.f124622b;
        E e10 = (E) objArr[i10];
        objArr[i10] = null;
        this.f124622b = o(i10);
        this.f124624d = size() - 1;
        return e10;
    }

    public final E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        int iY = y(this.f124622b + CollectionsKt__CollectionsKt.G(this));
        Object[] objArr = this.f124623c;
        E e10 = (E) objArr[iY];
        objArr[iY] = null;
        this.f124624d = size() - 1;
        return e10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(@dl.d Collection<? extends Object> elements) {
        int iY;
        kotlin.jvm.internal.f0.p(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty()) {
            if ((this.f124623c.length == 0) == false) {
                int iY2 = y(this.f124622b + size());
                int i10 = this.f124622b;
                if (i10 < iY2) {
                    iY = i10;
                    while (i10 < iY2) {
                        Object obj = this.f124623c[i10];
                        if (elements.contains(obj)) {
                            this.f124623c[iY] = obj;
                            iY++;
                        } else {
                            z10 = true;
                        }
                        i10++;
                    }
                    m.n2(this.f124623c, null, iY, iY2);
                } else {
                    int length = this.f124623c.length;
                    boolean z11 = false;
                    int i11 = i10;
                    while (i10 < length) {
                        Object[] objArr = this.f124623c;
                        Object obj2 = objArr[i10];
                        objArr[i10] = null;
                        if (elements.contains(obj2)) {
                            this.f124623c[i11] = obj2;
                            i11++;
                        } else {
                            z11 = true;
                        }
                        i10++;
                    }
                    iY = y(i11);
                    for (int i12 = 0; i12 < iY2; i12++) {
                        Object[] objArr2 = this.f124623c;
                        Object obj3 = objArr2[i12];
                        objArr2[i12] = null;
                        if (elements.contains(obj3)) {
                            this.f124623c[iY] = obj3;
                            iY = o(iY);
                        } else {
                            z11 = true;
                        }
                    }
                    z10 = z11;
                }
                if (z10) {
                    this.f124624d = x(iY - this.f124622b);
                }
            }
        }
        return z10;
    }

    @Override // kotlin.collections.d, java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        b.Companion.b(i10, size());
        int iY = y(this.f124622b + i10);
        Object[] objArr = this.f124623c;
        E e11 = (E) objArr[iY];
        objArr[iY] = e10;
        return e11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @dl.d
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @dl.d
    public <T> T[] toArray(@dl.d T[] array) {
        kotlin.jvm.internal.f0.p(array, "array");
        if (array.length < size()) {
            array = (T[]) k.a(array, size());
        }
        int iY = y(this.f124622b + size());
        int i10 = this.f124622b;
        if (i10 < iY) {
            m.l1(this.f124623c, array, 0, i10, iY, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr = this.f124623c;
            m.c1(objArr, array, 0, this.f124622b, objArr.length);
            Object[] objArr2 = this.f124623c;
            m.c1(objArr2, array, objArr2.length - this.f124622b, 0, iY);
        }
        if (array.length > size()) {
            array[size()] = null;
        }
        return array;
    }

    public final void v(@dl.d yh.p<? super Integer, ? super Object[], b2> structure) {
        int i10;
        kotlin.jvm.internal.f0.p(structure, "structure");
        structure.invoke(Integer.valueOf((isEmpty() || (i10 = this.f124622b) < y(this.f124622b + size())) ? this.f124622b : i10 - this.f124623c.length), toArray());
    }

    @dl.e
    public final E w() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.f124623c[y(this.f124622b + CollectionsKt__CollectionsKt.G(this))];
    }
}
