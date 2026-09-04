package kotlin.collections;

import java.util.Iterator;

/* JADX INFO: compiled from: PrimitiveIterators.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class l0 implements Iterator<Long>, zh.a {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    @dl.d
    public final Long next() {
        return Long.valueOf(nextLong());
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Long next() {
        return Long.valueOf(nextLong());
    }

    public abstract long nextLong();

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
