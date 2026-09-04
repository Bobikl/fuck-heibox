package kotlin.jvm.internal;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: ArrayIterators.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a extends kotlin.collections.o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final boolean[] f124903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f124904c;

    public a(@dl.d boolean[] array) {
        f0.p(array, "array");
        this.f124903b = array;
    }

    @Override // kotlin.collections.o
    public boolean b() {
        try {
            boolean[] zArr = this.f124903b;
            int i10 = this.f124904c;
            this.f124904c = i10 + 1;
            return zArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f124904c--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f124904c < this.f124903b.length;
    }
}
