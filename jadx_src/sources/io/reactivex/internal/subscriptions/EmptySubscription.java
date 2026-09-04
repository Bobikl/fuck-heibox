package io.reactivex.internal.subscriptions;

import jh.f;
import lh.l;
import org.reactivestreams.d;

/* JADX INFO: loaded from: classes5.dex */
public enum EmptySubscription implements l<Object> {
    INSTANCE;

    public static void complete(d<?> dVar) {
        dVar.onSubscribe(INSTANCE);
        dVar.onComplete();
    }

    public static void error(Throwable th2, d<?> dVar) {
        dVar.onSubscribe(INSTANCE);
        dVar.onError(th2);
    }

    @Override // org.reactivestreams.e
    public void cancel() {
    }

    @Override // lh.o
    public void clear() {
    }

    @Override // lh.o
    public boolean isEmpty() {
        return true;
    }

    @Override // lh.o
    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // lh.o
    public boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // lh.o
    @f
    public Object poll() {
        return null;
    }

    @Override // org.reactivestreams.e
    public void request(long j10) {
        SubscriptionHelper.validate(j10);
    }

    @Override // lh.k
    public int requestFusion(int i10) {
        return i10 & 2;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "EmptySubscription";
    }
}
