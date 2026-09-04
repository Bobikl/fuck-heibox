package io.reactivex.internal.operators.observable;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableRetryPredicate<T> extends a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.r<? super Throwable> f122461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final long f122462d;

    public static final class RepeatObserver<T> extends AtomicInteger implements io.reactivex.g0<T> {
        private static final long serialVersionUID = -7098360935104053232L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super T> f122463b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final SequentialDisposable f122464c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.e0<? extends T> f122465d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final kh.r<? super Throwable> f122466e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        long f122467f;

        RepeatObserver(io.reactivex.g0<? super T> g0Var, long j10, kh.r<? super Throwable> rVar, SequentialDisposable sequentialDisposable, io.reactivex.e0<? extends T> e0Var) {
            this.f122463b = g0Var;
            this.f122464c = sequentialDisposable;
            this.f122465d = e0Var;
            this.f122466e = rVar;
            this.f122467f = j10;
        }

        void a() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f122464c.isDisposed()) {
                    this.f122465d.g(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            this.f122463b.onComplete();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            long j10 = this.f122467f;
            if (j10 != Long.MAX_VALUE) {
                this.f122467f = j10 - 1;
            }
            if (j10 == 0) {
                this.f122463b.onError(th2);
                return;
            }
            try {
                if (this.f122466e.test(th2)) {
                    a();
                } else {
                    this.f122463b.onError(th2);
                }
            } catch (Throwable th3) {
                io.reactivex.exceptions.a.b(th3);
                this.f122463b.onError(new CompositeException(th2, th3));
            }
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            this.f122463b.onNext(t10);
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            this.f122464c.a(bVar);
        }
    }

    public ObservableRetryPredicate(io.reactivex.z<T> zVar, long j10, kh.r<? super Throwable> rVar) {
        super(zVar);
        this.f122461c = rVar;
        this.f122462d = j10;
    }

    @Override // io.reactivex.z
    public void H5(io.reactivex.g0<? super T> g0Var) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        g0Var.onSubscribe(sequentialDisposable);
        new RepeatObserver(g0Var, this.f122462d, this.f122461c, sequentialDisposable, this.f122785b).a();
    }
}
