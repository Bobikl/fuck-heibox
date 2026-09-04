package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableMergeWithSingle<T> extends a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.o0<? extends T> f122329c;

    public static final class MergeWithObserver<T> extends AtomicInteger implements io.reactivex.g0<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        static final int f122330k = 1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        static final int f122331l = 2;
        private static final long serialVersionUID = -4592979584110982903L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super T> f122332b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicReference<io.reactivex.disposables.b> f122333c = new AtomicReference<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final OtherObserver<T> f122334d = new OtherObserver<>(this);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicThrowable f122335e = new AtomicThrowable();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        volatile lh.n<T> f122336f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        T f122337g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        volatile boolean f122338h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        volatile boolean f122339i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        volatile int f122340j;

        public static final class OtherObserver<T> extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.l0<T> {
            private static final long serialVersionUID = -2935427570954647017L;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final MergeWithObserver<T> f122341b;

            OtherObserver(MergeWithObserver<T> mergeWithObserver) {
                this.f122341b = mergeWithObserver;
            }

            @Override // io.reactivex.l0
            public void onError(Throwable th2) {
                this.f122341b.d(th2);
            }

            @Override // io.reactivex.l0
            public void onSubscribe(io.reactivex.disposables.b bVar) {
                DisposableHelper.setOnce(this, bVar);
            }

            @Override // io.reactivex.l0
            public void onSuccess(T t10) {
                this.f122341b.f(t10);
            }
        }

        MergeWithObserver(io.reactivex.g0<? super T> g0Var) {
            this.f122332b = g0Var;
        }

        void a() {
            if (getAndIncrement() == 0) {
                b();
            }
        }

        void b() {
            io.reactivex.g0<? super T> g0Var = this.f122332b;
            int iAddAndGet = 1;
            while (!this.f122338h) {
                if (this.f122335e.get() != null) {
                    this.f122337g = null;
                    this.f122336f = null;
                    g0Var.onError(this.f122335e.c());
                    return;
                }
                int i10 = this.f122340j;
                if (i10 == 1) {
                    T t10 = this.f122337g;
                    this.f122337g = null;
                    this.f122340j = 2;
                    g0Var.onNext(t10);
                    i10 = 2;
                }
                boolean z10 = this.f122339i;
                lh.n<T> nVar = this.f122336f;
                a.a.a.a.d.p.d.c.d dVarPoll = nVar != null ? nVar.poll() : null;
                boolean z11 = dVarPoll == null;
                if (z10 && z11 && i10 == 2) {
                    this.f122336f = null;
                    g0Var.onComplete();
                    return;
                } else if (z11) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    g0Var.onNext(dVarPoll);
                }
            }
            this.f122337g = null;
            this.f122336f = null;
        }

        lh.n<T> c() {
            lh.n<T> nVar = this.f122336f;
            if (nVar != null) {
                return nVar;
            }
            io.reactivex.internal.queue.a aVar = new io.reactivex.internal.queue.a(io.reactivex.z.T());
            this.f122336f = aVar;
            return aVar;
        }

        void d(Throwable th2) {
            if (!this.f122335e.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                DisposableHelper.dispose(this.f122333c);
                a();
            }
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f122338h = true;
            DisposableHelper.dispose(this.f122333c);
            DisposableHelper.dispose(this.f122334d);
            if (getAndIncrement() == 0) {
                this.f122336f = null;
                this.f122337g = null;
            }
        }

        void f(T t10) {
            if (compareAndSet(0, 1)) {
                this.f122332b.onNext(t10);
                this.f122340j = 2;
            } else {
                this.f122337g = t10;
                this.f122340j = 1;
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            b();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(this.f122333c.get());
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            this.f122339i = true;
            a();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            if (!this.f122335e.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                DisposableHelper.dispose(this.f122333c);
                a();
            }
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            if (compareAndSet(0, 1)) {
                this.f122332b.onNext(t10);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                c().offer(t10);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            b();
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            DisposableHelper.setOnce(this.f122333c, bVar);
        }
    }

    public ObservableMergeWithSingle(io.reactivex.z<T> zVar, io.reactivex.o0<? extends T> o0Var) {
        super(zVar);
        this.f122329c = o0Var;
    }

    @Override // io.reactivex.z
    protected void H5(io.reactivex.g0<? super T> g0Var) {
        MergeWithObserver mergeWithObserver = new MergeWithObserver(g0Var);
        g0Var.onSubscribe(mergeWithObserver);
        this.f122785b.g(mergeWithObserver);
        this.f122329c.f(mergeWithObserver.f122334d);
    }
}
