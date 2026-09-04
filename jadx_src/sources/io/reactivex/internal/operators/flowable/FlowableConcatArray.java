package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableConcatArray<T> extends io.reactivex.j<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final org.reactivestreams.c<? extends T>[] f119993c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f119994d;

    public static final class ConcatArraySubscriber<T> extends SubscriptionArbiter implements io.reactivex.o<T> {
        private static final long serialVersionUID = -8158322871608889516L;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f119995j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final org.reactivestreams.c<? extends T>[] f119996k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final boolean f119997l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final AtomicInteger f119998m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f119999n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        List<Throwable> f120000o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        long f120001p;

        ConcatArraySubscriber(org.reactivestreams.c<? extends T>[] cVarArr, boolean z10, org.reactivestreams.d<? super T> dVar) {
            super(false);
            this.f119995j = dVar;
            this.f119996k = cVarArr;
            this.f119997l = z10;
            this.f119998m = new AtomicInteger();
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            if (this.f119998m.getAndIncrement() == 0) {
                org.reactivestreams.c<? extends T>[] cVarArr = this.f119996k;
                int length = cVarArr.length;
                int i10 = this.f119999n;
                while (i10 != length) {
                    org.reactivestreams.c<? extends T> cVar = cVarArr[i10];
                    if (cVar == null) {
                        NullPointerException nullPointerException = new NullPointerException("A Publisher entry is null");
                        if (!this.f119997l) {
                            this.f119995j.onError(nullPointerException);
                            return;
                        }
                        List arrayList = this.f120000o;
                        if (arrayList == null) {
                            arrayList = new ArrayList((length - i10) + 1);
                            this.f120000o = arrayList;
                        }
                        arrayList.add(nullPointerException);
                        i10++;
                    } else {
                        long j10 = this.f120001p;
                        if (j10 != 0) {
                            this.f120001p = 0L;
                            g(j10);
                        }
                        cVar.g(this);
                        i10++;
                        this.f119999n = i10;
                        if (this.f119998m.decrementAndGet() == 0) {
                            return;
                        }
                    }
                }
                List<Throwable> list = this.f120000o;
                if (list == null) {
                    this.f119995j.onComplete();
                } else if (list.size() == 1) {
                    this.f119995j.onError(list.get(0));
                } else {
                    this.f119995j.onError(new CompositeException(list));
                }
            }
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (!this.f119997l) {
                this.f119995j.onError(th2);
                return;
            }
            List arrayList = this.f120000o;
            if (arrayList == null) {
                arrayList = new ArrayList((this.f119996k.length - this.f119999n) + 1);
                this.f120000o = arrayList;
            }
            arrayList.add(th2);
            onComplete();
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            this.f120001p++;
            this.f119995j.onNext(t10);
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            h(eVar);
        }
    }

    public FlowableConcatArray(org.reactivestreams.c<? extends T>[] cVarArr, boolean z10) {
        this.f119993c = cVarArr;
        this.f119994d = z10;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super T> dVar) {
        ConcatArraySubscriber concatArraySubscriber = new ConcatArraySubscriber(this.f119993c, this.f119994d, dVar);
        dVar.onSubscribe(concatArraySubscriber);
        concatArraySubscriber.onComplete();
    }
}
