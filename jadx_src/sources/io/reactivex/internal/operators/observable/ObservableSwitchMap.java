package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableSwitchMap<T, R> extends a<T, R> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.o<? super T, ? extends io.reactivex.e0<? extends R>> f122566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f122567d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final boolean f122568e;

    public static final class SwitchMapInnerObserver<T, R> extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.g0<R> {
        private static final long serialVersionUID = 3837284832786408377L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final SwitchMapObserver<T, R> f122569b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f122570c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f122571d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        volatile lh.o<R> f122572e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        volatile boolean f122573f;

        SwitchMapInnerObserver(SwitchMapObserver<T, R> switchMapObserver, long j10, int i10) {
            this.f122569b = switchMapObserver;
            this.f122570c = j10;
            this.f122571d = i10;
        }

        public void a() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            if (this.f122570c == this.f122569b.f122584k) {
                this.f122573f = true;
                this.f122569b.b();
            }
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            this.f122569b.c(this, th2);
        }

        @Override // io.reactivex.g0
        public void onNext(R r10) {
            if (this.f122570c == this.f122569b.f122584k) {
                if (r10 != null) {
                    this.f122572e.offer(r10);
                }
                this.f122569b.b();
            }
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.setOnce(this, bVar)) {
                if (bVar instanceof lh.j) {
                    lh.j jVar = (lh.j) bVar;
                    int iRequestFusion = jVar.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.f122572e = jVar;
                        this.f122573f = true;
                        this.f122569b.b();
                        return;
                    } else if (iRequestFusion == 2) {
                        this.f122572e = jVar;
                        return;
                    }
                }
                this.f122572e = new io.reactivex.internal.queue.a(this.f122571d);
            }
        }
    }

    public static final class SwitchMapObserver<T, R> extends AtomicInteger implements io.reactivex.g0<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        static final SwitchMapInnerObserver<Object, Object> f122574l;
        private static final long serialVersionUID = -3491074160481096299L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super R> f122575b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.o<? super T, ? extends io.reactivex.e0<? extends R>> f122576c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f122577d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final boolean f122578e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        volatile boolean f122580g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        volatile boolean f122581h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        io.reactivex.disposables.b f122582i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        volatile long f122584k;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final AtomicReference<SwitchMapInnerObserver<T, R>> f122583j = new AtomicReference<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final AtomicThrowable f122579f = new AtomicThrowable();

        static {
            SwitchMapInnerObserver<Object, Object> switchMapInnerObserver = new SwitchMapInnerObserver<>(null, -1L, 1);
            f122574l = switchMapInnerObserver;
            switchMapInnerObserver.a();
        }

        SwitchMapObserver(io.reactivex.g0<? super R> g0Var, kh.o<? super T, ? extends io.reactivex.e0<? extends R>> oVar, int i10, boolean z10) {
            this.f122575b = g0Var;
            this.f122576c = oVar;
            this.f122577d = i10;
            this.f122578e = z10;
        }

        void a() {
            SwitchMapInnerObserver<T, R> andSet;
            SwitchMapInnerObserver<T, R> switchMapInnerObserver = this.f122583j.get();
            SwitchMapInnerObserver<Object, Object> switchMapInnerObserver2 = f122574l;
            if (switchMapInnerObserver == switchMapInnerObserver2 || (andSet = this.f122583j.getAndSet((SwitchMapInnerObserver<T, R>) switchMapInnerObserver2)) == switchMapInnerObserver2 || andSet == null) {
                return;
            }
            andSet.a();
        }

        /* JADX WARN: Code duplicated, block: B:101:0x000f A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:95:0x00e9 A[SYNTHETIC] */
        void b() {
            lh.o<R> oVar;
            a.a.a.a.d.p.d.c.d dVarPoll;
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.g0<? super R> g0Var = this.f122575b;
            AtomicReference<SwitchMapInnerObserver<T, R>> atomicReference = this.f122583j;
            boolean z10 = this.f122578e;
            int iAddAndGet = 1;
            while (!this.f122581h) {
                if (this.f122580g) {
                    boolean z11 = atomicReference.get() == null;
                    if (z10) {
                        if (z11) {
                            Throwable th2 = this.f122579f.get();
                            if (th2 != null) {
                                g0Var.onError(th2);
                                return;
                            } else {
                                g0Var.onComplete();
                                return;
                            }
                        }
                    } else if (this.f122579f.get() != null) {
                        g0Var.onError(this.f122579f.c());
                        return;
                    } else if (z11) {
                        g0Var.onComplete();
                        return;
                    }
                }
                SwitchMapInnerObserver<T, R> switchMapInnerObserver = atomicReference.get();
                if (switchMapInnerObserver != null && (oVar = switchMapInnerObserver.f122572e) != null) {
                    if (switchMapInnerObserver.f122573f) {
                        boolean zIsEmpty = oVar.isEmpty();
                        if (z10) {
                            if (zIsEmpty) {
                                androidx.compose.animation.core.s0.a(atomicReference, switchMapInnerObserver, null);
                            }
                        } else if (this.f122579f.get() != null) {
                            g0Var.onError(this.f122579f.c());
                            return;
                        } else if (zIsEmpty) {
                            androidx.compose.animation.core.s0.a(atomicReference, switchMapInnerObserver, null);
                        }
                    }
                    boolean z12 = false;
                    while (!this.f122581h) {
                        if (switchMapInnerObserver == atomicReference.get()) {
                            if (!z10 && this.f122579f.get() != null) {
                                g0Var.onError(this.f122579f.c());
                                return;
                            }
                            boolean z13 = switchMapInnerObserver.f122573f;
                            try {
                                dVarPoll = oVar.poll();
                            } catch (Throwable th3) {
                                io.reactivex.exceptions.a.b(th3);
                                this.f122579f.a(th3);
                                androidx.compose.animation.core.s0.a(atomicReference, switchMapInnerObserver, null);
                                if (z10) {
                                    switchMapInnerObserver.a();
                                } else {
                                    a();
                                    this.f122582i.dispose();
                                    this.f122580g = true;
                                }
                                z12 = true;
                                dVarPoll = null;
                            }
                            boolean z14 = dVarPoll == null;
                            if (z13 && z14) {
                                androidx.compose.animation.core.s0.a(atomicReference, switchMapInnerObserver, null);
                            } else if (!z14) {
                                g0Var.onNext(dVarPoll);
                            }
                            if (z12) {
                                continue;
                            }
                        }
                        z12 = true;
                        if (z12) {
                            continue;
                        }
                    }
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        void c(SwitchMapInnerObserver<T, R> switchMapInnerObserver, Throwable th2) {
            if (switchMapInnerObserver.f122570c != this.f122584k || !this.f122579f.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (!this.f122578e) {
                this.f122582i.dispose();
            }
            switchMapInnerObserver.f122573f = true;
            b();
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (this.f122581h) {
                return;
            }
            this.f122581h = true;
            this.f122582i.dispose();
            a();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f122581h;
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            if (this.f122580g) {
                return;
            }
            this.f122580g = true;
            b();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            if (this.f122580g || !this.f122579f.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (!this.f122578e) {
                a();
            }
            this.f122580g = true;
            b();
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            SwitchMapInnerObserver<T, R> switchMapInnerObserver;
            long j10 = this.f122584k + 1;
            this.f122584k = j10;
            SwitchMapInnerObserver<T, R> switchMapInnerObserver2 = this.f122583j.get();
            if (switchMapInnerObserver2 != null) {
                switchMapInnerObserver2.a();
            }
            try {
                io.reactivex.e0 e0Var = (io.reactivex.e0) io.reactivex.internal.functions.a.g(this.f122576c.apply(t10), "The ObservableSource returned is null");
                SwitchMapInnerObserver switchMapInnerObserver3 = new SwitchMapInnerObserver(this, j10, this.f122577d);
                do {
                    switchMapInnerObserver = this.f122583j.get();
                    if (switchMapInnerObserver == f122574l) {
                        return;
                    }
                } while (!androidx.compose.animation.core.s0.a(this.f122583j, switchMapInnerObserver, switchMapInnerObserver3));
                e0Var.g(switchMapInnerObserver3);
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f122582i.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f122582i, bVar)) {
                this.f122582i = bVar;
                this.f122575b.onSubscribe(this);
            }
        }
    }

    public ObservableSwitchMap(io.reactivex.e0<T> e0Var, kh.o<? super T, ? extends io.reactivex.e0<? extends R>> oVar, int i10, boolean z10) {
        super(e0Var);
        this.f122566c = oVar;
        this.f122567d = i10;
        this.f122568e = z10;
    }

    @Override // io.reactivex.z
    public void H5(io.reactivex.g0<? super R> g0Var) {
        if (ObservableScalarXMap.b(this.f122785b, g0Var, this.f122566c)) {
            return;
        }
        this.f122785b.g(new SwitchMapObserver(g0Var, this.f122566c, this.f122567d, this.f122568e));
    }
}
