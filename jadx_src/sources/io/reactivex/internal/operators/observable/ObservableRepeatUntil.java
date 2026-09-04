package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableRepeatUntil<T> extends a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.e f122404c;

    public static final class RepeatUntilObserver<T> extends AtomicInteger implements io.reactivex.g0<T> {
        private static final long serialVersionUID = -7098360935104053232L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super T> f122405b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final SequentialDisposable f122406c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.e0<? extends T> f122407d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final kh.e f122408e;

        RepeatUntilObserver(io.reactivex.g0<? super T> g0Var, kh.e eVar, SequentialDisposable sequentialDisposable, io.reactivex.e0<? extends T> e0Var) {
            this.f122405b = g0Var;
            this.f122406c = sequentialDisposable;
            this.f122407d = e0Var;
            this.f122408e = eVar;
        }

        void a() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                do {
                    this.f122407d.g(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                } while (iAddAndGet != 0);
            }
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            try {
                if (this.f122408e.a()) {
                    this.f122405b.onComplete();
                } else {
                    a();
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f122405b.onError(th2);
            }
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            this.f122405b.onError(th2);
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            this.f122405b.onNext(t10);
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            this.f122406c.a(bVar);
        }
    }

    public ObservableRepeatUntil(io.reactivex.z<T> zVar, kh.e eVar) {
        super(zVar);
        this.f122404c = eVar;
    }

    @Override // io.reactivex.z
    public void H5(io.reactivex.g0<? super T> g0Var) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        g0Var.onSubscribe(sequentialDisposable);
        new RepeatUntilObserver(g0Var, this.f122404c, sequentialDisposable, this.f122785b).a();
    }
}
