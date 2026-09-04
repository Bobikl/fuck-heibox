package kotlin.jvm.internal;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: ArrayIterators.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class f extends kotlin.collections.k0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final int[] f124919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f124920c;

    public f(@dl.d int[] array) {
        f0.p(array, "array");
        this.f124919b = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f124920c < this.f124919b.length;
    }

    @Override // kotlin.collections.k0
    public int nextInt() {
        try {
            int[] iArr = this.f124919b;
            int i10 = this.f124920c;
            this.f124920c = i10 + 1;
            return iArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f124920c--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }
}
