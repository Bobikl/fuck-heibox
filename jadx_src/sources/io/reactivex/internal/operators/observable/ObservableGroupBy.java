package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableGroupBy<T, K, V> extends io.reactivex.internal.operators.observable.a<T, io.reactivex.observables.b<K, V>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.o<? super T, ? extends K> f122197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.o<? super T, ? extends V> f122198d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f122199e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final boolean f122200f;

    public static final class GroupByObserver<T, K, V> extends AtomicInteger implements io.reactivex.g0<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        static final Object f122201j = new Object();
        private static final long serialVersionUID = -3688291656102519502L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super io.reactivex.observables.b<K, V>> f122202b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.o<? super T, ? extends K> f122203c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final kh.o<? super T, ? extends V> f122204d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f122205e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final boolean f122206f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        io.reactivex.disposables.b f122208h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final AtomicBoolean f122209i = new AtomicBoolean();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final Map<Object, a<K, V>> f122207g = new ConcurrentHashMap();

        public GroupByObserver(io.reactivex.g0<? super io.reactivex.observables.b<K, V>> g0Var, kh.o<? super T, ? extends K> oVar, kh.o<? super T, ? extends V> oVar2, int i10, boolean z10) {
            this.f122202b = g0Var;
            this.f122203c = oVar;
            this.f122204d = oVar2;
            this.f122205e = i10;
            this.f122206f = z10;
            lazySet(1);
        }

        public void a(K k10) {
            if (k10 == null) {
                k10 = (K) f122201j;
            }
            this.f122207g.remove(k10);
            if (decrementAndGet() == 0) {
                this.f122208h.dispose();
            }
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (this.f122209i.compareAndSet(false, true) && decrementAndGet() == 0) {
                this.f122208h.dispose();
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f122209i.get();
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            ArrayList arrayList = new ArrayList(this.f122207g.values());
            this.f122207g.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((a) it.next()).onComplete();
            }
            this.f122202b.onComplete();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            ArrayList arrayList = new ArrayList(this.f122207g.values());
            this.f122207g.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((a) it.next()).onError(th2);
            }
            this.f122202b.onError(th2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.g0
        public void onNext(T t10) {
            try {
                K kApply = this.f122203c.apply(t10);
                Object obj = kApply != null ? kApply : f122201j;
                a<K, V> aVar = this.f122207g.get(obj);
                a aVar2 = aVar;
                if (aVar == false) {
                    if (this.f122209i.get()) {
                        return;
                    }
                    a<K, V> aVarI8 = a.i8(kApply, this.f122205e, this, this.f122206f);
                    this.f122207g.put(obj, aVarI8);
                    getAndIncrement();
                    this.f122202b.onNext(aVarI8);
                    aVar2 = aVarI8;
                }
                try {
                    aVar2.onNext(io.reactivex.internal.functions.a.g(this.f122204d.apply(t10), "The value supplied is null"));
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.b(th2);
                    this.f122208h.dispose();
                    onError(th2);
                }
            } catch (Throwable th3) {
                io.reactivex.exceptions.a.b(th3);
                this.f122208h.dispose();
                onError(th3);
            }
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f122208h, bVar)) {
                this.f122208h = bVar;
                this.f122202b.onSubscribe(this);
            }
        }
    }

    public static final class State<T, K> extends AtomicInteger implements io.reactivex.disposables.b, io.reactivex.e0<T> {
        private static final long serialVersionUID = -3852313036005250360L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final K f122210b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.internal.queue.a<T> f122211c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final GroupByObserver<?, K, T> f122212d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final boolean f122213e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        volatile boolean f122214f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Throwable f122215g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final AtomicBoolean f122216h = new AtomicBoolean();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final AtomicBoolean f122217i = new AtomicBoolean();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final AtomicReference<io.reactivex.g0<? super T>> f122218j = new AtomicReference<>();

        State(int i10, GroupByObserver<?, K, T> groupByObserver, K k10, boolean z10) {
            this.f122211c = new io.reactivex.internal.queue.a<>(i10);
            this.f122212d = groupByObserver;
            this.f122210b = k10;
            this.f122213e = z10;
        }

        boolean a(boolean z10, boolean z11, io.reactivex.g0<? super T> g0Var, boolean z12) {
            if (this.f122216h.get()) {
                this.f122211c.clear();
                this.f122212d.a(this.f122210b);
                this.f122218j.lazySet(null);
                return true;
            }
            if (!z10) {
                return false;
            }
            if (z12) {
                if (!z11) {
                    return false;
                }
                Throwable th2 = this.f122215g;
                this.f122218j.lazySet(null);
                if (th2 != null) {
                    g0Var.onError(th2);
                } else {
                    g0Var.onComplete();
                }
                return true;
            }
            Throwable th3 = this.f122215g;
            if (th3 != null) {
                this.f122211c.clear();
                this.f122218j.lazySet(null);
                g0Var.onError(th3);
                return true;
            }
            if (!z11) {
                return false;
            }
            this.f122218j.lazySet(null);
            g0Var.onComplete();
            return true;
        }

        void b() {
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.internal.queue.a<T> aVar = this.f122211c;
            boolean z10 = this.f122213e;
            io.reactivex.g0<? super T> g0Var = this.f122218j.get();
            int iAddAndGet = 1;
            while (true) {
                if (g0Var != null) {
                    while (true) {
                        boolean z11 = this.f122214f;
                        T tPoll = aVar.poll();
                        boolean z12 = tPoll == null;
                        if (a(z11, z12, g0Var, z10)) {
                            return;
                        }
                        if (z12) {
                            break;
                        } else {
                            g0Var.onNext(tPoll);
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                if (g0Var == null) {
                    g0Var = this.f122218j.get();
                }
            }
        }

        public void c() {
            this.f122214f = true;
            b();
        }

        public void d(Throwable th2) {
            this.f122215g = th2;
            this.f122214f = true;
            b();
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (this.f122216h.compareAndSet(false, true) && getAndIncrement() == 0) {
                this.f122218j.lazySet(null);
                this.f122212d.a(this.f122210b);
            }
        }

        public void f(T t10) {
            this.f122211c.offer(t10);
            b();
        }

        @Override // io.reactivex.e0
        public void g(io.reactivex.g0<? super T> g0Var) {
            if (!this.f122217i.compareAndSet(false, true)) {
                EmptyDisposable.error(new IllegalStateException("Only one Observer allowed!"), g0Var);
                return;
            }
            g0Var.onSubscribe(this);
            this.f122218j.lazySet(g0Var);
            if (this.f122216h.get()) {
                this.f122218j.lazySet(null);
            } else {
                b();
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f122216h.get();
        }
    }

    public static final class a<K, T> extends io.reactivex.observables.b<K, T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final State<T, K> f122219c;

        protected a(K k10, State<T, K> state) {
            super(k10);
            this.f122219c = state;
        }

        public static <T, K> a<K, T> i8(K k10, int i10, GroupByObserver<?, K, T> groupByObserver, boolean z10) {
            return new a<>(k10, new State(i10, groupByObserver, k10, z10));
        }

        @Override // io.reactivex.z
        protected void H5(io.reactivex.g0<? super T> g0Var) {
            this.f122219c.g(g0Var);
        }

        public void onComplete() {
            this.f122219c.c();
        }

        public void onError(Throwable th2) {
            this.f122219c.d(th2);
        }

        public void onNext(T t10) {
            this.f122219c.f(t10);
        }
    }

    public ObservableGroupBy(io.reactivex.e0<T> e0Var, kh.o<? super T, ? extends K> oVar, kh.o<? super T, ? extends V> oVar2, int i10, boolean z10) {
        super(e0Var);
        this.f122197c = oVar;
        this.f122198d = oVar2;
        this.f122199e = i10;
        this.f122200f = z10;
    }

    @Override // io.reactivex.z
    public void H5(io.reactivex.g0<? super io.reactivex.observables.b<K, V>> g0Var) {
        this.f122785b.g(new GroupByObserver(g0Var, this.f122197c, this.f122198d, this.f122199e, this.f122200f));
    }
}
