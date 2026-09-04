package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.Iterator;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableFromIterable<T> extends io.reactivex.j<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Iterable<? extends T> f120235c;

    public static abstract class BaseRangeSubscription<T> extends BasicQueueSubscription<T> {
        private static final long serialVersionUID = -2252972430506210021L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Iterator<? extends T> f120236b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        volatile boolean f120237c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f120238d;

        BaseRangeSubscription(Iterator<? extends T> it) {
            this.f120236b = it;
        }

        abstract void a();

        abstract void b(long j10);

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f120237c = true;
        }

        @Override // lh.o
        public final void clear() {
            this.f120236b = null;
        }

        @Override // lh.o
        public final boolean isEmpty() {
            Iterator<? extends T> it = this.f120236b;
            return it == null || !it.hasNext();
        }

        @Override // lh.o
        @jh.f
        public final T poll() {
            Iterator<? extends T> it = this.f120236b;
            if (it == null) {
                return null;
            }
            if (!this.f120238d) {
                this.f120238d = true;
            } else if (!it.hasNext()) {
                return null;
            }
            return (T) io.reactivex.internal.functions.a.g(this.f120236b.next(), "Iterator.next() returned a null value");
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

    public static final class IteratorConditionalSubscription<T> extends BaseRangeSubscription<T> {
        private static final long serialVersionUID = -6022804456014692607L;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final lh.a<? super T> f120239e;

        IteratorConditionalSubscription(lh.a<? super T> aVar, Iterator<? extends T> it) {
            super(it);
            this.f120239e = aVar;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription
        void a() {
            Iterator<? extends T> it = this.f120236b;
            lh.a<? super T> aVar = this.f120239e;
            while (!this.f120237c) {
                try {
                    T next = it.next();
                    if (this.f120237c) {
                        return;
                    }
                    if (next == null) {
                        aVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                        return;
                    }
                    aVar.m(next);
                    if (this.f120237c) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            if (this.f120237c) {
                                return;
                            }
                            aVar.onComplete();
                            return;
                        }
                    } catch (Throwable th2) {
                        io.reactivex.exceptions.a.b(th2);
                        aVar.onError(th2);
                        return;
                    }
                } catch (Throwable th3) {
                    io.reactivex.exceptions.a.b(th3);
                    aVar.onError(th3);
                    return;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription
        void b(long j10) {
            Iterator<? extends T> it = this.f120236b;
            lh.a<? super T> aVar = this.f120239e;
            do {
                long j11 = 0;
                while (true) {
                    if (j11 == j10) {
                        j10 = get();
                        if (j11 == j10) {
                            break;
                        }
                    } else {
                        if (this.f120237c) {
                            return;
                        }
                        try {
                            T next = it.next();
                            if (this.f120237c) {
                                return;
                            }
                            if (next == null) {
                                aVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                                return;
                            }
                            boolean zM = aVar.m(next);
                            if (this.f120237c) {
                                return;
                            }
                            try {
                                if (!it.hasNext()) {
                                    if (this.f120237c) {
                                        return;
                                    }
                                    aVar.onComplete();
                                    return;
                                } else if (zM) {
                                    j11++;
                                }
                            } catch (Throwable th2) {
                                io.reactivex.exceptions.a.b(th2);
                                aVar.onError(th2);
                                return;
                            }
                        } catch (Throwable th3) {
                            io.reactivex.exceptions.a.b(th3);
                            aVar.onError(th3);
                            return;
                        }
                    }
                }
                j10 = addAndGet(-j11);
            } while (j10 != 0);
        }
    }

    public static final class IteratorSubscription<T> extends BaseRangeSubscription<T> {
        private static final long serialVersionUID = -6022804456014692607L;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f120240e;

        IteratorSubscription(org.reactivestreams.d<? super T> dVar, Iterator<? extends T> it) {
            super(it);
            this.f120240e = dVar;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription
        void a() {
            Iterator<? extends T> it = this.f120236b;
            org.reactivestreams.d<? super T> dVar = this.f120240e;
            while (!this.f120237c) {
                try {
                    T next = it.next();
                    if (this.f120237c) {
                        return;
                    }
                    if (next == null) {
                        dVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                        return;
                    }
                    dVar.onNext(next);
                    if (this.f120237c) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            if (this.f120237c) {
                                return;
                            }
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

        @Override // io.reactivex.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription
        void b(long j10) {
            Iterator<? extends T> it = this.f120236b;
            org.reactivestreams.d<? super T> dVar = this.f120240e;
            do {
                long j11 = 0;
                while (true) {
                    if (j11 == j10) {
                        j10 = get();
                        if (j11 == j10) {
                            break;
                        }
                    } else {
                        if (this.f120237c) {
                            return;
                        }
                        try {
                            T next = it.next();
                            if (this.f120237c) {
                                return;
                            }
                            if (next == null) {
                                dVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                                return;
                            }
                            dVar.onNext(next);
                            if (this.f120237c) {
                                return;
                            }
                            try {
                                if (!it.hasNext()) {
                                    if (this.f120237c) {
                                        return;
                                    }
                                    dVar.onComplete();
                                    return;
                                }
                                j11++;
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
                j10 = addAndGet(-j11);
            } while (j10 != 0);
        }
    }

    public FlowableFromIterable(Iterable<? extends T> iterable) {
        this.f120235c = iterable;
    }

    public static <T> void M8(org.reactivestreams.d<? super T> dVar, Iterator<? extends T> it) {
        try {
            if (!it.hasNext()) {
                EmptySubscription.complete(dVar);
            } else if (dVar instanceof lh.a) {
                dVar.onSubscribe(new IteratorConditionalSubscription((lh.a) dVar, it));
            } else {
                dVar.onSubscribe(new IteratorSubscription(dVar, it));
            }
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            EmptySubscription.error(th2, dVar);
        }
    }

    @Override // io.reactivex.j
    public void k6(org.reactivestreams.d<? super T> dVar) {
        try {
            M8(dVar, this.f120235c.iterator());
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            EmptySubscription.error(th2, dVar);
        }
    }
}
