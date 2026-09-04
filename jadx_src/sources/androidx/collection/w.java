package androidx.collection;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: IndexBasedArrayIterator.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.t0({"SMAP\nIndexBasedArrayIterator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IndexBasedArrayIterator.kt\nandroidx/collection/IndexBasedArrayIterator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,48:1\n1#2:49\n*E\n"})
public abstract class w<T> implements Iterator<T>, zh.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f3723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f3724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f3725d;

    public w(int i10) {
        this.f3723b = i10;
    }

    protected abstract T a(int i10);

    protected abstract void b(int i10);

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f3724c < this.f3723b;
    }

    @Override // java.util.Iterator
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        T tA = a(this.f3724c);
        this.f3724c++;
        this.f3725d = true;
        return tA;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.f3725d) {
            throw new IllegalStateException("Call next() before removing an element.".toString());
        }
        int i10 = this.f3724c - 1;
        this.f3724c = i10;
        b(i10);
        this.f3723b--;
        this.f3725d = false;
    }
}
