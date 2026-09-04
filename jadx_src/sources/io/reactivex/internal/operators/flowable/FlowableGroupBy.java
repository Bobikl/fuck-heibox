package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.EmptyComponent;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableGroupBy<T, K, V> extends io.reactivex.internal.operators.flowable.a<T, io.reactivex.flowables.b<K, V>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.o<? super T, ? extends K> f120251d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final kh.o<? super T, ? extends V> f120252e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int f120253f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final boolean f120254g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final kh.o<? super kh.g<Object>, ? extends Map<K, Object>> f120255h;

    public static final class GroupBySubscriber<T, K, V> extends BasicIntQueueSubscription<io.reactivex.flowables.b<K, V>> implements io.reactivex.o<T> {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        static final Object f120256r = new Object();
        private static final long serialVersionUID = -3688291656102519502L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super io.reactivex.flowables.b<K, V>> f120257b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.o<? super T, ? extends K> f120258c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final kh.o<? super T, ? extends V> f120259d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f120260e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final boolean f120261f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final Map<Object, b<K, V>> f120262g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final io.reactivex.internal.queue.a<io.reactivex.flowables.b<K, V>> f120263h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final Queue<b<K, V>> f120264i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        org.reactivestreams.e f120265j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final AtomicBoolean f120266k = new AtomicBoolean();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final AtomicLong f120267l = new AtomicLong();

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final AtomicInteger f120268m = new AtomicInteger(1);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Throwable f120269n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        volatile boolean f120270o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        boolean f120271p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        boolean f120272q;

        public GroupBySubscriber(org.reactivestreams.d<? super io.reactivex.flowables.b<K, V>> dVar, kh.o<? super T, ? extends K> oVar, kh.o<? super T, ? extends V> oVar2, int i10, boolean z10, Map<Object, b<K, V>> map, Queue<b<K, V>> queue) {
            this.f120257b = dVar;
            this.f120258c = oVar;
            this.f120259d = oVar2;
            this.f120260e = i10;
            this.f120261f = z10;
            this.f120262g = map;
            this.f120264i = queue;
            this.f120263h = new io.reactivex.internal.queue.a<>(i10);
        }

        private void f() {
            if (this.f120264i != null) {
                int i10 = 0;
                while (true) {
                    b<K, V> bVarPoll = this.f120264i.poll();
                    if (bVarPoll == null) {
                        break;
                    }
                    bVarPoll.onComplete();
                    i10++;
                }
                if (i10 != 0) {
                    this.f120268m.addAndGet(-i10);
                }
            }
        }

        void b() {
            if (getAndIncrement() != 0) {
                return;
            }
            if (this.f120272q) {
                k();
            } else {
                n();
            }
        }

        public void c(K k10) {
            if (k10 == null) {
                k10 = (K) f120256r;
            }
            this.f120262g.remove(k10);
            if (this.f120268m.decrementAndGet() == 0) {
                this.f120265j.cancel();
                if (getAndIncrement() == 0) {
                    this.f120263h.clear();
                }
            }
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            if (this.f120266k.compareAndSet(false, true)) {
                f();
                if (this.f120268m.decrementAndGet() == 0) {
                    this.f120265j.cancel();
                }
            }
        }

        @Override // lh.o
        public void clear() {
            this.f120263h.clear();
        }

        boolean d(boolean z10, boolean z11, org.reactivestreams.d<?> dVar, io.reactivex.internal.queue.a<?> aVar) {
            if (this.f120266k.get()) {
                aVar.clear();
                return true;
            }
            if (this.f120261f) {
                if (!z10 || !z11) {
                    return false;
                }
                Throwable th2 = this.f120269n;
                if (th2 != null) {
                    dVar.onError(th2);
                } else {
                    dVar.onComplete();
                }
                return true;
            }
            if (!z10) {
                return false;
            }
            Throwable th3 = this.f120269n;
            if (th3 != null) {
                aVar.clear();
                dVar.onError(th3);
                return true;
            }
            if (!z11) {
                return false;
            }
            dVar.onComplete();
            return true;
        }

        @Override // lh.o
        public boolean isEmpty() {
            return this.f120263h.isEmpty();
        }

        void k() {
            Throwable th2;
            io.reactivex.internal.queue.a<io.reactivex.flowables.b<K, V>> aVar = this.f120263h;
            org.reactivestreams.d<? super io.reactivex.flowables.b<K, V>> dVar = this.f120257b;
            int iAddAndGet = 1;
            while (!this.f120266k.get()) {
                boolean z10 = this.f120270o;
                if (z10 && !this.f120261f && (th2 = this.f120269n) != null) {
                    aVar.clear();
                    dVar.onError(th2);
                    return;
                }
                dVar.onNext(null);
                if (z10) {
                    Throwable th3 = this.f120269n;
                    if (th3 != null) {
                        dVar.onError(th3);
                        return;
                    } else {
                        dVar.onComplete();
                        return;
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            aVar.clear();
        }

        void n() {
            io.reactivex.internal.queue.a<io.reactivex.flowables.b<K, V>> aVar = this.f120263h;
            org.reactivestreams.d<? super io.reactivex.flowables.b<K, V>> dVar = this.f120257b;
            int iAddAndGet = 1;
            do {
                long j10 = this.f120267l.get();
                long j11 = 0;
                while (j11 != j10) {
                    boolean z10 = this.f120270o;
                    io.reactivex.flowables.b<K, V> bVarPoll = aVar.poll();
                    boolean z11 = bVarPoll == null;
                    if (d(z10, z11, dVar, aVar)) {
                        return;
                    }
                    if (z11) {
                        break;
                    }
                    dVar.onNext(bVarPoll);
                    j11++;
                }
                if (j11 == j10 && d(this.f120270o, aVar.isEmpty(), dVar, aVar)) {
                    return;
                }
                if (j11 != 0) {
                    if (j10 != Long.MAX_VALUE) {
                        this.f120267l.addAndGet(-j11);
                    }
                    this.f120265j.request(j11);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // lh.o
        @jh.f
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public io.reactivex.flowables.b<K, V> poll() {
            return this.f120263h.poll();
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            if (this.f120271p) {
                return;
            }
            Iterator<b<K, V>> it = this.f120262g.values().iterator();
            while (it.hasNext()) {
                it.next().onComplete();
            }
            this.f120262g.clear();
            Queue<b<K, V>> queue = this.f120264i;
            if (queue != null) {
                queue.clear();
            }
            this.f120271p = true;
            this.f120270o = true;
            b();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (this.f120271p) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f120271p = true;
            Iterator<b<K, V>> it = this.f120262g.values().iterator();
            while (it.hasNext()) {
                it.next().onError(th2);
            }
            this.f120262g.clear();
            Queue<b<K, V>> queue = this.f120264i;
            if (queue != null) {
                queue.clear();
            }
            this.f120269n = th2;
            this.f120270o = true;
            b();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (this.f120271p) {
                return;
            }
            io.reactivex.internal.queue.a<io.reactivex.flowables.b<K, V>> aVar = this.f120263h;
            try {
                K kApply = this.f120258c.apply(t10);
                boolean z10 = false;
                Object obj = kApply != null ? kApply : f120256r;
                b<K, V> bVar = this.f120262g.get(obj);
                b bVar2 = bVar;
                if (bVar == null) {
                    if (this.f120266k.get()) {
                        return;
                    }
                    b bVarN8 = b.N8(kApply, this.f120260e, this, this.f120261f);
                    this.f120262g.put(obj, bVarN8);
                    this.f120268m.getAndIncrement();
                    z10 = true;
                    bVar2 = bVarN8;
                }
                try {
                    bVar2.onNext(io.reactivex.internal.functions.a.g(this.f120259d.apply(t10), "The valueSelector returned null"));
                    f();
                    if (z10) {
                        aVar.offer(bVar2);
                        b();
                    }
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.b(th2);
                    this.f120265j.cancel();
                    onError(th2);
                }
            } catch (Throwable th3) {
                io.reactivex.exceptions.a.b(th3);
                this.f120265j.cancel();
                onError(th3);
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f120265j, eVar)) {
                this.f120265j = eVar;
                this.f120257b.onSubscribe(this);
                eVar.request(this.f120260e);
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                io.reactivex.internal.util.b.a(this.f120267l, j10);
                b();
            }
        }

        @Override // lh.k
        public int requestFusion(int i10) {
            if ((i10 & 2) == 0) {
                return 0;
            }
            this.f120272q = true;
            return 2;
        }
    }

    public static final class State<T, K> extends BasicIntQueueSubscription<T> implements org.reactivestreams.c<T> {
        private static final long serialVersionUID = -3852313036005250360L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final K f120273b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.internal.queue.a<T> f120274c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final GroupBySubscriber<?, K, T> f120275d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final boolean f120276e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        volatile boolean f120278g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Throwable f120279h;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        boolean f120283l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f120284m;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final AtomicLong f120277f = new AtomicLong();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final AtomicBoolean f120280i = new AtomicBoolean();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final AtomicReference<org.reactivestreams.d<? super T>> f120281j = new AtomicReference<>();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final AtomicBoolean f120282k = new AtomicBoolean();

        State(int i10, GroupBySubscriber<?, K, T> groupBySubscriber, K k10, boolean z10) {
            this.f120274c = new io.reactivex.internal.queue.a<>(i10);
            this.f120275d = groupBySubscriber;
            this.f120273b = k10;
            this.f120276e = z10;
        }

        void b() {
            if (getAndIncrement() != 0) {
                return;
            }
            if (this.f120283l) {
                d();
            } else {
                f();
            }
        }

        boolean c(boolean z10, boolean z11, org.reactivestreams.d<? super T> dVar, boolean z12) {
            if (this.f120280i.get()) {
                this.f120274c.clear();
                return true;
            }
            if (!z10) {
                return false;
            }
            if (z12) {
                if (!z11) {
                    return false;
                }
                Throwable th2 = this.f120279h;
                if (th2 != null) {
                    dVar.onError(th2);
                } else {
                    dVar.onComplete();
                }
                return true;
            }
            Throwable th3 = this.f120279h;
            if (th3 != null) {
                this.f120274c.clear();
                dVar.onError(th3);
                return true;
            }
            if (!z11) {
                return false;
            }
            dVar.onComplete();
            return true;
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            if (this.f120280i.compareAndSet(false, true)) {
                this.f120275d.c(this.f120273b);
            }
        }

        @Override // lh.o
        public void clear() {
            this.f120274c.clear();
        }

        void d() {
            Throwable th2;
            io.reactivex.internal.queue.a<T> aVar = this.f120274c;
            org.reactivestreams.d<? super T> dVar = this.f120281j.get();
            int iAddAndGet = 1;
            while (true) {
                if (dVar != null) {
                    if (this.f120280i.get()) {
                        aVar.clear();
                        return;
                    }
                    boolean z10 = this.f120278g;
                    if (z10 && !this.f120276e && (th2 = this.f120279h) != null) {
                        aVar.clear();
                        dVar.onError(th2);
                        return;
                    }
                    dVar.onNext(null);
                    if (z10) {
                        Throwable th3 = this.f120279h;
                        if (th3 != null) {
                            dVar.onError(th3);
                            return;
                        } else {
                            dVar.onComplete();
                            return;
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                if (dVar == null) {
                    dVar = this.f120281j.get();
                }
            }
        }

        void f() {
            io.reactivex.internal.queue.a<T> aVar = this.f120274c;
            boolean z10 = this.f120276e;
            org.reactivestreams.d<? super T> dVar = this.f120281j.get();
            int iAddAndGet = 1;
            while (true) {
                if (dVar != null) {
                    long j10 = this.f120277f.get();
                    long j11 = 0;
                    while (j11 != j10) {
                        boolean z11 = this.f120278g;
                        T tPoll = aVar.poll();
                        boolean z12 = tPoll == null;
                        if (c(z11, z12, dVar, z10)) {
                            return;
                        }
                        if (z12) {
                            break;
                        }
                        dVar.onNext(tPoll);
                        j11++;
                    }
                    if (j11 == j10 && c(this.f120278g, aVar.isEmpty(), dVar, z10)) {
                        return;
                    }
                    if (j11 != 0) {
                        if (j10 != Long.MAX_VALUE) {
                            this.f120277f.addAndGet(-j11);
                        }
                        this.f120275d.f120265j.request(j11);
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                if (dVar == null) {
                    dVar = this.f120281j.get();
                }
            }
        }

        @Override // org.reactivestreams.c
        public void g(org.reactivestreams.d<? super T> dVar) {
            if (!this.f120282k.compareAndSet(false, true)) {
                EmptySubscription.error(new IllegalStateException("Only one Subscriber allowed!"), dVar);
                return;
            }
            dVar.onSubscribe(this);
            this.f120281j.lazySet(dVar);
            b();
        }

        @Override // lh.o
        public boolean isEmpty() {
            return this.f120274c.isEmpty();
        }

        public void onComplete() {
            this.f120278g = true;
            b();
        }

        public void onError(Throwable th2) {
            this.f120279h = th2;
            this.f120278g = true;
            b();
        }

        public void onNext(T t10) {
            this.f120274c.offer(t10);
            b();
        }

        @Override // lh.o
        @jh.f
        public T poll() {
            T tPoll = this.f120274c.poll();
            if (tPoll != null) {
                this.f120284m++;
                return tPoll;
            }
            int i10 = this.f120284m;
            if (i10 == 0) {
                return null;
            }
            this.f120284m = 0;
            this.f120275d.f120265j.request(i10);
            return null;
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                io.reactivex.internal.util.b.a(this.f120277f, j10);
                b();
            }
        }

        @Override // lh.k
        public int requestFusion(int i10) {
            if ((i10 & 2) == 0) {
                return 0;
            }
            this.f120283l = true;
            return 2;
        }
    }

    public static final class a<K, V> implements kh.g<b<K, V>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Queue<b<K, V>> f120285b;

        a(Queue<b<K, V>> queue) {
            this.f120285b = queue;
        }

        @Override // kh.g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(b<K, V> bVar) {
            this.f120285b.offer(bVar);
        }
    }

    public static final class b<K, T> extends io.reactivex.flowables.b<K, T> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final State<T, K> f120286d;

        protected b(K k10, State<T, K> state) {
            super(k10);
            this.f120286d = state;
        }

        public static <T, K> b<K, T> N8(K k10, int i10, GroupBySubscriber<?, K, T> groupBySubscriber, boolean z10) {
            return new b<>(k10, new State(i10, groupBySubscriber, k10, z10));
        }

        @Override // io.reactivex.j
        protected void k6(org.reactivestreams.d<? super T> dVar) {
            this.f120286d.g(dVar);
        }

        public void onComplete() {
            this.f120286d.onComplete();
        }

        public void onError(Throwable th2) {
            this.f120286d.onError(th2);
        }

        public void onNext(T t10) {
            this.f120286d.onNext(t10);
        }
    }

    public FlowableGroupBy(io.reactivex.j<T> jVar, kh.o<? super T, ? extends K> oVar, kh.o<? super T, ? extends V> oVar2, int i10, boolean z10, kh.o<? super kh.g<Object>, ? extends Map<K, Object>> oVar3) {
        super(jVar);
        this.f120251d = oVar;
        this.f120252e = oVar2;
        this.f120253f = i10;
        this.f120254g = z10;
        this.f120255h = oVar3;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super io.reactivex.flowables.b<K, V>> dVar) {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        Map<K, Object> mapApply;
        try {
            if (this.f120255h == null) {
                concurrentLinkedQueue = null;
                mapApply = new ConcurrentHashMap<>();
            } else {
                concurrentLinkedQueue = new ConcurrentLinkedQueue();
                mapApply = this.f120255h.apply(new a(concurrentLinkedQueue));
            }
            this.f121039c.j6(new GroupBySubscriber(dVar, this.f120251d, this.f120252e, this.f120253f, this.f120254g, mapApply, concurrentLinkedQueue));
        } catch (Exception e10) {
            io.reactivex.exceptions.a.b(e10);
            dVar.onSubscribe(EmptyComponent.INSTANCE);
            dVar.onError(e10);
        }
    }
}
