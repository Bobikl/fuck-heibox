package io.reactivex.internal.operators.single;

import io.reactivex.i0;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.l0;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: SingleFromPublisher.java */
/* JADX INFO: loaded from: classes5.dex */
public final class q<T> extends i0<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final org.reactivestreams.c<? extends T> f123561b;

    /* JADX INFO: compiled from: SingleFromPublisher.java */
    public static final class a<T> implements io.reactivex.o<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final l0<? super T> f123562b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        org.reactivestreams.e f123563c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        T f123564d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f123565e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        volatile boolean f123566f;

        a(l0<? super T> l0Var) {
            this.f123562b = l0Var;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f123566f = true;
            this.f123563c.cancel();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f123566f;
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            if (this.f123565e) {
                return;
            }
            this.f123565e = true;
            T t10 = this.f123564d;
            this.f123564d = null;
            if (t10 == null) {
                this.f123562b.onError(new NoSuchElementException("The source Publisher is empty"));
            } else {
                this.f123562b.onSuccess(t10);
            }
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (this.f123565e) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f123565e = true;
            this.f123564d = null;
            this.f123562b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (this.f123565e) {
                return;
            }
            if (this.f123564d == null) {
                this.f123564d = t10;
                return;
            }
            this.f123563c.cancel();
            this.f123565e = true;
            this.f123564d = null;
            this.f123562b.onError(new IndexOutOfBoundsException("Too many elements in the Publisher"));
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f123563c, eVar)) {
                this.f123563c = eVar;
                this.f123562b.onSubscribe(this);
                eVar.request(Long.MAX_VALUE);
            }
        }
    }

    public q(org.reactivestreams.c<? extends T> cVar) {
        this.f123561b = cVar;
    }

    @Override // io.reactivex.i0
    protected void c1(l0<? super T> l0Var) {
        this.f123561b.g(new a(l0Var));
    }
}
