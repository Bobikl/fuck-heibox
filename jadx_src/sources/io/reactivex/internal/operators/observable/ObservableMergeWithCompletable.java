package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableMergeWithCompletable<T> extends a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.g f122308c;

    public static final class MergeWithObserver<T> extends AtomicInteger implements io.reactivex.g0<T>, io.reactivex.disposables.b {
        private static final long serialVersionUID = -4592979584110982903L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super T> f122309b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicReference<io.reactivex.disposables.b> f122310c = new AtomicReference<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final OtherObserver f122311d = new OtherObserver(this);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicThrowable f122312e = new AtomicThrowable();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        volatile boolean f122313f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        volatile boolean f122314g;

        public static final class OtherObserver extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.d {
            private static final long serialVersionUID = -2935427570954647017L;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final MergeWithObserver<?> f122315b;

            OtherObserver(MergeWithObserver<?> mergeWithObserver) {
                this.f122315b = mergeWithObserver;
            }

            @Override // io.reactivex.d
            public void onComplete() {
                this.f122315b.a();
            }

            @Override // io.reactivex.d
            public void onError(Throwable th2) {
                this.f122315b.b(th2);
            }

            @Override // io.reactivex.d
            public void onSubscribe(io.reactivex.disposables.b bVar) {
                DisposableHelper.setOnce(this, bVar);
            }
        }

        MergeWithObserver(io.reactivex.g0<? super T> g0Var) {
            this.f122309b = g0Var;
        }

        void a() {
            this.f122314g = true;
            if (this.f122313f) {
                io.reactivex.internal.util.g.a(this.f122309b, this, this.f122312e);
            }
        }

        void b(Throwable th2) {
            DisposableHelper.dispose(this.f122310c);
            io.reactivex.internal.util.g.c(this.f122309b, th2, this, this.f122312e);
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.dispose(this.f122310c);
            DisposableHelper.dispose(this.f122311d);
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(this.f122310c.get());
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            this.f122313f = true;
            if (this.f122314g) {
                io.reactivex.internal.util.g.a(this.f122309b, this, this.f122312e);
            }
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            DisposableHelper.dispose(this.f122310c);
            io.reactivex.internal.util.g.c(this.f122309b, th2, this, this.f122312e);
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            io.reactivex.internal.util.g.e(this.f122309b, t10, this, this.f122312e);
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            DisposableHelper.setOnce(this.f122310c, bVar);
        }
    }

    public ObservableMergeWithCompletable(io.reactivex.z<T> zVar, io.reactivex.g gVar) {
        super(zVar);
        this.f122308c = gVar;
    }

    @Override // io.reactivex.z
    protected void H5(io.reactivex.g0<? super T> g0Var) {
        MergeWithObserver mergeWithObserver = new MergeWithObserver(g0Var);
        g0Var.onSubscribe(mergeWithObserver);
        this.f122785b.g(mergeWithObserver);
        this.f122308c.d(mergeWithObserver.f122311d);
    }
}
