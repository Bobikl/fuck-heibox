package kotlin.jvm.internal;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: ArrayIterators.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b extends kotlin.collections.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final byte[] f124905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f124906c;

    public b(@dl.d byte[] array) {
        f0.p(array, "array");
        this.f124905b = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f124906c < this.f124905b.length;
    }

    @Override // kotlin.collections.p
    public byte l() {
        try {
            byte[] bArr = this.f124905b;
            int i10 = this.f124906c;
            this.f124906c = i10 + 1;
            return bArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f124906c--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }
}
