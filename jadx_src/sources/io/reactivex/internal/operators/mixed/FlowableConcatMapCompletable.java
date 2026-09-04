package io.reactivex.internal.operators.mixed;

import io.reactivex.d;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.g;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.j;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kh.o;
import lh.n;
import org.reactivestreams.e;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableConcatMapCompletable<T> extends io.reactivex.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final j<T> f121735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final o<? super T, ? extends g> f121736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final ErrorMode f121737d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f121738e;

    public static final class ConcatMapCompletableObserver<T> extends AtomicInteger implements io.reactivex.o<T>, io.reactivex.disposables.b {
        private static final long serialVersionUID = 3610901111000061034L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final d f121739b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final o<? super T, ? extends g> f121740c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final ErrorMode f121741d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicThrowable f121742e = new AtomicThrowable();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final ConcatMapInnerObserver f121743f = new ConcatMapInnerObserver(this);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final int f121744g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final n<T> f121745h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        e f121746i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        volatile boolean f121747j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        volatile boolean f121748k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        volatile boolean f121749l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f121750m;

        public static final class ConcatMapInnerObserver extends AtomicReference<io.reactivex.disposables.b> implements d {
            private static final long serialVersionUID = 5638352172918776687L;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final ConcatMapCompletableObserver<?> f121751b;

            ConcatMapInnerObserver(ConcatMapCompletableObserver<?> concatMapCompletableObserver) {
                this.f121751b = concatMapCompletableObserver;
            }

            void a() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.d
            public void onComplete() {
                this.f121751b.b();
            }

            @Override // io.reactivex.d
            public void onError(Throwable th2) {
                this.f121751b.c(th2);
            }

            @Override // io.reactivex.d
            public void onSubscribe(io.reactivex.disposables.b bVar) {
                DisposableHelper.replace(this, bVar);
            }
        }

        ConcatMapCompletableObserver(d dVar, o<? super T, ? extends g> oVar, ErrorMode errorMode, int i10) {
            this.f121739b = dVar;
            this.f121740c = oVar;
            this.f121741d = errorMode;
            this.f121744g = i10;
            this.f121745h = new SpscArrayQueue(i10);
        }

        void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            while (!this.f121749l) {
                if (!this.f121747j) {
                    if (this.f121741d == ErrorMode.BOUNDARY && this.f121742e.get() != null) {
                        this.f121745h.clear();
                        this.f121739b.onError(this.f121742e.c());
                        return;
                    }
                    boolean z10 = this.f121748k;
                    T tPoll = this.f121745h.poll();
                    boolean z11 = tPoll == null;
                    if (z10 && z11) {
                        Throwable thC = this.f121742e.c();
                        if (thC != null) {
                            this.f121739b.onError(thC);
                            return;
                        } else {
                            this.f121739b.onComplete();
                            return;
                        }
                    }
                    if (!z11) {
                        int i10 = this.f121744g;
                        int i11 = i10 - (i10 >> 1);
                        int i12 = this.f121750m + 1;
                        if (i12 == i11) {
                            this.f121750m = 0;
                            this.f121746i.request(i11);
                        } else {
                            this.f121750m = i12;
                        }
                        try {
                            g gVar = (g) io.reactivex.internal.functions.a.g(this.f121740c.apply(tPoll), "The mapper returned a null CompletableSource");
                            this.f121747j = true;
                            gVar.d(this.f121743f);
                        } catch (Throwable th2) {
                            io.reactivex.exceptions.a.b(th2);
                            this.f121745h.clear();
                            this.f121746i.cancel();
                            this.f121742e.a(th2);
                            this.f121739b.onError(this.f121742e.c());
                            return;
                        }
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            this.f121745h.clear();
        }

        void b() {
            this.f121747j = false;
            a();
        }

        void c(Throwable th2) {
            if (!this.f121742e.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (this.f121741d != ErrorMode.IMMEDIATE) {
                this.f121747j = false;
                a();
                return;
            }
            this.f121746i.cancel();
            Throwable thC = this.f121742e.c();
            if (thC != ExceptionHelper.f123860a) {
                this.f121739b.onError(thC);
            }
            if (getAndIncrement() == 0) {
                this.f121745h.clear();
            }
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f121749l = true;
            this.f121746i.cancel();
            this.f121743f.a();
            if (getAndIncrement() == 0) {
                this.f121745h.clear();
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f121749l;
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            this.f121748k = true;
            a();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (!this.f121742e.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (this.f121741d != ErrorMode.IMMEDIATE) {
                this.f121748k = true;
                a();
                return;
            }
            this.f121743f.a();
            Throwable thC = this.f121742e.c();
            if (thC != ExceptionHelper.f123860a) {
                this.f121739b.onError(thC);
            }
            if (getAndIncrement() == 0) {
                this.f121745h.clear();
            }
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (this.f121745h.offer(t10)) {
                a();
            } else {
                this.f121746i.cancel();
                onError(new MissingBackpressureException("Queue full?!"));
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(e eVar) {
            if (SubscriptionHelper.validate(this.f121746i, eVar)) {
                this.f121746i = eVar;
                this.f121739b.onSubscribe(this);
                eVar.request(this.f121744g);
            }
        }
    }

    public FlowableConcatMapCompletable(j<T> jVar, o<? super T, ? extends g> oVar, ErrorMode errorMode, int i10) {
        this.f121735b = jVar;
        this.f121736c = oVar;
        this.f121737d = errorMode;
        this.f121738e = i10;
    }

    @Override // io.reactivex.a
    protected void J0(d dVar) {
        this.f121735b.j6(new ConcatMapCompletableObserver(dVar, this.f121736c, this.f121737d, this.f121738e));
    }
}
