package io.reactivex.internal.observers;

/* JADX INFO: compiled from: BasicQueueDisposable.java */
/* JADX INFO: loaded from: classes9.dex */
public abstract class b<T> implements lh.j<T> {
    @Override // lh.o
    public final boolean offer(T t10) {
        throw new UnsupportedOperationException("Should not be called");
    }

    @Override // lh.o
    public final boolean offer(T t10, T t11) {
        throw new UnsupportedOperationException("Should not be called");
    }
}
