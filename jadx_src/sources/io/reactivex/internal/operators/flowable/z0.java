package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: FlowableSingleSingle.java */
/* JADX INFO: loaded from: classes12.dex */
public final class z0<T> extends io.reactivex.i0<T> implements lh.b<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.j<T> f121394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final T f121395c;

    /* JADX INFO: compiled from: FlowableSingleSingle.java */
    public static final class a<T> implements io.reactivex.o<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.l0<? super T> f121396b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final T f121397c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        org.reactivestreams.e f121398d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f121399e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        T f121400f;

        a(io.reactivex.l0<? super T> l0Var, T t10) {
            this.f121396b = l0Var;
            this.f121397c = t10;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f121398d.cancel();
            this.f121398d = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f121398d == SubscriptionHelper.CANCELLED;
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            if (this.f121399e) {
                return;
            }
            this.f121399e = true;
            this.f121398d = SubscriptionHelper.CANCELLED;
            T t10 = this.f121400f;
            this.f121400f = null;
            if (t10 == null) {
                t10 = this.f121397c;
            }
            if (t10 != null) {
                this.f121396b.onSuccess(t10);
            } else {
                this.f121396b.onError(new NoSuchElementException());
            }
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (this.f121399e) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f121399e = true;
            this.f121398d = SubscriptionHelper.CANCELLED;
            this.f121396b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (this.f121399e) {
                return;
            }
            if (this.f121400f == null) {
                this.f121400f = t10;
                return;
            }
            this.f121399e = true;
            this.f121398d.cancel();
            this.f121398d = SubscriptionHelper.CANCELLED;
            this.f121396b.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f121398d, eVar)) {
                this.f121398d = eVar;
                this.f121396b.onSubscribe(this);
                eVar.request(Long.MAX_VALUE);
            }
        }
    }

    public z0(io.reactivex.j<T> jVar, T t10) {
        this.f121394b = jVar;
        this.f121395c = t10;
    }

    @Override // lh.b
    public io.reactivex.j<T> c() {
        return io.reactivex.plugins.a.P(new FlowableSingle(this.f121394b, this.f121395c, true));
    }

    @Override // io.reactivex.i0
    protected void c1(io.reactivex.l0<? super T> l0Var) {
        this.f121394b.j6(new a(l0Var, this.f121395c));
    }
}
