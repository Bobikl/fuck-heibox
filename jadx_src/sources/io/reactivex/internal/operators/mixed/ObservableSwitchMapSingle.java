package io.reactivex.internal.operators.mixed;

import androidx.compose.animation.core.s0;
import io.reactivex.g0;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.l0;
import io.reactivex.o0;
import io.reactivex.z;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kh.o;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableSwitchMapSingle<T, R> extends z<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final z<T> f121932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final o<? super T, ? extends o0<? extends R>> f121933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f121934d;

    public static final class SwitchMapSingleMainObserver<T, R> extends AtomicInteger implements g0<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        static final SwitchMapSingleObserver<Object> f121935j = new SwitchMapSingleObserver<>(null);
        private static final long serialVersionUID = -5402190102429853762L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final g0<? super R> f121936b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final o<? super T, ? extends o0<? extends R>> f121937c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final boolean f121938d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicThrowable f121939e = new AtomicThrowable();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final AtomicReference<SwitchMapSingleObserver<R>> f121940f = new AtomicReference<>();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        io.reactivex.disposables.b f121941g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        volatile boolean f121942h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        volatile boolean f121943i;

        public static final class SwitchMapSingleObserver<R> extends AtomicReference<io.reactivex.disposables.b> implements l0<R> {
            private static final long serialVersionUID = 8042919737683345351L;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final SwitchMapSingleMainObserver<?, R> f121944b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            volatile R f121945c;

            SwitchMapSingleObserver(SwitchMapSingleMainObserver<?, R> switchMapSingleMainObserver) {
                this.f121944b = switchMapSingleMainObserver;
            }

            void a() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.l0
            public void onError(Throwable th2) {
                this.f121944b.c(this, th2);
            }

            @Override // io.reactivex.l0
            public void onSubscribe(io.reactivex.disposables.b bVar) {
                DisposableHelper.setOnce(this, bVar);
            }

            @Override // io.reactivex.l0
            public void onSuccess(R r10) {
                this.f121945c = r10;
                this.f121944b.b();
            }
        }

        SwitchMapSingleMainObserver(g0<? super R> g0Var, o<? super T, ? extends o0<? extends R>> oVar, boolean z10) {
            this.f121936b = g0Var;
            this.f121937c = oVar;
            this.f121938d = z10;
        }

        void a() {
            AtomicReference<SwitchMapSingleObserver<R>> atomicReference = this.f121940f;
            SwitchMapSingleObserver<Object> switchMapSingleObserver = f121935j;
            SwitchMapSingleObserver<R> andSet = atomicReference.getAndSet((SwitchMapSingleObserver<R>) switchMapSingleObserver);
            if (andSet == null || andSet == switchMapSingleObserver) {
                return;
            }
            andSet.a();
        }

        void b() {
            if (getAndIncrement() != 0) {
                return;
            }
            g0<? super R> g0Var = this.f121936b;
            AtomicThrowable atomicThrowable = this.f121939e;
            AtomicReference<SwitchMapSingleObserver<R>> atomicReference = this.f121940f;
            int iAddAndGet = 1;
            while (!this.f121943i) {
                if (atomicThrowable.get() != null && !this.f121938d) {
                    g0Var.onError(atomicThrowable.c());
                    return;
                }
                boolean z10 = this.f121942h;
                SwitchMapSingleObserver<R> switchMapSingleObserver = atomicReference.get();
                boolean z11 = switchMapSingleObserver == null;
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
                if (z11 || switchMapSingleObserver.f121945c == null) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    s0.a(atomicReference, switchMapSingleObserver, null);
                    g0Var.onNext(switchMapSingleObserver.f121945c);
                }
            }
        }

        void c(SwitchMapSingleObserver<R> switchMapSingleObserver, Throwable th2) {
            if (!s0.a(this.f121940f, switchMapSingleObserver, null) || !this.f121939e.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (!this.f121938d) {
                this.f121941g.dispose();
                a();
            }
            b();
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f121943i = true;
            this.f121941g.dispose();
            a();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f121943i;
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            this.f121942h = true;
            b();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            if (!this.f121939e.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (!this.f121938d) {
                a();
            }
            this.f121942h = true;
            b();
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            SwitchMapSingleObserver<R> switchMapSingleObserver;
            SwitchMapSingleObserver<R> switchMapSingleObserver2 = this.f121940f.get();
            if (switchMapSingleObserver2 != null) {
                switchMapSingleObserver2.a();
            }
            try {
                o0 o0Var = (o0) io.reactivex.internal.functions.a.g(this.f121937c.apply(t10), "The mapper returned a null SingleSource");
                SwitchMapSingleObserver switchMapSingleObserver3 = new SwitchMapSingleObserver(this);
                do {
                    switchMapSingleObserver = this.f121940f.get();
                    if (switchMapSingleObserver == f121935j) {
                        return;
                    }
                } while (!s0.a(this.f121940f, switchMapSingleObserver, switchMapSingleObserver3));
                o0Var.f(switchMapSingleObserver3);
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f121941g.dispose();
                this.f121940f.getAndSet((SwitchMapSingleObserver<R>) f121935j);
                onError(th2);
            }
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f121941g, bVar)) {
                this.f121941g = bVar;
                this.f121936b.onSubscribe(this);
            }
        }
    }

    public ObservableSwitchMapSingle(z<T> zVar, o<? super T, ? extends o0<? extends R>> oVar, boolean z10) {
        this.f121932b = zVar;
        this.f121933c = oVar;
        this.f121934d = z10;
    }

    @Override // io.reactivex.z
    protected void H5(g0<? super R> g0Var) {
        if (b.c(this.f121932b, this.f121933c, g0Var)) {
            return;
        }
        this.f121932b.g(new SwitchMapSingleMainObserver(g0Var, this.f121933c, this.f121934d));
    }
}
