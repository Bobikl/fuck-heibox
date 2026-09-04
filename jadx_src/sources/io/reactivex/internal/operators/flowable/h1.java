package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ArrayListSupplier;
import java.util.Collection;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: FlowableToListSingle.java */
/* JADX INFO: loaded from: classes12.dex */
public final class h1<T, U extends Collection<? super T>> extends io.reactivex.i0<U> implements lh.b<U> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.j<T> f121126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Callable<U> f121127c;

    /* JADX INFO: compiled from: FlowableToListSingle.java */
    public static final class a<T, U extends Collection<? super T>> implements io.reactivex.o<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.l0<? super U> f121128b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        org.reactivestreams.e f121129c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        U f121130d;

        a(io.reactivex.l0<? super U> l0Var, U u10) {
            this.f121128b = l0Var;
            this.f121130d = u10;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f121129c.cancel();
            this.f121129c = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f121129c == SubscriptionHelper.CANCELLED;
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            this.f121129c = SubscriptionHelper.CANCELLED;
            this.f121128b.onSuccess(this.f121130d);
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            this.f121130d = null;
            this.f121129c = SubscriptionHelper.CANCELLED;
            this.f121128b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            this.f121130d.add(t10);
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f121129c, eVar)) {
                this.f121129c = eVar;
                this.f121128b.onSubscribe(this);
                eVar.request(Long.MAX_VALUE);
            }
        }
    }

    public h1(io.reactivex.j<T> jVar) {
        this(jVar, ArrayListSupplier.asCallable());
    }

    public h1(io.reactivex.j<T> jVar, Callable<U> callable) {
        this.f121126b = jVar;
        this.f121127c = callable;
    }

    @Override // lh.b
    public io.reactivex.j<U> c() {
        return io.reactivex.plugins.a.P(new FlowableToList(this.f121126b, this.f121127c));
    }

    @Override // io.reactivex.i0
    protected void c1(io.reactivex.l0<? super U> l0Var) {
        try {
            this.f121126b.j6(new a(l0Var, (Collection) io.reactivex.internal.functions.a.g(this.f121127c.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            EmptyDisposable.error(th2, l0Var);
        }
    }
}
