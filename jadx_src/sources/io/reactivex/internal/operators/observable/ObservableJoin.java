package io.reactivex.internal.operators.observable;

import io.reactivex.internal.util.ExceptionHelper;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableJoin<TLeft, TRight, TLeftEnd, TRightEnd, R> extends a<TLeft, R> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.e0<? extends TRight> f122287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.o<? super TLeft, ? extends io.reactivex.e0<TLeftEnd>> f122288d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final kh.o<? super TRight, ? extends io.reactivex.e0<TRightEnd>> f122289e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final kh.c<? super TLeft, ? super TRight, ? extends R> f122290f;

    public static final class JoinDisposable<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements io.reactivex.disposables.b, ObservableGroupJoin.a {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        static final Integer f122291o = 1;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        static final Integer f122292p = 2;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        static final Integer f122293q = 3;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        static final Integer f122294r = 4;
        private static final long serialVersionUID = -6071216598687999801L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super R> f122295b;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final kh.o<? super TLeft, ? extends io.reactivex.e0<TLeftEnd>> f122301h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final kh.o<? super TRight, ? extends io.reactivex.e0<TRightEnd>> f122302i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final kh.c<? super TLeft, ? super TRight, ? extends R> f122303j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f122305l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f122306m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        volatile boolean f122307n;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.disposables.a f122297d = new io.reactivex.disposables.a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.internal.queue.a<Object> f122296c = new io.reactivex.internal.queue.a<>(io.reactivex.z.T());

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final Map<Integer, TLeft> f122298e = new LinkedHashMap();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final Map<Integer, TRight> f122299f = new LinkedHashMap();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final AtomicReference<Throwable> f122300g = new AtomicReference<>();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final AtomicInteger f122304k = new AtomicInteger(2);

        JoinDisposable(io.reactivex.g0<? super R> g0Var, kh.o<? super TLeft, ? extends io.reactivex.e0<TLeftEnd>> oVar, kh.o<? super TRight, ? extends io.reactivex.e0<TRightEnd>> oVar2, kh.c<? super TLeft, ? super TRight, ? extends R> cVar) {
            this.f122295b = g0Var;
            this.f122301h = oVar;
            this.f122302i = oVar2;
            this.f122303j = cVar;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.a
        public void a(Throwable th2) {
            if (!ExceptionHelper.a(this.f122300g, th2)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f122304k.decrementAndGet();
                h();
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.a
        public void b(Throwable th2) {
            if (ExceptionHelper.a(this.f122300g, th2)) {
                h();
            } else {
                io.reactivex.plugins.a.Y(th2);
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.a
        public void c(boolean z10, Object obj) {
            synchronized (this) {
                this.f122296c.offer(z10 ? f122291o : f122292p, obj);
            }
            h();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.a
        public void d(boolean z10, ObservableGroupJoin.LeftRightEndObserver leftRightEndObserver) {
            synchronized (this) {
                this.f122296c.offer(z10 ? f122293q : f122294r, leftRightEndObserver);
            }
            h();
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (this.f122307n) {
                return;
            }
            this.f122307n = true;
            g();
            if (getAndIncrement() == 0) {
                this.f122296c.clear();
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.a
        public void f(ObservableGroupJoin.LeftRightObserver leftRightObserver) {
            this.f122297d.b(leftRightObserver);
            this.f122304k.decrementAndGet();
            h();
        }

        void g() {
            this.f122297d.dispose();
        }

        void h() {
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.internal.queue.a<?> aVar = this.f122296c;
            io.reactivex.g0<? super R> g0Var = this.f122295b;
            int iAddAndGet = 1;
            while (!this.f122307n) {
                if (this.f122300g.get() != null) {
                    aVar.clear();
                    g();
                    j(g0Var);
                    return;
                }
                boolean z10 = this.f122304k.get() == 0;
                Integer num = (Integer) aVar.poll();
                boolean z11 = num == null;
                if (z10 && z11) {
                    this.f122298e.clear();
                    this.f122299f.clear();
                    this.f122297d.dispose();
                    g0Var.onComplete();
                    return;
                }
                if (z11) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    Object objPoll = aVar.poll();
                    if (num == f122291o) {
                        int i10 = this.f122305l;
                        this.f122305l = i10 + 1;
                        this.f122298e.put(Integer.valueOf(i10), (TLeft) objPoll);
                        try {
                            io.reactivex.e0 e0Var = (io.reactivex.e0) io.reactivex.internal.functions.a.g(this.f122301h.apply(objPoll), "The leftEnd returned a null ObservableSource");
                            ObservableGroupJoin.LeftRightEndObserver leftRightEndObserver = new ObservableGroupJoin.LeftRightEndObserver(this, true, i10);
                            this.f122297d.c(leftRightEndObserver);
                            e0Var.g(leftRightEndObserver);
                            if (this.f122300g.get() != null) {
                                aVar.clear();
                                g();
                                j(g0Var);
                                return;
                            } else {
                                Iterator<TRight> it = this.f122299f.values().iterator();
                                while (it.hasNext()) {
                                    try {
                                        g0Var.onNext((Object) io.reactivex.internal.functions.a.g(this.f122303j.apply(objPoll, it.next()), "The resultSelector returned a null value"));
                                    } catch (Throwable th2) {
                                        k(th2, g0Var, aVar);
                                        return;
                                    }
                                }
                            }
                        } catch (Throwable th3) {
                            k(th3, g0Var, aVar);
                            return;
                        }
                    } else if (num == f122292p) {
                        int i11 = this.f122306m;
                        this.f122306m = i11 + 1;
                        this.f122299f.put(Integer.valueOf(i11), (TRight) objPoll);
                        try {
                            io.reactivex.e0 e0Var2 = (io.reactivex.e0) io.reactivex.internal.functions.a.g(this.f122302i.apply(objPoll), "The rightEnd returned a null ObservableSource");
                            ObservableGroupJoin.LeftRightEndObserver leftRightEndObserver2 = new ObservableGroupJoin.LeftRightEndObserver(this, false, i11);
                            this.f122297d.c(leftRightEndObserver2);
                            e0Var2.g(leftRightEndObserver2);
                            if (this.f122300g.get() != null) {
                                aVar.clear();
                                g();
                                j(g0Var);
                                return;
                            } else {
                                Iterator<TLeft> it2 = this.f122298e.values().iterator();
                                while (it2.hasNext()) {
                                    try {
                                        g0Var.onNext((Object) io.reactivex.internal.functions.a.g(this.f122303j.apply(it2.next(), objPoll), "The resultSelector returned a null value"));
                                    } catch (Throwable th4) {
                                        k(th4, g0Var, aVar);
                                        return;
                                    }
                                }
                            }
                        } catch (Throwable th5) {
                            k(th5, g0Var, aVar);
                            return;
                        }
                    } else if (num == f122293q) {
                        ObservableGroupJoin.LeftRightEndObserver leftRightEndObserver3 = (ObservableGroupJoin.LeftRightEndObserver) objPoll;
                        this.f122298e.remove(Integer.valueOf(leftRightEndObserver3.f122243d));
                        this.f122297d.a(leftRightEndObserver3);
                    } else {
                        ObservableGroupJoin.LeftRightEndObserver leftRightEndObserver4 = (ObservableGroupJoin.LeftRightEndObserver) objPoll;
                        this.f122299f.remove(Integer.valueOf(leftRightEndObserver4.f122243d));
                        this.f122297d.a(leftRightEndObserver4);
                    }
                }
            }
            aVar.clear();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f122307n;
        }

        void j(io.reactivex.g0<?> g0Var) {
            Throwable thC = ExceptionHelper.c(this.f122300g);
            this.f122298e.clear();
            this.f122299f.clear();
            g0Var.onError(thC);
        }

        void k(Throwable th2, io.reactivex.g0<?> g0Var, io.reactivex.internal.queue.a<?> aVar) {
            io.reactivex.exceptions.a.b(th2);
            ExceptionHelper.a(this.f122300g, th2);
            aVar.clear();
            g();
            j(g0Var);
        }
    }

    public ObservableJoin(io.reactivex.e0<TLeft> e0Var, io.reactivex.e0<? extends TRight> e0Var2, kh.o<? super TLeft, ? extends io.reactivex.e0<TLeftEnd>> oVar, kh.o<? super TRight, ? extends io.reactivex.e0<TRightEnd>> oVar2, kh.c<? super TLeft, ? super TRight, ? extends R> cVar) {
        super(e0Var);
        this.f122287c = e0Var2;
        this.f122288d = oVar;
        this.f122289e = oVar2;
        this.f122290f = cVar;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // io.reactivex.z
    protected void H5(io.reactivex.g0<? super R> g0Var) {
        JoinDisposable joinDisposable = new JoinDisposable(g0Var, this.f122288d, this.f122289e, this.f122290f);
        g0Var.onSubscribe(joinDisposable);
        ObservableGroupJoin.LeftRightObserver leftRightObserver = new ObservableGroupJoin.LeftRightObserver(joinDisposable, true);
        joinDisposable.f122297d.c(leftRightObserver);
        ObservableGroupJoin.LeftRightObserver leftRightObserver2 = new ObservableGroupJoin.LeftRightObserver(joinDisposable, false);
        joinDisposable.f122297d.c(leftRightObserver2);
        this.f122785b.g(leftRightObserver);
        this.f122287c.g(leftRightObserver2);
    }
}
