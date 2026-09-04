package com.uber.autodispose;

import io.reactivex.observers.TestObserver;

/* JADX INFO: compiled from: CompletableSubscribeProxy.java */
/* JADX INFO: loaded from: classes4.dex */
public interface r {
    io.reactivex.disposables.b a();

    @jh.c
    TestObserver<Void> c(boolean z10);

    void d(io.reactivex.d dVar);

    @jh.c
    <E extends io.reactivex.d> E e(E e10);

    io.reactivex.disposables.b f(kh.a aVar, kh.g<? super Throwable> gVar);

    io.reactivex.disposables.b g(kh.a aVar);

    @jh.c
    TestObserver<Void> test();
}
