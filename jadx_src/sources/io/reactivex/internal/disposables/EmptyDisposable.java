package io.reactivex.internal.disposables;

import io.reactivex.d;
import io.reactivex.g0;
import io.reactivex.l0;
import io.reactivex.t;
import jh.f;
import lh.j;

/* JADX INFO: loaded from: classes7.dex */
public enum EmptyDisposable implements j<Object> {
    INSTANCE,
    NEVER;

    public static void complete(d dVar) {
        dVar.onSubscribe(INSTANCE);
        dVar.onComplete();
    }

    public static void complete(g0<?> g0Var) {
        g0Var.onSubscribe(INSTANCE);
        g0Var.onComplete();
    }

    public static void complete(t<?> tVar) {
        tVar.onSubscribe(INSTANCE);
        tVar.onComplete();
    }

    public static void error(Throwable th2, d dVar) {
        dVar.onSubscribe(INSTANCE);
        dVar.onError(th2);
    }

    public static void error(Throwable th2, g0<?> g0Var) {
        g0Var.onSubscribe(INSTANCE);
        g0Var.onError(th2);
    }

    public static void error(Throwable th2, l0<?> l0Var) {
        l0Var.onSubscribe(INSTANCE);
        l0Var.onError(th2);
    }

    public static void error(Throwable th2, t<?> tVar) {
        tVar.onSubscribe(INSTANCE);
        tVar.onError(th2);
    }

    @Override // lh.o
    public void clear() {
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
    }

    @Override // io.reactivex.disposables.b
    public boolean isDisposed() {
        return this == INSTANCE;
    }

    @Override // lh.o
    public boolean isEmpty() {
        return true;
    }

    @Override // lh.o
    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // lh.o
    public boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // lh.o
    @f
    public Object poll() throws Exception {
        return null;
    }

    @Override // lh.k
    public int requestFusion(int i10) {
        return i10 & 2;
    }
}
