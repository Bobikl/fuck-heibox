package io.reactivex;

/* JADX INFO: compiled from: Emitter.java */
/* JADX INFO: loaded from: classes4.dex */
public interface i<T> {
    void onComplete();

    void onError(@jh.e Throwable th2);

    void onNext(@jh.e T t10);
}
