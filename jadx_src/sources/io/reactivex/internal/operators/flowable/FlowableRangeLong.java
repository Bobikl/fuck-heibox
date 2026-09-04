package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableRangeLong extends io.reactivex.j<Long> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f120555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final long f120556d;

    public static abstract class BaseRangeSubscription extends BasicQueueSubscription<Long> {
        private static final long serialVersionUID = -2252972430506210021L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f120557b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f120558c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        volatile boolean f120559d;

        BaseRangeSubscription(long j10, long j11) {
            this.f120558c = j10;
            this.f120557b = j11;
        }

        abstract void a();

        @Override // lh.o
        @jh.f
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Long poll() {
            long j10 = this.f120558c;
            if (j10 == this.f120557b) {
                return null;
            }
            this.f120558c = 1 + j10;
            return Long.valueOf(j10);
        }

        abstract void c(long j10);

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f120559d = true;
        }

        @Override // lh.o
        public final void clear() {
            this.f120558c = this.f120557b;
        }

        @Override // lh.o
        public final boolean isEmpty() {
            return this.f120558c == this.f120557b;
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
        final lh.a<? super Long> f120560e;

        RangeConditionalSubscription(lh.a<? super Long> aVar, long j10, long j11) {
            super(j10, j11);
            this.f120560e = aVar;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRangeLong.BaseRangeSubscription
        void a() {
            long j10 = this.f120557b;
            lh.a<? super Long> aVar = this.f120560e;
            for (long j11 = this.f120558c; j11 != j10; j11++) {
                if (this.f120559d) {
                    return;
                }
                aVar.m(Long.valueOf(j11));
            }
            if (this.f120559d) {
                return;
            }
            aVar.onComplete();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRangeLong.BaseRangeSubscription
        void c(long j10) {
            long j11 = this.f120557b;
            long j12 = this.f120558c;
            lh.a<? super Long> aVar = this.f120560e;
            do {
                long j13 = 0;
                while (true) {
                    if (j13 == j10 || j12 == j11) {
                        if (j12 == j11) {
                            if (this.f120559d) {
                                return;
                            }
                            aVar.onComplete();
                            return;
                        } else {
                            j10 = get();
                            if (j13 == j10) {
                                break;
                            }
                        }
                    } else {
                        if (this.f120559d) {
                            return;
                        }
                        if (aVar.m(Long.valueOf(j12))) {
                            j13++;
                        }
                        j12++;
                    }
                }
                this.f120558c = j12;
                j10 = addAndGet(-j13);
            } while (j10 != 0);
        }
    }

    public static final class RangeSubscription extends BaseRangeSubscription {
        private static final long serialVersionUID = 2587302975077663557L;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final org.reactivestreams.d<? super Long> f120561e;

        RangeSubscription(org.reactivestreams.d<? super Long> dVar, long j10, long j11) {
            super(j10, j11);
            this.f120561e = dVar;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRangeLong.BaseRangeSubscription
        void a() {
            long j10 = this.f120557b;
            org.reactivestreams.d<? super Long> dVar = this.f120561e;
            for (long j11 = this.f120558c; j11 != j10; j11++) {
                if (this.f120559d) {
                    return;
                }
                dVar.onNext(Long.valueOf(j11));
            }
            if (this.f120559d) {
                return;
            }
            dVar.onComplete();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRangeLong.BaseRangeSubscription
        void c(long j10) {
            long j11 = this.f120557b;
            long j12 = this.f120558c;
            org.reactivestreams.d<? super Long> dVar = this.f120561e;
            do {
                long j13 = 0;
                while (true) {
                    if (j13 == j10 || j12 == j11) {
                        if (j12 == j11) {
                            if (this.f120559d) {
                                return;
                            }
                            dVar.onComplete();
                            return;
                        } else {
                            j10 = get();
                            if (j13 == j10) {
                                break;
                            }
                        }
                    } else {
                        if (this.f120559d) {
                            return;
                        }
                        dVar.onNext(Long.valueOf(j12));
                        j13++;
                        j12++;
                    }
                }
                this.f120558c = j12;
                j10 = addAndGet(-j13);
            } while (j10 != 0);
        }
    }

    public FlowableRangeLong(long j10, long j11) {
        this.f120555c = j10;
        this.f120556d = j10 + j11;
    }

    @Override // io.reactivex.j
    public void k6(org.reactivestreams.d<? super Long> dVar) {
        if (dVar instanceof lh.a) {
            dVar.onSubscribe(new RangeConditionalSubscription((lh.a) dVar, this.f120555c, this.f120556d));
        } else {
            dVar.onSubscribe(new RangeSubscription(dVar, this.f120555c, this.f120556d));
        }
    }
}
