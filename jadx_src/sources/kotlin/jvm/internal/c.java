package kotlin.jvm.internal;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: ArrayIterators.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class c extends kotlin.collections.q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final char[] f124907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f124908c;

    public c(@dl.d char[] array) {
        f0.p(array, "array");
        this.f124907b = array;
    }

    @Override // kotlin.collections.q
    public char b() {
        try {
            char[] cArr = this.f124907b;
            int i10 = this.f124908c;
            this.f124908c = i10 + 1;
            return cArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f124908c--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f124908c < this.f124907b.length;
    }
}
