package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableTakeLast<T> extends a<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f120799d;

    public static final class TakeLastSubscriber<T> extends ArrayDeque<T> implements io.reactivex.o<T>, org.reactivestreams.e {
        private static final long serialVersionUID = 7240042530241604978L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f120800b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f120801c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        org.reactivestreams.e f120802d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        volatile boolean f120803e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        volatile boolean f120804f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final AtomicLong f120805g = new AtomicLong();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final AtomicInteger f120806h = new AtomicInteger();

        TakeLastSubscriber(org.reactivestreams.d<? super T> dVar, int i10) {
            this.f120800b = dVar;
            this.f120801c = i10;
        }

        void a() {
            if (this.f120806h.getAndIncrement() == 0) {
                org.reactivestreams.d<? super T> dVar = this.f120800b;
                long jAddAndGet = this.f120805g.get();
                while (!this.f120804f) {
                    if (this.f120803e) {
                        long j10 = 0;
                        while (j10 != jAddAndGet) {
                            if (this.f120804f) {
                                return;
                            }
                            T tPoll = poll();
                            if (tPoll == null) {
                                dVar.onComplete();
                                return;
                            } else {
                                dVar.onNext(tPoll);
                                j10++;
                            }
                        }
                        if (j10 != 0 && jAddAndGet != Long.MAX_VALUE) {
                            jAddAndGet = this.f120805g.addAndGet(-j10);
                        }
                    }
                    if (this.f120806h.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            this.f120804f = true;
            this.f120802d.cancel();
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            this.f120803e = true;
            a();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            this.f120800b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (this.f120801c == size()) {
                poll();
            }
            offer(t10);
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f120802d, eVar)) {
                this.f120802d = eVar;
                this.f120800b.onSubscribe(this);
                eVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                io.reactivex.internal.util.b.a(this.f120805g, j10);
                a();
            }
        }
    }

    public FlowableTakeLast(io.reactivex.j<T> jVar, int i10) {
        super(jVar);
        this.f120799d = i10;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super T> dVar) {
        this.f121039c.j6(new TakeLastSubscriber(dVar, this.f120799d));
    }
}
