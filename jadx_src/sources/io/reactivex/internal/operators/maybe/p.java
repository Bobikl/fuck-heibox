package io.reactivex.internal.operators.maybe;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: MaybeFromAction.java */
/* JADX INFO: loaded from: classes12.dex */
public final class p<T> extends io.reactivex.q<T> implements Callable<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final kh.a f121701b;

    public p(kh.a aVar) {
        this.f121701b = aVar;
    }

    @Override // java.util.concurrent.Callable
    public T call() throws Exception {
        this.f121701b.run();
        return null;
    }

    @Override // io.reactivex.q
    protected void r1(io.reactivex.t<? super T> tVar) {
        io.reactivex.disposables.b bVarB = io.reactivex.disposables.c.b();
        tVar.onSubscribe(bVarB);
        if (bVarB.isDisposed()) {
            return;
        }
        try {
            this.f121701b.run();
            if (bVarB.isDisposed()) {
                return;
            }
            tVar.onComplete();
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            if (bVarB.isDisposed()) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                tVar.onError(th2);
            }
        }
    }
}
