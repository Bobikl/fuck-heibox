package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableBuffer<T, U extends Collection<? super T>> extends io.reactivex.internal.operators.observable.a<T, U> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f121968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f121969d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Callable<U> f121970e;

    public static final class BufferSkipObserver<T, U extends Collection<? super T>> extends AtomicBoolean implements io.reactivex.g0<T>, io.reactivex.disposables.b {
        private static final long serialVersionUID = -8223395059921494546L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super U> f121971b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f121972c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f121973d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final Callable<U> f121974e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        io.reactivex.disposables.b f121975f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final ArrayDeque<U> f121976g = new ArrayDeque<>();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        long f121977h;

        BufferSkipObserver(io.reactivex.g0<? super U> g0Var, int i10, int i11, Callable<U> callable) {
            this.f121971b = g0Var;
            this.f121972c = i10;
            this.f121973d = i11;
            this.f121974e = callable;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f121975f.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f121975f.isDisposed();
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            while (!this.f121976g.isEmpty()) {
                this.f121971b.onNext(this.f121976g.poll());
            }
            this.f121971b.onComplete();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            this.f121976g.clear();
            this.f121971b.onError(th2);
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            long j10 = this.f121977h;
            this.f121977h = 1 + j10;
            if (j10 % ((long) this.f121973d) == 0) {
                try {
                    this.f121976g.offer((U) ((Collection) io.reactivex.internal.functions.a.g(this.f121974e.call(), "The bufferSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
                } catch (Throwable th2) {
                    this.f121976g.clear();
                    this.f121975f.dispose();
                    this.f121971b.onError(th2);
                    return;
                }
            }
            Iterator<U> it = this.f121976g.iterator();
            while (it.hasNext()) {
                U next = it.next();
                next.add(t10);
                if (this.f121972c <= next.size()) {
                    it.remove();
                    this.f121971b.onNext(next);
                }
            }
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f121975f, bVar)) {
                this.f121975f = bVar;
                this.f121971b.onSubscribe(this);
            }
        }
    }

    public static final class a<T, U extends Collection<? super T>> implements io.reactivex.g0<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super U> f121978b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f121979c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Callable<U> f121980d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        U f121981e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f121982f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        io.reactivex.disposables.b f121983g;

        a(io.reactivex.g0<? super U> g0Var, int i10, Callable<U> callable) {
            this.f121978b = g0Var;
            this.f121979c = i10;
            this.f121980d = callable;
        }

        boolean a() {
            try {
                this.f121981e = (U) io.reactivex.internal.functions.a.g(this.f121980d.call(), "Empty buffer supplied");
                return true;
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f121981e = null;
                io.reactivex.disposables.b bVar = this.f121983g;
                if (bVar == null) {
                    EmptyDisposable.error(th2, this.f121978b);
                    return false;
                }
                bVar.dispose();
                this.f121978b.onError(th2);
                return false;
            }
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f121983g.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f121983g.isDisposed();
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            U u10 = this.f121981e;
            if (u10 != null) {
                this.f121981e = null;
                if (!u10.isEmpty()) {
                    this.f121978b.onNext(u10);
                }
                this.f121978b.onComplete();
            }
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            this.f121981e = null;
            this.f121978b.onError(th2);
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            U u10 = this.f121981e;
            if (u10 != null) {
                u10.add(t10);
                int i10 = this.f121982f + 1;
                this.f121982f = i10;
                if (i10 >= this.f121979c) {
                    this.f121978b.onNext(u10);
                    this.f121982f = 0;
                    a();
                }
            }
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f121983g, bVar)) {
                this.f121983g = bVar;
                this.f121978b.onSubscribe(this);
            }
        }
    }

    public ObservableBuffer(io.reactivex.e0<T> e0Var, int i10, int i11, Callable<U> callable) {
        super(e0Var);
        this.f121968c = i10;
        this.f121969d = i11;
        this.f121970e = callable;
    }

    @Override // io.reactivex.z
    protected void H5(io.reactivex.g0<? super U> g0Var) {
        int i10 = this.f121969d;
        int i11 = this.f121968c;
        if (i10 != i11) {
            this.f122785b.g(new BufferSkipObserver(g0Var, this.f121968c, this.f121969d, this.f121970e));
            return;
        }
        a aVar = new a(g0Var, i11, this.f121970e);
        if (aVar.a()) {
            this.f122785b.g(aVar);
        }
    }
}
