package kotlin.collections;

import java.util.Iterator;

/* JADX INFO: compiled from: PrimitiveIterators.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a0 implements Iterator<Double>, zh.a {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    @dl.d
    public final Double next() {
        return Double.valueOf(nextDouble());
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Double next() {
        return Double.valueOf(nextDouble());
    }

    public abstract double nextDouble();

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
