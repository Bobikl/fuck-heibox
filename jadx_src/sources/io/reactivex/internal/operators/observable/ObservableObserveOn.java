package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.BasicIntQueueDisposable;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableObserveOn<T> extends a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.h0 f122342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f122343d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f122344e;

    public static final class ObserveOnObserver<T> extends BasicIntQueueDisposable<T> implements io.reactivex.g0<T>, Runnable {
        private static final long serialVersionUID = 6576896619930983584L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super T> f122345b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.h0.c f122346c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final boolean f122347d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f122348e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        lh.o<T> f122349f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        io.reactivex.disposables.b f122350g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Throwable f122351h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        volatile boolean f122352i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        volatile boolean f122353j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f122354k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        boolean f122355l;

        ObserveOnObserver(io.reactivex.g0<? super T> g0Var, io.reactivex.h0.c cVar, boolean z10, int i10) {
            this.f122345b = g0Var;
            this.f122346c = cVar;
            this.f122347d = z10;
            this.f122348e = i10;
        }

        boolean a(boolean z10, boolean z11, io.reactivex.g0<? super T> g0Var) {
            if (this.f122353j) {
                this.f122349f.clear();
                return true;
            }
            if (!z10) {
                return false;
            }
            Throwable th2 = this.f122351h;
            if (this.f122347d) {
                if (!z11) {
                    return false;
                }
                this.f122353j = true;
                if (th2 != null) {
                    g0Var.onError(th2);
                } else {
                    g0Var.onComplete();
                }
                this.f122346c.dispose();
                return true;
            }
            if (th2 != null) {
                this.f122353j = true;
                this.f122349f.clear();
                g0Var.onError(th2);
                this.f122346c.dispose();
                return true;
            }
            if (!z11) {
                return false;
            }
            this.f122353j = true;
            g0Var.onComplete();
            this.f122346c.dispose();
            return true;
        }

        void b() {
            int iAddAndGet = 1;
            while (!this.f122353j) {
                boolean z10 = this.f122352i;
                Throwable th2 = this.f122351h;
                if (!this.f122347d && z10 && th2 != null) {
                    this.f122353j = true;
                    this.f122345b.onError(this.f122351h);
                    this.f122346c.dispose();
                    return;
                }
                this.f122345b.onNext(null);
                if (z10) {
                    this.f122353j = true;
                    Throwable th3 = this.f122351h;
                    if (th3 != null) {
                        this.f122345b.onError(th3);
                    } else {
                        this.f122345b.onComplete();
                    }
                    this.f122346c.dispose();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        void c() {
            lh.o<T> oVar = this.f122349f;
            io.reactivex.g0<? super T> g0Var = this.f122345b;
            int iAddAndGet = 1;
            while (!a(this.f122352i, oVar.isEmpty(), g0Var)) {
                while (true) {
                    boolean z10 = this.f122352i;
                    try {
                        T tPoll = oVar.poll();
                        boolean z11 = tPoll == null;
                        if (a(z10, z11, g0Var)) {
                            return;
                        }
                        if (z11) {
                            break;
                        } else {
                            g0Var.onNext(tPoll);
                        }
                    } catch (Throwable th2) {
                        io.reactivex.exceptions.a.b(th2);
                        this.f122353j = true;
                        this.f122350g.dispose();
                        oVar.clear();
                        g0Var.onError(th2);
                        this.f122346c.dispose();
                        return;
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // lh.o
        public void clear() {
            this.f122349f.clear();
        }

        void d() {
            if (getAndIncrement() == 0) {
                this.f122346c.b(this);
            }
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (this.f122353j) {
                return;
            }
            this.f122353j = true;
            this.f122350g.dispose();
            this.f122346c.dispose();
            if (getAndIncrement() == 0) {
                this.f122349f.clear();
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f122353j;
        }

        @Override // lh.o
        public boolean isEmpty() {
            return this.f122349f.isEmpty();
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            if (this.f122352i) {
                return;
            }
            this.f122352i = true;
            d();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            if (this.f122352i) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f122351h = th2;
            this.f122352i = true;
            d();
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            if (this.f122352i) {
                return;
            }
            if (this.f122354k != 2) {
                this.f122349f.offer(t10);
            }
            d();
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f122350g, bVar)) {
                this.f122350g = bVar;
                if (bVar instanceof lh.j) {
                    lh.j jVar = (lh.j) bVar;
                    int iRequestFusion = jVar.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.f122354k = iRequestFusion;
                        this.f122349f = jVar;
                        this.f122352i = true;
                        this.f122345b.onSubscribe(this);
                        d();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f122354k = iRequestFusion;
                        this.f122349f = jVar;
                        this.f122345b.onSubscribe(this);
                        return;
                    }
                }
                this.f122349f = new io.reactivex.internal.queue.a(this.f122348e);
                this.f122345b.onSubscribe(this);
            }
        }

        @Override // lh.o
        @jh.f
        public T poll() throws Exception {
            return this.f122349f.poll();
        }

        @Override // lh.k
        public int requestFusion(int i10) {
            if ((i10 & 2) == 0) {
                return 0;
            }
            this.f122355l = true;
            return 2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f122355l) {
                b();
            } else {
                c();
            }
        }
    }

    public ObservableObserveOn(io.reactivex.e0<T> e0Var, io.reactivex.h0 h0Var, boolean z10, int i10) {
        super(e0Var);
        this.f122342c = h0Var;
        this.f122343d = z10;
        this.f122344e = i10;
    }

    @Override // io.reactivex.z
    protected void H5(io.reactivex.g0<? super T> g0Var) {
        io.reactivex.h0 h0Var = this.f122342c;
        if (h0Var instanceof io.reactivex.internal.schedulers.l) {
            this.f122785b.g(g0Var);
        } else {
            this.f122785b.g(new ObserveOnObserver(g0Var, h0Var.c(), this.f122343d, this.f122344e));
        }
    }
}
