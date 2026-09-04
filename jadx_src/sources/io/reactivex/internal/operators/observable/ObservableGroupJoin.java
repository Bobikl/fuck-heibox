package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.subjects.UnicastSubject;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableGroupJoin<TLeft, TRight, TLeftEnd, TRightEnd, R> extends io.reactivex.internal.operators.observable.a<TLeft, R> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.e0<? extends TRight> f122220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.o<? super TLeft, ? extends io.reactivex.e0<TLeftEnd>> f122221d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final kh.o<? super TRight, ? extends io.reactivex.e0<TRightEnd>> f122222e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final kh.c<? super TLeft, ? super io.reactivex.z<TRight>, ? extends R> f122223f;

    public static final class GroupJoinDisposable<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements io.reactivex.disposables.b, a {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        static final Integer f122224o = 1;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        static final Integer f122225p = 2;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        static final Integer f122226q = 3;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        static final Integer f122227r = 4;
        private static final long serialVersionUID = -6071216598687999801L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super R> f122228b;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final kh.o<? super TLeft, ? extends io.reactivex.e0<TLeftEnd>> f122234h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final kh.o<? super TRight, ? extends io.reactivex.e0<TRightEnd>> f122235i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final kh.c<? super TLeft, ? super io.reactivex.z<TRight>, ? extends R> f122236j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f122238l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f122239m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        volatile boolean f122240n;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.disposables.a f122230d = new io.reactivex.disposables.a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.internal.queue.a<Object> f122229c = new io.reactivex.internal.queue.a<>(io.reactivex.z.T());

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final Map<Integer, UnicastSubject<TRight>> f122231e = new LinkedHashMap();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final Map<Integer, TRight> f122232f = new LinkedHashMap();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final AtomicReference<Throwable> f122233g = new AtomicReference<>();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final AtomicInteger f122237k = new AtomicInteger(2);

        GroupJoinDisposable(io.reactivex.g0<? super R> g0Var, kh.o<? super TLeft, ? extends io.reactivex.e0<TLeftEnd>> oVar, kh.o<? super TRight, ? extends io.reactivex.e0<TRightEnd>> oVar2, kh.c<? super TLeft, ? super io.reactivex.z<TRight>, ? extends R> cVar) {
            this.f122228b = g0Var;
            this.f122234h = oVar;
            this.f122235i = oVar2;
            this.f122236j = cVar;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.a
        public void a(Throwable th2) {
            if (!ExceptionHelper.a(this.f122233g, th2)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f122237k.decrementAndGet();
                h();
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.a
        public void b(Throwable th2) {
            if (ExceptionHelper.a(this.f122233g, th2)) {
                h();
            } else {
                io.reactivex.plugins.a.Y(th2);
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.a
        public void c(boolean z10, Object obj) {
            synchronized (this) {
                this.f122229c.offer(z10 ? f122224o : f122225p, obj);
            }
            h();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.a
        public void d(boolean z10, LeftRightEndObserver leftRightEndObserver) {
            synchronized (this) {
                this.f122229c.offer(z10 ? f122226q : f122227r, leftRightEndObserver);
            }
            h();
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (this.f122240n) {
                return;
            }
            this.f122240n = true;
            g();
            if (getAndIncrement() == 0) {
                this.f122229c.clear();
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.a
        public void f(LeftRightObserver leftRightObserver) {
            this.f122230d.b(leftRightObserver);
            this.f122237k.decrementAndGet();
            h();
        }

        void g() {
            this.f122230d.dispose();
        }

        void h() {
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.internal.queue.a<?> aVar = this.f122229c;
            io.reactivex.g0<? super R> g0Var = this.f122228b;
            int iAddAndGet = 1;
            while (!this.f122240n) {
                if (this.f122233g.get() != null) {
                    aVar.clear();
                    g();
                    j(g0Var);
                    return;
                }
                boolean z10 = this.f122237k.get() == 0;
                Integer num = (Integer) aVar.poll();
                boolean z11 = num == null;
                if (z10 && z11) {
                    Iterator<UnicastSubject<TRight>> it = this.f122231e.values().iterator();
                    while (it.hasNext()) {
                        it.next().onComplete();
                    }
                    this.f122231e.clear();
                    this.f122232f.clear();
                    this.f122230d.dispose();
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
                    if (num == f122224o) {
                        UnicastSubject unicastSubjectM8 = UnicastSubject.m8();
                        int i10 = this.f122238l;
                        this.f122238l = i10 + 1;
                        this.f122231e.put(Integer.valueOf(i10), (UnicastSubject<TRight>) unicastSubjectM8);
                        try {
                            io.reactivex.e0 e0Var = (io.reactivex.e0) io.reactivex.internal.functions.a.g(this.f122234h.apply(objPoll), "The leftEnd returned a null ObservableSource");
                            LeftRightEndObserver leftRightEndObserver = new LeftRightEndObserver(this, true, i10);
                            this.f122230d.c(leftRightEndObserver);
                            e0Var.g(leftRightEndObserver);
                            if (this.f122233g.get() != null) {
                                aVar.clear();
                                g();
                                j(g0Var);
                                return;
                            } else {
                                try {
                                    g0Var.onNext((Object) io.reactivex.internal.functions.a.g(this.f122236j.apply(objPoll, unicastSubjectM8), "The resultSelector returned a null value"));
                                    Iterator<TRight> it2 = this.f122232f.values().iterator();
                                    while (it2.hasNext()) {
                                        unicastSubjectM8.onNext(it2.next());
                                    }
                                } catch (Throwable th2) {
                                    k(th2, g0Var, aVar);
                                    return;
                                }
                            }
                        } catch (Throwable th3) {
                            k(th3, g0Var, aVar);
                            return;
                        }
                    } else if (num == f122225p) {
                        int i11 = this.f122239m;
                        this.f122239m = i11 + 1;
                        this.f122232f.put(Integer.valueOf(i11), (TRight) objPoll);
                        try {
                            io.reactivex.e0 e0Var2 = (io.reactivex.e0) io.reactivex.internal.functions.a.g(this.f122235i.apply(objPoll), "The rightEnd returned a null ObservableSource");
                            LeftRightEndObserver leftRightEndObserver2 = new LeftRightEndObserver(this, false, i11);
                            this.f122230d.c(leftRightEndObserver2);
                            e0Var2.g(leftRightEndObserver2);
                            if (this.f122233g.get() != null) {
                                aVar.clear();
                                g();
                                j(g0Var);
                                return;
                            } else {
                                Iterator<UnicastSubject<TRight>> it3 = this.f122231e.values().iterator();
                                while (it3.hasNext()) {
                                    it3.next().onNext(objPoll);
                                }
                            }
                        } catch (Throwable th4) {
                            k(th4, g0Var, aVar);
                            return;
                        }
                    } else if (num == f122226q) {
                        LeftRightEndObserver leftRightEndObserver3 = (LeftRightEndObserver) objPoll;
                        UnicastSubject<TRight> unicastSubjectRemove = this.f122231e.remove(Integer.valueOf(leftRightEndObserver3.f122243d));
                        this.f122230d.a(leftRightEndObserver3);
                        if (unicastSubjectRemove != null) {
                            unicastSubjectRemove.onComplete();
                        }
                    } else if (num == f122227r) {
                        LeftRightEndObserver leftRightEndObserver4 = (LeftRightEndObserver) objPoll;
                        this.f122232f.remove(Integer.valueOf(leftRightEndObserver4.f122243d));
                        this.f122230d.a(leftRightEndObserver4);
                    }
                }
            }
            aVar.clear();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f122240n;
        }

        void j(io.reactivex.g0<?> g0Var) {
            Throwable thC = ExceptionHelper.c(this.f122233g);
            Iterator<UnicastSubject<TRight>> it = this.f122231e.values().iterator();
            while (it.hasNext()) {
                it.next().onError(thC);
            }
            this.f122231e.clear();
            this.f122232f.clear();
            g0Var.onError(thC);
        }

        void k(Throwable th2, io.reactivex.g0<?> g0Var, io.reactivex.internal.queue.a<?> aVar) {
            io.reactivex.exceptions.a.b(th2);
            ExceptionHelper.a(this.f122233g, th2);
            aVar.clear();
            g();
            j(g0Var);
        }
    }

    public static final class LeftRightEndObserver extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.g0<Object>, io.reactivex.disposables.b {
        private static final long serialVersionUID = 1883890389173668373L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final a f122241b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final boolean f122242c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f122243d;

        LeftRightEndObserver(a aVar, boolean z10, int i10) {
            this.f122241b = aVar;
            this.f122242c = z10;
            this.f122243d = i10;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            this.f122241b.d(this.f122242c, this);
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            this.f122241b.b(th2);
        }

        @Override // io.reactivex.g0
        public void onNext(Object obj) {
            if (DisposableHelper.dispose(this)) {
                this.f122241b.d(this.f122242c, this);
            }
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            DisposableHelper.setOnce(this, bVar);
        }
    }

    public static final class LeftRightObserver extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.g0<Object>, io.reactivex.disposables.b {
        private static final long serialVersionUID = 1883890389173668373L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final a f122244b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final boolean f122245c;

        LeftRightObserver(a aVar, boolean z10) {
            this.f122244b = aVar;
            this.f122245c = z10;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            this.f122244b.f(this);
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            this.f122244b.a(th2);
        }

        @Override // io.reactivex.g0
        public void onNext(Object obj) {
            this.f122244b.c(this.f122245c, obj);
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            DisposableHelper.setOnce(this, bVar);
        }
    }

    public interface a {
        void a(Throwable th2);

        void b(Throwable th2);

        void c(boolean z10, Object obj);

        void d(boolean z10, LeftRightEndObserver leftRightEndObserver);

        void f(LeftRightObserver leftRightObserver);
    }

    public ObservableGroupJoin(io.reactivex.e0<TLeft> e0Var, io.reactivex.e0<? extends TRight> e0Var2, kh.o<? super TLeft, ? extends io.reactivex.e0<TLeftEnd>> oVar, kh.o<? super TRight, ? extends io.reactivex.e0<TRightEnd>> oVar2, kh.c<? super TLeft, ? super io.reactivex.z<TRight>, ? extends R> cVar) {
        super(e0Var);
        this.f122220c = e0Var2;
        this.f122221d = oVar;
        this.f122222e = oVar2;
        this.f122223f = cVar;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // io.reactivex.z
    protected void H5(io.reactivex.g0<? super R> g0Var) {
        GroupJoinDisposable groupJoinDisposable = new GroupJoinDisposable(g0Var, this.f122221d, this.f122222e, this.f122223f);
        g0Var.onSubscribe(groupJoinDisposable);
        LeftRightObserver leftRightObserver = new LeftRightObserver(groupJoinDisposable, true);
        groupJoinDisposable.f122230d.c(leftRightObserver);
        LeftRightObserver leftRightObserver2 = new LeftRightObserver(groupJoinDisposable, false);
        groupJoinDisposable.f122230d.c(leftRightObserver2);
        this.f122785b.g(leftRightObserver);
        this.f122220c.g(leftRightObserver2);
    }
}
