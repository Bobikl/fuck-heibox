package io.reactivex;

/* JADX INFO: compiled from: Observer.java */
/* JADX INFO: loaded from: classes4.dex */
public interface g0<T> {
    void onComplete();

    void onError(@jh.e Throwable th2);

    void onNext(@jh.e T t10);

    void onSubscribe(@jh.e io.reactivex.disposables.b bVar);
}
