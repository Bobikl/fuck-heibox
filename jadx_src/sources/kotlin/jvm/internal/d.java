package kotlin.jvm.internal;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: ArrayIterators.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class d extends kotlin.collections.a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final double[] f124909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f124910c;

    public d(@dl.d double[] array) {
        f0.p(array, "array");
        this.f124909b = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f124910c < this.f124909b.length;
    }

    @Override // kotlin.collections.a0
    public double nextDouble() {
        try {
            double[] dArr = this.f124909b;
            int i10 = this.f124910c;
            this.f124910c = i10 + 1;
            return dArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f124910c--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }
}
