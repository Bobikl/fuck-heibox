package io.reactivex.internal.operators.mixed;

import io.reactivex.d;
import io.reactivex.g;
import io.reactivex.g0;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.z;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kh.o;
import lh.j;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableConcatMapCompletable<T> extends io.reactivex.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final z<T> f121852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final o<? super T, ? extends g> f121853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final ErrorMode f121854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f121855e;

    public static final class ConcatMapCompletableObserver<T> extends AtomicInteger implements g0<T>, io.reactivex.disposables.b {
        private static final long serialVersionUID = 3610901111000061034L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final d f121856b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final o<? super T, ? extends g> f121857c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final ErrorMode f121858d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicThrowable f121859e = new AtomicThrowable();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final ConcatMapInnerObserver f121860f = new ConcatMapInnerObserver(this);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final int f121861g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        lh.o<T> f121862h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        io.reactivex.disposables.b f121863i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        volatile boolean f121864j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        volatile boolean f121865k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        volatile boolean f121866l;

        public static final class ConcatMapInnerObserver extends AtomicReference<io.reactivex.disposables.b> implements d {
            private static final long serialVersionUID = 5638352172918776687L;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final ConcatMapCompletableObserver<?> f121867b;

            ConcatMapInnerObserver(ConcatMapCompletableObserver<?> concatMapCompletableObserver) {
                this.f121867b = concatMapCompletableObserver;
            }

            void a() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.d
            public void onComplete() {
                this.f121867b.b();
            }

            @Override // io.reactivex.d
            public void onError(Throwable th2) {
                this.f121867b.c(th2);
            }

            @Override // io.reactivex.d
            public void onSubscribe(io.reactivex.disposables.b bVar) {
                DisposableHelper.replace(this, bVar);
            }
        }

        ConcatMapCompletableObserver(d dVar, o<? super T, ? extends g> oVar, ErrorMode errorMode, int i10) {
            this.f121856b = dVar;
            this.f121857c = oVar;
            this.f121858d = errorMode;
            this.f121861g = i10;
        }

        void a() {
            boolean z10;
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicThrowable atomicThrowable = this.f121859e;
            ErrorMode errorMode = this.f121858d;
            while (!this.f121866l) {
                if (!this.f121864j) {
                    if (errorMode == ErrorMode.BOUNDARY && atomicThrowable.get() != null) {
                        this.f121866l = true;
                        this.f121862h.clear();
                        this.f121856b.onError(atomicThrowable.c());
                        return;
                    }
                    boolean z11 = this.f121865k;
                    g gVar = null;
                    try {
                        T tPoll = this.f121862h.poll();
                        if (tPoll != null) {
                            gVar = (g) io.reactivex.internal.functions.a.g(this.f121857c.apply(tPoll), "The mapper returned a null CompletableSource");
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (z11 && z10) {
                            this.f121866l = true;
                            Throwable thC = atomicThrowable.c();
                            if (thC != null) {
                                this.f121856b.onError(thC);
                                return;
                            } else {
                                this.f121856b.onComplete();
                                return;
                            }
                        }
                        if (!z10) {
                            this.f121864j = true;
                            gVar.d(this.f121860f);
                        }
                    } catch (Throwable th2) {
                        io.reactivex.exceptions.a.b(th2);
                        this.f121866l = true;
                        this.f121862h.clear();
                        this.f121863i.dispose();
                        atomicThrowable.a(th2);
                        this.f121856b.onError(atomicThrowable.c());
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            this.f121862h.clear();
        }

        void b() {
            this.f121864j = false;
            a();
        }

        void c(Throwable th2) {
            if (!this.f121859e.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (this.f121858d != ErrorMode.IMMEDIATE) {
                this.f121864j = false;
                a();
                return;
            }
            this.f121866l = true;
            this.f121863i.dispose();
            Throwable thC = this.f121859e.c();
            if (thC != ExceptionHelper.f123860a) {
                this.f121856b.onError(thC);
            }
            if (getAndIncrement() == 0) {
                this.f121862h.clear();
            }
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f121866l = true;
            this.f121863i.dispose();
            this.f121860f.a();
            if (getAndIncrement() == 0) {
                this.f121862h.clear();
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f121866l;
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            this.f121865k = true;
            a();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            if (!this.f121859e.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (this.f121858d != ErrorMode.IMMEDIATE) {
                this.f121865k = true;
                a();
                return;
            }
            this.f121866l = true;
            this.f121860f.a();
            Throwable thC = this.f121859e.c();
            if (thC != ExceptionHelper.f123860a) {
                this.f121856b.onError(thC);
            }
            if (getAndIncrement() == 0) {
                this.f121862h.clear();
            }
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            if (t10 != null) {
                this.f121862h.offer(t10);
            }
            a();
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f121863i, bVar)) {
                this.f121863i = bVar;
                if (bVar instanceof j) {
                    j jVar = (j) bVar;
                    int iRequestFusion = jVar.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.f121862h = jVar;
                        this.f121865k = true;
                        this.f121856b.onSubscribe(this);
                        a();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f121862h = jVar;
                        this.f121856b.onSubscribe(this);
                        return;
                    }
                }
                this.f121862h = new io.reactivex.internal.queue.a(this.f121861g);
                this.f121856b.onSubscribe(this);
            }
        }
    }

    public ObservableConcatMapCompletable(z<T> zVar, o<? super T, ? extends g> oVar, ErrorMode errorMode, int i10) {
        this.f121852b = zVar;
        this.f121853c = oVar;
        this.f121854d = errorMode;
        this.f121855e = i10;
    }

    @Override // io.reactivex.a
    protected void J0(d dVar) {
        if (b.a(this.f121852b, this.f121853c, dVar)) {
            return;
        }
        this.f121852b.g(new ConcatMapCompletableObserver(dVar, this.f121853c, this.f121854d, this.f121855e));
    }
}
