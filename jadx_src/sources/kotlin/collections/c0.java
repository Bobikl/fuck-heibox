package kotlin.collections;

import java.util.Iterator;

/* JADX INFO: compiled from: PrimitiveIterators.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class c0 implements Iterator<Float>, zh.a {
    @dl.d
    public final Float a() {
        return Float.valueOf(b());
    }

    public abstract float b();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Float next() {
        return Float.valueOf(b());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
