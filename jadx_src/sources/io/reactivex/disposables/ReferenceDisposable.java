package io.reactivex.disposables;

import java.util.concurrent.atomic.AtomicReference;
import jh.e;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ReferenceDisposable<T> extends AtomicReference<T> implements b {
    private static final long serialVersionUID = 6537757548749041217L;

    ReferenceDisposable(T t10) {
        super(io.reactivex.internal.functions.a.g(t10, "value is null"));
    }

    protected abstract void a(@e T t10);

    @Override // io.reactivex.disposables.b
    public final void dispose() {
        T andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        a(andSet);
    }

    @Override // io.reactivex.disposables.b
    public final boolean isDisposed() {
        return get() == null;
    }
}
