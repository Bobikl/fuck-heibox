package io.reactivex.internal.operators.mixed;

import androidx.compose.animation.core.s0;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.j;
import io.reactivex.l0;
import io.reactivex.o0;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kh.o;
import org.reactivestreams.d;
import org.reactivestreams.e;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableSwitchMapSingle<T, R> extends j<R> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final j<T> f121826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final o<? super T, ? extends o0<? extends R>> f121827d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final boolean f121828e;

    public static final class SwitchMapSingleSubscriber<T, R> extends AtomicInteger implements io.reactivex.o<T>, e {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        static final SwitchMapSingleObserver<Object> f121829l = new SwitchMapSingleObserver<>(null);
        private static final long serialVersionUID = -5402190102429853762L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final d<? super R> f121830b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final o<? super T, ? extends o0<? extends R>> f121831c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final boolean f121832d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicThrowable f121833e = new AtomicThrowable();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final AtomicLong f121834f = new AtomicLong();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final AtomicReference<SwitchMapSingleObserver<R>> f121835g = new AtomicReference<>();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        e f121836h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        volatile boolean f121837i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        volatile boolean f121838j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        long f121839k;

        public static final class SwitchMapSingleObserver<R> extends AtomicReference<io.reactivex.disposables.b> implements l0<R> {
            private static final long serialVersionUID = 8042919737683345351L;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final SwitchMapSingleSubscriber<?, R> f121840b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            volatile R f121841c;

            SwitchMapSingleObserver(SwitchMapSingleSubscriber<?, R> switchMapSingleSubscriber) {
                this.f121840b = switchMapSingleSubscriber;
            }

            void a() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.l0
            public void onError(Throwable th2) {
                this.f121840b.c(this, th2);
            }

            @Override // io.reactivex.l0
            public void onSubscribe(io.reactivex.disposables.b bVar) {
                DisposableHelper.setOnce(this, bVar);
            }

            @Override // io.reactivex.l0
            public void onSuccess(R r10) {
                this.f121841c = r10;
                this.f121840b.b();
            }
        }

        SwitchMapSingleSubscriber(d<? super R> dVar, o<? super T, ? extends o0<? extends R>> oVar, boolean z10) {
            this.f121830b = dVar;
            this.f121831c = oVar;
            this.f121832d = z10;
        }

        void a() {
            AtomicReference<SwitchMapSingleObserver<R>> atomicReference = this.f121835g;
            SwitchMapSingleObserver<Object> switchMapSingleObserver = f121829l;
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
            d<? super R> dVar = this.f121830b;
            AtomicThrowable atomicThrowable = this.f121833e;
            AtomicReference<SwitchMapSingleObserver<R>> atomicReference = this.f121835g;
            AtomicLong atomicLong = this.f121834f;
            long j10 = this.f121839k;
            int iAddAndGet = 1;
            while (!this.f121838j) {
                if (atomicThrowable.get() != null && !this.f121832d) {
                    dVar.onError(atomicThrowable.c());
                    return;
                }
                boolean z10 = this.f121837i;
                SwitchMapSingleObserver<R> switchMapSingleObserver = atomicReference.get();
                boolean z11 = switchMapSingleObserver == null;
                if (z10 && z11) {
                    Throwable thC = atomicThrowable.c();
                    if (thC != null) {
                        dVar.onError(thC);
                        return;
                    } else {
                        dVar.onComplete();
                        return;
                    }
                }
                if (z11 || switchMapSingleObserver.f121841c == null || j10 == atomicLong.get()) {
                    this.f121839k = j10;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    s0.a(atomicReference, switchMapSingleObserver, null);
                    dVar.onNext(switchMapSingleObserver.f121841c);
                    j10++;
                }
            }
        }

        void c(SwitchMapSingleObserver<R> switchMapSingleObserver, Throwable th2) {
            if (!s0.a(this.f121835g, switchMapSingleObserver, null) || !this.f121833e.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (!this.f121832d) {
                this.f121836h.cancel();
                a();
            }
            b();
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            this.f121838j = true;
            this.f121836h.cancel();
            a();
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            this.f121837i = true;
            b();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (!this.f121833e.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (!this.f121832d) {
                a();
            }
            this.f121837i = true;
            b();
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            SwitchMapSingleObserver<R> switchMapSingleObserver;
            SwitchMapSingleObserver<R> switchMapSingleObserver2 = this.f121835g.get();
            if (switchMapSingleObserver2 != null) {
                switchMapSingleObserver2.a();
            }
            try {
                o0 o0Var = (o0) io.reactivex.internal.functions.a.g(this.f121831c.apply(t10), "The mapper returned a null SingleSource");
                SwitchMapSingleObserver switchMapSingleObserver3 = new SwitchMapSingleObserver(this);
                do {
                    switchMapSingleObserver = this.f121835g.get();
                    if (switchMapSingleObserver == f121829l) {
                        return;
                    }
                } while (!s0.a(this.f121835g, switchMapSingleObserver, switchMapSingleObserver3));
                o0Var.f(switchMapSingleObserver3);
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f121836h.cancel();
                this.f121835g.getAndSet((SwitchMapSingleObserver<R>) f121829l);
                onError(th2);
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(e eVar) {
            if (SubscriptionHelper.validate(this.f121836h, eVar)) {
                this.f121836h = eVar;
                this.f121830b.onSubscribe(this);
                eVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            io.reactivex.internal.util.b.a(this.f121834f, j10);
            b();
        }
    }

    public FlowableSwitchMapSingle(j<T> jVar, o<? super T, ? extends o0<? extends R>> oVar, boolean z10) {
        this.f121826c = jVar;
        this.f121827d = oVar;
        this.f121828e = z10;
    }

    @Override // io.reactivex.j
    protected void k6(d<? super R> dVar) {
        this.f121826c.j6(new SwitchMapSingleSubscriber(dVar, this.f121827d, this.f121828e));
    }
}
