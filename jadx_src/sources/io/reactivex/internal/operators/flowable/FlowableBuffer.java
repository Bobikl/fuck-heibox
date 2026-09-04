package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableBuffer<T, C extends Collection<? super T>> extends io.reactivex.internal.operators.flowable.a<T, C> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f119895d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f119896e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final Callable<C> f119897f;

    public static final class PublisherBufferOverlappingSubscriber<T, C extends Collection<? super T>> extends AtomicLong implements io.reactivex.o<T>, org.reactivestreams.e, kh.e {
        private static final long serialVersionUID = -7370244972039324525L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super C> f119898b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Callable<C> f119899c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f119900d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f119901e;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        org.reactivestreams.e f119904h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        boolean f119905i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f119906j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        volatile boolean f119907k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        long f119908l;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final AtomicBoolean f119903g = new AtomicBoolean();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final ArrayDeque<C> f119902f = new ArrayDeque<>();

        PublisherBufferOverlappingSubscriber(org.reactivestreams.d<? super C> dVar, int i10, int i11, Callable<C> callable) {
            this.f119898b = dVar;
            this.f119900d = i10;
            this.f119901e = i11;
            this.f119899c = callable;
        }

        @Override // kh.e
        public boolean a() {
            return this.f119907k;
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            this.f119907k = true;
            this.f119904h.cancel();
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            if (this.f119905i) {
                return;
            }
            this.f119905i = true;
            long j10 = this.f119908l;
            if (j10 != 0) {
                io.reactivex.internal.util.b.e(this, j10);
            }
            io.reactivex.internal.util.n.g(this.f119898b, this.f119902f, this, this);
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (this.f119905i) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f119905i = true;
            this.f119902f.clear();
            this.f119898b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (this.f119905i) {
                return;
            }
            ArrayDeque<C> arrayDeque = this.f119902f;
            int i10 = this.f119906j;
            int i11 = i10 + 1;
            if (i10 == 0) {
                try {
                    arrayDeque.offer((C) ((Collection) io.reactivex.internal.functions.a.g(this.f119899c.call(), "The bufferSupplier returned a null buffer")));
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.b(th2);
                    cancel();
                    onError(th2);
                    return;
                }
            }
            C cPeek = arrayDeque.peek();
            if (cPeek != null && cPeek.size() + 1 == this.f119900d) {
                arrayDeque.poll();
                cPeek.add(t10);
                this.f119908l++;
                this.f119898b.onNext(cPeek);
            }
            Iterator<C> it = arrayDeque.iterator();
            while (it.hasNext()) {
                it.next().add(t10);
            }
            if (i11 == this.f119901e) {
                i11 = 0;
            }
            this.f119906j = i11;
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f119904h, eVar)) {
                this.f119904h = eVar;
                this.f119898b.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            if (!SubscriptionHelper.validate(j10) || io.reactivex.internal.util.n.i(j10, this.f119898b, this.f119902f, this, this)) {
                return;
            }
            if (this.f119903g.get() || !this.f119903g.compareAndSet(false, true)) {
                this.f119904h.request(io.reactivex.internal.util.b.d(this.f119901e, j10));
            } else {
                this.f119904h.request(io.reactivex.internal.util.b.c(this.f119900d, io.reactivex.internal.util.b.d(this.f119901e, j10 - 1)));
            }
        }
    }

    public static final class PublisherBufferSkipSubscriber<T, C extends Collection<? super T>> extends AtomicInteger implements io.reactivex.o<T>, org.reactivestreams.e {
        private static final long serialVersionUID = -5616169793639412593L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super C> f119909b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Callable<C> f119910c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f119911d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f119912e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        C f119913f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        org.reactivestreams.e f119914g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f119915h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f119916i;

        PublisherBufferSkipSubscriber(org.reactivestreams.d<? super C> dVar, int i10, int i11, Callable<C> callable) {
            this.f119909b = dVar;
            this.f119911d = i10;
            this.f119912e = i11;
            this.f119910c = callable;
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            this.f119914g.cancel();
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            if (this.f119915h) {
                return;
            }
            this.f119915h = true;
            C c10 = this.f119913f;
            this.f119913f = null;
            if (c10 != null) {
                this.f119909b.onNext(c10);
            }
            this.f119909b.onComplete();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (this.f119915h) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f119915h = true;
            this.f119913f = null;
            this.f119909b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (this.f119915h) {
                return;
            }
            C c10 = this.f119913f;
            int i10 = this.f119916i;
            int i11 = i10 + 1;
            if (i10 == 0) {
                try {
                    c10 = (C) io.reactivex.internal.functions.a.g(this.f119910c.call(), "The bufferSupplier returned a null buffer");
                    this.f119913f = c10;
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.b(th2);
                    cancel();
                    onError(th2);
                    return;
                }
            }
            if (c10 != null) {
                c10.add(t10);
                if (c10.size() == this.f119911d) {
                    this.f119913f = null;
                    this.f119909b.onNext(c10);
                }
            }
            if (i11 == this.f119912e) {
                i11 = 0;
            }
            this.f119916i = i11;
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f119914g, eVar)) {
                this.f119914g = eVar;
                this.f119909b.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                if (get() != 0 || !compareAndSet(0, 1)) {
                    this.f119914g.request(io.reactivex.internal.util.b.d(this.f119912e, j10));
                    return;
                }
                this.f119914g.request(io.reactivex.internal.util.b.c(io.reactivex.internal.util.b.d(j10, this.f119911d), io.reactivex.internal.util.b.d(this.f119912e - this.f119911d, j10 - 1)));
            }
        }
    }

    public static final class a<T, C extends Collection<? super T>> implements io.reactivex.o<T>, org.reactivestreams.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super C> f119917b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Callable<C> f119918c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f119919d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        C f119920e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        org.reactivestreams.e f119921f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f119922g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f119923h;

        a(org.reactivestreams.d<? super C> dVar, int i10, Callable<C> callable) {
            this.f119917b = dVar;
            this.f119919d = i10;
            this.f119918c = callable;
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            this.f119921f.cancel();
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            if (this.f119922g) {
                return;
            }
            this.f119922g = true;
            C c10 = this.f119920e;
            if (c10 != null && !c10.isEmpty()) {
                this.f119917b.onNext(c10);
            }
            this.f119917b.onComplete();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (this.f119922g) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f119922g = true;
                this.f119917b.onError(th2);
            }
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (this.f119922g) {
                return;
            }
            C c10 = this.f119920e;
            if (c10 == null) {
                try {
                    c10 = (C) io.reactivex.internal.functions.a.g(this.f119918c.call(), "The bufferSupplier returned a null buffer");
                    this.f119920e = c10;
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.b(th2);
                    cancel();
                    onError(th2);
                    return;
                }
            }
            c10.add(t10);
            int i10 = this.f119923h + 1;
            if (i10 != this.f119919d) {
                this.f119923h = i10;
                return;
            }
            this.f119923h = 0;
            this.f119920e = null;
            this.f119917b.onNext(c10);
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f119921f, eVar)) {
                this.f119921f = eVar;
                this.f119917b.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                this.f119921f.request(io.reactivex.internal.util.b.d(j10, this.f119919d));
            }
        }
    }

    public FlowableBuffer(io.reactivex.j<T> jVar, int i10, int i11, Callable<C> callable) {
        super(jVar);
        this.f119895d = i10;
        this.f119896e = i11;
        this.f119897f = callable;
    }

    @Override // io.reactivex.j
    public void k6(org.reactivestreams.d<? super C> dVar) {
        int i10 = this.f119895d;
        int i11 = this.f119896e;
        if (i10 == i11) {
            this.f121039c.j6(new a(dVar, i10, this.f119897f));
        } else if (i11 > i10) {
            this.f121039c.j6(new PublisherBufferSkipSubscriber(dVar, this.f119895d, this.f119896e, this.f119897f));
        } else {
            this.f121039c.j6(new PublisherBufferOverlappingSubscriber(dVar, this.f119895d, this.f119896e, this.f119897f));
        }
    }
}
