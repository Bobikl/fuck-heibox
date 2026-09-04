package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableMergeWithMaybe<T> extends a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.w<? extends T> f122316c;

    public static final class MergeWithObserver<T> extends AtomicInteger implements io.reactivex.g0<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        static final int f122317k = 1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        static final int f122318l = 2;
        private static final long serialVersionUID = -4592979584110982903L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super T> f122319b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicReference<io.reactivex.disposables.b> f122320c = new AtomicReference<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final OtherObserver<T> f122321d = new OtherObserver<>(this);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicThrowable f122322e = new AtomicThrowable();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        volatile lh.n<T> f122323f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        T f122324g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        volatile boolean f122325h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        volatile boolean f122326i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        volatile int f122327j;

        public static final class OtherObserver<T> extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.t<T> {
            private static final long serialVersionUID = -2935427570954647017L;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final MergeWithObserver<T> f122328b;

            OtherObserver(MergeWithObserver<T> mergeWithObserver) {
                this.f122328b = mergeWithObserver;
            }

            @Override // io.reactivex.t
            public void onComplete() {
                this.f122328b.d();
            }

            @Override // io.reactivex.t
            public void onError(Throwable th2) {
                this.f122328b.f(th2);
            }

            @Override // io.reactivex.t
            public void onSubscribe(io.reactivex.disposables.b bVar) {
                DisposableHelper.setOnce(this, bVar);
            }

            @Override // io.reactivex.t
            public void onSuccess(T t10) {
                this.f122328b.g(t10);
            }
        }

        MergeWithObserver(io.reactivex.g0<? super T> g0Var) {
            this.f122319b = g0Var;
        }

        void a() {
            if (getAndIncrement() == 0) {
                b();
            }
        }

        void b() {
            io.reactivex.g0<? super T> g0Var = this.f122319b;
            int iAddAndGet = 1;
            while (!this.f122325h) {
                if (this.f122322e.get() != null) {
                    this.f122324g = null;
                    this.f122323f = null;
                    g0Var.onError(this.f122322e.c());
                    return;
                }
                int i10 = this.f122327j;
                if (i10 == 1) {
                    T t10 = this.f122324g;
                    this.f122324g = null;
                    this.f122327j = 2;
                    g0Var.onNext(t10);
                    i10 = 2;
                }
                boolean z10 = this.f122326i;
                lh.n<T> nVar = this.f122323f;
                a.a.a.a.d.p.d.c.d dVarPoll = nVar != null ? nVar.poll() : null;
                boolean z11 = dVarPoll == null;
                if (z10 && z11 && i10 == 2) {
                    this.f122323f = null;
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
            this.f122324g = null;
            this.f122323f = null;
        }

        lh.n<T> c() {
            lh.n<T> nVar = this.f122323f;
            if (nVar != null) {
                return nVar;
            }
            io.reactivex.internal.queue.a aVar = new io.reactivex.internal.queue.a(io.reactivex.z.T());
            this.f122323f = aVar;
            return aVar;
        }

        void d() {
            this.f122327j = 2;
            a();
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f122325h = true;
            DisposableHelper.dispose(this.f122320c);
            DisposableHelper.dispose(this.f122321d);
            if (getAndIncrement() == 0) {
                this.f122323f = null;
                this.f122324g = null;
            }
        }

        void f(Throwable th2) {
            if (!this.f122322e.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                DisposableHelper.dispose(this.f122320c);
                a();
            }
        }

        void g(T t10) {
            if (compareAndSet(0, 1)) {
                this.f122319b.onNext(t10);
                this.f122327j = 2;
            } else {
                this.f122324g = t10;
                this.f122327j = 1;
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            b();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(this.f122320c.get());
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            this.f122326i = true;
            a();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            if (!this.f122322e.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                DisposableHelper.dispose(this.f122320c);
                a();
            }
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            if (compareAndSet(0, 1)) {
                this.f122319b.onNext(t10);
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
            DisposableHelper.setOnce(this.f122320c, bVar);
        }
    }

    public ObservableMergeWithMaybe(io.reactivex.z<T> zVar, io.reactivex.w<? extends T> wVar) {
        super(zVar);
        this.f122316c = wVar;
    }

    @Override // io.reactivex.z
    protected void H5(io.reactivex.g0<? super T> g0Var) {
        MergeWithObserver mergeWithObserver = new MergeWithObserver(g0Var);
        g0Var.onSubscribe(mergeWithObserver);
        this.f122785b.g(mergeWithObserver);
        this.f122316c.f(mergeWithObserver.f122321d);
    }
}
