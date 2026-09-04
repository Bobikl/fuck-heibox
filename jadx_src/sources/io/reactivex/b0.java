package io.reactivex;

/* JADX INFO: compiled from: ObservableEmitter.java */
/* JADX INFO: loaded from: classes4.dex */
public interface b0<T> extends i<T> {
    void a(@jh.f kh.f fVar);

    boolean b(@jh.e Throwable th2);

    void c(@jh.f io.reactivex.disposables.b bVar);

    boolean isDisposed();

    @jh.e
    b0<T> serialize();
}
