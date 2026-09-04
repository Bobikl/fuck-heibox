package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.NotificationLite;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeConcatArrayDelayError<T> extends io.reactivex.j<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.w<? extends T>[] f121419c;

    public static final class ConcatMaybeObserver<T> extends AtomicInteger implements io.reactivex.t<T>, org.reactivestreams.e {
        private static final long serialVersionUID = 3520831347801429610L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f121420b;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final io.reactivex.w<? extends T>[] f121424f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f121426h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        long f121427i;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicLong f121421c = new AtomicLong();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final SequentialDisposable f121423e = new SequentialDisposable();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicReference<Object> f121422d = new AtomicReference<>(NotificationLite.COMPLETE);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final AtomicThrowable f121425g = new AtomicThrowable();

        ConcatMaybeObserver(org.reactivestreams.d<? super T> dVar, io.reactivex.w<? extends T>[] wVarArr) {
            this.f121420b = dVar;
            this.f121424f = wVarArr;
        }

        void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicReference<Object> atomicReference = this.f121422d;
            org.reactivestreams.d<? super T> dVar = this.f121420b;
            SequentialDisposable sequentialDisposable = this.f121423e;
            while (!sequentialDisposable.isDisposed()) {
                Object obj = atomicReference.get();
                if (obj != null) {
                    boolean z10 = true;
                    if (obj != NotificationLite.COMPLETE) {
                        long j10 = this.f121427i;
                        if (j10 != this.f121421c.get()) {
                            this.f121427i = j10 + 1;
                            atomicReference.lazySet(null);
                            dVar.onNext(obj);
                        } else {
                            z10 = false;
                        }
                    } else {
                        atomicReference.lazySet(null);
                    }
                    if (z10 && !sequentialDisposable.isDisposed()) {
                        int i10 = this.f121426h;
                        io.reactivex.w<? extends T>[] wVarArr = this.f121424f;
                        if (i10 == wVarArr.length) {
                            if (this.f121425g.get() != null) {
                                dVar.onError(this.f121425g.c());
                                return;
                            } else {
                                dVar.onComplete();
                                return;
                            }
                        }
                        this.f121426h = i10 + 1;
                        wVarArr[i10].f(this);
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            atomicReference.lazySet(null);
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            this.f121423e.dispose();
        }

        @Override // io.reactivex.t
        public void onComplete() {
            this.f121422d.lazySet(NotificationLite.COMPLETE);
            a();
        }

        @Override // io.reactivex.t
        public void onError(Throwable th2) {
            this.f121422d.lazySet(NotificationLite.COMPLETE);
            if (this.f121425g.a(th2)) {
                a();
            } else {
                io.reactivex.plugins.a.Y(th2);
            }
        }

        @Override // io.reactivex.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            this.f121423e.a(bVar);
        }

        @Override // io.reactivex.t
        public void onSuccess(T t10) {
            this.f121422d.lazySet(t10);
            a();
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                io.reactivex.internal.util.b.a(this.f121421c, j10);
                a();
            }
        }
    }

    public MaybeConcatArrayDelayError(io.reactivex.w<? extends T>[] wVarArr) {
        this.f121419c = wVarArr;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super T> dVar) {
        ConcatMaybeObserver concatMaybeObserver = new ConcatMaybeObserver(dVar, this.f121419c);
        dVar.onSubscribe(concatMaybeObserver);
        concatMaybeObserver.a();
    }
}
