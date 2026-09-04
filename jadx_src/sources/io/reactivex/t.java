package io.reactivex;

/* JADX INFO: compiled from: MaybeObserver.java */
/* JADX INFO: loaded from: classes4.dex */
public interface t<T> {
    void onComplete();

    void onError(@jh.e Throwable th2);

    void onSubscribe(@jh.e io.reactivex.disposables.b bVar);

    void onSuccess(@jh.e T t10);
}
