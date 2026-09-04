package com.uber.autodispose;

import io.reactivex.g0;
import io.reactivex.observers.TestObserver;

/* JADX INFO: compiled from: ObservableSubscribeProxy.java */
/* JADX INFO: loaded from: classes4.dex */
public interface v<T> {
    io.reactivex.disposables.b a();

    io.reactivex.disposables.b b(kh.g<? super T> gVar);

    @jh.c
    TestObserver<T> c(boolean z10);

    io.reactivex.disposables.b d(kh.g<? super T> gVar, kh.g<? super Throwable> gVar2);

    io.reactivex.disposables.b e(kh.g<? super T> gVar, kh.g<? super Throwable> gVar2, kh.a aVar);

    io.reactivex.disposables.b f(kh.g<? super T> gVar, kh.g<? super Throwable> gVar2, kh.a aVar, kh.g<? super io.reactivex.disposables.b> gVar3);

    void g(g0<? super T> g0Var);

    @jh.c
    <E extends g0<? super T>> E h(E e10);

    @jh.c
    TestObserver<T> test();
}
