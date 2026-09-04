package kotlin;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.collections.ArraysKt___ArraysKt;

/* JADX INFO: compiled from: UShortArray.kt */
/* JADX INFO: loaded from: classes5.dex */
@u0(version = "1.3")
@s
@xh.f
public final class y1 implements Collection<x1>, zh.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final short[] f128665b;

    /* JADX INFO: compiled from: UShortArray.kt */
    public static final class a implements Iterator<x1>, zh.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final short[] f128666b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f128667c;

        public a(@dl.d short[] array) {
            kotlin.jvm.internal.f0.p(array, "array");
            this.f128666b = array;
        }

        public short a() {
            int i10 = this.f128667c;
            short[] sArr = this.f128666b;
            if (i10 >= sArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f128667c));
            }
            this.f128667c = i10 + 1;
            return x1.h(sArr[i10]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f128667c < this.f128666b.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ x1 next() {
            return x1.b(a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @r0
    private /* synthetic */ y1(short[] sArr) {
        this.f128665b = sArr;
    }

    @dl.d
    public static Iterator<x1> A(short[] sArr) {
        return new a(sArr);
    }

    public static final void B(short[] sArr, int i10, short s10) {
        sArr[i10] = s10;
    }

    public static String D(short[] sArr) {
        return "UShortArray(storage=" + Arrays.toString(sArr) + ')';
    }

    public static final /* synthetic */ y1 b(short[] sArr) {
        return new y1(sArr);
    }

    @dl.d
    public static short[] e(int i10) {
        return g(new short[i10]);
    }

    @dl.d
    @r0
    public static short[] g(@dl.d short[] storage) {
        kotlin.jvm.internal.f0.p(storage, "storage");
        return storage;
    }

    public static boolean i(short[] sArr, short s10) {
        return ArraysKt___ArraysKt.U8(sArr, s10);
    }

    public static boolean j(short[] sArr, @dl.d Collection<x1> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        if (!elements.isEmpty()) {
            for (Object obj : elements) {
                if (!((obj instanceof x1) && ArraysKt___ArraysKt.U8(sArr, ((x1) obj).o0()))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean l(short[] sArr, Object obj) {
        return (obj instanceof y1) && kotlin.jvm.internal.f0.g(sArr, ((y1) obj).E());
    }

    public static final boolean o(short[] sArr, short[] sArr2) {
        return kotlin.jvm.internal.f0.g(sArr, sArr2);
    }

    public static final short s(short[] sArr, int i10) {
        return x1.h(sArr[i10]);
    }

    public static int v(short[] sArr) {
        return sArr.length;
    }

    @r0
    public static /* synthetic */ void w() {
    }

    public static int x(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    public static boolean y(short[] sArr) {
        return sArr.length == 0;
    }

    public final /* synthetic */ short[] E() {
        return this.f128665b;
    }

    public boolean a(short s10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(x1 x1Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends x1> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof x1) {
            return h(((x1) obj).o0());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(@dl.d Collection<? extends Object> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        return j(this.f128665b, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return l(this.f128665b, obj);
    }

    public boolean h(short s10) {
        return i(this.f128665b, s10);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return x(this.f128665b);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return y(this.f128665b);
    }

    @Override // java.util.Collection, java.lang.Iterable
    @dl.d
    public Iterator<x1> iterator() {
        return A(this.f128665b);
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
        return D(this.f128665b);
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public int size() {
        return v(this.f128665b);
    }
}
