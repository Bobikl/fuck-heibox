package io.reactivex.internal.operators.completable;

import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes12.dex */
public final class CompletableConcatArray extends io.reactivex.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.g[] f119706b;

    public static final class ConcatInnerObserver extends AtomicInteger implements io.reactivex.d {
        private static final long serialVersionUID = -7965400327305809232L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.d f119707b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.g[] f119708c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f119709d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final SequentialDisposable f119710e = new SequentialDisposable();

        ConcatInnerObserver(io.reactivex.d dVar, io.reactivex.g[] gVarArr) {
            this.f119707b = dVar;
            this.f119708c = gVarArr;
        }

        void a() {
            if (!this.f119710e.isDisposed() && getAndIncrement() == 0) {
                io.reactivex.g[] gVarArr = this.f119708c;
                while (!this.f119710e.isDisposed()) {
                    int i10 = this.f119709d;
                    this.f119709d = i10 + 1;
                    if (i10 == gVarArr.length) {
                        this.f119707b.onComplete();
                        return;
                    } else {
                        gVarArr[i10].d(this);
                        if (decrementAndGet() == 0) {
                            return;
                        }
                    }
                }
            }
        }

        @Override // io.reactivex.d
        public void onComplete() {
            a();
        }

        @Override // io.reactivex.d
        public void onError(Throwable th2) {
            this.f119707b.onError(th2);
        }

        @Override // io.reactivex.d
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            this.f119710e.a(bVar);
        }
    }

    public CompletableConcatArray(io.reactivex.g[] gVarArr) {
        this.f119706b = gVarArr;
    }

    @Override // io.reactivex.a
    public void J0(io.reactivex.d dVar) {
        ConcatInnerObserver concatInnerObserver = new ConcatInnerObserver(dVar, this.f119706b);
        dVar.onSubscribe(concatInnerObserver.f119710e);
        concatInnerObserver.a();
    }
}
