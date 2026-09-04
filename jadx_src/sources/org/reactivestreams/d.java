package org.reactivestreams;

/* JADX INFO: compiled from: Subscriber.java */
/* JADX INFO: loaded from: classes5.dex */
public interface d<T> {
    void onComplete();

    void onError(Throwable th2);

    void onNext(T t10);

    void onSubscribe(e eVar);
}
