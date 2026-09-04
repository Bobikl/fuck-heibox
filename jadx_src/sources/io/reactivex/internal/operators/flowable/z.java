package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: FlowableElementAtSingle.java */
/* JADX INFO: loaded from: classes12.dex */
public final class z<T> extends io.reactivex.i0<T> implements lh.b<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.j<T> f121385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f121386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final T f121387d;

    /* JADX INFO: compiled from: FlowableElementAtSingle.java */
    public static final class a<T> implements io.reactivex.o<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.l0<? super T> f121388b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f121389c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final T f121390d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        org.reactivestreams.e f121391e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        long f121392f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f121393g;

        a(io.reactivex.l0<? super T> l0Var, long j10, T t10) {
            this.f121388b = l0Var;
            this.f121389c = j10;
            this.f121390d = t10;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f121391e.cancel();
            this.f121391e = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f121391e == SubscriptionHelper.CANCELLED;
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            this.f121391e = SubscriptionHelper.CANCELLED;
            if (this.f121393g) {
                return;
            }
            this.f121393g = true;
            T t10 = this.f121390d;
            if (t10 != null) {
                this.f121388b.onSuccess(t10);
            } else {
                this.f121388b.onError(new NoSuchElementException());
            }
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (this.f121393g) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f121393g = true;
            this.f121391e = SubscriptionHelper.CANCELLED;
            this.f121388b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (this.f121393g) {
                return;
            }
            long j10 = this.f121392f;
            if (j10 != this.f121389c) {
                this.f121392f = j10 + 1;
                return;
            }
            this.f121393g = true;
            this.f121391e.cancel();
            this.f121391e = SubscriptionHelper.CANCELLED;
            this.f121388b.onSuccess(t10);
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f121391e, eVar)) {
                this.f121391e = eVar;
                this.f121388b.onSubscribe(this);
                eVar.request(Long.MAX_VALUE);
            }
        }
    }

    public z(io.reactivex.j<T> jVar, long j10, T t10) {
        this.f121385b = jVar;
        this.f121386c = j10;
        this.f121387d = t10;
    }

    @Override // lh.b
    public io.reactivex.j<T> c() {
        return io.reactivex.plugins.a.P(new FlowableElementAt(this.f121385b, this.f121386c, this.f121387d, true));
    }

    @Override // io.reactivex.i0
    protected void c1(io.reactivex.l0<? super T> l0Var) {
        this.f121385b.j6(new a(l0Var, this.f121386c, this.f121387d));
    }
}
