package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableRepeat<T> extends a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f122399c;

    public static final class RepeatObserver<T> extends AtomicInteger implements io.reactivex.g0<T> {
        private static final long serialVersionUID = -7098360935104053232L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super T> f122400b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final SequentialDisposable f122401c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.e0<? extends T> f122402d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        long f122403e;

        RepeatObserver(io.reactivex.g0<? super T> g0Var, long j10, SequentialDisposable sequentialDisposable, io.reactivex.e0<? extends T> e0Var) {
            this.f122400b = g0Var;
            this.f122401c = sequentialDisposable;
            this.f122402d = e0Var;
            this.f122403e = j10;
        }

        void a() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f122401c.isDisposed()) {
                    this.f122402d.g(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            long j10 = this.f122403e;
            if (j10 != Long.MAX_VALUE) {
                this.f122403e = j10 - 1;
            }
            if (j10 != 0) {
                a();
            } else {
                this.f122400b.onComplete();
            }
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            this.f122400b.onError(th2);
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            this.f122400b.onNext(t10);
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            this.f122401c.a(bVar);
        }
    }

    public ObservableRepeat(io.reactivex.z<T> zVar, long j10) {
        super(zVar);
        this.f122399c = j10;
    }

    @Override // io.reactivex.z
    public void H5(io.reactivex.g0<? super T> g0Var) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        g0Var.onSubscribe(sequentialDisposable);
        long j10 = this.f122399c;
        new RepeatObserver(g0Var, j10 != Long.MAX_VALUE ? j10 - 1 : Long.MAX_VALUE, sequentialDisposable, this.f122785b).a();
    }
}
