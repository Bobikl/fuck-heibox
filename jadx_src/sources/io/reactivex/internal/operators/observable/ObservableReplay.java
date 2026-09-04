package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableReplay<T> extends io.reactivex.observables.a<T> implements lh.g<T>, io.reactivex.internal.disposables.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final a f122419f = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.e0<T> f122420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicReference<ReplayObserver<T>> f122421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final a<T> f122422d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final io.reactivex.e0<T> f122423e;

    public static abstract class BoundedReplayBuffer<T> extends AtomicReference<Node> implements e<T> {
        private static final long serialVersionUID = 2346567790059478686L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Node f122424b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f122425c;

        BoundedReplayBuffer() {
            Node node = new Node(null);
            this.f122424b = node;
            set(node);
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.e
        public final void a() {
            c(new Node(f(NotificationLite.complete())));
            p();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.e
        public final void b(T t10) {
            c(new Node(f(NotificationLite.next(t10))));
            o();
        }

        final void c(Node node) {
            this.f122424b.set(node);
            this.f122424b = node;
            this.f122425c++;
        }

        final void d(Collection<? super T> collection) {
            Node nodeG = g();
            while (true) {
                nodeG = nodeG.get();
                if (nodeG == null) {
                    return;
                }
                Object objJ = j(nodeG.f122430b);
                if (NotificationLite.isComplete(objJ) || NotificationLite.isError(objJ)) {
                    return;
                } else {
                    collection.add((Object) NotificationLite.getValue(objJ));
                }
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.e
        public final void e(InnerDisposable<T> innerDisposable) {
            if (innerDisposable.getAndIncrement() != 0) {
                return;
            }
            int iAddAndGet = 1;
            do {
                Node nodeG = (Node) innerDisposable.a();
                if (nodeG == null) {
                    nodeG = g();
                    innerDisposable.f122428d = nodeG;
                }
                while (true) {
                    if (innerDisposable.isDisposed()) {
                        innerDisposable.f122428d = null;
                        return;
                    }
                    Node node = nodeG.get();
                    if (node != null) {
                        if (NotificationLite.accept(j(node.f122430b), innerDisposable.f122427c)) {
                            innerDisposable.f122428d = null;
                            return;
                        }
                        nodeG = node;
                    }
                }
                innerDisposable.f122428d = nodeG;
                iAddAndGet = innerDisposable.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.e
        public final void error(Throwable th2) {
            c(new Node(f(NotificationLite.error(th2))));
            p();
        }

        Object f(Object obj) {
            return obj;
        }

        Node g() {
            return get();
        }

        boolean h() {
            Object obj = this.f122424b.f122430b;
            return obj != null && NotificationLite.isComplete(j(obj));
        }

        boolean i() {
            Object obj = this.f122424b.f122430b;
            return obj != null && NotificationLite.isError(j(obj));
        }

        Object j(Object obj) {
            return obj;
        }

        final void k() {
            Node node = get().get();
            this.f122425c--;
            m(node);
        }

        final void l(int i10) {
            Node node = get();
            while (i10 > 0) {
                node = node.get();
                i10--;
                this.f122425c--;
            }
            m(node);
        }

        final void m(Node node) {
            set(node);
        }

        final void n() {
            Node node = get();
            if (node.f122430b != null) {
                Node node2 = new Node(null);
                node2.lazySet(node.get());
                set(node2);
            }
        }

        abstract void o();

        void p() {
            n();
        }
    }

    public static final class InnerDisposable<T> extends AtomicInteger implements io.reactivex.disposables.b {
        private static final long serialVersionUID = 2728361546769921047L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ReplayObserver<T> f122426b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.g0<? super T> f122427c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f122428d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        volatile boolean f122429e;

        InnerDisposable(ReplayObserver<T> replayObserver, io.reactivex.g0<? super T> g0Var) {
            this.f122426b = replayObserver;
            this.f122427c = g0Var;
        }

        <U> U a() {
            return (U) this.f122428d;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (this.f122429e) {
                return;
            }
            this.f122429e = true;
            this.f122426b.b(this);
            this.f122428d = null;
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f122429e;
        }
    }

    public static final class Node extends AtomicReference<Node> {
        private static final long serialVersionUID = 245354315435971818L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Object f122430b;

        Node(Object obj) {
            this.f122430b = obj;
        }
    }

    public static final class ReplayObserver<T> extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.g0<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final InnerDisposable[] f122431f = new InnerDisposable[0];

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final InnerDisposable[] f122432g = new InnerDisposable[0];
        private static final long serialVersionUID = -533785617179540163L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final e<T> f122433b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f122434c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicReference<InnerDisposable[]> f122435d = new AtomicReference<>(f122431f);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicBoolean f122436e = new AtomicBoolean();

        ReplayObserver(e<T> eVar) {
            this.f122433b = eVar;
        }

        boolean a(InnerDisposable<T> innerDisposable) {
            InnerDisposable[] innerDisposableArr;
            InnerDisposable[] innerDisposableArr2;
            do {
                innerDisposableArr = this.f122435d.get();
                if (innerDisposableArr == f122432g) {
                    return false;
                }
                int length = innerDisposableArr.length;
                innerDisposableArr2 = new InnerDisposable[length + 1];
                System.arraycopy(innerDisposableArr, 0, innerDisposableArr2, 0, length);
                innerDisposableArr2[length] = innerDisposable;
            } while (!androidx.compose.animation.core.s0.a(this.f122435d, innerDisposableArr, innerDisposableArr2));
            return true;
        }

        void b(InnerDisposable<T> innerDisposable) {
            InnerDisposable[] innerDisposableArr;
            InnerDisposable[] innerDisposableArr2;
            do {
                innerDisposableArr = this.f122435d.get();
                int length = innerDisposableArr.length;
                if (length == 0) {
                    return;
                }
                int i10 = -1;
                for (int i11 = 0; i11 < length; i11++) {
                    if (innerDisposableArr[i11].equals(innerDisposable)) {
                        i10 = i11;
                        break;
                    }
                }
                if (i10 < 0) {
                    return;
                }
                if (length == 1) {
                    innerDisposableArr2 = f122431f;
                } else {
                    InnerDisposable[] innerDisposableArr3 = new InnerDisposable[length - 1];
                    System.arraycopy(innerDisposableArr, 0, innerDisposableArr3, 0, i10);
                    System.arraycopy(innerDisposableArr, i10 + 1, innerDisposableArr3, i10, (length - i10) - 1);
                    innerDisposableArr2 = innerDisposableArr3;
                }
            } while (!androidx.compose.animation.core.s0.a(this.f122435d, innerDisposableArr, innerDisposableArr2));
        }

        void c() {
            for (InnerDisposable<T> innerDisposable : this.f122435d.get()) {
                this.f122433b.e(innerDisposable);
            }
        }

        void d() {
            for (InnerDisposable<T> innerDisposable : this.f122435d.getAndSet(f122432g)) {
                this.f122433b.e(innerDisposable);
            }
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f122435d.set(f122432g);
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f122435d.get() == f122432g;
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            if (this.f122434c) {
                return;
            }
            this.f122434c = true;
            this.f122433b.a();
            d();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            if (this.f122434c) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f122434c = true;
            this.f122433b.error(th2);
            d();
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            if (this.f122434c) {
                return;
            }
            this.f122433b.b(t10);
            c();
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.setOnce(this, bVar)) {
                c();
            }
        }
    }

    public static final class SizeAndTimeBoundReplayBuffer<T> extends BoundedReplayBuffer<T> {
        private static final long serialVersionUID = 3457957419649567404L;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.h0 f122437d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final long f122438e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final TimeUnit f122439f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final int f122440g;

        SizeAndTimeBoundReplayBuffer(int i10, long j10, TimeUnit timeUnit, io.reactivex.h0 h0Var) {
            this.f122437d = h0Var;
            this.f122440g = i10;
            this.f122438e = j10;
            this.f122439f = timeUnit;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BoundedReplayBuffer
        Object f(Object obj) {
            return new io.reactivex.schedulers.d(obj, this.f122437d.d(this.f122439f), this.f122439f);
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BoundedReplayBuffer
        Node g() {
            Node node;
            long jD = this.f122437d.d(this.f122439f) - this.f122438e;
            Node node2 = get();
            Node node3 = node2.get();
            while (true) {
                Node node4 = node3;
                node = node2;
                node2 = node4;
                if (node2 == null) {
                    break;
                }
                io.reactivex.schedulers.d dVar = (io.reactivex.schedulers.d) node2.f122430b;
                if (NotificationLite.isComplete(dVar.d()) || NotificationLite.isError(dVar.d()) || dVar.a() > jD) {
                    break;
                }
                node3 = node2.get();
            }
            return node;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BoundedReplayBuffer
        Object j(Object obj) {
            return ((io.reactivex.schedulers.d) obj).d();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BoundedReplayBuffer
        void o() {
            Node node;
            long jD = this.f122437d.d(this.f122439f) - this.f122438e;
            Node node2 = get();
            Node node3 = node2.get();
            int i10 = 0;
            while (true) {
                Node node4 = node3;
                node = node2;
                node2 = node4;
                if (node2 != null) {
                    int i11 = this.f122425c;
                    if (i11 <= this.f122440g) {
                        if (((io.reactivex.schedulers.d) node2.f122430b).a() > jD) {
                            break;
                        }
                        i10++;
                        this.f122425c--;
                        node3 = node2.get();
                    } else {
                        i10++;
                        this.f122425c = i11 - 1;
                        node3 = node2.get();
                    }
                } else {
                    break;
                }
            }
            if (i10 != 0) {
                m(node);
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BoundedReplayBuffer
        void p() {
            Node node;
            long jD = this.f122437d.d(this.f122439f) - this.f122438e;
            Node node2 = get();
            Node node3 = node2.get();
            int i10 = 0;
            while (true) {
                Node node4 = node3;
                node = node2;
                node2 = node4;
                if (node2 == null || this.f122425c <= 1 || ((io.reactivex.schedulers.d) node2.f122430b).a() > jD) {
                    break;
                }
                i10++;
                this.f122425c--;
                node3 = node2.get();
            }
            if (i10 != 0) {
                m(node);
            }
        }
    }

    public static final class SizeBoundReplayBuffer<T> extends BoundedReplayBuffer<T> {
        private static final long serialVersionUID = -5898283885385201806L;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f122441d;

        SizeBoundReplayBuffer(int i10) {
            this.f122441d = i10;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BoundedReplayBuffer
        void o() {
            if (this.f122425c > this.f122441d) {
                k();
            }
        }
    }

    public static final class UnboundedReplayBuffer<T> extends ArrayList<Object> implements e<T> {
        private static final long serialVersionUID = 7063189396499112664L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        volatile int f122442b;

        UnboundedReplayBuffer(int i10) {
            super(i10);
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.e
        public void a() {
            add(NotificationLite.complete());
            this.f122442b++;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.e
        public void b(T t10) {
            add(NotificationLite.next(t10));
            this.f122442b++;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.e
        public void e(InnerDisposable<T> innerDisposable) {
            if (innerDisposable.getAndIncrement() != 0) {
                return;
            }
            io.reactivex.g0<? super T> g0Var = innerDisposable.f122427c;
            int iAddAndGet = 1;
            while (!innerDisposable.isDisposed()) {
                int i10 = this.f122442b;
                Integer num = (Integer) innerDisposable.a();
                int iIntValue = num != null ? num.intValue() : 0;
                while (iIntValue < i10) {
                    if (NotificationLite.accept(get(iIntValue), g0Var) || innerDisposable.isDisposed()) {
                        return;
                    } else {
                        iIntValue++;
                    }
                }
                innerDisposable.f122428d = Integer.valueOf(iIntValue);
                iAddAndGet = innerDisposable.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.e
        public void error(Throwable th2) {
            add(NotificationLite.error(th2));
            this.f122442b++;
        }
    }

    public interface a<T> {
        e<T> call();
    }

    public static final class b<R> implements kh.g<io.reactivex.disposables.b> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ObserverResourceWrapper<R> f122443b;

        b(ObserverResourceWrapper<R> observerResourceWrapper) {
            this.f122443b = observerResourceWrapper;
        }

        @Override // kh.g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(io.reactivex.disposables.b bVar) {
            this.f122443b.a(bVar);
        }
    }

    public static final class c<R, U> extends io.reactivex.z<R> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Callable<? extends io.reactivex.observables.a<U>> f122444b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final kh.o<? super io.reactivex.z<U>, ? extends io.reactivex.e0<R>> f122445c;

        c(Callable<? extends io.reactivex.observables.a<U>> callable, kh.o<? super io.reactivex.z<U>, ? extends io.reactivex.e0<R>> oVar) {
            this.f122444b = callable;
            this.f122445c = oVar;
        }

        @Override // io.reactivex.z
        protected void H5(io.reactivex.g0<? super R> g0Var) {
            try {
                io.reactivex.observables.a aVar = (io.reactivex.observables.a) io.reactivex.internal.functions.a.g(this.f122444b.call(), "The connectableFactory returned a null ConnectableObservable");
                io.reactivex.e0 e0Var = (io.reactivex.e0) io.reactivex.internal.functions.a.g(this.f122445c.apply(aVar), "The selector returned a null ObservableSource");
                ObserverResourceWrapper observerResourceWrapper = new ObserverResourceWrapper(g0Var);
                e0Var.g(observerResourceWrapper);
                aVar.l8(new b(observerResourceWrapper));
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                EmptyDisposable.error(th2, g0Var);
            }
        }
    }

    public static final class d<T> extends io.reactivex.observables.a<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final io.reactivex.observables.a<T> f122446b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final io.reactivex.z<T> f122447c;

        d(io.reactivex.observables.a<T> aVar, io.reactivex.z<T> zVar) {
            this.f122446b = aVar;
            this.f122447c = zVar;
        }

        @Override // io.reactivex.z
        protected void H5(io.reactivex.g0<? super T> g0Var) {
            this.f122447c.g(g0Var);
        }

        @Override // io.reactivex.observables.a
        public void l8(kh.g<? super io.reactivex.disposables.b> gVar) {
            this.f122446b.l8(gVar);
        }
    }

    public interface e<T> {
        void a();

        void b(T t10);

        void e(InnerDisposable<T> innerDisposable);

        void error(Throwable th2);
    }

    public static final class f<T> implements a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f122448a;

        f(int i10) {
            this.f122448a = i10;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.a
        public e<T> call() {
            return new SizeBoundReplayBuffer(this.f122448a);
        }
    }

    public static final class g<T> implements io.reactivex.e0<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicReference<ReplayObserver<T>> f122449b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final a<T> f122450c;

        g(AtomicReference<ReplayObserver<T>> atomicReference, a<T> aVar) {
            this.f122449b = atomicReference;
            this.f122450c = aVar;
        }

        @Override // io.reactivex.e0
        public void g(io.reactivex.g0<? super T> g0Var) {
            ReplayObserver<T> replayObserver;
            while (true) {
                replayObserver = this.f122449b.get();
                if (replayObserver != null) {
                    break;
                }
                ReplayObserver<T> replayObserver2 = new ReplayObserver<>(this.f122450c.call());
                if (androidx.compose.animation.core.s0.a(this.f122449b, null, replayObserver2)) {
                    replayObserver = replayObserver2;
                    break;
                }
            }
            InnerDisposable<T> innerDisposable = new InnerDisposable<>(replayObserver, g0Var);
            g0Var.onSubscribe(innerDisposable);
            replayObserver.a(innerDisposable);
            if (innerDisposable.isDisposed()) {
                replayObserver.b(innerDisposable);
            } else {
                replayObserver.f122433b.e(innerDisposable);
            }
        }
    }

    public static final class h<T> implements a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f122451a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f122452b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final TimeUnit f122453c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final io.reactivex.h0 f122454d;

        h(int i10, long j10, TimeUnit timeUnit, io.reactivex.h0 h0Var) {
            this.f122451a = i10;
            this.f122452b = j10;
            this.f122453c = timeUnit;
            this.f122454d = h0Var;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.a
        public e<T> call() {
            return new SizeAndTimeBoundReplayBuffer(this.f122451a, this.f122452b, this.f122453c, this.f122454d);
        }
    }

    public static final class i implements a<Object> {
        i() {
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.a
        public e<Object> call() {
            return new UnboundedReplayBuffer(16);
        }
    }

    private ObservableReplay(io.reactivex.e0<T> e0Var, io.reactivex.e0<T> e0Var2, AtomicReference<ReplayObserver<T>> atomicReference, a<T> aVar) {
        this.f122423e = e0Var;
        this.f122420b = e0Var2;
        this.f122421c = atomicReference;
        this.f122422d = aVar;
    }

    public static <T> io.reactivex.observables.a<T> s8(io.reactivex.e0<T> e0Var, int i10) {
        return i10 == Integer.MAX_VALUE ? w8(e0Var) : v8(e0Var, new f(i10));
    }

    public static <T> io.reactivex.observables.a<T> t8(io.reactivex.e0<T> e0Var, long j10, TimeUnit timeUnit, io.reactivex.h0 h0Var) {
        return u8(e0Var, j10, timeUnit, h0Var, Integer.MAX_VALUE);
    }

    public static <T> io.reactivex.observables.a<T> u8(io.reactivex.e0<T> e0Var, long j10, TimeUnit timeUnit, io.reactivex.h0 h0Var, int i10) {
        return v8(e0Var, new h(i10, j10, timeUnit, h0Var));
    }

    static <T> io.reactivex.observables.a<T> v8(io.reactivex.e0<T> e0Var, a<T> aVar) {
        AtomicReference atomicReference = new AtomicReference();
        return io.reactivex.plugins.a.U(new ObservableReplay(new g(atomicReference, aVar), e0Var, atomicReference, aVar));
    }

    public static <T> io.reactivex.observables.a<T> w8(io.reactivex.e0<? extends T> e0Var) {
        return v8(e0Var, f122419f);
    }

    public static <U, R> io.reactivex.z<R> x8(Callable<? extends io.reactivex.observables.a<U>> callable, kh.o<? super io.reactivex.z<U>, ? extends io.reactivex.e0<R>> oVar) {
        return io.reactivex.plugins.a.R(new c(callable, oVar));
    }

    public static <T> io.reactivex.observables.a<T> y8(io.reactivex.observables.a<T> aVar, io.reactivex.h0 h0Var) {
        return io.reactivex.plugins.a.U(new d(aVar, aVar.a4(h0Var)));
    }

    @Override // io.reactivex.z
    protected void H5(io.reactivex.g0<? super T> g0Var) {
        this.f122423e.g(g0Var);
    }

    @Override // io.reactivex.internal.disposables.c
    public void a(io.reactivex.disposables.b bVar) {
        androidx.compose.animation.core.s0.a(this.f122421c, (ReplayObserver) bVar, null);
    }

    @Override // io.reactivex.observables.a
    public void l8(kh.g<? super io.reactivex.disposables.b> gVar) {
        ReplayObserver<T> replayObserver;
        while (true) {
            replayObserver = this.f122421c.get();
            if (replayObserver != null && !replayObserver.isDisposed()) {
                break;
            }
            ReplayObserver<T> replayObserver2 = new ReplayObserver<>(this.f122422d.call());
            if (androidx.compose.animation.core.s0.a(this.f122421c, replayObserver, replayObserver2)) {
                replayObserver = replayObserver2;
                break;
            }
        }
        boolean z10 = !replayObserver.f122436e.get() && replayObserver.f122436e.compareAndSet(false, true);
        try {
            gVar.accept(replayObserver);
            if (z10) {
                this.f122420b.g(replayObserver);
            }
        } catch (Throwable th2) {
            if (z10) {
                replayObserver.f122436e.compareAndSet(true, false);
            }
            io.reactivex.exceptions.a.b(th2);
            throw ExceptionHelper.f(th2);
        }
    }

    @Override // lh.g
    public io.reactivex.e0<T> source() {
        return this.f122420b;
    }
}
