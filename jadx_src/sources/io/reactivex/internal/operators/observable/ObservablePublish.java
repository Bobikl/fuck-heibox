package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservablePublish<T> extends io.reactivex.observables.a<T> implements lh.g<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.e0<T> f122356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicReference<a<T>> f122357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final io.reactivex.e0<T> f122358d;

    public static final class InnerDisposable<T> extends AtomicReference<Object> implements io.reactivex.disposables.b {
        private static final long serialVersionUID = -1100270633763673112L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super T> f122359b;

        InnerDisposable(io.reactivex.g0<? super T> g0Var) {
            this.f122359b = g0Var;
        }

        void a(a<T> aVar) {
            if (compareAndSet(null, aVar)) {
                return;
            }
            aVar.b(this);
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            Object andSet = getAndSet(this);
            if (andSet == null || andSet == this) {
                return;
            }
            ((a) andSet).b(this);
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return get() == this;
        }
    }

    public static final class a<T> implements io.reactivex.g0<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final InnerDisposable[] f122360f = new InnerDisposable[0];

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final InnerDisposable[] f122361g = new InnerDisposable[0];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicReference<a<T>> f122362b;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicReference<io.reactivex.disposables.b> f122365e = new AtomicReference<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicReference<InnerDisposable<T>[]> f122363c = new AtomicReference<>(f122360f);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicBoolean f122364d = new AtomicBoolean();

        a(AtomicReference<a<T>> atomicReference) {
            this.f122362b = atomicReference;
        }

        boolean a(InnerDisposable<T> innerDisposable) {
            InnerDisposable<T>[] innerDisposableArr;
            InnerDisposable[] innerDisposableArr2;
            do {
                innerDisposableArr = this.f122363c.get();
                if (innerDisposableArr == f122361g) {
                    return false;
                }
                int length = innerDisposableArr.length;
                innerDisposableArr2 = new InnerDisposable[length + 1];
                System.arraycopy(innerDisposableArr, 0, innerDisposableArr2, 0, length);
                innerDisposableArr2[length] = innerDisposable;
            } while (!androidx.compose.animation.core.s0.a(this.f122363c, innerDisposableArr, innerDisposableArr2));
            return true;
        }

        void b(InnerDisposable<T> innerDisposable) {
            InnerDisposable<T>[] innerDisposableArr;
            InnerDisposable[] innerDisposableArr2;
            do {
                innerDisposableArr = this.f122363c.get();
                int length = innerDisposableArr.length;
                if (length == 0) {
                    return;
                }
                int i10 = -1;
                for (int i11 = 0; i11 < length; i11++) {
                    if (innerDisposableArr[i11].equals(innerDisposable)) {
                        i10 = i11;
                        break;
                    }
                }
                if (i10 < 0) {
                    return;
                }
                if (length == 1) {
                    innerDisposableArr2 = f122360f;
                } else {
                    InnerDisposable[] innerDisposableArr3 = new InnerDisposable[length - 1];
                    System.arraycopy(innerDisposableArr, 0, innerDisposableArr3, 0, i10);
                    System.arraycopy(innerDisposableArr, i10 + 1, innerDisposableArr3, i10, (length - i10) - 1);
                    innerDisposableArr2 = innerDisposableArr3;
                }
            } while (!androidx.compose.animation.core.s0.a(this.f122363c, innerDisposableArr, innerDisposableArr2));
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            AtomicReference<InnerDisposable<T>[]> atomicReference = this.f122363c;
            InnerDisposable<T>[] innerDisposableArr = f122361g;
            if (atomicReference.getAndSet(innerDisposableArr) != innerDisposableArr) {
                androidx.compose.animation.core.s0.a(this.f122362b, this, null);
                DisposableHelper.dispose(this.f122365e);
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f122363c.get() == f122361g;
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            androidx.compose.animation.core.s0.a(this.f122362b, this, null);
            for (InnerDisposable<T> innerDisposable : this.f122363c.getAndSet(f122361g)) {
                innerDisposable.f122359b.onComplete();
            }
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            androidx.compose.animation.core.s0.a(this.f122362b, this, null);
            InnerDisposable<T>[] andSet = this.f122363c.getAndSet(f122361g);
            if (andSet.length == 0) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            for (InnerDisposable<T> innerDisposable : andSet) {
                innerDisposable.f122359b.onError(th2);
            }
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            for (InnerDisposable<T> innerDisposable : this.f122363c.get()) {
                innerDisposable.f122359b.onNext(t10);
            }
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            DisposableHelper.setOnce(this.f122365e, bVar);
        }
    }

    public static final class b<T> implements io.reactivex.e0<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicReference<a<T>> f122366b;

        b(AtomicReference<a<T>> atomicReference) {
            this.f122366b = atomicReference;
        }

        @Override // io.reactivex.e0
        public void g(io.reactivex.g0<? super T> g0Var) {
            InnerDisposable innerDisposable = new InnerDisposable(g0Var);
            g0Var.onSubscribe(innerDisposable);
            while (true) {
                a<T> aVar = this.f122366b.get();
                if (aVar == null || aVar.isDisposed()) {
                    a<T> aVar2 = new a<>(this.f122366b);
                    if (androidx.compose.animation.core.s0.a(this.f122366b, aVar, aVar2)) {
                        aVar = aVar2;
                    } else {
                        continue;
                    }
                }
                if (aVar.a(innerDisposable)) {
                    innerDisposable.a(aVar);
                    return;
                }
            }
        }
    }

    private ObservablePublish(io.reactivex.e0<T> e0Var, io.reactivex.e0<T> e0Var2, AtomicReference<a<T>> atomicReference) {
        this.f122358d = e0Var;
        this.f122356b = e0Var2;
        this.f122357c = atomicReference;
    }

    public static <T> io.reactivex.observables.a<T> s8(io.reactivex.e0<T> e0Var) {
        AtomicReference atomicReference = new AtomicReference();
        return io.reactivex.plugins.a.U(new ObservablePublish(new b(atomicReference), e0Var, atomicReference));
    }

    @Override // io.reactivex.z
    protected void H5(io.reactivex.g0<? super T> g0Var) {
        this.f122358d.g(g0Var);
    }

    @Override // io.reactivex.observables.a
    public void l8(kh.g<? super io.reactivex.disposables.b> gVar) {
        a<T> aVar;
        while (true) {
            aVar = this.f122357c.get();
            if (aVar != null && !aVar.isDisposed()) {
                break;
            }
            a<T> aVar2 = new a<>(this.f122357c);
            if (androidx.compose.animation.core.s0.a(this.f122357c, aVar, aVar2)) {
                aVar = aVar2;
                break;
            }
        }
        boolean z10 = !aVar.f122364d.get() && aVar.f122364d.compareAndSet(false, true);
        try {
            gVar.accept(aVar);
            if (z10) {
                this.f122356b.g(aVar);
            }
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            throw ExceptionHelper.f(th2);
        }
    }

    @Override // lh.g
    public io.reactivex.e0<T> source() {
        return this.f122356b;
    }
}
