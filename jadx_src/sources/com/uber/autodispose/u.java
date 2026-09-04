package com.uber.autodispose;

import io.reactivex.observers.TestObserver;

/* JADX INFO: compiled from: MaybeSubscribeProxy.java */
/* JADX INFO: loaded from: classes4.dex */
public interface u<T> {
    io.reactivex.disposables.b a();

    io.reactivex.disposables.b b(kh.g<? super T> gVar);

    @jh.c
    TestObserver<T> c(boolean z10);

    io.reactivex.disposables.b d(kh.g<? super T> gVar, kh.g<? super Throwable> gVar2);

    io.reactivex.disposables.b e(kh.g<? super T> gVar, kh.g<? super Throwable> gVar2, kh.a aVar);

    void f(io.reactivex.t<? super T> tVar);

    @jh.c
    <E extends io.reactivex.t<? super T>> E g(E e10);

    @jh.c
    TestObserver<T> test();
}
