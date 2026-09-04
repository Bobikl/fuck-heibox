package com.uber.autodispose;

import io.reactivex.subscribers.TestSubscriber;

/* JADX INFO: compiled from: FlowableSubscribeProxy.java */
/* JADX INFO: loaded from: classes4.dex */
public interface s<T> {
    io.reactivex.disposables.b a();

    io.reactivex.disposables.b b(kh.g<? super T> gVar);

    io.reactivex.disposables.b d(kh.g<? super T> gVar, kh.g<? super Throwable> gVar2);

    io.reactivex.disposables.b e(kh.g<? super T> gVar, kh.g<? super Throwable> gVar2, kh.a aVar);

    io.reactivex.disposables.b f(kh.g<? super T> gVar, kh.g<? super Throwable> gVar2, kh.a aVar, kh.g<? super org.reactivestreams.e> gVar3);

    void g(org.reactivestreams.d<? super T> dVar);

    @jh.c
    <E extends org.reactivestreams.d<? super T>> E h(E e10);

    @jh.c
    TestSubscriber<T> i(long j10, boolean z10);

    @jh.c
    TestSubscriber<T> test();

    @jh.c
    TestSubscriber<T> test(long j10);
}
