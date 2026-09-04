package io.reactivex;

/* JADX INFO: compiled from: CompletableEmitter.java */
/* JADX INFO: loaded from: classes4.dex */
public interface c {
    void a(@jh.f kh.f fVar);

    boolean b(@jh.e Throwable th2);

    void c(@jh.f io.reactivex.disposables.b bVar);

    boolean isDisposed();

    void onComplete();

    void onError(@jh.e Throwable th2);
}
