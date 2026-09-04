package io.reactivex.internal.subscriptions;

import java.util.concurrent.atomic.AtomicLong;
import lh.l;

/* JADX INFO: loaded from: classes5.dex */
public abstract class BasicQueueSubscription<T> extends AtomicLong implements l<T> {
    private static final long serialVersionUID = -6671519529404341862L;

    @Override // lh.o
    public final boolean offer(T t10) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // lh.o
    public final boolean offer(T t10, T t11) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
