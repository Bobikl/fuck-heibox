package kotlin;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.collections.ArraysKt___ArraysKt;

/* JADX INFO: compiled from: UByteArray.kt */
/* JADX INFO: loaded from: classes5.dex */
@u0(version = "1.3")
@s
@xh.f
public final class k1 implements Collection<j1>, zh.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final byte[] f125005b;

    /* JADX INFO: compiled from: UByteArray.kt */
    public static final class a implements Iterator<j1>, zh.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final byte[] f125006b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f125007c;

        public a(@dl.d byte[] array) {
            kotlin.jvm.internal.f0.p(array, "array");
            this.f125006b = array;
        }

        public byte a() {
            int i10 = this.f125007c;
            byte[] bArr = this.f125006b;
            if (i10 >= bArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f125007c));
            }
            this.f125007c = i10 + 1;
            return j1.h(bArr[i10]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f125007c < this.f125006b.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ j1 next() {
            return j1.b(a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @r0
    private /* synthetic */ k1(byte[] bArr) {
        this.f125005b = bArr;
    }

    @dl.d
    public static Iterator<j1> A(byte[] bArr) {
        return new a(bArr);
    }

    public static final void B(byte[] bArr, int i10, byte b10) {
        bArr[i10] = b10;
    }

    public static String D(byte[] bArr) {
        return "UByteArray(storage=" + Arrays.toString(bArr) + ')';
    }

    public static final /* synthetic */ k1 b(byte[] bArr) {
        return new k1(bArr);
    }

    @dl.d
    public static byte[] e(int i10) {
        return g(new byte[i10]);
    }

    @dl.d
    @r0
    public static byte[] g(@dl.d byte[] storage) {
        kotlin.jvm.internal.f0.p(storage, "storage");
        return storage;
    }

    public static boolean i(byte[] bArr, byte b10) {
        return ArraysKt___ArraysKt.N8(bArr, b10);
    }

    public static boolean j(byte[] bArr, @dl.d Collection<j1> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        if (!elements.isEmpty()) {
            for (Object obj : elements) {
                if (!((obj instanceof j1) && ArraysKt___ArraysKt.N8(bArr, ((j1) obj).o0()))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean l(byte[] bArr, Object obj) {
        return (obj instanceof k1) && kotlin.jvm.internal.f0.g(bArr, ((k1) obj).E());
    }

    public static final boolean o(byte[] bArr, byte[] bArr2) {
        return kotlin.jvm.internal.f0.g(bArr, bArr2);
    }

    public static final byte s(byte[] bArr, int i10) {
        return j1.h(bArr[i10]);
    }

    public static int v(byte[] bArr) {
        return bArr.length;
    }

    @r0
    public static /* synthetic */ void w() {
    }

    public static int x(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    public static boolean y(byte[] bArr) {
        return bArr.length == 0;
    }

    public final /* synthetic */ byte[] E() {
        return this.f125005b;
    }

    public boolean a(byte b10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(j1 j1Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends j1> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof j1) {
            return h(((j1) obj).o0());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(@dl.d Collection<? extends Object> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        return j(this.f125005b, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return l(this.f125005b, obj);
    }

    public boolean h(byte b10) {
        return i(this.f125005b, b10);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return x(this.f125005b);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return y(this.f125005b);
    }

    @Override // java.util.Collection, java.lang.Iterable
    @dl.d
    public Iterator<j1> iterator() {
        return A(this.f125005b);
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
        return D(this.f125005b);
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public int size() {
        return v(this.f125005b);
    }
}
