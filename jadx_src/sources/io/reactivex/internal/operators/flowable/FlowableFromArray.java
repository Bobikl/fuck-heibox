package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableFromArray<T> extends io.reactivex.j<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final T[] f120229c;

    public static final class ArrayConditionalSubscription<T> extends BaseArraySubscription<T> {
        private static final long serialVersionUID = 2587302975077663557L;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final lh.a<? super T> f120230e;

        ArrayConditionalSubscription(lh.a<? super T> aVar, T[] tArr) {
            super(tArr);
            this.f120230e = aVar;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        void a() {
            T[] tArr = this.f120232b;
            int length = tArr.length;
            lh.a<? super T> aVar = this.f120230e;
            for (int i10 = this.f120233c; i10 != length; i10++) {
                if (this.f120234d) {
                    return;
                }
                T t10 = tArr[i10];
                if (t10 == null) {
                    aVar.onError(new NullPointerException("The element at index " + i10 + " is null"));
                    return;
                }
                aVar.m(t10);
            }
            if (this.f120234d) {
                return;
            }
            aVar.onComplete();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        void b(long j10) {
            T[] tArr = this.f120232b;
            int length = tArr.length;
            int i10 = this.f120233c;
            lh.a<? super T> aVar = this.f120230e;
            do {
                long j11 = 0;
                while (true) {
                    if (j11 == j10 || i10 == length) {
                        if (i10 == length) {
                            if (this.f120234d) {
                                return;
                            }
                            aVar.onComplete();
                            return;
                        } else {
                            j10 = get();
                            if (j11 == j10) {
                                break;
                            }
                        }
                    } else {
                        if (this.f120234d) {
                            return;
                        }
                        T t10 = tArr[i10];
                        if (t10 == null) {
                            aVar.onError(new NullPointerException("The element at index " + i10 + " is null"));
                            return;
                        }
                        if (aVar.m(t10)) {
                            j11++;
                        }
                        i10++;
                    }
                }
                this.f120233c = i10;
                j10 = addAndGet(-j11);
            } while (j10 != 0);
        }
    }

    public static final class ArraySubscription<T> extends BaseArraySubscription<T> {
        private static final long serialVersionUID = 2587302975077663557L;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f120231e;

        ArraySubscription(org.reactivestreams.d<? super T> dVar, T[] tArr) {
            super(tArr);
            this.f120231e = dVar;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        void a() {
            T[] tArr = this.f120232b;
            int length = tArr.length;
            org.reactivestreams.d<? super T> dVar = this.f120231e;
            for (int i10 = this.f120233c; i10 != length; i10++) {
                if (this.f120234d) {
                    return;
                }
                T t10 = tArr[i10];
                if (t10 == null) {
                    dVar.onError(new NullPointerException("The element at index " + i10 + " is null"));
                    return;
                }
                dVar.onNext(t10);
            }
            if (this.f120234d) {
                return;
            }
            dVar.onComplete();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        void b(long j10) {
            T[] tArr = this.f120232b;
            int length = tArr.length;
            int i10 = this.f120233c;
            org.reactivestreams.d<? super T> dVar = this.f120231e;
            do {
                long j11 = 0;
                while (true) {
                    if (j11 == j10 || i10 == length) {
                        if (i10 == length) {
                            if (this.f120234d) {
                                return;
                            }
                            dVar.onComplete();
                            return;
                        } else {
                            j10 = get();
                            if (j11 == j10) {
                                break;
                            }
                        }
                    } else {
                        if (this.f120234d) {
                            return;
                        }
                        T t10 = tArr[i10];
                        if (t10 == null) {
                            dVar.onError(new NullPointerException("The element at index " + i10 + " is null"));
                            return;
                        }
                        dVar.onNext(t10);
                        j11++;
                        i10++;
                    }
                }
                this.f120233c = i10;
                j10 = addAndGet(-j11);
            } while (j10 != 0);
        }
    }

    public static abstract class BaseArraySubscription<T> extends BasicQueueSubscription<T> {
        private static final long serialVersionUID = -2252972430506210021L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final T[] f120232b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f120233c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        volatile boolean f120234d;

        BaseArraySubscription(T[] tArr) {
            this.f120232b = tArr;
        }

        abstract void a();

        abstract void b(long j10);

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f120234d = true;
        }

        @Override // lh.o
        public final void clear() {
            this.f120233c = this.f120232b.length;
        }

        @Override // lh.o
        public final boolean isEmpty() {
            return this.f120233c == this.f120232b.length;
        }

        @Override // lh.o
        @jh.f
        public final T poll() {
            int i10 = this.f120233c;
            T[] tArr = this.f120232b;
            if (i10 == tArr.length) {
                return null;
            }
            this.f120233c = i10 + 1;
            return (T) io.reactivex.internal.functions.a.g(tArr[i10], "array element is null");
        }

        @Override // org.reactivestreams.e
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10) && io.reactivex.internal.util.b.a(this, j10) == 0) {
                if (j10 == Long.MAX_VALUE) {
                    a();
                } else {
                    b(j10);
                }
            }
        }

        @Override // lh.k
        public final int requestFusion(int i10) {
            return i10 & 1;
        }
    }

    public FlowableFromArray(T[] tArr) {
        this.f120229c = tArr;
    }

    @Override // io.reactivex.j
    public void k6(org.reactivestreams.d<? super T> dVar) {
        if (dVar instanceof lh.a) {
            dVar.onSubscribe(new ArrayConditionalSubscription((lh.a) dVar, this.f120229c));
        } else {
            dVar.onSubscribe(new ArraySubscription(dVar, this.f120229c));
        }
    }
}
