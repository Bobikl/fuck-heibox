package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableDoFinally<T> extends a<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.a f120108d;

    public static final class DoFinallyConditionalSubscriber<T> extends BasicIntQueueSubscription<T> implements lh.a<T> {
        private static final long serialVersionUID = 4109457741734051389L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final lh.a<? super T> f120109b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.a f120110c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        org.reactivestreams.e f120111d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        lh.l<T> f120112e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f120113f;

        DoFinallyConditionalSubscriber(lh.a<? super T> aVar, kh.a aVar2) {
            this.f120109b = aVar;
            this.f120110c = aVar2;
        }

        void c() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f120110c.run();
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.b(th2);
                    io.reactivex.plugins.a.Y(th2);
                }
            }
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            this.f120111d.cancel();
            c();
        }

        @Override // lh.o
        public void clear() {
            this.f120112e.clear();
        }

        @Override // lh.o
        public boolean isEmpty() {
            return this.f120112e.isEmpty();
        }

        @Override // lh.a
        public boolean m(T t10) {
            return this.f120109b.m(t10);
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            this.f120109b.onComplete();
            c();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            this.f120109b.onError(th2);
            c();
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            this.f120109b.onNext(t10);
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f120111d, eVar)) {
                this.f120111d = eVar;
                if (eVar instanceof lh.l) {
                    this.f120112e = (lh.l) eVar;
                }
                this.f120109b.onSubscribe(this);
            }
        }

        @Override // lh.o
        @jh.f
        public T poll() throws Exception {
            T tPoll = this.f120112e.poll();
            if (tPoll == null && this.f120113f) {
                c();
            }
            return tPoll;
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            this.f120111d.request(j10);
        }

        @Override // lh.k
        public int requestFusion(int i10) {
            lh.l<T> lVar = this.f120112e;
            if (lVar == null || (i10 & 4) != 0) {
                return 0;
            }
            int iRequestFusion = lVar.requestFusion(i10);
            if (iRequestFusion != 0) {
                this.f120113f = iRequestFusion == 1;
            }
            return iRequestFusion;
        }
    }

    public static final class DoFinallySubscriber<T> extends BasicIntQueueSubscription<T> implements io.reactivex.o<T> {
        private static final long serialVersionUID = 4109457741734051389L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f120114b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.a f120115c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        org.reactivestreams.e f120116d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        lh.l<T> f120117e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f120118f;

        DoFinallySubscriber(org.reactivestreams.d<? super T> dVar, kh.a aVar) {
            this.f120114b = dVar;
            this.f120115c = aVar;
        }

        void c() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f120115c.run();
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.b(th2);
                    io.reactivex.plugins.a.Y(th2);
                }
            }
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            this.f120116d.cancel();
            c();
        }

        @Override // lh.o
        public void clear() {
            this.f120117e.clear();
        }

        @Override // lh.o
        public boolean isEmpty() {
            return this.f120117e.isEmpty();
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            this.f120114b.onComplete();
            c();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            this.f120114b.onError(th2);
            c();
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            this.f120114b.onNext(t10);
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f120116d, eVar)) {
                this.f120116d = eVar;
                if (eVar instanceof lh.l) {
                    this.f120117e = (lh.l) eVar;
                }
                this.f120114b.onSubscribe(this);
            }
        }

        @Override // lh.o
        @jh.f
        public T poll() throws Exception {
            T tPoll = this.f120117e.poll();
            if (tPoll == null && this.f120118f) {
                c();
            }
            return tPoll;
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            this.f120116d.request(j10);
        }

        @Override // lh.k
        public int requestFusion(int i10) {
            lh.l<T> lVar = this.f120117e;
            if (lVar == null || (i10 & 4) != 0) {
                return 0;
            }
            int iRequestFusion = lVar.requestFusion(i10);
            if (iRequestFusion != 0) {
                this.f120118f = iRequestFusion == 1;
            }
            return iRequestFusion;
        }
    }

    public FlowableDoFinally(io.reactivex.j<T> jVar, kh.a aVar) {
        super(jVar);
        this.f120108d = aVar;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super T> dVar) {
        if (dVar instanceof lh.a) {
            this.f121039c.j6(new DoFinallyConditionalSubscriber((lh.a) dVar, this.f120108d));
        } else {
            this.f121039c.j6(new DoFinallySubscriber(dVar, this.f120108d));
        }
    }
}
