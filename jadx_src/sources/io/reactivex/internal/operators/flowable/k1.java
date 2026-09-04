package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.Iterator;

/* JADX INFO: compiled from: FlowableZipIterable.java */
/* JADX INFO: loaded from: classes12.dex */
public final class k1<T, U, V> extends io.reactivex.internal.operators.flowable.a<T, V> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Iterable<U> f121242d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final kh.c<? super T, ? super U, ? extends V> f121243e;

    /* JADX INFO: compiled from: FlowableZipIterable.java */
    public static final class a<T, U, V> implements io.reactivex.o<T>, org.reactivestreams.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super V> f121244b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Iterator<U> f121245c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final kh.c<? super T, ? super U, ? extends V> f121246d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        org.reactivestreams.e f121247e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f121248f;

        a(org.reactivestreams.d<? super V> dVar, Iterator<U> it, kh.c<? super T, ? super U, ? extends V> cVar) {
            this.f121244b = dVar;
            this.f121245c = it;
            this.f121246d = cVar;
        }

        void a(Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            this.f121248f = true;
            this.f121247e.cancel();
            this.f121244b.onError(th2);
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            this.f121247e.cancel();
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            if (this.f121248f) {
                return;
            }
            this.f121248f = true;
            this.f121244b.onComplete();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (this.f121248f) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f121248f = true;
                this.f121244b.onError(th2);
            }
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (this.f121248f) {
                return;
            }
            try {
                try {
                    this.f121244b.onNext(io.reactivex.internal.functions.a.g(this.f121246d.apply(t10, io.reactivex.internal.functions.a.g(this.f121245c.next(), "The iterator returned a null value")), "The zipper function returned a null value"));
                    try {
                        if (this.f121245c.hasNext()) {
                            return;
                        }
                        this.f121248f = true;
                        this.f121247e.cancel();
                        this.f121244b.onComplete();
                    } catch (Throwable th2) {
                        a(th2);
                    }
                } catch (Throwable th3) {
                    a(th3);
                }
            } catch (Throwable th4) {
                a(th4);
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f121247e, eVar)) {
                this.f121247e = eVar;
                this.f121244b.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            this.f121247e.request(j10);
        }
    }

    public k1(io.reactivex.j<T> jVar, Iterable<U> iterable, kh.c<? super T, ? super U, ? extends V> cVar) {
        super(jVar);
        this.f121242d = iterable;
        this.f121243e = cVar;
    }

    @Override // io.reactivex.j
    public void k6(org.reactivestreams.d<? super V> dVar) {
        try {
            Iterator it = (Iterator) io.reactivex.internal.functions.a.g(this.f121242d.iterator(), "The iterator returned by other is null");
            try {
                if (it.hasNext()) {
                    this.f121039c.j6(new a(dVar, it, this.f121243e));
                } else {
                    EmptySubscription.complete(dVar);
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                EmptySubscription.error(th2, dVar);
            }
        } catch (Throwable th3) {
            io.reactivex.exceptions.a.b(th3);
            EmptySubscription.error(th3, dVar);
        }
    }
}
