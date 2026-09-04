package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: ArrayIterator.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class g<T> implements Iterator<T>, zh.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final T[] f124921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f124922c;

    public g(@dl.d T[] array) {
        f0.p(array, "array");
        this.f124921b = array;
    }

    @dl.d
    public final T[] a() {
        return this.f124921b;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f124922c < this.f124921b.length;
    }

    @Override // java.util.Iterator
    public T next() {
        try {
            T[] tArr = this.f124921b;
            int i10 = this.f124922c;
            this.f124922c = i10 + 1;
            return tArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f124922c--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
