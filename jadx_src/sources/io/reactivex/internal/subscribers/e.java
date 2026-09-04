package io.reactivex.internal.subscribers;

/* JADX INFO: compiled from: BlockingLastSubscriber.java */
/* JADX INFO: loaded from: classes5.dex */
public final class e<T> extends c<T> {
    @Override // org.reactivestreams.d
    public void onError(Throwable th2) {
        this.f123802b = null;
        this.f123803c = th2;
        countDown();
    }

    @Override // org.reactivestreams.d
    public void onNext(T t10) {
        this.f123802b = t10;
    }
}
