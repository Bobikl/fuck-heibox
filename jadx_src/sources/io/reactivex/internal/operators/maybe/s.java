package io.reactivex.internal.operators.maybe;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: MaybeFromFuture.java */
/* JADX INFO: loaded from: classes12.dex */
public final class s<T> extends io.reactivex.q<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Future<? extends T> f121706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f121707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final TimeUnit f121708d;

    public s(Future<? extends T> future, long j10, TimeUnit timeUnit) {
        this.f121706b = future;
        this.f121707c = j10;
        this.f121708d = timeUnit;
    }

    @Override // io.reactivex.q
    protected void r1(io.reactivex.t<? super T> tVar) {
        io.reactivex.disposables.b bVarB = io.reactivex.disposables.c.b();
        tVar.onSubscribe(bVarB);
        if (bVarB.isDisposed()) {
            return;
        }
        try {
            long j10 = this.f121707c;
            T t10 = j10 <= 0 ? this.f121706b.get() : this.f121706b.get(j10, this.f121708d);
            if (bVarB.isDisposed()) {
                return;
            }
            if (t10 == null) {
                tVar.onComplete();
            } else {
                tVar.onSuccess(t10);
            }
        } catch (Throwable th2) {
            th = th2;
            if (th instanceof ExecutionException) {
                th = th.getCause();
            }
            io.reactivex.exceptions.a.b(th);
            if (bVarB.isDisposed()) {
                return;
            }
            tVar.onError(th);
        }
    }
}
