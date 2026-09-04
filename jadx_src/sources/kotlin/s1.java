package kotlin;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.collections.ArraysKt___ArraysKt;

/* JADX INFO: compiled from: ULongArray.kt */
/* JADX INFO: loaded from: classes5.dex */
@u0(version = "1.3")
@s
@xh.f
public final class s1 implements Collection<r1>, zh.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final long[] f128336b;

    /* JADX INFO: compiled from: ULongArray.kt */
    public static final class a implements Iterator<r1>, zh.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final long[] f128337b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f128338c;

        public a(@dl.d long[] array) {
            kotlin.jvm.internal.f0.p(array, "array");
            this.f128337b = array;
        }

        public long a() {
            int i10 = this.f128338c;
            long[] jArr = this.f128337b;
            if (i10 >= jArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f128338c));
            }
            this.f128338c = i10 + 1;
            return r1.h(jArr[i10]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f128338c < this.f128337b.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ r1 next() {
            return r1.b(a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @r0
    private /* synthetic */ s1(long[] jArr) {
        this.f128336b = jArr;
    }

    @dl.d
    public static Iterator<r1> A(long[] jArr) {
        return new a(jArr);
    }

    public static final void B(long[] jArr, int i10, long j10) {
        jArr[i10] = j10;
    }

    public static String D(long[] jArr) {
        return "ULongArray(storage=" + Arrays.toString(jArr) + ')';
    }

    public static final /* synthetic */ s1 b(long[] jArr) {
        return new s1(jArr);
    }

    @dl.d
    public static long[] e(int i10) {
        return g(new long[i10]);
    }

    @dl.d
    @r0
    public static long[] g(@dl.d long[] storage) {
        kotlin.jvm.internal.f0.p(storage, "storage");
        return storage;
    }

    public static boolean i(long[] jArr, long j10) {
        return ArraysKt___ArraysKt.S8(jArr, j10);
    }

    public static boolean j(long[] jArr, @dl.d Collection<r1> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        if (!elements.isEmpty()) {
            for (Object obj : elements) {
                if (!((obj instanceof r1) && ArraysKt___ArraysKt.S8(jArr, ((r1) obj).q0()))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean l(long[] jArr, Object obj) {
        return (obj instanceof s1) && kotlin.jvm.internal.f0.g(jArr, ((s1) obj).E());
    }

    public static final boolean o(long[] jArr, long[] jArr2) {
        return kotlin.jvm.internal.f0.g(jArr, jArr2);
    }

    public static final long s(long[] jArr, int i10) {
        return r1.h(jArr[i10]);
    }

    public static int v(long[] jArr) {
        return jArr.length;
    }

    @r0
    public static /* synthetic */ void w() {
    }

    public static int x(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    public static boolean y(long[] jArr) {
        return jArr.length == 0;
    }

    public final /* synthetic */ long[] E() {
        return this.f128336b;
    }

    public boolean a(long j10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(r1 r1Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends r1> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof r1) {
            return h(((r1) obj).q0());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(@dl.d Collection<? extends Object> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        return j(this.f128336b, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return l(this.f128336b, obj);
    }

    public boolean h(long j10) {
        return i(this.f128336b, j10);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return x(this.f128336b);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return y(this.f128336b);
    }

    @Override // java.util.Collection, java.lang.Iterable
    @dl.d
    public Iterator<r1> iterator() {
        return A(this.f128336b);
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
        return D(this.f128336b);
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public int size() {
        return v(this.f128336b);
    }
}
