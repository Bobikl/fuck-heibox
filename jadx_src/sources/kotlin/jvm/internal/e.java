package kotlin.jvm.internal;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: ArrayIterators.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class e extends kotlin.collections.c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final float[] f124916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f124917c;

    public e(@dl.d float[] array) {
        f0.p(array, "array");
        this.f124916b = array;
    }

    @Override // kotlin.collections.c0
    public float b() {
        try {
            float[] fArr = this.f124916b;
            int i10 = this.f124917c;
            this.f124917c = i10 + 1;
            return fArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f124917c--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f124917c < this.f124916b.length;
    }
}
