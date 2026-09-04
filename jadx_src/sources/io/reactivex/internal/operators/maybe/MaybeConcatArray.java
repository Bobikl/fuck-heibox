package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeConcatArray<T> extends io.reactivex.j<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.w<? extends T>[] f121411c;

    public static final class ConcatMaybeObserver<T> extends AtomicInteger implements io.reactivex.t<T>, org.reactivestreams.e {
        private static final long serialVersionUID = 3520831347801429610L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f121412b;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final io.reactivex.w<? extends T>[] f121416f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f121417g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        long f121418h;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicLong f121413c = new AtomicLong();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final SequentialDisposable f121415e = new SequentialDisposable();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicReference<Object> f121414d = new AtomicReference<>(NotificationLite.COMPLETE);

        ConcatMaybeObserver(org.reactivestreams.d<? super T> dVar, io.reactivex.w<? extends T>[] wVarArr) {
            this.f121412b = dVar;
            this.f121416f = wVarArr;
        }

        void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicReference<Object> atomicReference = this.f121414d;
            org.reactivestreams.d<? super T> dVar = this.f121412b;
            SequentialDisposable sequentialDisposable = this.f121415e;
            while (!sequentialDisposable.isDisposed()) {
                Object obj = atomicReference.get();
                if (obj != null) {
                    boolean z10 = true;
                    if (obj != NotificationLite.COMPLETE) {
                        long j10 = this.f121418h;
                        if (j10 != this.f121413c.get()) {
                            this.f121418h = j10 + 1;
                            atomicReference.lazySet(null);
                            dVar.onNext(obj);
                        } else {
                            z10 = false;
                        }
                    } else {
                        atomicReference.lazySet(null);
                    }
                    if (z10 && !sequentialDisposable.isDisposed()) {
                        int i10 = this.f121417g;
                        io.reactivex.w<? extends T>[] wVarArr = this.f121416f;
                        if (i10 == wVarArr.length) {
                            dVar.onComplete();
                            return;
                        } else {
                            this.f121417g = i10 + 1;
                            wVarArr[i10].f(this);
                        }
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
            this.f121415e.dispose();
        }

        @Override // io.reactivex.t
        public void onComplete() {
            this.f121414d.lazySet(NotificationLite.COMPLETE);
            a();
        }

        @Override // io.reactivex.t
        public void onError(Throwable th2) {
            this.f121412b.onError(th2);
        }

        @Override // io.reactivex.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            this.f121415e.a(bVar);
        }

        @Override // io.reactivex.t
        public void onSuccess(T t10) {
            this.f121414d.lazySet(t10);
            a();
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                io.reactivex.internal.util.b.a(this.f121413c, j10);
                a();
            }
        }
    }

    public MaybeConcatArray(io.reactivex.w<? extends T>[] wVarArr) {
        this.f121411c = wVarArr;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super T> dVar) {
        ConcatMaybeObserver concatMaybeObserver = new ConcatMaybeObserver(dVar, this.f121411c);
        dVar.onSubscribe(concatMaybeObserver);
        concatMaybeObserver.a();
    }
}
