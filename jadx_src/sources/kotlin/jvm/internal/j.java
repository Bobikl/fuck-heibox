package kotlin.jvm.internal;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: ArrayIterators.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class j extends kotlin.collections.l0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final long[] f124928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f124929c;

    public j(@dl.d long[] array) {
        f0.p(array, "array");
        this.f124928b = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f124929c < this.f124928b.length;
    }

    @Override // kotlin.collections.l0
    public long nextLong() {
        try {
            long[] jArr = this.f124928b;
            int i10 = this.f124929c;
            this.f124929c = i10 + 1;
            return jArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f124929c--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }
}
