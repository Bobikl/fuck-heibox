package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableAmb<T> extends io.reactivex.j<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final org.reactivestreams.c<? extends T>[] f119881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Iterable<? extends org.reactivestreams.c<? extends T>> f119882d;

    public static final class AmbInnerSubscriber<T> extends AtomicReference<org.reactivestreams.e> implements io.reactivex.o<T>, org.reactivestreams.e {
        private static final long serialVersionUID = -1185974347409665484L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final a<T> f119883b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f119884c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f119885d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f119886e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final AtomicLong f119887f = new AtomicLong();

        AmbInnerSubscriber(a<T> aVar, int i10, org.reactivestreams.d<? super T> dVar) {
            this.f119883b = aVar;
            this.f119884c = i10;
            this.f119885d = dVar;
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            SubscriptionHelper.cancel(this);
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            if (this.f119886e) {
                this.f119885d.onComplete();
            } else if (!this.f119883b.b(this.f119884c)) {
                get().cancel();
            } else {
                this.f119886e = true;
                this.f119885d.onComplete();
            }
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (this.f119886e) {
                this.f119885d.onError(th2);
            } else if (this.f119883b.b(this.f119884c)) {
                this.f119886e = true;
                this.f119885d.onError(th2);
            } else {
                get().cancel();
                io.reactivex.plugins.a.Y(th2);
            }
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (this.f119886e) {
                this.f119885d.onNext(t10);
            } else if (!this.f119883b.b(this.f119884c)) {
                get().cancel();
            } else {
                this.f119886e = true;
                this.f119885d.onNext(t10);
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            SubscriptionHelper.deferredSetOnce(this, this.f119887f, eVar);
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            SubscriptionHelper.deferredRequest(this, this.f119887f, j10);
        }
    }

    public static final class a<T> implements org.reactivestreams.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f119888b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AmbInnerSubscriber<T>[] f119889c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicInteger f119890d = new AtomicInteger();

        a(org.reactivestreams.d<? super T> dVar, int i10) {
            this.f119888b = dVar;
            this.f119889c = new AmbInnerSubscriber[i10];
        }

        public void a(org.reactivestreams.c<? extends T>[] cVarArr) {
            AmbInnerSubscriber<T>[] ambInnerSubscriberArr = this.f119889c;
            int length = ambInnerSubscriberArr.length;
            int i10 = 0;
            while (i10 < length) {
                int i11 = i10 + 1;
                ambInnerSubscriberArr[i10] = new AmbInnerSubscriber<>(this, i11, this.f119888b);
                i10 = i11;
            }
            this.f119890d.lazySet(0);
            this.f119888b.onSubscribe(this);
            for (int i12 = 0; i12 < length && this.f119890d.get() == 0; i12++) {
                cVarArr[i12].g(ambInnerSubscriberArr[i12]);
            }
        }

        public boolean b(int i10) {
            int i11 = 0;
            if (this.f119890d.get() != 0 || !this.f119890d.compareAndSet(0, i10)) {
                return false;
            }
            AmbInnerSubscriber<T>[] ambInnerSubscriberArr = this.f119889c;
            int length = ambInnerSubscriberArr.length;
            while (i11 < length) {
                int i12 = i11 + 1;
                if (i12 != i10) {
                    ambInnerSubscriberArr[i11].cancel();
                }
                i11 = i12;
            }
            return true;
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            if (this.f119890d.get() != -1) {
                this.f119890d.lazySet(-1);
                for (AmbInnerSubscriber<T> ambInnerSubscriber : this.f119889c) {
                    ambInnerSubscriber.cancel();
                }
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                int i10 = this.f119890d.get();
                if (i10 > 0) {
                    this.f119889c[i10 - 1].request(j10);
                    return;
                }
                if (i10 == 0) {
                    for (AmbInnerSubscriber<T> ambInnerSubscriber : this.f119889c) {
                        ambInnerSubscriber.request(j10);
                    }
                }
            }
        }
    }

    public FlowableAmb(org.reactivestreams.c<? extends T>[] cVarArr, Iterable<? extends org.reactivestreams.c<? extends T>> iterable) {
        this.f119881c = cVarArr;
        this.f119882d = iterable;
    }

    @Override // io.reactivex.j
    public void k6(org.reactivestreams.d<? super T> dVar) {
        int length;
        org.reactivestreams.c<? extends T>[] cVarArr = this.f119881c;
        if (cVarArr == null) {
            cVarArr = new org.reactivestreams.c[8];
            try {
                length = 0;
                for (org.reactivestreams.c<? extends T> cVar : this.f119882d) {
                    if (cVar == null) {
                        EmptySubscription.error(new NullPointerException("One of the sources is null"), dVar);
                        return;
                    }
                    if (length == cVarArr.length) {
                        org.reactivestreams.c<? extends T>[] cVarArr2 = new org.reactivestreams.c[(length >> 2) + length];
                        System.arraycopy(cVarArr, 0, cVarArr2, 0, length);
                        cVarArr = cVarArr2;
                    }
                    int i10 = length + 1;
                    cVarArr[length] = cVar;
                    length = i10;
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                EmptySubscription.error(th2, dVar);
                return;
            }
        } else {
            length = cVarArr.length;
        }
        if (length == 0) {
            EmptySubscription.complete(dVar);
        } else if (length == 1) {
            cVarArr[0].g(dVar);
        } else {
            new a(dVar, length).a(cVarArr);
        }
    }
}
