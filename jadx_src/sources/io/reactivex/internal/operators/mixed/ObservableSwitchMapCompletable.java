package io.reactivex.internal.operators.mixed;

import androidx.compose.animation.core.s0;
import io.reactivex.d;
import io.reactivex.g;
import io.reactivex.g0;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.z;
import java.util.concurrent.atomic.AtomicReference;
import kh.o;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableSwitchMapCompletable<T> extends io.reactivex.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final z<T> f121906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final o<? super T, ? extends g> f121907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f121908d;

    public static final class SwitchMapCompletableObserver<T> implements g0<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        static final SwitchMapInnerObserver f121909i = new SwitchMapInnerObserver(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final d f121910b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final o<? super T, ? extends g> f121911c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final boolean f121912d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicThrowable f121913e = new AtomicThrowable();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final AtomicReference<SwitchMapInnerObserver> f121914f = new AtomicReference<>();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        volatile boolean f121915g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        io.reactivex.disposables.b f121916h;

        public static final class SwitchMapInnerObserver extends AtomicReference<io.reactivex.disposables.b> implements d {
            private static final long serialVersionUID = -8003404460084760287L;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final SwitchMapCompletableObserver<?> f121917b;

            SwitchMapInnerObserver(SwitchMapCompletableObserver<?> switchMapCompletableObserver) {
                this.f121917b = switchMapCompletableObserver;
            }

            void a() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.d
            public void onComplete() {
                this.f121917b.b(this);
            }

            @Override // io.reactivex.d
            public void onError(Throwable th2) {
                this.f121917b.c(this, th2);
            }

            @Override // io.reactivex.d
            public void onSubscribe(io.reactivex.disposables.b bVar) {
                DisposableHelper.setOnce(this, bVar);
            }
        }

        SwitchMapCompletableObserver(d dVar, o<? super T, ? extends g> oVar, boolean z10) {
            this.f121910b = dVar;
            this.f121911c = oVar;
            this.f121912d = z10;
        }

        void a() {
            AtomicReference<SwitchMapInnerObserver> atomicReference = this.f121914f;
            SwitchMapInnerObserver switchMapInnerObserver = f121909i;
            SwitchMapInnerObserver andSet = atomicReference.getAndSet(switchMapInnerObserver);
            if (andSet == null || andSet == switchMapInnerObserver) {
                return;
            }
            andSet.a();
        }

        void b(SwitchMapInnerObserver switchMapInnerObserver) {
            if (s0.a(this.f121914f, switchMapInnerObserver, null) && this.f121915g) {
                Throwable thC = this.f121913e.c();
                if (thC == null) {
                    this.f121910b.onComplete();
                } else {
                    this.f121910b.onError(thC);
                }
            }
        }

        void c(SwitchMapInnerObserver switchMapInnerObserver, Throwable th2) {
            if (!s0.a(this.f121914f, switchMapInnerObserver, null) || !this.f121913e.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (this.f121912d) {
                if (this.f121915g) {
                    this.f121910b.onError(this.f121913e.c());
                    return;
                }
                return;
            }
            dispose();
            Throwable thC = this.f121913e.c();
            if (thC != ExceptionHelper.f123860a) {
                this.f121910b.onError(thC);
            }
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f121916h.dispose();
            a();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f121914f.get() == f121909i;
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            this.f121915g = true;
            if (this.f121914f.get() == null) {
                Throwable thC = this.f121913e.c();
                if (thC == null) {
                    this.f121910b.onComplete();
                } else {
                    this.f121910b.onError(thC);
                }
            }
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            if (!this.f121913e.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (this.f121912d) {
                onComplete();
                return;
            }
            a();
            Throwable thC = this.f121913e.c();
            if (thC != ExceptionHelper.f123860a) {
                this.f121910b.onError(thC);
            }
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            SwitchMapInnerObserver switchMapInnerObserver;
            try {
                g gVar = (g) io.reactivex.internal.functions.a.g(this.f121911c.apply(t10), "The mapper returned a null CompletableSource");
                SwitchMapInnerObserver switchMapInnerObserver2 = new SwitchMapInnerObserver(this);
                do {
                    switchMapInnerObserver = this.f121914f.get();
                    if (switchMapInnerObserver == f121909i) {
                        return;
                    }
                } while (!s0.a(this.f121914f, switchMapInnerObserver, switchMapInnerObserver2));
                if (switchMapInnerObserver != null) {
                    switchMapInnerObserver.a();
                }
                gVar.d(switchMapInnerObserver2);
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f121916h.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f121916h, bVar)) {
                this.f121916h = bVar;
                this.f121910b.onSubscribe(this);
            }
        }
    }

    public ObservableSwitchMapCompletable(z<T> zVar, o<? super T, ? extends g> oVar, boolean z10) {
        this.f121906b = zVar;
        this.f121907c = oVar;
        this.f121908d = z10;
    }

    @Override // io.reactivex.a
    protected void J0(d dVar) {
        if (b.a(this.f121906b, this.f121907c, dVar)) {
            return;
        }
        this.f121906b.g(new SwitchMapCompletableObserver(dVar, this.f121907c, this.f121908d));
    }
}
