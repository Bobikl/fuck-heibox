package io.reactivex.internal.operators.mixed;

import androidx.compose.animation.core.s0;
import io.reactivex.d;
import io.reactivex.g;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.j;
import java.util.concurrent.atomic.AtomicReference;
import kh.o;
import org.reactivestreams.e;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableSwitchMapCompletable<T> extends io.reactivex.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final j<T> f121798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final o<? super T, ? extends g> f121799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f121800d;

    public static final class SwitchMapCompletableObserver<T> implements io.reactivex.o<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        static final SwitchMapInnerObserver f121801i = new SwitchMapInnerObserver(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final d f121802b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final o<? super T, ? extends g> f121803c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final boolean f121804d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicThrowable f121805e = new AtomicThrowable();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final AtomicReference<SwitchMapInnerObserver> f121806f = new AtomicReference<>();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        volatile boolean f121807g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        e f121808h;

        public static final class SwitchMapInnerObserver extends AtomicReference<io.reactivex.disposables.b> implements d {
            private static final long serialVersionUID = -8003404460084760287L;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final SwitchMapCompletableObserver<?> f121809b;

            SwitchMapInnerObserver(SwitchMapCompletableObserver<?> switchMapCompletableObserver) {
                this.f121809b = switchMapCompletableObserver;
            }

            void a() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.d
            public void onComplete() {
                this.f121809b.b(this);
            }

            @Override // io.reactivex.d
            public void onError(Throwable th2) {
                this.f121809b.c(this, th2);
            }

            @Override // io.reactivex.d
            public void onSubscribe(io.reactivex.disposables.b bVar) {
                DisposableHelper.setOnce(this, bVar);
            }
        }

        SwitchMapCompletableObserver(d dVar, o<? super T, ? extends g> oVar, boolean z10) {
            this.f121802b = dVar;
            this.f121803c = oVar;
            this.f121804d = z10;
        }

        void a() {
            AtomicReference<SwitchMapInnerObserver> atomicReference = this.f121806f;
            SwitchMapInnerObserver switchMapInnerObserver = f121801i;
            SwitchMapInnerObserver andSet = atomicReference.getAndSet(switchMapInnerObserver);
            if (andSet == null || andSet == switchMapInnerObserver) {
                return;
            }
            andSet.a();
        }

        void b(SwitchMapInnerObserver switchMapInnerObserver) {
            if (s0.a(this.f121806f, switchMapInnerObserver, null) && this.f121807g) {
                Throwable thC = this.f121805e.c();
                if (thC == null) {
                    this.f121802b.onComplete();
                } else {
                    this.f121802b.onError(thC);
                }
            }
        }

        void c(SwitchMapInnerObserver switchMapInnerObserver, Throwable th2) {
            if (!s0.a(this.f121806f, switchMapInnerObserver, null) || !this.f121805e.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (this.f121804d) {
                if (this.f121807g) {
                    this.f121802b.onError(this.f121805e.c());
                    return;
                }
                return;
            }
            dispose();
            Throwable thC = this.f121805e.c();
            if (thC != ExceptionHelper.f123860a) {
                this.f121802b.onError(thC);
            }
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f121808h.cancel();
            a();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f121806f.get() == f121801i;
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            this.f121807g = true;
            if (this.f121806f.get() == null) {
                Throwable thC = this.f121805e.c();
                if (thC == null) {
                    this.f121802b.onComplete();
                } else {
                    this.f121802b.onError(thC);
                }
            }
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (!this.f121805e.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (this.f121804d) {
                onComplete();
                return;
            }
            a();
            Throwable thC = this.f121805e.c();
            if (thC != ExceptionHelper.f123860a) {
                this.f121802b.onError(thC);
            }
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            SwitchMapInnerObserver switchMapInnerObserver;
            try {
                g gVar = (g) io.reactivex.internal.functions.a.g(this.f121803c.apply(t10), "The mapper returned a null CompletableSource");
                SwitchMapInnerObserver switchMapInnerObserver2 = new SwitchMapInnerObserver(this);
                do {
                    switchMapInnerObserver = this.f121806f.get();
                    if (switchMapInnerObserver == f121801i) {
                        return;
                    }
                } while (!s0.a(this.f121806f, switchMapInnerObserver, switchMapInnerObserver2));
                if (switchMapInnerObserver != null) {
                    switchMapInnerObserver.a();
                }
                gVar.d(switchMapInnerObserver2);
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f121808h.cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(e eVar) {
            if (SubscriptionHelper.validate(this.f121808h, eVar)) {
                this.f121808h = eVar;
                this.f121802b.onSubscribe(this);
                eVar.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableSwitchMapCompletable(j<T> jVar, o<? super T, ? extends g> oVar, boolean z10) {
        this.f121798b = jVar;
        this.f121799c = oVar;
        this.f121800d = z10;
    }

    @Override // io.reactivex.a
    protected void J0(d dVar) {
        this.f121798b.j6(new SwitchMapCompletableObserver(dVar, this.f121799c, this.f121800d));
    }
}
