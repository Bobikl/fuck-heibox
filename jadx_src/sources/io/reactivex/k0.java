package io.reactivex;

/* JADX INFO: compiled from: SingleEmitter.java */
/* JADX INFO: loaded from: classes4.dex */
public interface k0<T> {
    void a(@jh.f kh.f fVar);

    boolean b(@jh.e Throwable th2);

    void c(@jh.f io.reactivex.disposables.b bVar);

    boolean isDisposed();

    void onError(@jh.e Throwable th2);

    void onSuccess(@jh.e T t10);
}
