package io.reactivex.processors;

import androidx.compose.animation.core.s0;
import io.reactivex.h0;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import jh.f;
import org.reactivestreams.e;

/* JADX INFO: loaded from: classes5.dex */
public final class ReplayProcessor<T> extends io.reactivex.processors.a<T> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object[] f123996f = new Object[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final ReplaySubscription[] f123997g = new ReplaySubscription[0];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final ReplaySubscription[] f123998h = new ReplaySubscription[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final a<T> f123999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f124000d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final AtomicReference<ReplaySubscription<T>[]> f124001e = new AtomicReference<>(f123997g);

    public static final class Node<T> extends AtomicReference<Node<T>> {
        private static final long serialVersionUID = 6404226426336033100L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final T f124002b;

        Node(T t10) {
            this.f124002b = t10;
        }
    }

    public static final class ReplaySubscription<T> extends AtomicInteger implements e {
        private static final long serialVersionUID = 466549804534799122L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f124003b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final ReplayProcessor<T> f124004c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f124005d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicLong f124006e = new AtomicLong();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        volatile boolean f124007f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        long f124008g;

        ReplaySubscription(org.reactivestreams.d<? super T> dVar, ReplayProcessor<T> replayProcessor) {
            this.f124003b = dVar;
            this.f124004c = replayProcessor;
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            if (this.f124007f) {
                return;
            }
            this.f124007f = true;
            this.f124004c.d9(this);
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                io.reactivex.internal.util.b.a(this.f124006e, j10);
                this.f124004c.f123999c.e(this);
            }
        }
    }

    public static final class TimedNode<T> extends AtomicReference<TimedNode<T>> {
        private static final long serialVersionUID = 6404226426336033100L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final T f124009b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f124010c;

        TimedNode(T t10, long j10) {
            this.f124009b = t10;
            this.f124010c = j10;
        }
    }

    public interface a<T> {
        void a();

        void b(T t10);

        void c();

        T[] d(T[] tArr);

        void e(ReplaySubscription<T> replaySubscription);

        void error(Throwable th2);

        @f
        T getValue();

        boolean isDone();

        Throwable q();

        int size();
    }

    public static final class b<T> implements a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f124011a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f124012b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final TimeUnit f124013c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final h0 f124014d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f124015e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        volatile TimedNode<T> f124016f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        TimedNode<T> f124017g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Throwable f124018h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        volatile boolean f124019i;

        b(int i10, long j10, TimeUnit timeUnit, h0 h0Var) {
            this.f124011a = io.reactivex.internal.functions.a.h(i10, "maxSize");
            this.f124012b = io.reactivex.internal.functions.a.i(j10, "maxAge");
            this.f124013c = (TimeUnit) io.reactivex.internal.functions.a.g(timeUnit, "unit is null");
            this.f124014d = (h0) io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
            TimedNode<T> timedNode = new TimedNode<>(null, 0L);
            this.f124017g = timedNode;
            this.f124016f = timedNode;
        }

        @Override // io.reactivex.processors.ReplayProcessor.a
        public void a() {
            i();
            this.f124019i = true;
        }

        @Override // io.reactivex.processors.ReplayProcessor.a
        public void b(T t10) {
            TimedNode<T> timedNode = new TimedNode<>(t10, this.f124014d.d(this.f124013c));
            TimedNode<T> timedNode2 = this.f124017g;
            this.f124017g = timedNode;
            this.f124015e++;
            timedNode2.set(timedNode);
            h();
        }

        @Override // io.reactivex.processors.ReplayProcessor.a
        public void c() {
            if (this.f124016f.f124009b != null) {
                TimedNode<T> timedNode = new TimedNode<>(null, 0L);
                timedNode.lazySet(this.f124016f.get());
                this.f124016f = timedNode;
            }
        }

        @Override // io.reactivex.processors.ReplayProcessor.a
        public T[] d(T[] tArr) {
            TimedNode<T> timedNodeF = f();
            int iG = g(timedNodeF);
            if (iG != 0) {
                if (tArr.length < iG) {
                    tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), iG));
                }
                for (int i10 = 0; i10 != iG; i10++) {
                    timedNodeF = timedNodeF.get();
                    tArr[i10] = timedNodeF.f124009b;
                }
                if (tArr.length > iG) {
                    tArr[iG] = null;
                }
            } else if (tArr.length != 0) {
                tArr[0] = null;
            }
            return tArr;
        }

        @Override // io.reactivex.processors.ReplayProcessor.a
        public void e(ReplaySubscription<T> replaySubscription) {
            if (replaySubscription.getAndIncrement() != 0) {
                return;
            }
            org.reactivestreams.d<? super T> dVar = replaySubscription.f124003b;
            TimedNode<T> timedNodeF = (TimedNode) replaySubscription.f124005d;
            if (timedNodeF == null) {
                timedNodeF = f();
            }
            long j10 = replaySubscription.f124008g;
            int iAddAndGet = 1;
            do {
                long j11 = replaySubscription.f124006e.get();
                while (j10 != j11) {
                    if (replaySubscription.f124007f) {
                        replaySubscription.f124005d = null;
                        return;
                    }
                    boolean z10 = this.f124019i;
                    TimedNode<T> timedNode = timedNodeF.get();
                    boolean z11 = timedNode == null;
                    if (z10 && z11) {
                        replaySubscription.f124005d = null;
                        replaySubscription.f124007f = true;
                        Throwable th2 = this.f124018h;
                        if (th2 == null) {
                            dVar.onComplete();
                            return;
                        } else {
                            dVar.onError(th2);
                            return;
                        }
                    }
                    if (z11) {
                        break;
                    }
                    dVar.onNext(timedNode.f124009b);
                    j10++;
                    timedNodeF = timedNode;
                }
                if (j10 == j11) {
                    if (replaySubscription.f124007f) {
                        replaySubscription.f124005d = null;
                        return;
                    }
                    if (this.f124019i && timedNodeF.get() == null) {
                        replaySubscription.f124005d = null;
                        replaySubscription.f124007f = true;
                        Throwable th3 = this.f124018h;
                        if (th3 == null) {
                            dVar.onComplete();
                            return;
                        } else {
                            dVar.onError(th3);
                            return;
                        }
                    }
                }
                replaySubscription.f124005d = timedNodeF;
                replaySubscription.f124008g = j10;
                iAddAndGet = replaySubscription.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // io.reactivex.processors.ReplayProcessor.a
        public void error(Throwable th2) {
            i();
            this.f124018h = th2;
            this.f124019i = true;
        }

        TimedNode<T> f() {
            TimedNode<T> timedNode;
            TimedNode<T> timedNode2 = this.f124016f;
            long jD = this.f124014d.d(this.f124013c) - this.f124012b;
            TimedNode<T> timedNode3 = timedNode2.get();
            while (true) {
                TimedNode<T> timedNode4 = timedNode3;
                timedNode = timedNode2;
                timedNode2 = timedNode4;
                if (timedNode2 == null || timedNode2.f124010c > jD) {
                    break;
                }
                timedNode3 = timedNode2.get();
            }
            return timedNode;
        }

        int g(TimedNode<T> timedNode) {
            int i10 = 0;
            while (i10 != Integer.MAX_VALUE && (timedNode = timedNode.get()) != null) {
                i10++;
            }
            return i10;
        }

        @Override // io.reactivex.processors.ReplayProcessor.a
        @f
        public T getValue() {
            TimedNode<T> timedNode = this.f124016f;
            while (true) {
                TimedNode<T> timedNode2 = timedNode.get();
                if (timedNode2 == null) {
                    break;
                }
                timedNode = timedNode2;
            }
            if (timedNode.f124010c < this.f124014d.d(this.f124013c) - this.f124012b) {
                return null;
            }
            return timedNode.f124009b;
        }

        void h() {
            int i10 = this.f124015e;
            if (i10 > this.f124011a) {
                this.f124015e = i10 - 1;
                this.f124016f = this.f124016f.get();
            }
            long jD = this.f124014d.d(this.f124013c) - this.f124012b;
            TimedNode<T> timedNode = this.f124016f;
            while (true) {
                TimedNode<T> timedNode2 = timedNode.get();
                if (timedNode2 == null) {
                    this.f124016f = timedNode;
                    return;
                } else {
                    if (timedNode2.f124010c > jD) {
                        this.f124016f = timedNode;
                        return;
                    }
                    timedNode = timedNode2;
                }
            }
        }

        void i() {
            long jD = this.f124014d.d(this.f124013c) - this.f124012b;
            TimedNode<T> timedNode = this.f124016f;
            while (true) {
                TimedNode<T> timedNode2 = timedNode.get();
                if (timedNode2 == null) {
                    if (timedNode.f124009b != null) {
                        this.f124016f = new TimedNode<>(null, 0L);
                        return;
                    } else {
                        this.f124016f = timedNode;
                        return;
                    }
                }
                if (timedNode2.f124010c > jD) {
                    if (timedNode.f124009b == null) {
                        this.f124016f = timedNode;
                        return;
                    }
                    TimedNode<T> timedNode3 = new TimedNode<>(null, 0L);
                    timedNode3.lazySet(timedNode.get());
                    this.f124016f = timedNode3;
                    return;
                }
                timedNode = timedNode2;
            }
        }

        @Override // io.reactivex.processors.ReplayProcessor.a
        public boolean isDone() {
            return this.f124019i;
        }

        @Override // io.reactivex.processors.ReplayProcessor.a
        public Throwable q() {
            return this.f124018h;
        }

        @Override // io.reactivex.processors.ReplayProcessor.a
        public int size() {
            return g(f());
        }
    }

    public static final class c<T> implements a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f124020a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f124021b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        volatile Node<T> f124022c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Node<T> f124023d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Throwable f124024e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        volatile boolean f124025f;

        c(int i10) {
            this.f124020a = io.reactivex.internal.functions.a.h(i10, "maxSize");
            Node<T> node = new Node<>(null);
            this.f124023d = node;
            this.f124022c = node;
        }

        @Override // io.reactivex.processors.ReplayProcessor.a
        public void a() {
            c();
            this.f124025f = true;
        }

        @Override // io.reactivex.processors.ReplayProcessor.a
        public void b(T t10) {
            Node<T> node = new Node<>(t10);
            Node<T> node2 = this.f124023d;
            this.f124023d = node;
            this.f124021b++;
            node2.set(node);
            f();
        }

        @Override // io.reactivex.processors.ReplayProcessor.a
        public void c() {
            if (this.f124022c.f124002b != null) {
                Node<T> node = new Node<>(null);
                node.lazySet(this.f124022c.get());
                this.f124022c = node;
            }
        }

        @Override // io.reactivex.processors.ReplayProcessor.a
        public T[] d(T[] tArr) {
            Node<T> node = this.f124022c;
            Node<T> node2 = node;
            int i10 = 0;
            while (true) {
                node2 = node2.get();
                if (node2 == null) {
                    break;
                }
                i10++;
            }
            if (tArr.length < i10) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i10));
            }
            for (int i11 = 0; i11 < i10; i11++) {
                node = node.get();
                tArr[i11] = node.f124002b;
            }
            if (tArr.length > i10) {
                tArr[i10] = null;
            }
            return tArr;
        }

        @Override // io.reactivex.processors.ReplayProcessor.a
        public void e(ReplaySubscription<T> replaySubscription) {
            if (replaySubscription.getAndIncrement() != 0) {
                return;
            }
            org.reactivestreams.d<? super T> dVar = replaySubscription.f124003b;
            Node<T> node = (Node) replaySubscription.f124005d;
            if (node == null) {
                node = this.f124022c;
            }
            long j10 = replaySubscription.f124008g;
            int iAddAndGet = 1;
            do {
                long j11 = replaySubscription.f124006e.get();
                while (j10 != j11) {
                    if (replaySubscription.f124007f) {
                        replaySubscription.f124005d = null;
                        return;
                    }
                    boolean z10 = this.f124025f;
                    Node<T> node2 = node.get();
                    boolean z11 = node2 == null;
                    if (z10 && z11) {
                        replaySubscription.f124005d = null;
                        replaySubscription.f124007f = true;
                        Throwable th2 = this.f124024e;
                        if (th2 == null) {
                            dVar.onComplete();
                            return;
                        } else {
                            dVar.onError(th2);
                            return;
                        }
                    }
                    if (z11) {
                        break;
                    }
                    dVar.onNext(node2.f124002b);
                    j10++;
                    node = node2;
                }
                if (j10 == j11) {
                    if (replaySubscription.f124007f) {
                        replaySubscription.f124005d = null;
                        return;
                    }
                    if (this.f124025f && node.get() == null) {
                        replaySubscription.f124005d = null;
                        replaySubscription.f124007f = true;
                        Throwable th3 = this.f124024e;
                        if (th3 == null) {
                            dVar.onComplete();
                            return;
                        } else {
                            dVar.onError(th3);
                            return;
                        }
                    }
                }
                replaySubscription.f124005d = node;
                replaySubscription.f124008g = j10;
                iAddAndGet = replaySubscription.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // io.reactivex.processors.ReplayProcessor.a
        public void error(Throwable th2) {
            this.f124024e = th2;
            c();
            this.f124025f = true;
        }

        void f() {
            int i10 = this.f124021b;
            if (i10 > this.f124020a) {
                this.f124021b = i10 - 1;
                this.f124022c = this.f124022c.get();
            }
        }

        @Override // io.reactivex.processors.ReplayProcessor.a
        public T getValue() {
            Node<T> node = this.f124022c;
            while (true) {
                Node<T> node2 = node.get();
                if (node2 == null) {
                    return node.f124002b;
                }
                node = node2;
            }
        }

        @Override // io.reactivex.processors.ReplayProcessor.a
        public boolean isDone() {
            return this.f124025f;
        }

        @Override // io.reactivex.processors.ReplayProcessor.a
        public Throwable q() {
            return this.f124024e;
        }

        @Override // io.reactivex.processors.ReplayProcessor.a
        public int size() {
            Node<T> node = this.f124022c;
            int i10 = 0;
            while (i10 != Integer.MAX_VALUE && (node = node.get()) != null) {
                i10++;
            }
            return i10;
        }
    }

    public static final class d<T> implements a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final List<T> f124026a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Throwable f124027b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        volatile boolean f124028c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        volatile int f124029d;

        d(int i10) {
            this.f124026a = new ArrayList(io.reactivex.internal.functions.a.h(i10, "capacityHint"));
        }

        @Override // io.reactivex.processors.ReplayProcessor.a
        public void a() {
            this.f124028c = true;
        }

        @Override // io.reactivex.processors.ReplayProcessor.a
        public void b(T t10) {
            this.f124026a.add(t10);
            this.f124029d++;
        }

        @Override // io.reactivex.processors.ReplayProcessor.a
        public void c() {
        }

        @Override // io.reactivex.processors.ReplayProcessor.a
        public T[] d(T[] tArr) {
            int i10 = this.f124029d;
            if (i10 == 0) {
                if (tArr.length != 0) {
                    tArr[0] = null;
                }
                return tArr;
            }
            List<T> list = this.f124026a;
            if (tArr.length < i10) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i10));
            }
            for (int i11 = 0; i11 < i10; i11++) {
                tArr[i11] = list.get(i11);
            }
            if (tArr.length > i10) {
                tArr[i10] = null;
            }
            return tArr;
        }

        @Override // io.reactivex.processors.ReplayProcessor.a
        public void e(ReplaySubscription<T> replaySubscription) {
            if (replaySubscription.getAndIncrement() != 0) {
                return;
            }
            List<T> list = this.f124026a;
            org.reactivestreams.d<? super T> dVar = replaySubscription.f124003b;
            Integer num = (Integer) replaySubscription.f124005d;
            int iIntValue = 0;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                replaySubscription.f124005d = 0;
            }
            long j10 = replaySubscription.f124008g;
            int iAddAndGet = 1;
            do {
                long j11 = replaySubscription.f124006e.get();
                while (j10 != j11) {
                    if (replaySubscription.f124007f) {
                        replaySubscription.f124005d = null;
                        return;
                    }
                    boolean z10 = this.f124028c;
                    int i10 = this.f124029d;
                    if (z10 && iIntValue == i10) {
                        replaySubscription.f124005d = null;
                        replaySubscription.f124007f = true;
                        Throwable th2 = this.f124027b;
                        if (th2 == null) {
                            dVar.onComplete();
                            return;
                        } else {
                            dVar.onError(th2);
                            return;
                        }
                    }
                    if (iIntValue == i10) {
                        break;
                    }
                    dVar.onNext(list.get(iIntValue));
                    iIntValue++;
                    j10++;
                }
                if (j10 == j11) {
                    if (replaySubscription.f124007f) {
                        replaySubscription.f124005d = null;
                        return;
                    }
                    boolean z11 = this.f124028c;
                    int i11 = this.f124029d;
                    if (z11 && iIntValue == i11) {
                        replaySubscription.f124005d = null;
                        replaySubscription.f124007f = true;
                        Throwable th3 = this.f124027b;
                        if (th3 == null) {
                            dVar.onComplete();
                            return;
                        } else {
                            dVar.onError(th3);
                            return;
                        }
                    }
                }
                replaySubscription.f124005d = Integer.valueOf(iIntValue);
                replaySubscription.f124008g = j10;
                iAddAndGet = replaySubscription.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // io.reactivex.processors.ReplayProcessor.a
        public void error(Throwable th2) {
            this.f124027b = th2;
            this.f124028c = true;
        }

        @Override // io.reactivex.processors.ReplayProcessor.a
        @f
        public T getValue() {
            int i10 = this.f124029d;
            if (i10 == 0) {
                return null;
            }
            return this.f124026a.get(i10 - 1);
        }

        @Override // io.reactivex.processors.ReplayProcessor.a
        public boolean isDone() {
            return this.f124028c;
        }

        @Override // io.reactivex.processors.ReplayProcessor.a
        public Throwable q() {
            return this.f124027b;
        }

        @Override // io.reactivex.processors.ReplayProcessor.a
        public int size() {
            return this.f124029d;
        }
    }

    ReplayProcessor(a<T> aVar) {
        this.f123999c = aVar;
    }

    @jh.e
    @jh.c
    public static <T> ReplayProcessor<T> T8() {
        return new ReplayProcessor<>(new d(16));
    }

    @jh.e
    @jh.c
    public static <T> ReplayProcessor<T> U8(int i10) {
        return new ReplayProcessor<>(new d(i10));
    }

    static <T> ReplayProcessor<T> V8() {
        return new ReplayProcessor<>(new c(Integer.MAX_VALUE));
    }

    @jh.e
    @jh.c
    public static <T> ReplayProcessor<T> W8(int i10) {
        return new ReplayProcessor<>(new c(i10));
    }

    @jh.e
    @jh.c
    public static <T> ReplayProcessor<T> X8(long j10, TimeUnit timeUnit, h0 h0Var) {
        return new ReplayProcessor<>(new b(Integer.MAX_VALUE, j10, timeUnit, h0Var));
    }

    @jh.e
    @jh.c
    public static <T> ReplayProcessor<T> Y8(long j10, TimeUnit timeUnit, h0 h0Var, int i10) {
        return new ReplayProcessor<>(new b(i10, j10, timeUnit, h0Var));
    }

    @Override // io.reactivex.processors.a
    @f
    public Throwable M8() {
        a<T> aVar = this.f123999c;
        if (aVar.isDone()) {
            return aVar.q();
        }
        return null;
    }

    @Override // io.reactivex.processors.a
    public boolean N8() {
        a<T> aVar = this.f123999c;
        return aVar.isDone() && aVar.q() == null;
    }

    @Override // io.reactivex.processors.a
    public boolean O8() {
        return this.f124001e.get().length != 0;
    }

    @Override // io.reactivex.processors.a
    public boolean P8() {
        a<T> aVar = this.f123999c;
        return aVar.isDone() && aVar.q() != null;
    }

    boolean R8(ReplaySubscription<T> replaySubscription) {
        ReplaySubscription<T>[] replaySubscriptionArr;
        ReplaySubscription[] replaySubscriptionArr2;
        do {
            replaySubscriptionArr = this.f124001e.get();
            if (replaySubscriptionArr == f123998h) {
                return false;
            }
            int length = replaySubscriptionArr.length;
            replaySubscriptionArr2 = new ReplaySubscription[length + 1];
            System.arraycopy(replaySubscriptionArr, 0, replaySubscriptionArr2, 0, length);
            replaySubscriptionArr2[length] = replaySubscription;
        } while (!s0.a(this.f124001e, replaySubscriptionArr, replaySubscriptionArr2));
        return true;
    }

    public void S8() {
        this.f123999c.c();
    }

    public T Z8() {
        return this.f123999c.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Object[] a9() {
        Object[] objArr = f123996f;
        Object[] objArrB9 = b9(objArr);
        return objArrB9 == objArr ? new Object[0] : objArrB9;
    }

    public T[] b9(T[] tArr) {
        return this.f123999c.d(tArr);
    }

    public boolean c9() {
        return this.f123999c.size() != 0;
    }

    void d9(ReplaySubscription<T> replaySubscription) {
        ReplaySubscription<T>[] replaySubscriptionArr;
        ReplaySubscription[] replaySubscriptionArr2;
        do {
            replaySubscriptionArr = this.f124001e.get();
            if (replaySubscriptionArr == f123998h || replaySubscriptionArr == f123997g) {
                return;
            }
            int length = replaySubscriptionArr.length;
            int i10 = -1;
            for (int i11 = 0; i11 < length; i11++) {
                if (replaySubscriptionArr[i11] == replaySubscription) {
                    i10 = i11;
                    break;
                }
            }
            if (i10 < 0) {
                return;
            }
            if (length == 1) {
                replaySubscriptionArr2 = f123997g;
            } else {
                ReplaySubscription[] replaySubscriptionArr3 = new ReplaySubscription[length - 1];
                System.arraycopy(replaySubscriptionArr, 0, replaySubscriptionArr3, 0, i10);
                System.arraycopy(replaySubscriptionArr, i10 + 1, replaySubscriptionArr3, i10, (length - i10) - 1);
                replaySubscriptionArr2 = replaySubscriptionArr3;
            }
        } while (!s0.a(this.f124001e, replaySubscriptionArr, replaySubscriptionArr2));
    }

    int e9() {
        return this.f123999c.size();
    }

    int f9() {
        return this.f124001e.get().length;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super T> dVar) {
        ReplaySubscription<T> replaySubscription = new ReplaySubscription<>(dVar, this);
        dVar.onSubscribe(replaySubscription);
        if (R8(replaySubscription) && replaySubscription.f124007f) {
            d9(replaySubscription);
        } else {
            this.f123999c.e(replaySubscription);
        }
    }

    @Override // org.reactivestreams.d
    public void onComplete() {
        if (this.f124000d) {
            return;
        }
        this.f124000d = true;
        a<T> aVar = this.f123999c;
        aVar.a();
        for (ReplaySubscription<T> replaySubscription : this.f124001e.getAndSet(f123998h)) {
            aVar.e(replaySubscription);
        }
    }

    @Override // org.reactivestreams.d
    public void onError(Throwable th2) {
        io.reactivex.internal.functions.a.g(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f124000d) {
            io.reactivex.plugins.a.Y(th2);
            return;
        }
        this.f124000d = true;
        a<T> aVar = this.f123999c;
        aVar.error(th2);
        for (ReplaySubscription<T> replaySubscription : this.f124001e.getAndSet(f123998h)) {
            aVar.e(replaySubscription);
        }
    }

    @Override // org.reactivestreams.d
    public void onNext(T t10) {
        io.reactivex.internal.functions.a.g(t10, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f124000d) {
            return;
        }
        a<T> aVar = this.f123999c;
        aVar.b(t10);
        for (ReplaySubscription<T> replaySubscription : this.f124001e.get()) {
            aVar.e(replaySubscription);
        }
    }

    @Override // org.reactivestreams.d
    public void onSubscribe(e eVar) {
        if (this.f124000d) {
            eVar.cancel();
        } else {
            eVar.request(Long.MAX_VALUE);
        }
    }
}
