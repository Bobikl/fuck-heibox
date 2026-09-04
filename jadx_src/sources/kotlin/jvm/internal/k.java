package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.f1;

/* JADX INFO: compiled from: ArrayIterators.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class k extends f1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final short[] f124931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f124932c;

    public k(@dl.d short[] array) {
        f0.p(array, "array");
        this.f124931b = array;
    }

    @Override // kotlin.collections.f1
    public short b() {
        try {
            short[] sArr = this.f124931b;
            int i10 = this.f124932c;
            this.f124932c = i10 + 1;
            return sArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f124932c--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f124932c < this.f124931b.length;
    }
}
