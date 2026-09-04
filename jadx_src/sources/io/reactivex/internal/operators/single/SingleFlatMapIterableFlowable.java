package io.reactivex.internal.operators.single;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.l0;
import io.reactivex.o0;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes5.dex */
public final class SingleFlatMapIterableFlowable<T, R> extends io.reactivex.j<R> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final o0<T> f123396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.o<? super T, ? extends Iterable<? extends R>> f123397d;

    public static final class FlatMapIterableObserver<T, R> extends BasicIntQueueSubscription<R> implements l0<T> {
        private static final long serialVersionUID = -8938804753851907758L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super R> f123398b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.o<? super T, ? extends Iterable<? extends R>> f123399c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicLong f123400d = new AtomicLong();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        io.reactivex.disposables.b f123401e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        volatile Iterator<? extends R> f123402f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        volatile boolean f123403g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f123404h;

        FlatMapIterableObserver(org.reactivestreams.d<? super R> dVar, kh.o<? super T, ? extends Iterable<? extends R>> oVar) {
            this.f123398b = dVar;
            this.f123399c = oVar;
        }

        void b() {
            if (getAndIncrement() != 0) {
                return;
            }
            org.reactivestreams.d<? super R> dVar = this.f123398b;
            Iterator<? extends R> it = this.f123402f;
            if (this.f123404h && it != null) {
                dVar.onNext(null);
                dVar.onComplete();
                return;
            }
            int iAddAndGet = 1;
            while (true) {
                if (it != null) {
                    long j10 = this.f123400d.get();
                    if (j10 == Long.MAX_VALUE) {
                        c(dVar, it);
                        return;
                    }
                    long j11 = 0;
                    while (j11 != j10) {
                        if (this.f123403g) {
                            return;
                        }
                        try {
                            dVar.onNext((Object) io.reactivex.internal.functions.a.g(it.next(), "The iterator returned a null value"));
                            if (this.f123403g) {
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
                        io.reactivex.internal.util.b.e(this.f123400d, j11);
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                if (it == null) {
                    it = this.f123402f;
                }
            }
        }

        void c(org.reactivestreams.d<? super R> dVar, Iterator<? extends R> it) {
            while (!this.f123403g) {
                try {
                    dVar.onNext(it.next());
                    if (this.f123403g) {
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
            this.f123403g = true;
            this.f123401e.dispose();
            this.f123401e = DisposableHelper.DISPOSED;
        }

        @Override // lh.o
        public void clear() {
            this.f123402f = null;
        }

        @Override // lh.o
        public boolean isEmpty() {
            return this.f123402f == null;
        }

        @Override // io.reactivex.l0
        public void onError(Throwable th2) {
            this.f123401e = DisposableHelper.DISPOSED;
            this.f123398b.onError(th2);
        }

        @Override // io.reactivex.l0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f123401e, bVar)) {
                this.f123401e = bVar;
                this.f123398b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.l0
        public void onSuccess(T t10) {
            try {
                Iterator<? extends R> it = this.f123399c.apply(t10).iterator();
                if (!it.hasNext()) {
                    this.f123398b.onComplete();
                } else {
                    this.f123402f = it;
                    b();
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f123398b.onError(th2);
            }
        }

        @Override // lh.o
        @jh.f
        public R poll() throws Exception {
            Iterator<? extends R> it = this.f123402f;
            if (it == null) {
                return null;
            }
            R r10 = (R) io.reactivex.internal.functions.a.g(it.next(), "The iterator returned a null value");
            if (!it.hasNext()) {
                this.f123402f = null;
            }
            return r10;
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                io.reactivex.internal.util.b.a(this.f123400d, j10);
                b();
            }
        }

        @Override // lh.k
        public int requestFusion(int i10) {
            if ((i10 & 2) == 0) {
                return 0;
            }
            this.f123404h = true;
            return 2;
        }
    }

    public SingleFlatMapIterableFlowable(o0<T> o0Var, kh.o<? super T, ? extends Iterable<? extends R>> oVar) {
        this.f123396c = o0Var;
        this.f123397d = oVar;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super R> dVar) {
        this.f123396c.f(new FlatMapIterableObserver(dVar, this.f123397d));
    }
}
