package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableRange extends io.reactivex.j<Integer> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f120548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f120549d;

    public static abstract class BaseRangeSubscription extends BasicQueueSubscription<Integer> {
        private static final long serialVersionUID = -2252972430506210021L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f120550b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f120551c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        volatile boolean f120552d;

        BaseRangeSubscription(int i10, int i11) {
            this.f120551c = i10;
            this.f120550b = i11;
        }

        abstract void a();

        @Override // lh.o
        @jh.f
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Integer poll() {
            int i10 = this.f120551c;
            if (i10 == this.f120550b) {
                return null;
            }
            this.f120551c = i10 + 1;
            return Integer.valueOf(i10);
        }

        abstract void c(long j10);

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f120552d = true;
        }

        @Override // lh.o
        public final void clear() {
            this.f120551c = this.f120550b;
        }

        @Override // lh.o
        public final boolean isEmpty() {
            return this.f120551c == this.f120550b;
        }

        @Override // org.reactivestreams.e
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10) && io.reactivex.internal.util.b.a(this, j10) == 0) {
                if (j10 == Long.MAX_VALUE) {
                    a();
                } else {
                    c(j10);
                }
            }
        }

        @Override // lh.k
        public final int requestFusion(int i10) {
            return i10 & 1;
        }
    }

    public static final class RangeConditionalSubscription extends BaseRangeSubscription {
        private static final long serialVersionUID = 2587302975077663557L;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final lh.a<? super Integer> f120553e;

        RangeConditionalSubscription(lh.a<? super Integer> aVar, int i10, int i11) {
            super(i10, i11);
            this.f120553e = aVar;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRange.BaseRangeSubscription
        void a() {
            int i10 = this.f120550b;
            lh.a<? super Integer> aVar = this.f120553e;
            for (int i11 = this.f120551c; i11 != i10; i11++) {
                if (this.f120552d) {
                    return;
                }
                aVar.m(Integer.valueOf(i11));
            }
            if (this.f120552d) {
                return;
            }
            aVar.onComplete();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRange.BaseRangeSubscription
        void c(long j10) {
            int i10 = this.f120550b;
            int i11 = this.f120551c;
            lh.a<? super Integer> aVar = this.f120553e;
            do {
                long j11 = 0;
                while (true) {
                    if (j11 == j10 || i11 == i10) {
                        if (i11 == i10) {
                            if (this.f120552d) {
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
                        if (this.f120552d) {
                            return;
                        }
                        if (aVar.m(Integer.valueOf(i11))) {
                            j11++;
                        }
                        i11++;
                    }
                }
                this.f120551c = i11;
                j10 = addAndGet(-j11);
            } while (j10 != 0);
        }
    }

    public static final class RangeSubscription extends BaseRangeSubscription {
        private static final long serialVersionUID = 2587302975077663557L;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final org.reactivestreams.d<? super Integer> f120554e;

        RangeSubscription(org.reactivestreams.d<? super Integer> dVar, int i10, int i11) {
            super(i10, i11);
            this.f120554e = dVar;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRange.BaseRangeSubscription
        void a() {
            int i10 = this.f120550b;
            org.reactivestreams.d<? super Integer> dVar = this.f120554e;
            for (int i11 = this.f120551c; i11 != i10; i11++) {
                if (this.f120552d) {
                    return;
                }
                dVar.onNext(Integer.valueOf(i11));
            }
            if (this.f120552d) {
                return;
            }
            dVar.onComplete();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRange.BaseRangeSubscription
        void c(long j10) {
            int i10 = this.f120550b;
            int i11 = this.f120551c;
            org.reactivestreams.d<? super Integer> dVar = this.f120554e;
            do {
                long j11 = 0;
                while (true) {
                    if (j11 == j10 || i11 == i10) {
                        if (i11 == i10) {
                            if (this.f120552d) {
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
                        if (this.f120552d) {
                            return;
                        }
                        dVar.onNext(Integer.valueOf(i11));
                        j11++;
                        i11++;
                    }
                }
                this.f120551c = i11;
                j10 = addAndGet(-j11);
            } while (j10 != 0);
        }
    }

    public FlowableRange(int i10, int i11) {
        this.f120548c = i10;
        this.f120549d = i10 + i11;
    }

    @Override // io.reactivex.j
    public void k6(org.reactivestreams.d<? super Integer> dVar) {
        if (dVar instanceof lh.a) {
            dVar.onSubscribe(new RangeConditionalSubscription((lh.a) dVar, this.f120548c, this.f120549d));
        } else {
            dVar.onSubscribe(new RangeSubscription(dVar, this.f120548c, this.f120549d));
        }
    }
}
