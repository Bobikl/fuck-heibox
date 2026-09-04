package io.reactivex;

/* JADX INFO: compiled from: FlowableEmitter.java */
/* JADX INFO: loaded from: classes4.dex */
public interface l<T> extends i<T> {
    void a(@jh.f kh.f fVar);

    boolean b(@jh.e Throwable th2);

    void c(@jh.f io.reactivex.disposables.b bVar);

    long f();

    boolean isCancelled();

    @jh.e
    l<T> serialize();
}
