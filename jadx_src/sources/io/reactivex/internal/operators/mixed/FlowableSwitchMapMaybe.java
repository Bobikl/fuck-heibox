package io.reactivex.internal.operators.mixed;

import androidx.compose.animation.core.s0;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.j;
import io.reactivex.t;
import io.reactivex.w;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kh.o;
import org.reactivestreams.d;
import org.reactivestreams.e;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableSwitchMapMaybe<T, R> extends j<R> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final j<T> f121810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final o<? super T, ? extends w<? extends R>> f121811d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final boolean f121812e;

    public static final class SwitchMapMaybeSubscriber<T, R> extends AtomicInteger implements io.reactivex.o<T>, e {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        static final SwitchMapMaybeObserver<Object> f121813l = new SwitchMapMaybeObserver<>(null);
        private static final long serialVersionUID = -5402190102429853762L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final d<? super R> f121814b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final o<? super T, ? extends w<? extends R>> f121815c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final boolean f121816d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicThrowable f121817e = new AtomicThrowable();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final AtomicLong f121818f = new AtomicLong();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final AtomicReference<SwitchMapMaybeObserver<R>> f121819g = new AtomicReference<>();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        e f121820h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        volatile boolean f121821i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        volatile boolean f121822j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        long f121823k;

        public static final class SwitchMapMaybeObserver<R> extends AtomicReference<io.reactivex.disposables.b> implements t<R> {
            private static final long serialVersionUID = 8042919737683345351L;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final SwitchMapMaybeSubscriber<?, R> f121824b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            volatile R f121825c;

            SwitchMapMaybeObserver(SwitchMapMaybeSubscriber<?, R> switchMapMaybeSubscriber) {
                this.f121824b = switchMapMaybeSubscriber;
            }

            void a() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.t
            public void onComplete() {
                this.f121824b.c(this);
            }

            @Override // io.reactivex.t
            public void onError(Throwable th2) {
                this.f121824b.d(this, th2);
            }

            @Override // io.reactivex.t
            public void onSubscribe(io.reactivex.disposables.b bVar) {
                DisposableHelper.setOnce(this, bVar);
            }

            @Override // io.reactivex.t
            public void onSuccess(R r10) {
                this.f121825c = r10;
                this.f121824b.b();
            }
        }

        SwitchMapMaybeSubscriber(d<? super R> dVar, o<? super T, ? extends w<? extends R>> oVar, boolean z10) {
            this.f121814b = dVar;
            this.f121815c = oVar;
            this.f121816d = z10;
        }

        void a() {
            AtomicReference<SwitchMapMaybeObserver<R>> atomicReference = this.f121819g;
            SwitchMapMaybeObserver<Object> switchMapMaybeObserver = f121813l;
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
            d<? super R> dVar = this.f121814b;
            AtomicThrowable atomicThrowable = this.f121817e;
            AtomicReference<SwitchMapMaybeObserver<R>> atomicReference = this.f121819g;
            AtomicLong atomicLong = this.f121818f;
            long j10 = this.f121823k;
            int iAddAndGet = 1;
            while (!this.f121822j) {
                if (atomicThrowable.get() != null && !this.f121816d) {
                    dVar.onError(atomicThrowable.c());
                    return;
                }
                boolean z10 = this.f121821i;
                SwitchMapMaybeObserver<R> switchMapMaybeObserver = atomicReference.get();
                boolean z11 = switchMapMaybeObserver == null;
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
                if (z11 || switchMapMaybeObserver.f121825c == null || j10 == atomicLong.get()) {
                    this.f121823k = j10;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    s0.a(atomicReference, switchMapMaybeObserver, null);
                    dVar.onNext(switchMapMaybeObserver.f121825c);
                    j10++;
                }
            }
        }

        void c(SwitchMapMaybeObserver<R> switchMapMaybeObserver) {
            if (s0.a(this.f121819g, switchMapMaybeObserver, null)) {
                b();
            }
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            this.f121822j = true;
            this.f121820h.cancel();
            a();
        }

        void d(SwitchMapMaybeObserver<R> switchMapMaybeObserver, Throwable th2) {
            if (!s0.a(this.f121819g, switchMapMaybeObserver, null) || !this.f121817e.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (!this.f121816d) {
                this.f121820h.cancel();
                a();
            }
            b();
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            this.f121821i = true;
            b();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (!this.f121817e.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (!this.f121816d) {
                a();
            }
            this.f121821i = true;
            b();
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            SwitchMapMaybeObserver<R> switchMapMaybeObserver;
            SwitchMapMaybeObserver<R> switchMapMaybeObserver2 = this.f121819g.get();
            if (switchMapMaybeObserver2 != null) {
                switchMapMaybeObserver2.a();
            }
            try {
                w wVar = (w) io.reactivex.internal.functions.a.g(this.f121815c.apply(t10), "The mapper returned a null MaybeSource");
                SwitchMapMaybeObserver switchMapMaybeObserver3 = new SwitchMapMaybeObserver(this);
                do {
                    switchMapMaybeObserver = this.f121819g.get();
                    if (switchMapMaybeObserver == f121813l) {
                        return;
                    }
                } while (!s0.a(this.f121819g, switchMapMaybeObserver, switchMapMaybeObserver3));
                wVar.f(switchMapMaybeObserver3);
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f121820h.cancel();
                this.f121819g.getAndSet((SwitchMapMaybeObserver<R>) f121813l);
                onError(th2);
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(e eVar) {
            if (SubscriptionHelper.validate(this.f121820h, eVar)) {
                this.f121820h = eVar;
                this.f121814b.onSubscribe(this);
                eVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            io.reactivex.internal.util.b.a(this.f121818f, j10);
            b();
        }
    }

    public FlowableSwitchMapMaybe(j<T> jVar, o<? super T, ? extends w<? extends R>> oVar, boolean z10) {
        this.f121810c = jVar;
        this.f121811d = oVar;
        this.f121812e = z10;
    }

    @Override // io.reactivex.j
    protected void k6(d<? super R> dVar) {
        this.f121810c.j6(new SwitchMapMaybeSubscriber(dVar, this.f121811d, this.f121812e));
    }
}
