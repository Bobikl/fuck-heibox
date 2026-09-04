package kotlin.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: SlidingWindow.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a1<T> extends b<T> implements RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Object[] f124560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f124561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f124562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f124563e;

    /* JADX INFO: compiled from: SlidingWindow.kt */
    public static final class a extends kotlin.collections.a<T> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f124564d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f124565e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ a1<T> f124566f;

        a(a1<T> a1Var) {
            this.f124566f = a1Var;
            this.f124564d = a1Var.size();
            this.f124565e = ((a1) a1Var).f124562d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.collections.a
        protected void a() {
            if (this.f124564d == 0) {
                b();
                return;
            }
            c(((a1) this.f124566f).f124560b[this.f124565e]);
            this.f124565e = (this.f124565e + 1) % ((a1) this.f124566f).f124561c;
            this.f124564d--;
        }
    }

    public a1(int i10) {
        this(new Object[i10], 0);
    }

    public a1(@dl.d Object[] buffer, int i10) {
        kotlin.jvm.internal.f0.p(buffer, "buffer");
        this.f124560b = buffer;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("ring buffer filled size should not be negative but it is " + i10).toString());
        }
        if (i10 <= buffer.length) {
            this.f124561c = buffer.length;
            this.f124563e = i10;
            return;
        }
        throw new IllegalArgumentException(("ring buffer filled size: " + i10 + " cannot be larger than the buffer size: " + buffer.length).toString());
    }

    private final int i(int i10, int i11) {
        return (i10 + i11) % this.f124561c;
    }

    public final void g(T t10) {
        if (j()) {
            throw new IllegalStateException("ring buffer is full");
        }
        this.f124560b[(this.f124562d + size()) % this.f124561c] = t10;
        this.f124563e = size() + 1;
    }

    @Override // kotlin.collections.b, java.util.List
    public T get(int i10) {
        b.Companion.b(i10, size());
        return (T) this.f124560b[(this.f124562d + i10) % this.f124561c];
    }

    @Override // kotlin.collections.b, kotlin.collections.AbstractCollection
    public int getSize() {
        return this.f124563e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    public final a1<T> h(int i10) {
        Object[] array;
        int i11 = this.f124561c;
        int iB = fi.u.B(i11 + (i11 >> 1) + 1, i10);
        if (this.f124562d == 0) {
            array = Arrays.copyOf(this.f124560b, iB);
            kotlin.jvm.internal.f0.o(array, "copyOf(this, newSize)");
        } else {
            array = toArray(new Object[iB]);
        }
        return new a1<>(array, size());
    }

    @Override // kotlin.collections.b, kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @dl.d
    public Iterator<T> iterator() {
        return new a(this);
    }

    public final boolean j() {
        return size() == this.f124561c;
    }

    public final void l(int i10) {
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("n shouldn't be negative but it is " + i10).toString());
        }
        if (!(i10 <= size())) {
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = " + i10 + ", size = " + size()).toString());
        }
        if (i10 > 0) {
            int i11 = this.f124562d;
            int i12 = (i11 + i10) % this.f124561c;
            if (i11 > i12) {
                m.n2(this.f124560b, null, i11, this.f124561c);
                m.n2(this.f124560b, null, 0, i12);
            } else {
                m.n2(this.f124560b, null, i11, i12);
            }
            this.f124562d = i12;
            this.f124563e = size() - i10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    @dl.d
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    @dl.d
    public <T> T[] toArray(@dl.d T[] array) {
        kotlin.jvm.internal.f0.p(array, "array");
        if (array.length < size()) {
            array = (T[]) Arrays.copyOf(array, size());
            kotlin.jvm.internal.f0.o(array, "copyOf(this, newSize)");
        }
        int size = size();
        int i10 = 0;
        int i11 = 0;
        for (int i12 = this.f124562d; i11 < size && i12 < this.f124561c; i12++) {
            array[i11] = this.f124560b[i12];
            i11++;
        }
        while (i11 < size) {
            array[i11] = this.f124560b[i10];
            i11++;
            i10++;
        }
        if (array.length > size()) {
            array[size()] = null;
        }
        return array;
    }
}
