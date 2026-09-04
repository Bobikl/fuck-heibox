package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscribers.SubscriberResourceWrapper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableReplay<T> extends io.reactivex.flowables.a<T> implements lh.h<T>, io.reactivex.internal.disposables.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final Callable f120601g = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.j<T> f120602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final AtomicReference<ReplaySubscriber<T>> f120603d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Callable<? extends d<T>> f120604e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final org.reactivestreams.c<T> f120605f;

    public static class BoundedReplayBuffer<T> extends AtomicReference<Node> implements d<T> {
        private static final long serialVersionUID = 2346567790059478686L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Node f120606b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f120607c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f120608d;

        BoundedReplayBuffer() {
            Node node = new Node(null, 0L);
            this.f120606b = node;
            set(node);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.d
        public final void a() {
            Object objF = f(NotificationLite.complete());
            long j10 = this.f120608d + 1;
            this.f120608d = j10;
            c(new Node(objF, j10));
            p();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.d
        public final void b(T t10) {
            Object objF = f(NotificationLite.next(t10));
            long j10 = this.f120608d + 1;
            this.f120608d = j10;
            c(new Node(objF, j10));
            o();
        }

        final void c(Node node) {
            this.f120606b.set(node);
            this.f120606b = node;
            this.f120607c++;
        }

        final void d(Collection<? super T> collection) {
            Node nodeG = g();
            while (true) {
                nodeG = nodeG.get();
                if (nodeG == null) {
                    return;
                }
                Object objJ = j(nodeG.f120616b);
                if (NotificationLite.isComplete(objJ) || NotificationLite.isError(objJ)) {
                    return;
                } else {
                    collection.add((Object) NotificationLite.getValue(objJ));
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.d
        public final void e(InnerSubscription<T> innerSubscription) {
            Node node;
            synchronized (innerSubscription) {
                if (innerSubscription.f120614f) {
                    innerSubscription.f120615g = true;
                    return;
                }
                innerSubscription.f120614f = true;
                while (!innerSubscription.isDisposed()) {
                    long j10 = innerSubscription.get();
                    boolean z10 = j10 == Long.MAX_VALUE;
                    Node nodeG = (Node) innerSubscription.a();
                    if (nodeG == null) {
                        nodeG = g();
                        innerSubscription.f120612d = nodeG;
                        io.reactivex.internal.util.b.a(innerSubscription.f120613e, nodeG.f120617c);
                    }
                    long j11 = 0;
                    while (j10 != 0 && (node = nodeG.get()) != null) {
                        Object objJ = j(node.f120616b);
                        try {
                            if (NotificationLite.accept(objJ, innerSubscription.f120611c)) {
                                innerSubscription.f120612d = null;
                                return;
                            }
                            j11++;
                            j10--;
                            if (innerSubscription.isDisposed()) {
                                innerSubscription.f120612d = null;
                                return;
                            }
                            nodeG = node;
                        } catch (Throwable th2) {
                            io.reactivex.exceptions.a.b(th2);
                            innerSubscription.f120612d = null;
                            innerSubscription.dispose();
                            if (NotificationLite.isError(objJ) || NotificationLite.isComplete(objJ)) {
                                return;
                            }
                            innerSubscription.f120611c.onError(th2);
                            return;
                        }
                    }
                    if (j11 != 0) {
                        innerSubscription.f120612d = nodeG;
                        if (!z10) {
                            innerSubscription.b(j11);
                        }
                    }
                    synchronized (innerSubscription) {
                        if (!innerSubscription.f120615g) {
                            innerSubscription.f120614f = false;
                            return;
                        }
                        innerSubscription.f120615g = false;
                    }
                }
                innerSubscription.f120612d = null;
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.d
        public final void error(Throwable th2) {
            Object objF = f(NotificationLite.error(th2));
            long j10 = this.f120608d + 1;
            this.f120608d = j10;
            c(new Node(objF, j10));
            p();
        }

        Object f(Object obj) {
            return obj;
        }

        Node g() {
            return get();
        }

        boolean h() {
            Object obj = this.f120606b.f120616b;
            return obj != null && NotificationLite.isComplete(j(obj));
        }

        boolean i() {
            Object obj = this.f120606b.f120616b;
            return obj != null && NotificationLite.isError(j(obj));
        }

        Object j(Object obj) {
            return obj;
        }

        final void k() {
            Node node = get().get();
            if (node == null) {
                throw new IllegalStateException("Empty list!");
            }
            this.f120607c--;
            m(node);
        }

        final void l(int i10) {
            Node node = get();
            while (i10 > 0) {
                node = node.get();
                i10--;
                this.f120607c--;
            }
            m(node);
        }

        final void m(Node node) {
            set(node);
        }

        final void n() {
            Node node = get();
            if (node.f120616b != null) {
                Node node2 = new Node(null, 0L);
                node2.lazySet(node.get());
                set(node2);
            }
        }

        void o() {
        }

        void p() {
            n();
        }
    }

    public static final class InnerSubscription<T> extends AtomicLong implements org.reactivestreams.e, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        static final long f120609h = Long.MIN_VALUE;
        private static final long serialVersionUID = -4453897557930727610L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ReplaySubscriber<T> f120610b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f120611c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f120612d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicLong f120613e = new AtomicLong();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f120614f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f120615g;

        InnerSubscription(ReplaySubscriber<T> replaySubscriber, org.reactivestreams.d<? super T> dVar) {
            this.f120610b = replaySubscriber;
            this.f120611c = dVar;
        }

        <U> U a() {
            return (U) this.f120612d;
        }

        public long b(long j10) {
            return io.reactivex.internal.util.b.f(this, j10);
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            dispose();
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.f120610b.c(this);
                this.f120610b.b();
                this.f120612d = null;
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return get() == Long.MIN_VALUE;
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            if (!SubscriptionHelper.validate(j10) || io.reactivex.internal.util.b.b(this, j10) == Long.MIN_VALUE) {
                return;
            }
            io.reactivex.internal.util.b.a(this.f120613e, j10);
            this.f120610b.b();
            this.f120610b.f120620b.e(this);
        }
    }

    public static final class Node extends AtomicReference<Node> {
        private static final long serialVersionUID = 245354315435971818L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Object f120616b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f120617c;

        Node(Object obj, long j10) {
            this.f120616b = obj;
            this.f120617c = j10;
        }
    }

    public static final class ReplaySubscriber<T> extends AtomicReference<org.reactivestreams.e> implements io.reactivex.o<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        static final InnerSubscription[] f120618i = new InnerSubscription[0];

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        static final InnerSubscription[] f120619j = new InnerSubscription[0];
        private static final long serialVersionUID = 7224554242710036740L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final d<T> f120620b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f120621c;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        long f120625g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        long f120626h;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final AtomicInteger f120624f = new AtomicInteger();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicReference<InnerSubscription<T>[]> f120622d = new AtomicReference<>(f120618i);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicBoolean f120623e = new AtomicBoolean();

        ReplaySubscriber(d<T> dVar) {
            this.f120620b = dVar;
        }

        boolean a(InnerSubscription<T> innerSubscription) {
            InnerSubscription<T>[] innerSubscriptionArr;
            InnerSubscription[] innerSubscriptionArr2;
            innerSubscription.getClass();
            do {
                innerSubscriptionArr = this.f120622d.get();
                if (innerSubscriptionArr == f120619j) {
                    return false;
                }
                int length = innerSubscriptionArr.length;
                innerSubscriptionArr2 = new InnerSubscription[length + 1];
                System.arraycopy(innerSubscriptionArr, 0, innerSubscriptionArr2, 0, length);
                innerSubscriptionArr2[length] = innerSubscription;
            } while (!androidx.compose.animation.core.s0.a(this.f120622d, innerSubscriptionArr, innerSubscriptionArr2));
            return true;
        }

        void b() {
            if (this.f120624f.getAndIncrement() != 0) {
                return;
            }
            int iAddAndGet = 1;
            while (!isDisposed()) {
                InnerSubscription<T>[] innerSubscriptionArr = this.f120622d.get();
                long j10 = this.f120625g;
                long jMax = j10;
                for (InnerSubscription<T> innerSubscription : innerSubscriptionArr) {
                    jMax = Math.max(jMax, innerSubscription.f120613e.get());
                }
                long j11 = this.f120626h;
                org.reactivestreams.e eVar = get();
                long j12 = jMax - j10;
                if (j12 != 0) {
                    this.f120625g = jMax;
                    if (eVar == null) {
                        long j13 = j11 + j12;
                        if (j13 < 0) {
                            j13 = Long.MAX_VALUE;
                        }
                        this.f120626h = j13;
                    } else if (j11 != 0) {
                        this.f120626h = 0L;
                        eVar.request(j11 + j12);
                    } else {
                        eVar.request(j12);
                    }
                } else if (j11 != 0 && eVar != null) {
                    this.f120626h = 0L;
                    eVar.request(j11);
                }
                iAddAndGet = this.f120624f.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        void c(InnerSubscription<T> innerSubscription) {
            InnerSubscription<T>[] innerSubscriptionArr;
            InnerSubscription[] innerSubscriptionArr2;
            do {
                innerSubscriptionArr = this.f120622d.get();
                int length = innerSubscriptionArr.length;
                if (length == 0) {
                    return;
                }
                int i10 = -1;
                for (int i11 = 0; i11 < length; i11++) {
                    if (innerSubscriptionArr[i11].equals(innerSubscription)) {
                        i10 = i11;
                        break;
                    }
                }
                if (i10 < 0) {
                    return;
                }
                if (length == 1) {
                    innerSubscriptionArr2 = f120618i;
                } else {
                    InnerSubscription[] innerSubscriptionArr3 = new InnerSubscription[length - 1];
                    System.arraycopy(innerSubscriptionArr, 0, innerSubscriptionArr3, 0, i10);
                    System.arraycopy(innerSubscriptionArr, i10 + 1, innerSubscriptionArr3, i10, (length - i10) - 1);
                    innerSubscriptionArr2 = innerSubscriptionArr3;
                }
            } while (!androidx.compose.animation.core.s0.a(this.f120622d, innerSubscriptionArr, innerSubscriptionArr2));
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f120622d.set(f120619j);
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f120622d.get() == f120619j;
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            if (this.f120621c) {
                return;
            }
            this.f120621c = true;
            this.f120620b.a();
            for (InnerSubscription<T> innerSubscription : this.f120622d.getAndSet(f120619j)) {
                this.f120620b.e(innerSubscription);
            }
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (this.f120621c) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f120621c = true;
            this.f120620b.error(th2);
            for (InnerSubscription<T> innerSubscription : this.f120622d.getAndSet(f120619j)) {
                this.f120620b.e(innerSubscription);
            }
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (this.f120621c) {
                return;
            }
            this.f120620b.b(t10);
            for (InnerSubscription<T> innerSubscription : this.f120622d.get()) {
                this.f120620b.e(innerSubscription);
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.setOnce(this, eVar)) {
                b();
                for (InnerSubscription<T> innerSubscription : this.f120622d.get()) {
                    this.f120620b.e(innerSubscription);
                }
            }
        }
    }

    public static final class SizeAndTimeBoundReplayBuffer<T> extends BoundedReplayBuffer<T> {
        private static final long serialVersionUID = 3457957419649567404L;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final io.reactivex.h0 f120627e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final long f120628f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final TimeUnit f120629g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final int f120630h;

        SizeAndTimeBoundReplayBuffer(int i10, long j10, TimeUnit timeUnit, io.reactivex.h0 h0Var) {
            this.f120627e = h0Var;
            this.f120630h = i10;
            this.f120628f = j10;
            this.f120629g = timeUnit;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.BoundedReplayBuffer
        Object f(Object obj) {
            return new io.reactivex.schedulers.d(obj, this.f120627e.d(this.f120629g), this.f120629g);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.BoundedReplayBuffer
        Node g() {
            Node node;
            long jD = this.f120627e.d(this.f120629g) - this.f120628f;
            Node node2 = get();
            Node node3 = node2.get();
            while (true) {
                Node node4 = node3;
                node = node2;
                node2 = node4;
                if (node2 == null) {
                    break;
                }
                io.reactivex.schedulers.d dVar = (io.reactivex.schedulers.d) node2.f120616b;
                if (NotificationLite.isComplete(dVar.d()) || NotificationLite.isError(dVar.d()) || dVar.a() > jD) {
                    break;
                }
                node3 = node2.get();
            }
            return node;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.BoundedReplayBuffer
        Object j(Object obj) {
            return ((io.reactivex.schedulers.d) obj).d();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.BoundedReplayBuffer
        void o() {
            Node node;
            long jD = this.f120627e.d(this.f120629g) - this.f120628f;
            Node node2 = get();
            Node node3 = node2.get();
            int i10 = 0;
            while (true) {
                Node node4 = node3;
                node = node2;
                node2 = node4;
                if (node2 != null) {
                    int i11 = this.f120607c;
                    if (i11 <= this.f120630h) {
                        if (((io.reactivex.schedulers.d) node2.f120616b).a() > jD) {
                            break;
                        }
                        i10++;
                        this.f120607c--;
                        node3 = node2.get();
                    } else {
                        i10++;
                        this.f120607c = i11 - 1;
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

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.BoundedReplayBuffer
        void p() {
            Node node;
            long jD = this.f120627e.d(this.f120629g) - this.f120628f;
            Node node2 = get();
            Node node3 = node2.get();
            int i10 = 0;
            while (true) {
                Node node4 = node3;
                node = node2;
                node2 = node4;
                if (node2 == null || this.f120607c <= 1 || ((io.reactivex.schedulers.d) node2.f120616b).a() > jD) {
                    break;
                }
                i10++;
                this.f120607c--;
                node3 = node2.get();
            }
            if (i10 != 0) {
                m(node);
            }
        }
    }

    public static final class SizeBoundReplayBuffer<T> extends BoundedReplayBuffer<T> {
        private static final long serialVersionUID = -5898283885385201806L;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f120631e;

        SizeBoundReplayBuffer(int i10) {
            this.f120631e = i10;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.BoundedReplayBuffer
        void o() {
            if (this.f120607c > this.f120631e) {
                k();
            }
        }
    }

    public static final class UnboundedReplayBuffer<T> extends ArrayList<Object> implements d<T> {
        private static final long serialVersionUID = 7063189396499112664L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        volatile int f120632b;

        UnboundedReplayBuffer(int i10) {
            super(i10);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.d
        public void a() {
            add(NotificationLite.complete());
            this.f120632b++;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.d
        public void b(T t10) {
            add(NotificationLite.next(t10));
            this.f120632b++;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.d
        public void e(InnerSubscription<T> innerSubscription) {
            synchronized (innerSubscription) {
                if (innerSubscription.f120614f) {
                    innerSubscription.f120615g = true;
                    return;
                }
                innerSubscription.f120614f = true;
                org.reactivestreams.d<? super T> dVar = innerSubscription.f120611c;
                while (!innerSubscription.isDisposed()) {
                    int i10 = this.f120632b;
                    Integer num = (Integer) innerSubscription.a();
                    int iIntValue = num != null ? num.intValue() : 0;
                    long j10 = innerSubscription.get();
                    long j11 = j10;
                    long j12 = 0;
                    while (j11 != 0 && iIntValue < i10) {
                        Object obj = get(iIntValue);
                        try {
                            if (NotificationLite.accept(obj, dVar) || innerSubscription.isDisposed()) {
                                return;
                            }
                            iIntValue++;
                            j11--;
                            j12++;
                        } catch (Throwable th2) {
                            io.reactivex.exceptions.a.b(th2);
                            innerSubscription.dispose();
                            if (NotificationLite.isError(obj) || NotificationLite.isComplete(obj)) {
                                return;
                            }
                            dVar.onError(th2);
                            return;
                        }
                    }
                    if (j12 != 0) {
                        innerSubscription.f120612d = Integer.valueOf(iIntValue);
                        if (j10 != Long.MAX_VALUE) {
                            innerSubscription.b(j12);
                        }
                    }
                    synchronized (innerSubscription) {
                        if (!innerSubscription.f120615g) {
                            innerSubscription.f120614f = false;
                            return;
                        }
                        innerSubscription.f120615g = false;
                    }
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.d
        public void error(Throwable th2) {
            add(NotificationLite.error(th2));
            this.f120632b++;
        }
    }

    public static final class a<T> extends io.reactivex.flowables.a<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final io.reactivex.flowables.a<T> f120633c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final io.reactivex.j<T> f120634d;

        a(io.reactivex.flowables.a<T> aVar, io.reactivex.j<T> jVar) {
            this.f120633c = aVar;
            this.f120634d = jVar;
        }

        @Override // io.reactivex.flowables.a
        public void Q8(kh.g<? super io.reactivex.disposables.b> gVar) {
            this.f120633c.Q8(gVar);
        }

        @Override // io.reactivex.j
        protected void k6(org.reactivestreams.d<? super T> dVar) {
            this.f120634d.g(dVar);
        }
    }

    public static final class b implements Callable<Object> {
        b() {
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            return new UnboundedReplayBuffer(16);
        }
    }

    public static final class c<R, U> extends io.reactivex.j<R> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Callable<? extends io.reactivex.flowables.a<U>> f120635c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final kh.o<? super io.reactivex.j<U>, ? extends org.reactivestreams.c<R>> f120636d;

        public final class a implements kh.g<io.reactivex.disposables.b> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final SubscriberResourceWrapper<R> f120637b;

            a(SubscriberResourceWrapper<R> subscriberResourceWrapper) {
                this.f120637b = subscriberResourceWrapper;
            }

            @Override // kh.g
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void accept(io.reactivex.disposables.b bVar) {
                this.f120637b.a(bVar);
            }
        }

        c(Callable<? extends io.reactivex.flowables.a<U>> callable, kh.o<? super io.reactivex.j<U>, ? extends org.reactivestreams.c<R>> oVar) {
            this.f120635c = callable;
            this.f120636d = oVar;
        }

        @Override // io.reactivex.j
        protected void k6(org.reactivestreams.d<? super R> dVar) {
            try {
                io.reactivex.flowables.a aVar = (io.reactivex.flowables.a) io.reactivex.internal.functions.a.g(this.f120635c.call(), "The connectableFactory returned null");
                try {
                    org.reactivestreams.c cVar = (org.reactivestreams.c) io.reactivex.internal.functions.a.g(this.f120636d.apply(aVar), "The selector returned a null Publisher");
                    SubscriberResourceWrapper subscriberResourceWrapper = new SubscriberResourceWrapper(dVar);
                    cVar.g(subscriberResourceWrapper);
                    aVar.Q8(new a(subscriberResourceWrapper));
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.b(th2);
                    EmptySubscription.error(th2, dVar);
                }
            } catch (Throwable th3) {
                io.reactivex.exceptions.a.b(th3);
                EmptySubscription.error(th3, dVar);
            }
        }
    }

    public interface d<T> {
        void a();

        void b(T t10);

        void e(InnerSubscription<T> innerSubscription);

        void error(Throwable th2);
    }

    public static final class e<T> implements Callable<d<T>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f120639b;

        e(int i10) {
            this.f120639b = i10;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d<T> call() {
            return new SizeBoundReplayBuffer(this.f120639b);
        }
    }

    public static final class f<T> implements org.reactivestreams.c<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicReference<ReplaySubscriber<T>> f120640b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Callable<? extends d<T>> f120641c;

        f(AtomicReference<ReplaySubscriber<T>> atomicReference, Callable<? extends d<T>> callable) {
            this.f120640b = atomicReference;
            this.f120641c = callable;
        }

        @Override // org.reactivestreams.c
        public void g(org.reactivestreams.d<? super T> dVar) {
            ReplaySubscriber<T> replaySubscriber;
            while (true) {
                replaySubscriber = this.f120640b.get();
                if (replaySubscriber != null) {
                    break;
                }
                try {
                    ReplaySubscriber<T> replaySubscriber2 = new ReplaySubscriber<>(this.f120641c.call());
                    if (androidx.compose.animation.core.s0.a(this.f120640b, null, replaySubscriber2)) {
                        replaySubscriber = replaySubscriber2;
                        break;
                    }
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.b(th2);
                    EmptySubscription.error(th2, dVar);
                    return;
                }
            }
            InnerSubscription<T> innerSubscription = new InnerSubscription<>(replaySubscriber, dVar);
            dVar.onSubscribe(innerSubscription);
            replaySubscriber.a(innerSubscription);
            if (innerSubscription.isDisposed()) {
                replaySubscriber.c(innerSubscription);
            } else {
                replaySubscriber.b();
                replaySubscriber.f120620b.e(innerSubscription);
            }
        }
    }

    public static final class g<T> implements Callable<d<T>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f120642b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f120643c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final TimeUnit f120644d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final io.reactivex.h0 f120645e;

        g(int i10, long j10, TimeUnit timeUnit, io.reactivex.h0 h0Var) {
            this.f120642b = i10;
            this.f120643c = j10;
            this.f120644d = timeUnit;
            this.f120645e = h0Var;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d<T> call() {
            return new SizeAndTimeBoundReplayBuffer(this.f120642b, this.f120643c, this.f120644d, this.f120645e);
        }
    }

    private FlowableReplay(org.reactivestreams.c<T> cVar, io.reactivex.j<T> jVar, AtomicReference<ReplaySubscriber<T>> atomicReference, Callable<? extends d<T>> callable) {
        this.f120605f = cVar;
        this.f120602c = jVar;
        this.f120603d = atomicReference;
        this.f120604e = callable;
    }

    public static <T> io.reactivex.flowables.a<T> X8(io.reactivex.j<T> jVar, int i10) {
        return i10 == Integer.MAX_VALUE ? b9(jVar) : a9(jVar, new e(i10));
    }

    public static <T> io.reactivex.flowables.a<T> Y8(io.reactivex.j<T> jVar, long j10, TimeUnit timeUnit, io.reactivex.h0 h0Var) {
        return Z8(jVar, j10, timeUnit, h0Var, Integer.MAX_VALUE);
    }

    public static <T> io.reactivex.flowables.a<T> Z8(io.reactivex.j<T> jVar, long j10, TimeUnit timeUnit, io.reactivex.h0 h0Var, int i10) {
        return a9(jVar, new g(i10, j10, timeUnit, h0Var));
    }

    static <T> io.reactivex.flowables.a<T> a9(io.reactivex.j<T> jVar, Callable<? extends d<T>> callable) {
        AtomicReference atomicReference = new AtomicReference();
        return io.reactivex.plugins.a.T(new FlowableReplay(new f(atomicReference, callable), jVar, atomicReference, callable));
    }

    public static <T> io.reactivex.flowables.a<T> b9(io.reactivex.j<? extends T> jVar) {
        return a9(jVar, f120601g);
    }

    public static <U, R> io.reactivex.j<R> c9(Callable<? extends io.reactivex.flowables.a<U>> callable, kh.o<? super io.reactivex.j<U>, ? extends org.reactivestreams.c<R>> oVar) {
        return new c(callable, oVar);
    }

    public static <T> io.reactivex.flowables.a<T> d9(io.reactivex.flowables.a<T> aVar, io.reactivex.h0 h0Var) {
        return io.reactivex.plugins.a.T(new a(aVar, aVar.l4(h0Var)));
    }

    @Override // io.reactivex.flowables.a
    public void Q8(kh.g<? super io.reactivex.disposables.b> gVar) {
        ReplaySubscriber<T> replaySubscriber;
        while (true) {
            replaySubscriber = this.f120603d.get();
            if (replaySubscriber != null && !replaySubscriber.isDisposed()) {
                break;
            }
            try {
                ReplaySubscriber<T> replaySubscriber2 = new ReplaySubscriber<>(this.f120604e.call());
                if (androidx.compose.animation.core.s0.a(this.f120603d, replaySubscriber, replaySubscriber2)) {
                    replaySubscriber = replaySubscriber2;
                    break;
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                throw ExceptionHelper.f(th2);
            }
        }
        boolean z10 = !replaySubscriber.f120623e.get() && replaySubscriber.f120623e.compareAndSet(false, true);
        try {
            gVar.accept(replaySubscriber);
            if (z10) {
                this.f120602c.j6(replaySubscriber);
            }
        } catch (Throwable th3) {
            if (z10) {
                replaySubscriber.f120623e.compareAndSet(true, false);
            }
            io.reactivex.exceptions.a.b(th3);
            throw ExceptionHelper.f(th3);
        }
    }

    @Override // io.reactivex.internal.disposables.c
    public void a(io.reactivex.disposables.b bVar) {
        androidx.compose.animation.core.s0.a(this.f120603d, (ReplaySubscriber) bVar, null);
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super T> dVar) {
        this.f120605f.g(dVar);
    }

    @Override // lh.h
    public org.reactivestreams.c<T> source() {
        return this.f120602c;
    }
}
