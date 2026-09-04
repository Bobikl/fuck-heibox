package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeFlatten<T, R> extends a<T, R> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.o<? super T, ? extends io.reactivex.w<? extends R>> f121518c;

    public static final class FlatMapMaybeObserver<T, R> extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.t<T>, io.reactivex.disposables.b {
        private static final long serialVersionUID = 4375739915521278546L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.t<? super R> f121519b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.o<? super T, ? extends io.reactivex.w<? extends R>> f121520c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        io.reactivex.disposables.b f121521d;

        public final class a implements io.reactivex.t<R> {
            a() {
            }

            @Override // io.reactivex.t
            public void onComplete() {
                FlatMapMaybeObserver.this.f121519b.onComplete();
            }

            @Override // io.reactivex.t
            public void onError(Throwable th2) {
                FlatMapMaybeObserver.this.f121519b.onError(th2);
            }

            @Override // io.reactivex.t
            public void onSubscribe(io.reactivex.disposables.b bVar) {
                DisposableHelper.setOnce(FlatMapMaybeObserver.this, bVar);
            }

            @Override // io.reactivex.t
            public void onSuccess(R r10) {
                FlatMapMaybeObserver.this.f121519b.onSuccess(r10);
            }
        }

        FlatMapMaybeObserver(io.reactivex.t<? super R> tVar, kh.o<? super T, ? extends io.reactivex.w<? extends R>> oVar) {
            this.f121519b = tVar;
            this.f121520c = oVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.dispose(this);
            this.f121521d.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.t
        public void onComplete() {
            this.f121519b.onComplete();
        }

        @Override // io.reactivex.t
        public void onError(Throwable th2) {
            this.f121519b.onError(th2);
        }

        @Override // io.reactivex.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f121521d, bVar)) {
                this.f121521d = bVar;
                this.f121519b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.t
        public void onSuccess(T t10) {
            try {
                io.reactivex.w wVar = (io.reactivex.w) io.reactivex.internal.functions.a.g(this.f121520c.apply(t10), "The mapper returned a null MaybeSource");
                if (isDisposed()) {
                    return;
                }
                wVar.f(new a());
            } catch (Exception e10) {
                io.reactivex.exceptions.a.b(e10);
                this.f121519b.onError(e10);
            }
        }
    }

    public MaybeFlatten(io.reactivex.w<T> wVar, kh.o<? super T, ? extends io.reactivex.w<? extends R>> oVar) {
        super(wVar);
        this.f121518c = oVar;
    }

    @Override // io.reactivex.q
    protected void r1(io.reactivex.t<? super R> tVar) {
        this.f121618b.f(new FlatMapMaybeObserver(tVar, this.f121518c));
    }
}
