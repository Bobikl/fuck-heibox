package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeFlatMapIterableFlowable<T, R> extends io.reactivex.j<R> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.w<T> f121488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.o<? super T, ? extends Iterable<? extends R>> f121489d;

    public static final class FlatMapIterableObserver<T, R> extends BasicIntQueueSubscription<R> implements io.reactivex.t<T> {
        private static final long serialVersionUID = -8938804753851907758L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super R> f121490b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.o<? super T, ? extends Iterable<? extends R>> f121491c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicLong f121492d = new AtomicLong();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        io.reactivex.disposables.b f121493e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        volatile Iterator<? extends R> f121494f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        volatile boolean f121495g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f121496h;

        FlatMapIterableObserver(org.reactivestreams.d<? super R> dVar, kh.o<? super T, ? extends Iterable<? extends R>> oVar) {
            this.f121490b = dVar;
            this.f121491c = oVar;
        }

        void b() {
            if (getAndIncrement() != 0) {
                return;
            }
            org.reactivestreams.d<? super R> dVar = this.f121490b;
            Iterator<? extends R> it = this.f121494f;
            if (this.f121496h && it != null) {
                dVar.onNext(null);
                dVar.onComplete();
                return;
            }
            int iAddAndGet = 1;
            while (true) {
                if (it != null) {
                    long j10 = this.f121492d.get();
                    if (j10 == Long.MAX_VALUE) {
                        c(dVar, it);
                        return;
                    }
                    long j11 = 0;
                    while (j11 != j10) {
                        if (this.f121495g) {
                            return;
                        }
                        try {
                            dVar.onNext((Object) io.reactivex.internal.functions.a.g(it.next(), "The iterator returned a null value"));
                            if (this.f121495g) {
                                return;
                            }
                            j11++;
                            try {
                                if (!it.hasNext()) {
                                    dVar.onComplete();
                                    return;
                                }
                            } catch (Throwable th2) {
                                io.reactivex.exceptions.a.b(th2);
                                dVar.onError(th2);
                                return;
                            }
                        } catch (Throwable th3) {
                            io.reactivex.exceptions.a.b(th3);
                            dVar.onError(th3);
                            return;
                        }
                    }
                    if (j11 != 0) {
                        io.reactivex.internal.util.b.e(this.f121492d, j11);
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                if (it == null) {
                    it = this.f121494f;
                }
            }
        }

        void c(org.reactivestreams.d<? super R> dVar, Iterator<? extends R> it) {
            while (!this.f121495g) {
                try {
                    dVar.onNext(it.next());
                    if (this.f121495g) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            dVar.onComplete();
                            return;
                        }
                    } catch (Throwable th2) {
                        io.reactivex.exceptions.a.b(th2);
                        dVar.onError(th2);
                        return;
                    }
                } catch (Throwable th3) {
                    io.reactivex.exceptions.a.b(th3);
                    dVar.onError(th3);
                    return;
                }
            }
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            this.f121495g = true;
            this.f121493e.dispose();
            this.f121493e = DisposableHelper.DISPOSED;
        }

        @Override // lh.o
        public void clear() {
            this.f121494f = null;
        }

        @Override // lh.o
        public boolean isEmpty() {
            return this.f121494f == null;
        }

        @Override // io.reactivex.t
        public void onComplete() {
            this.f121490b.onComplete();
        }

        @Override // io.reactivex.t
        public void onError(Throwable th2) {
            this.f121493e = DisposableHelper.DISPOSED;
            this.f121490b.onError(th2);
        }

        @Override // io.reactivex.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f121493e, bVar)) {
                this.f121493e = bVar;
                this.f121490b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.t
        public void onSuccess(T t10) {
            try {
                Iterator<? extends R> it = this.f121491c.apply(t10).iterator();
                if (!it.hasNext()) {
                    this.f121490b.onComplete();
                } else {
                    this.f121494f = it;
                    b();
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f121490b.onError(th2);
            }
        }

        @Override // lh.o
        @jh.f
        public R poll() throws Exception {
            Iterator<? extends R> it = this.f121494f;
            if (it == null) {
                return null;
            }
            R r10 = (R) io.reactivex.internal.functions.a.g(it.next(), "The iterator returned a null value");
            if (!it.hasNext()) {
                this.f121494f = null;
            }
            return r10;
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                io.reactivex.internal.util.b.a(this.f121492d, j10);
                b();
            }
        }

        @Override // lh.k
        public int requestFusion(int i10) {
            if ((i10 & 2) == 0) {
                return 0;
            }
            this.f121496h = true;
            return 2;
        }
    }

    public MaybeFlatMapIterableFlowable(io.reactivex.w<T> wVar, kh.o<? super T, ? extends Iterable<? extends R>> oVar) {
        this.f121488c = wVar;
        this.f121489d = oVar;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super R> dVar) {
        this.f121488c.f(new FlatMapIterableObserver(dVar, this.f121489d));
    }
}
