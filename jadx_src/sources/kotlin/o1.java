package kotlin;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.collections.ArraysKt___ArraysKt;

/* JADX INFO: compiled from: UIntArray.kt */
/* JADX INFO: loaded from: classes5.dex */
@u0(version = "1.3")
@s
@xh.f
public final class o1 implements Collection<n1>, zh.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final int[] f125014b;

    /* JADX INFO: compiled from: UIntArray.kt */
    public static final class a implements Iterator<n1>, zh.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final int[] f125015b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f125016c;

        public a(@dl.d int[] array) {
            kotlin.jvm.internal.f0.p(array, "array");
            this.f125015b = array;
        }

        public int a() {
            int i10 = this.f125016c;
            int[] iArr = this.f125015b;
            if (i10 >= iArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f125016c));
            }
            this.f125016c = i10 + 1;
            return n1.h(iArr[i10]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f125016c < this.f125015b.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ n1 next() {
            return n1.b(a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @r0
    private /* synthetic */ o1(int[] iArr) {
        this.f125014b = iArr;
    }

    @dl.d
    public static Iterator<n1> A(int[] iArr) {
        return new a(iArr);
    }

    public static final void B(int[] iArr, int i10, int i11) {
        iArr[i10] = i11;
    }

    public static String D(int[] iArr) {
        return "UIntArray(storage=" + Arrays.toString(iArr) + ')';
    }

    public static final /* synthetic */ o1 b(int[] iArr) {
        return new o1(iArr);
    }

    @dl.d
    public static int[] e(int i10) {
        return g(new int[i10]);
    }

    @dl.d
    @r0
    public static int[] g(@dl.d int[] storage) {
        kotlin.jvm.internal.f0.p(storage, "storage");
        return storage;
    }

    public static boolean i(int[] iArr, int i10) {
        return ArraysKt___ArraysKt.R8(iArr, i10);
    }

    public static boolean j(int[] iArr, @dl.d Collection<n1> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        if (!elements.isEmpty()) {
            for (Object obj : elements) {
                if (!((obj instanceof n1) && ArraysKt___ArraysKt.R8(iArr, ((n1) obj).q0()))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean l(int[] iArr, Object obj) {
        return (obj instanceof o1) && kotlin.jvm.internal.f0.g(iArr, ((o1) obj).E());
    }

    public static final boolean o(int[] iArr, int[] iArr2) {
        return kotlin.jvm.internal.f0.g(iArr, iArr2);
    }

    public static final int s(int[] iArr, int i10) {
        return n1.h(iArr[i10]);
    }

    public static int v(int[] iArr) {
        return iArr.length;
    }

    @r0
    public static /* synthetic */ void w() {
    }

    public static int x(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    public static boolean y(int[] iArr) {
        return iArr.length == 0;
    }

    public final /* synthetic */ int[] E() {
        return this.f125014b;
    }

    public boolean a(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(n1 n1Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends n1> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof n1) {
            return h(((n1) obj).q0());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(@dl.d Collection<? extends Object> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        return j(this.f125014b, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return l(this.f125014b, obj);
    }

    public boolean h(int i10) {
        return i(this.f125014b, i10);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return x(this.f125014b);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return y(this.f125014b);
    }

    @Override // java.util.Collection, java.lang.Iterable
    @dl.d
    public Iterator<n1> iterator() {
        return A(this.f125014b);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.t.a(this);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.f0.p(array, "array");
        return (T[]) kotlin.jvm.internal.t.b(this, array);
    }

    public String toString() {
        return D(this.f125014b);
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public int size() {
        return v(this.f125014b);
    }
}
