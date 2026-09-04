package io.reactivex;

/* JADX INFO: compiled from: SingleObserver.java */
/* JADX INFO: loaded from: classes4.dex */
public interface l0<T> {
    void onError(@jh.e Throwable th2);

    void onSubscribe(@jh.e io.reactivex.disposables.b bVar);

    void onSuccess(@jh.e T t10);
}
