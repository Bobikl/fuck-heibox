package io.reactivex.internal.operators.mixed;

import androidx.compose.animation.core.s0;
import io.reactivex.g0;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.t;
import io.reactivex.w;
import io.reactivex.z;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kh.o;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableSwitchMapMaybe<T, R> extends z<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final z<T> f121918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final o<? super T, ? extends w<? extends R>> f121919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f121920d;

    public static final class SwitchMapMaybeMainObserver<T, R> extends AtomicInteger implements g0<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        static final SwitchMapMaybeObserver<Object> f121921j = new SwitchMapMaybeObserver<>(null);
        private static final long serialVersionUID = -5402190102429853762L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final g0<? super R> f121922b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final o<? super T, ? extends w<? extends R>> f121923c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final boolean f121924d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicThrowable f121925e = new AtomicThrowable();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final AtomicReference<SwitchMapMaybeObserver<R>> f121926f = new AtomicReference<>();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        io.reactivex.disposables.b f121927g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        volatile boolean f121928h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        volatile boolean f121929i;

        public static final class SwitchMapMaybeObserver<R> extends AtomicReference<io.reactivex.disposables.b> implements t<R> {
            private static final long serialVersionUID = 8042919737683345351L;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final SwitchMapMaybeMainObserver<?, R> f121930b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            volatile R f121931c;

            SwitchMapMaybeObserver(SwitchMapMaybeMainObserver<?, R> switchMapMaybeMainObserver) {
                this.f121930b = switchMapMaybeMainObserver;
            }

            void a() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.t
            public void onComplete() {
                this.f121930b.c(this);
            }

            @Override // io.reactivex.t
            public void onError(Throwable th2) {
                this.f121930b.d(this, th2);
            }

            @Override // io.reactivex.t
            public void onSubscribe(io.reactivex.disposables.b bVar) {
                DisposableHelper.setOnce(this, bVar);
            }

            @Override // io.reactivex.t
            public void onSuccess(R r10) {
                this.f121931c = r10;
                this.f121930b.b();
            }
        }

        SwitchMapMaybeMainObserver(g0<? super R> g0Var, o<? super T, ? extends w<? extends R>> oVar, boolean z10) {
            this.f121922b = g0Var;
            this.f121923c = oVar;
            this.f121924d = z10;
        }

        void a() {
            AtomicReference<SwitchMapMaybeObserver<R>> atomicReference = this.f121926f;
            SwitchMapMaybeObserver<Object> switchMapMaybeObserver = f121921j;
            SwitchMapMaybeObserver<R> andSet = atomicReference.getAndSet((SwitchMapMaybeObserver<R>) switchMapMaybeObserver);
            if (andSet == null || andSet == switchMapMaybeObserver) {
                return;
            }
            andSet.a();
        }

        void b() {
            if (getAndIncrement() != 0) {
                return;
            }
            g0<? super R> g0Var = this.f121922b;
            AtomicThrowable atomicThrowable = this.f121925e;
            AtomicReference<SwitchMapMaybeObserver<R>> atomicReference = this.f121926f;
            int iAddAndGet = 1;
            while (!this.f121929i) {
                if (atomicThrowable.get() != null && !this.f121924d) {
                    g0Var.onError(atomicThrowable.c());
                    return;
                }
                boolean z10 = this.f121928h;
                SwitchMapMaybeObserver<R> switchMapMaybeObserver = atomicReference.get();
                boolean z11 = switchMapMaybeObserver == null;
                if (z10 && z11) {
                    Throwable thC = atomicThrowable.c();
                    if (thC != null) {
                        g0Var.onError(thC);
                        return;
                    } else {
                        g0Var.onComplete();
                        return;
                    }
                }
                if (z11 || switchMapMaybeObserver.f121931c == null) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    s0.a(atomicReference, switchMapMaybeObserver, null);
                    g0Var.onNext(switchMapMaybeObserver.f121931c);
                }
            }
        }

        void c(SwitchMapMaybeObserver<R> switchMapMaybeObserver) {
            if (s0.a(this.f121926f, switchMapMaybeObserver, null)) {
                b();
            }
        }

        void d(SwitchMapMaybeObserver<R> switchMapMaybeObserver, Throwable th2) {
            if (!s0.a(this.f121926f, switchMapMaybeObserver, null) || !this.f121925e.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (!this.f121924d) {
                this.f121927g.dispose();
                a();
            }
            b();
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f121929i = true;
            this.f121927g.dispose();
            a();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f121929i;
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            this.f121928h = true;
            b();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            if (!this.f121925e.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (!this.f121924d) {
                a();
            }
            this.f121928h = true;
            b();
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            SwitchMapMaybeObserver<R> switchMapMaybeObserver;
            SwitchMapMaybeObserver<R> switchMapMaybeObserver2 = this.f121926f.get();
            if (switchMapMaybeObserver2 != null) {
                switchMapMaybeObserver2.a();
            }
            try {
                w wVar = (w) io.reactivex.internal.functions.a.g(this.f121923c.apply(t10), "The mapper returned a null MaybeSource");
                SwitchMapMaybeObserver switchMapMaybeObserver3 = new SwitchMapMaybeObserver(this);
                do {
                    switchMapMaybeObserver = this.f121926f.get();
                    if (switchMapMaybeObserver == f121921j) {
                        return;
                    }
                } while (!s0.a(this.f121926f, switchMapMaybeObserver, switchMapMaybeObserver3));
                wVar.f(switchMapMaybeObserver3);
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f121927g.dispose();
                this.f121926f.getAndSet((SwitchMapMaybeObserver<R>) f121921j);
                onError(th2);
            }
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f121927g, bVar)) {
                this.f121927g = bVar;
                this.f121922b.onSubscribe(this);
            }
        }
    }

    public ObservableSwitchMapMaybe(z<T> zVar, o<? super T, ? extends w<? extends R>> oVar, boolean z10) {
        this.f121918b = zVar;
        this.f121919c = oVar;
        this.f121920d = z10;
    }

    @Override // io.reactivex.z
    protected void H5(g0<? super R> g0Var) {
        if (b.b(this.f121918b, this.f121919c, g0Var)) {
            return;
        }
        this.f121918b.g(new SwitchMapMaybeMainObserver(g0Var, this.f121919c, this.f121920d));
    }
}
