package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeConcatIterable<T> extends io.reactivex.j<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Iterable<? extends io.reactivex.w<? extends T>> f121428c;

    public static final class ConcatMaybeObserver<T> extends AtomicInteger implements io.reactivex.t<T>, org.reactivestreams.e {
        private static final long serialVersionUID = 3520831347801429610L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f121429b;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final Iterator<? extends io.reactivex.w<? extends T>> f121433f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        long f121434g;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicLong f121430c = new AtomicLong();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final SequentialDisposable f121432e = new SequentialDisposable();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicReference<Object> f121431d = new AtomicReference<>(NotificationLite.COMPLETE);

        ConcatMaybeObserver(org.reactivestreams.d<? super T> dVar, Iterator<? extends io.reactivex.w<? extends T>> it) {
            this.f121429b = dVar;
            this.f121433f = it;
        }

        void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicReference<Object> atomicReference = this.f121431d;
            org.reactivestreams.d<? super T> dVar = this.f121429b;
            SequentialDisposable sequentialDisposable = this.f121432e;
            while (!sequentialDisposable.isDisposed()) {
                Object obj = atomicReference.get();
                if (obj != null) {
                    boolean z10 = true;
                    if (obj != NotificationLite.COMPLETE) {
                        long j10 = this.f121434g;
                        if (j10 != this.f121430c.get()) {
                            this.f121434g = j10 + 1;
                            atomicReference.lazySet(null);
                            dVar.onNext(obj);
                        } else {
                            z10 = false;
                        }
                    } else {
                        atomicReference.lazySet(null);
                    }
                    if (z10 && !sequentialDisposable.isDisposed()) {
                        try {
                            if (this.f121433f.hasNext()) {
                                try {
                                    ((io.reactivex.w) io.reactivex.internal.functions.a.g(this.f121433f.next(), "The source Iterator returned a null MaybeSource")).f(this);
                                } catch (Throwable th2) {
                                    io.reactivex.exceptions.a.b(th2);
                                    dVar.onError(th2);
                                    return;
                                }
                            } else {
                                dVar.onComplete();
                            }
                        } catch (Throwable th3) {
                            io.reactivex.exceptions.a.b(th3);
                            dVar.onError(th3);
                            return;
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
            this.f121432e.dispose();
        }

        @Override // io.reactivex.t
        public void onComplete() {
            this.f121431d.lazySet(NotificationLite.COMPLETE);
            a();
        }

        @Override // io.reactivex.t
        public void onError(Throwable th2) {
            this.f121429b.onError(th2);
        }

        @Override // io.reactivex.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            this.f121432e.a(bVar);
        }

        @Override // io.reactivex.t
        public void onSuccess(T t10) {
            this.f121431d.lazySet(t10);
            a();
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                io.reactivex.internal.util.b.a(this.f121430c, j10);
                a();
            }
        }
    }

    public MaybeConcatIterable(Iterable<? extends io.reactivex.w<? extends T>> iterable) {
        this.f121428c = iterable;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super T> dVar) {
        try {
            ConcatMaybeObserver concatMaybeObserver = new ConcatMaybeObserver(dVar, (Iterator) io.reactivex.internal.functions.a.g(this.f121428c.iterator(), "The sources Iterable returned a null Iterator"));
            dVar.onSubscribe(concatMaybeObserver);
            concatMaybeObserver.a();
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            EmptySubscription.error(th2, dVar);
        }
    }
}
