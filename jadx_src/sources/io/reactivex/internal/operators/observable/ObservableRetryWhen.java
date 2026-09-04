package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.subjects.PublishSubject;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableRetryWhen<T> extends a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.o<? super io.reactivex.z<Throwable>, ? extends io.reactivex.e0<?>> f122468c;

    public static final class RepeatWhenObserver<T> extends AtomicInteger implements io.reactivex.g0<T>, io.reactivex.disposables.b {
        private static final long serialVersionUID = 802743776666017014L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super T> f122469b;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final io.reactivex.subjects.c<Throwable> f122472e;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final io.reactivex.e0<T> f122475h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        volatile boolean f122476i;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicInteger f122470c = new AtomicInteger();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicThrowable f122471d = new AtomicThrowable();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final RepeatWhenObserver<T>.InnerRepeatObserver f122473f = new InnerRepeatObserver();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final AtomicReference<io.reactivex.disposables.b> f122474g = new AtomicReference<>();

        public final class InnerRepeatObserver extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.g0<Object> {
            private static final long serialVersionUID = 3254781284376480842L;

            InnerRepeatObserver() {
            }

            @Override // io.reactivex.g0
            public void onComplete() {
                RepeatWhenObserver.this.a();
            }

            @Override // io.reactivex.g0
            public void onError(Throwable th2) {
                RepeatWhenObserver.this.b(th2);
            }

            @Override // io.reactivex.g0
            public void onNext(Object obj) {
                RepeatWhenObserver.this.c();
            }

            @Override // io.reactivex.g0
            public void onSubscribe(io.reactivex.disposables.b bVar) {
                DisposableHelper.setOnce(this, bVar);
            }
        }

        RepeatWhenObserver(io.reactivex.g0<? super T> g0Var, io.reactivex.subjects.c<Throwable> cVar, io.reactivex.e0<T> e0Var) {
            this.f122469b = g0Var;
            this.f122472e = cVar;
            this.f122475h = e0Var;
        }

        void a() {
            DisposableHelper.dispose(this.f122474g);
            io.reactivex.internal.util.g.a(this.f122469b, this, this.f122471d);
        }

        void b(Throwable th2) {
            DisposableHelper.dispose(this.f122474g);
            io.reactivex.internal.util.g.c(this.f122469b, th2, this, this.f122471d);
        }

        void c() {
            d();
        }

        void d() {
            if (this.f122470c.getAndIncrement() == 0) {
                while (!isDisposed()) {
                    if (!this.f122476i) {
                        this.f122476i = true;
                        this.f122475h.g(this);
                    }
                    if (this.f122470c.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.dispose(this.f122474g);
            DisposableHelper.dispose(this.f122473f);
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(this.f122474g.get());
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            DisposableHelper.dispose(this.f122473f);
            io.reactivex.internal.util.g.a(this.f122469b, this, this.f122471d);
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            DisposableHelper.replace(this.f122474g, null);
            this.f122476i = false;
            this.f122472e.onNext(th2);
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            io.reactivex.internal.util.g.e(this.f122469b, t10, this, this.f122471d);
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            DisposableHelper.replace(this.f122474g, bVar);
        }
    }

    public ObservableRetryWhen(io.reactivex.e0<T> e0Var, kh.o<? super io.reactivex.z<Throwable>, ? extends io.reactivex.e0<?>> oVar) {
        super(e0Var);
        this.f122468c = oVar;
    }

    @Override // io.reactivex.z
    protected void H5(io.reactivex.g0<? super T> g0Var) {
        io.reactivex.subjects.c<T> cVarL8 = PublishSubject.n8().l8();
        try {
            io.reactivex.e0 e0Var = (io.reactivex.e0) io.reactivex.internal.functions.a.g(this.f122468c.apply(cVarL8), "The handler returned a null ObservableSource");
            RepeatWhenObserver repeatWhenObserver = new RepeatWhenObserver(g0Var, cVarL8, this.f122785b);
            g0Var.onSubscribe(repeatWhenObserver);
            e0Var.g(repeatWhenObserver.f122473f);
            repeatWhenObserver.d();
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            EmptyDisposable.error(th2, g0Var);
        }
    }
}
