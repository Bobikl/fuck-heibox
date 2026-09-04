package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableTimeout<T, U, V> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final org.reactivestreams.c<U> f120862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final kh.o<? super T, ? extends org.reactivestreams.c<V>> f120863e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final org.reactivestreams.c<? extends T> f120864f;

    public static final class TimeoutConsumer extends AtomicReference<org.reactivestreams.e> implements io.reactivex.o<Object>, io.reactivex.disposables.b {
        private static final long serialVersionUID = 8708641127342403073L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final a f120865b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f120866c;

        TimeoutConsumer(long j10, a aVar) {
            this.f120866c = j10;
            this.f120865b = aVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return get() == SubscriptionHelper.CANCELLED;
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            Object obj = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (obj != subscriptionHelper) {
                lazySet(subscriptionHelper);
                this.f120865b.b(this.f120866c);
            }
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            Object obj = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (obj == subscriptionHelper) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                lazySet(subscriptionHelper);
                this.f120865b.a(this.f120866c, th2);
            }
        }

        @Override // org.reactivestreams.d
        public void onNext(Object obj) {
            org.reactivestreams.e eVar = (org.reactivestreams.e) get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (eVar != subscriptionHelper) {
                eVar.cancel();
                lazySet(subscriptionHelper);
                this.f120865b.b(this.f120866c);
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            SubscriptionHelper.setOnce(this, eVar, Long.MAX_VALUE);
        }
    }

    public static final class TimeoutFallbackSubscriber<T> extends SubscriptionArbiter implements io.reactivex.o<T>, a {
        private static final long serialVersionUID = 3764492702657003550L;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f120867j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final kh.o<? super T, ? extends org.reactivestreams.c<?>> f120868k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final SequentialDisposable f120869l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final AtomicReference<org.reactivestreams.e> f120870m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final AtomicLong f120871n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        org.reactivestreams.c<? extends T> f120872o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        long f120873p;

        TimeoutFallbackSubscriber(org.reactivestreams.d<? super T> dVar, kh.o<? super T, ? extends org.reactivestreams.c<?>> oVar, org.reactivestreams.c<? extends T> cVar) {
            super(true);
            this.f120867j = dVar;
            this.f120868k = oVar;
            this.f120869l = new SequentialDisposable();
            this.f120870m = new AtomicReference<>();
            this.f120872o = cVar;
            this.f120871n = new AtomicLong();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableTimeout.a
        public void a(long j10, Throwable th2) {
            if (!this.f120871n.compareAndSet(j10, Long.MAX_VALUE)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                SubscriptionHelper.cancel(this.f120870m);
                this.f120867j.onError(th2);
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.b
        public void b(long j10) {
            if (this.f120871n.compareAndSet(j10, Long.MAX_VALUE)) {
                SubscriptionHelper.cancel(this.f120870m);
                org.reactivestreams.c<? extends T> cVar = this.f120872o;
                this.f120872o = null;
                long j11 = this.f120873p;
                if (j11 != 0) {
                    g(j11);
                }
                cVar.g(new FlowableTimeoutTimed.a(this.f120867j, this));
            }
        }

        @Override // io.reactivex.internal.subscriptions.SubscriptionArbiter, org.reactivestreams.e
        public void cancel() {
            super.cancel();
            this.f120869l.dispose();
        }

        void j(org.reactivestreams.c<?> cVar) {
            if (cVar != null) {
                TimeoutConsumer timeoutConsumer = new TimeoutConsumer(0L, this);
                if (this.f120869l.a(timeoutConsumer)) {
                    cVar.g(timeoutConsumer);
                }
            }
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            if (this.f120871n.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f120869l.dispose();
                this.f120867j.onComplete();
                this.f120869l.dispose();
            }
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (this.f120871n.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f120869l.dispose();
            this.f120867j.onError(th2);
            this.f120869l.dispose();
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            long j10 = this.f120871n.get();
            if (j10 != Long.MAX_VALUE) {
                long j11 = j10 + 1;
                if (this.f120871n.compareAndSet(j10, j11)) {
                    io.reactivex.disposables.b bVar = this.f120869l.get();
                    if (bVar != null) {
                        bVar.dispose();
                    }
                    this.f120873p++;
                    this.f120867j.onNext(t10);
                    try {
                        org.reactivestreams.c cVar = (org.reactivestreams.c) io.reactivex.internal.functions.a.g(this.f120868k.apply(t10), "The itemTimeoutIndicator returned a null Publisher.");
                        TimeoutConsumer timeoutConsumer = new TimeoutConsumer(j11, this);
                        if (this.f120869l.a(timeoutConsumer)) {
                            cVar.g(timeoutConsumer);
                        }
                    } catch (Throwable th2) {
                        io.reactivex.exceptions.a.b(th2);
                        this.f120870m.get().cancel();
                        this.f120871n.getAndSet(Long.MAX_VALUE);
                        this.f120867j.onError(th2);
                    }
                }
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.setOnce(this.f120870m, eVar)) {
                h(eVar);
            }
        }
    }

    public static final class TimeoutSubscriber<T> extends AtomicLong implements io.reactivex.o<T>, org.reactivestreams.e, a {
        private static final long serialVersionUID = 3764492702657003550L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f120874b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.o<? super T, ? extends org.reactivestreams.c<?>> f120875c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final SequentialDisposable f120876d = new SequentialDisposable();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicReference<org.reactivestreams.e> f120877e = new AtomicReference<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final AtomicLong f120878f = new AtomicLong();

        TimeoutSubscriber(org.reactivestreams.d<? super T> dVar, kh.o<? super T, ? extends org.reactivestreams.c<?>> oVar) {
            this.f120874b = dVar;
            this.f120875c = oVar;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableTimeout.a
        public void a(long j10, Throwable th2) {
            if (!compareAndSet(j10, Long.MAX_VALUE)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                SubscriptionHelper.cancel(this.f120877e);
                this.f120874b.onError(th2);
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.b
        public void b(long j10) {
            if (compareAndSet(j10, Long.MAX_VALUE)) {
                SubscriptionHelper.cancel(this.f120877e);
                this.f120874b.onError(new TimeoutException());
            }
        }

        void c(org.reactivestreams.c<?> cVar) {
            if (cVar != null) {
                TimeoutConsumer timeoutConsumer = new TimeoutConsumer(0L, this);
                if (this.f120876d.a(timeoutConsumer)) {
                    cVar.g(timeoutConsumer);
                }
            }
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            SubscriptionHelper.cancel(this.f120877e);
            this.f120876d.dispose();
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f120876d.dispose();
                this.f120874b.onComplete();
            }
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f120876d.dispose();
                this.f120874b.onError(th2);
            }
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            long j10 = get();
            if (j10 != Long.MAX_VALUE) {
                long j11 = 1 + j10;
                if (compareAndSet(j10, j11)) {
                    io.reactivex.disposables.b bVar = this.f120876d.get();
                    if (bVar != null) {
                        bVar.dispose();
                    }
                    this.f120874b.onNext(t10);
                    try {
                        org.reactivestreams.c cVar = (org.reactivestreams.c) io.reactivex.internal.functions.a.g(this.f120875c.apply(t10), "The itemTimeoutIndicator returned a null Publisher.");
                        TimeoutConsumer timeoutConsumer = new TimeoutConsumer(j11, this);
                        if (this.f120876d.a(timeoutConsumer)) {
                            cVar.g(timeoutConsumer);
                        }
                    } catch (Throwable th2) {
                        io.reactivex.exceptions.a.b(th2);
                        this.f120877e.get().cancel();
                        getAndSet(Long.MAX_VALUE);
                        this.f120874b.onError(th2);
                    }
                }
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            SubscriptionHelper.deferredSetOnce(this.f120877e, this.f120878f, eVar);
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            SubscriptionHelper.deferredRequest(this.f120877e, this.f120878f, j10);
        }
    }

    public interface a extends FlowableTimeoutTimed.b {
        void a(long j10, Throwable th2);
    }

    public FlowableTimeout(io.reactivex.j<T> jVar, org.reactivestreams.c<U> cVar, kh.o<? super T, ? extends org.reactivestreams.c<V>> oVar, org.reactivestreams.c<? extends T> cVar2) {
        super(jVar);
        this.f120862d = cVar;
        this.f120863e = oVar;
        this.f120864f = cVar2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super T> dVar) {
        if (this.f120864f == null) {
            TimeoutSubscriber timeoutSubscriber = new TimeoutSubscriber(dVar, this.f120863e);
            dVar.onSubscribe(timeoutSubscriber);
            timeoutSubscriber.c(this.f120862d);
            this.f121039c.j6(timeoutSubscriber);
            return;
        }
        TimeoutFallbackSubscriber timeoutFallbackSubscriber = new TimeoutFallbackSubscriber(dVar, this.f120863e, this.f120864f);
        dVar.onSubscribe(timeoutFallbackSubscriber);
        timeoutFallbackSubscriber.j(this.f120862d);
        this.f121039c.j6(timeoutFallbackSubscriber);
    }
}
