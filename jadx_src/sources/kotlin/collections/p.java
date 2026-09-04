package kotlin.collections;

import java.util.Iterator;

/* JADX INFO: compiled from: PrimitiveIterators.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class p implements Iterator<Byte>, zh.a {
    @dl.d
    public final Byte a() {
        return Byte.valueOf(l());
    }

    public abstract byte l();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Byte next() {
        return Byte.valueOf(l());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
