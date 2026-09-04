package com.uber.autodispose;

import io.reactivex.l0;
import io.reactivex.observers.TestObserver;

/* JADX INFO: compiled from: SingleSubscribeProxy.java */
/* JADX INFO: loaded from: classes4.dex */
public interface z<T> {
    io.reactivex.disposables.b a();

    io.reactivex.disposables.b b(kh.g<? super T> gVar);

    @jh.c
    TestObserver<T> c(boolean z10);

    io.reactivex.disposables.b d(kh.g<? super T> gVar, kh.g<? super Throwable> gVar2);

    void f(l0<? super T> l0Var);

    @jh.c
    <E extends l0<? super T>> E g(E e10);

    io.reactivex.disposables.b h(kh.b<? super T, ? super Throwable> bVar);

    @jh.c
    TestObserver<T> test();
}
