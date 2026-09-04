package kotlin.collections;

import java.util.Iterator;

/* JADX INFO: compiled from: PrimitiveIterators.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class o implements Iterator<Boolean>, zh.a {
    @dl.d
    public final Boolean a() {
        return Boolean.valueOf(b());
    }

    public abstract boolean b();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Boolean next() {
        return Boolean.valueOf(b());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
