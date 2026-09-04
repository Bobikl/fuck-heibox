package io.reactivex.subjects;

import androidx.compose.animation.core.s0;
import io.reactivex.g0;
import io.reactivex.h0;
import io.reactivex.internal.util.NotificationLite;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import jh.e;
import jh.f;

/* JADX INFO: loaded from: classes5.dex */
public final class ReplaySubject<T> extends c<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final ReplayDisposable[] f124094e = new ReplayDisposable[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final ReplayDisposable[] f124095f = new ReplayDisposable[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Object[] f124096g = new Object[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final a<T> f124097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicReference<ReplayDisposable<T>[]> f124098c = new AtomicReference<>(f124094e);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f124099d;

    public static final class Node<T> extends AtomicReference<Node<T>> {
        private static final long serialVersionUID = 6404226426336033100L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final T f124100b;

        Node(T t10) {
            this.f124100b = t10;
        }
    }

    public static final class ReplayDisposable<T> extends AtomicInteger implements io.reactivex.disposables.b {
        private static final long serialVersionUID = 466549804534799122L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final g0<? super T> f124101b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final ReplaySubject<T> f124102c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f124103d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        volatile boolean f124104e;

        ReplayDisposable(g0<? super T> g0Var, ReplaySubject<T> replaySubject) {
            this.f124101b = g0Var;
            this.f124102c = replaySubject;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (this.f124104e) {
                return;
            }
            this.f124104e = true;
            this.f124102c.z8(this);
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f124104e;
        }
    }

    public static final class SizeAndTimeBoundReplayBuffer<T> extends AtomicReference<Object> implements a<T> {
        private static final long serialVersionUID = -8056260896137901749L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f124105b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f124106c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final TimeUnit f124107d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final h0 f124108e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f124109f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        volatile TimedNode<Object> f124110g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        TimedNode<Object> f124111h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        volatile boolean f124112i;

        SizeAndTimeBoundReplayBuffer(int i10, long j10, TimeUnit timeUnit, h0 h0Var) {
            this.f124105b = io.reactivex.internal.functions.a.h(i10, "maxSize");
            this.f124106c = io.reactivex.internal.functions.a.i(j10, "maxAge");
            this.f124107d = (TimeUnit) io.reactivex.internal.functions.a.g(timeUnit, "unit is null");
            this.f124108e = (h0) io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
            TimedNode<Object> timedNode = new TimedNode<>(null, 0L);
            this.f124111h = timedNode;
            this.f124110g = timedNode;
        }

        @Override // io.reactivex.subjects.ReplaySubject.a
        public void a(Object obj) {
            TimedNode<Object> timedNode = new TimedNode<>(obj, Long.MAX_VALUE);
            TimedNode<Object> timedNode2 = this.f124111h;
            this.f124111h = timedNode;
            this.f124109f++;
            timedNode2.lazySet(timedNode);
            h();
            this.f124112i = true;
        }

        @Override // io.reactivex.subjects.ReplaySubject.a
        public void add(T t10) {
            TimedNode<Object> timedNode = new TimedNode<>(t10, this.f124108e.d(this.f124107d));
            TimedNode<Object> timedNode2 = this.f124111h;
            this.f124111h = timedNode;
            this.f124109f++;
            timedNode2.set(timedNode);
            g();
        }

        @Override // io.reactivex.subjects.ReplaySubject.a
        public void b(ReplayDisposable<T> replayDisposable) {
            if (replayDisposable.getAndIncrement() != 0) {
                return;
            }
            g0<? super T> g0Var = replayDisposable.f124101b;
            TimedNode<Object> timedNodeE = (TimedNode) replayDisposable.f124103d;
            if (timedNodeE == null) {
                timedNodeE = e();
            }
            int iAddAndGet = 1;
            while (!replayDisposable.f124104e) {
                while (true) {
                    if (replayDisposable.f124104e) {
                        replayDisposable.f124103d = null;
                        return;
                    }
                    TimedNode<T> timedNode = timedNodeE.get();
                    if (timedNode == null) {
                        break;
                    }
                    T t10 = timedNode.f124118b;
                    if (this.f124112i && timedNode.get() == null) {
                        if (NotificationLite.isComplete(t10)) {
                            g0Var.onComplete();
                        } else {
                            g0Var.onError(NotificationLite.getError(t10));
                        }
                        replayDisposable.f124103d = null;
                        replayDisposable.f124104e = true;
                        return;
                    }
                    g0Var.onNext(t10);
                    timedNodeE = timedNode;
                }
                if (timedNodeE.get() == null) {
                    replayDisposable.f124103d = timedNodeE;
                    iAddAndGet = replayDisposable.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            replayDisposable.f124103d = null;
        }

        @Override // io.reactivex.subjects.ReplaySubject.a
        public void c() {
            TimedNode<Object> timedNode = this.f124110g;
            if (timedNode.f124118b != null) {
                TimedNode<Object> timedNode2 = new TimedNode<>(null, 0L);
                timedNode2.lazySet(timedNode.get());
                this.f124110g = timedNode2;
            }
        }

        @Override // io.reactivex.subjects.ReplaySubject.a
        public T[] d(T[] tArr) {
            TimedNode<T> timedNodeE = e();
            int iF = f(timedNodeE);
            if (iF != 0) {
                if (tArr.length < iF) {
                    tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), iF));
                }
                for (int i10 = 0; i10 != iF; i10++) {
                    timedNodeE = timedNodeE.get();
                    tArr[i10] = timedNodeE.f124118b;
                }
                if (tArr.length > iF) {
                    tArr[iF] = null;
                }
            } else if (tArr.length != 0) {
                tArr[0] = null;
            }
            return tArr;
        }

        TimedNode<Object> e() {
            TimedNode<Object> timedNode;
            TimedNode<Object> timedNode2 = this.f124110g;
            long jD = this.f124108e.d(this.f124107d) - this.f124106c;
            TimedNode<T> timedNode3 = timedNode2.get();
            while (true) {
                TimedNode<T> timedNode4 = timedNode3;
                timedNode = timedNode2;
                timedNode2 = timedNode4;
                if (timedNode2 == null || timedNode2.f124119c > jD) {
                    break;
                }
                timedNode3 = timedNode2.get();
            }
            return timedNode;
        }

        int f(TimedNode<Object> timedNode) {
            int i10 = 0;
            while (i10 != Integer.MAX_VALUE) {
                TimedNode<T> timedNode2 = timedNode.get();
                if (timedNode2 == null) {
                    Object obj = timedNode.f124118b;
                    return (NotificationLite.isComplete(obj) || NotificationLite.isError(obj)) ? i10 - 1 : i10;
                }
                i10++;
                timedNode = timedNode2;
            }
            return i10;
        }

        void g() {
            int i10 = this.f124109f;
            if (i10 > this.f124105b) {
                this.f124109f = i10 - 1;
                this.f124110g = this.f124110g.get();
            }
            long jD = this.f124108e.d(this.f124107d) - this.f124106c;
            TimedNode<Object> timedNode = this.f124110g;
            while (true) {
                TimedNode<T> timedNode2 = timedNode.get();
                if (timedNode2 == null) {
                    this.f124110g = timedNode;
                    return;
                } else {
                    if (timedNode2.f124119c > jD) {
                        this.f124110g = timedNode;
                        return;
                    }
                    timedNode = timedNode2;
                }
            }
        }

        @Override // io.reactivex.subjects.ReplaySubject.a
        @f
        public T getValue() {
            T t10;
            TimedNode<Object> timedNode = this.f124110g;
            TimedNode<Object> timedNode2 = null;
            while (true) {
                TimedNode<T> timedNode3 = timedNode.get();
                if (timedNode3 == null) {
                    break;
                }
                timedNode2 = timedNode;
                timedNode = timedNode3;
            }
            if (timedNode.f124119c >= this.f124108e.d(this.f124107d) - this.f124106c && (t10 = (T) timedNode.f124118b) != null) {
                return (NotificationLite.isComplete(t10) || NotificationLite.isError(t10)) ? (T) timedNode2.f124118b : t10;
            }
            return null;
        }

        void h() {
            long jD = this.f124108e.d(this.f124107d) - this.f124106c;
            TimedNode<Object> timedNode = this.f124110g;
            while (true) {
                TimedNode<T> timedNode2 = timedNode.get();
                if (timedNode2.get() == null) {
                    if (timedNode.f124118b == null) {
                        this.f124110g = timedNode;
                        return;
                    }
                    TimedNode<Object> timedNode3 = new TimedNode<>(null, 0L);
                    timedNode3.lazySet(timedNode.get());
                    this.f124110g = timedNode3;
                    return;
                }
                if (timedNode2.f124119c > jD) {
                    if (timedNode.f124118b == null) {
                        this.f124110g = timedNode;
                        return;
                    }
                    TimedNode<Object> timedNode4 = new TimedNode<>(null, 0L);
                    timedNode4.lazySet(timedNode.get());
                    this.f124110g = timedNode4;
                    return;
                }
                timedNode = timedNode2;
            }
        }

        @Override // io.reactivex.subjects.ReplaySubject.a
        public int size() {
            return f(e());
        }
    }

    public static final class SizeBoundReplayBuffer<T> extends AtomicReference<Object> implements a<T> {
        private static final long serialVersionUID = 1107649250281456395L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f124113b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f124114c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        volatile Node<Object> f124115d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Node<Object> f124116e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        volatile boolean f124117f;

        SizeBoundReplayBuffer(int i10) {
            this.f124113b = io.reactivex.internal.functions.a.h(i10, "maxSize");
            Node<Object> node = new Node<>(null);
            this.f124116e = node;
            this.f124115d = node;
        }

        @Override // io.reactivex.subjects.ReplaySubject.a
        public void a(Object obj) {
            Node<Object> node = new Node<>(obj);
            Node<Object> node2 = this.f124116e;
            this.f124116e = node;
            this.f124114c++;
            node2.lazySet(node);
            c();
            this.f124117f = true;
        }

        @Override // io.reactivex.subjects.ReplaySubject.a
        public void add(T t10) {
            Node<Object> node = new Node<>(t10);
            Node<Object> node2 = this.f124116e;
            this.f124116e = node;
            this.f124114c++;
            node2.set(node);
            e();
        }

        @Override // io.reactivex.subjects.ReplaySubject.a
        public void b(ReplayDisposable<T> replayDisposable) {
            if (replayDisposable.getAndIncrement() != 0) {
                return;
            }
            g0<? super T> g0Var = replayDisposable.f124101b;
            Node<Object> node = (Node) replayDisposable.f124103d;
            if (node == null) {
                node = this.f124115d;
            }
            int iAddAndGet = 1;
            while (!replayDisposable.f124104e) {
                Node<T> node2 = node.get();
                if (node2 != null) {
                    T t10 = node2.f124100b;
                    if (this.f124117f && node2.get() == null) {
                        if (NotificationLite.isComplete(t10)) {
                            g0Var.onComplete();
                        } else {
                            g0Var.onError(NotificationLite.getError(t10));
                        }
                        replayDisposable.f124103d = null;
                        replayDisposable.f124104e = true;
                        return;
                    }
                    g0Var.onNext(t10);
                    node = node2;
                } else if (node.get() != null) {
                    continue;
                } else {
                    replayDisposable.f124103d = node;
                    iAddAndGet = replayDisposable.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            replayDisposable.f124103d = null;
        }

        @Override // io.reactivex.subjects.ReplaySubject.a
        public void c() {
            Node<Object> node = this.f124115d;
            if (node.f124100b != null) {
                Node<Object> node2 = new Node<>(null);
                node2.lazySet(node.get());
                this.f124115d = node2;
            }
        }

        @Override // io.reactivex.subjects.ReplaySubject.a
        public T[] d(T[] tArr) {
            Node<T> node = this.f124115d;
            int size = size();
            if (size != 0) {
                if (tArr.length < size) {
                    tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
                }
                for (int i10 = 0; i10 != size; i10++) {
                    node = node.get();
                    tArr[i10] = node.f124100b;
                }
                if (tArr.length > size) {
                    tArr[size] = null;
                }
            } else if (tArr.length != 0) {
                tArr[0] = null;
            }
            return tArr;
        }

        void e() {
            int i10 = this.f124114c;
            if (i10 > this.f124113b) {
                this.f124114c = i10 - 1;
                this.f124115d = this.f124115d.get();
            }
        }

        @Override // io.reactivex.subjects.ReplaySubject.a
        @f
        public T getValue() {
            Node<Object> node = this.f124115d;
            Node<Object> node2 = null;
            while (true) {
                Node<T> node3 = node.get();
                if (node3 == null) {
                    break;
                }
                node2 = node;
                node = node3;
            }
            T t10 = (T) node.f124100b;
            if (t10 == null) {
                return null;
            }
            return (NotificationLite.isComplete(t10) || NotificationLite.isError(t10)) ? (T) node2.f124100b : t10;
        }

        @Override // io.reactivex.subjects.ReplaySubject.a
        public int size() {
            Node<Object> node = this.f124115d;
            int i10 = 0;
            while (i10 != Integer.MAX_VALUE) {
                Node<T> node2 = node.get();
                if (node2 == null) {
                    Object obj = node.f124100b;
                    return (NotificationLite.isComplete(obj) || NotificationLite.isError(obj)) ? i10 - 1 : i10;
                }
                i10++;
                node = node2;
            }
            return i10;
        }
    }

    public static final class TimedNode<T> extends AtomicReference<TimedNode<T>> {
        private static final long serialVersionUID = 6404226426336033100L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final T f124118b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f124119c;

        TimedNode(T t10, long j10) {
            this.f124118b = t10;
            this.f124119c = j10;
        }
    }

    public static final class UnboundedReplayBuffer<T> extends AtomicReference<Object> implements a<T> {
        private static final long serialVersionUID = -733876083048047795L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final List<Object> f124120b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        volatile boolean f124121c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        volatile int f124122d;

        UnboundedReplayBuffer(int i10) {
            this.f124120b = new ArrayList(io.reactivex.internal.functions.a.h(i10, "capacityHint"));
        }

        @Override // io.reactivex.subjects.ReplaySubject.a
        public void a(Object obj) {
            this.f124120b.add(obj);
            c();
            this.f124122d++;
            this.f124121c = true;
        }

        @Override // io.reactivex.subjects.ReplaySubject.a
        public void add(T t10) {
            this.f124120b.add(t10);
            this.f124122d++;
        }

        @Override // io.reactivex.subjects.ReplaySubject.a
        public void b(ReplayDisposable<T> replayDisposable) {
            int i10;
            if (replayDisposable.getAndIncrement() != 0) {
                return;
            }
            List<Object> list = this.f124120b;
            g0<? super T> g0Var = replayDisposable.f124101b;
            Integer num = (Integer) replayDisposable.f124103d;
            int iIntValue = 0;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                replayDisposable.f124103d = 0;
            }
            int iAddAndGet = 1;
            while (!replayDisposable.f124104e) {
                int i11 = this.f124122d;
                while (i11 != iIntValue) {
                    if (replayDisposable.f124104e) {
                        replayDisposable.f124103d = null;
                        return;
                    }
                    Object obj = list.get(iIntValue);
                    if (this.f124121c && (i10 = iIntValue + 1) == i11 && i10 == (i11 = this.f124122d)) {
                        if (NotificationLite.isComplete(obj)) {
                            g0Var.onComplete();
                        } else {
                            g0Var.onError(NotificationLite.getError(obj));
                        }
                        replayDisposable.f124103d = null;
                        replayDisposable.f124104e = true;
                        return;
                    }
                    g0Var.onNext(obj);
                    iIntValue++;
                }
                if (iIntValue == this.f124122d) {
                    replayDisposable.f124103d = Integer.valueOf(iIntValue);
                    iAddAndGet = replayDisposable.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            replayDisposable.f124103d = null;
        }

        @Override // io.reactivex.subjects.ReplaySubject.a
        public void c() {
        }

        @Override // io.reactivex.subjects.ReplaySubject.a
        public T[] d(T[] tArr) {
            int i10 = this.f124122d;
            if (i10 == 0) {
                if (tArr.length != 0) {
                    tArr[0] = null;
                }
                return tArr;
            }
            List<Object> list = this.f124120b;
            Object obj = list.get(i10 - 1);
            if ((NotificationLite.isComplete(obj) || NotificationLite.isError(obj)) && (i10 = i10 - 1) == 0) {
                if (tArr.length != 0) {
                    tArr[0] = null;
                }
                return tArr;
            }
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

        @Override // io.reactivex.subjects.ReplaySubject.a
        @f
        public T getValue() {
            int i10 = this.f124122d;
            if (i10 == 0) {
                return null;
            }
            List<Object> list = this.f124120b;
            T t10 = (T) list.get(i10 - 1);
            if (!NotificationLite.isComplete(t10) && !NotificationLite.isError(t10)) {
                return t10;
            }
            if (i10 == 1) {
                return null;
            }
            return (T) list.get(i10 - 2);
        }

        @Override // io.reactivex.subjects.ReplaySubject.a
        public int size() {
            int i10 = this.f124122d;
            if (i10 == 0) {
                return 0;
            }
            int i11 = i10 - 1;
            Object obj = this.f124120b.get(i11);
            return (NotificationLite.isComplete(obj) || NotificationLite.isError(obj)) ? i11 : i10;
        }
    }

    public interface a<T> {
        void a(Object obj);

        void add(T t10);

        void b(ReplayDisposable<T> replayDisposable);

        void c();

        boolean compareAndSet(Object obj, Object obj2);

        T[] d(T[] tArr);

        Object get();

        @f
        T getValue();

        int size();
    }

    ReplaySubject(a<T> aVar) {
        this.f124097b = aVar;
    }

    @e
    @jh.c
    public static <T> ReplaySubject<T> o8() {
        return new ReplaySubject<>(new UnboundedReplayBuffer(16));
    }

    @e
    @jh.c
    public static <T> ReplaySubject<T> p8(int i10) {
        return new ReplaySubject<>(new UnboundedReplayBuffer(i10));
    }

    static <T> ReplaySubject<T> q8() {
        return new ReplaySubject<>(new SizeBoundReplayBuffer(Integer.MAX_VALUE));
    }

    @e
    @jh.c
    public static <T> ReplaySubject<T> r8(int i10) {
        return new ReplaySubject<>(new SizeBoundReplayBuffer(i10));
    }

    @e
    @jh.c
    public static <T> ReplaySubject<T> s8(long j10, TimeUnit timeUnit, h0 h0Var) {
        return new ReplaySubject<>(new SizeAndTimeBoundReplayBuffer(Integer.MAX_VALUE, j10, timeUnit, h0Var));
    }

    @e
    @jh.c
    public static <T> ReplaySubject<T> t8(long j10, TimeUnit timeUnit, h0 h0Var, int i10) {
        return new ReplaySubject<>(new SizeAndTimeBoundReplayBuffer(i10, j10, timeUnit, h0Var));
    }

    int A8() {
        return this.f124097b.size();
    }

    ReplayDisposable<T>[] B8(Object obj) {
        return this.f124097b.compareAndSet(null, obj) ? this.f124098c.getAndSet(f124095f) : f124095f;
    }

    @Override // io.reactivex.z
    protected void H5(g0<? super T> g0Var) {
        ReplayDisposable<T> replayDisposable = new ReplayDisposable<>(g0Var, this);
        g0Var.onSubscribe(replayDisposable);
        if (replayDisposable.f124104e) {
            return;
        }
        if (m8(replayDisposable) && replayDisposable.f124104e) {
            z8(replayDisposable);
        } else {
            this.f124097b.b(replayDisposable);
        }
    }

    @Override // io.reactivex.subjects.c
    @f
    public Throwable h8() {
        Object obj = this.f124097b.get();
        if (NotificationLite.isError(obj)) {
            return NotificationLite.getError(obj);
        }
        return null;
    }

    @Override // io.reactivex.subjects.c
    public boolean i8() {
        return NotificationLite.isComplete(this.f124097b.get());
    }

    @Override // io.reactivex.subjects.c
    public boolean j8() {
        return this.f124098c.get().length != 0;
    }

    @Override // io.reactivex.subjects.c
    public boolean k8() {
        return NotificationLite.isError(this.f124097b.get());
    }

    boolean m8(ReplayDisposable<T> replayDisposable) {
        ReplayDisposable<T>[] replayDisposableArr;
        ReplayDisposable[] replayDisposableArr2;
        do {
            replayDisposableArr = this.f124098c.get();
            if (replayDisposableArr == f124095f) {
                return false;
            }
            int length = replayDisposableArr.length;
            replayDisposableArr2 = new ReplayDisposable[length + 1];
            System.arraycopy(replayDisposableArr, 0, replayDisposableArr2, 0, length);
            replayDisposableArr2[length] = replayDisposable;
        } while (!s0.a(this.f124098c, replayDisposableArr, replayDisposableArr2));
        return true;
    }

    public void n8() {
        this.f124097b.c();
    }

    @Override // io.reactivex.g0
    public void onComplete() {
        if (this.f124099d) {
            return;
        }
        this.f124099d = true;
        Object objComplete = NotificationLite.complete();
        a<T> aVar = this.f124097b;
        aVar.a(objComplete);
        for (ReplayDisposable<T> replayDisposable : B8(objComplete)) {
            aVar.b(replayDisposable);
        }
    }

    @Override // io.reactivex.g0
    public void onError(Throwable th2) {
        io.reactivex.internal.functions.a.g(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f124099d) {
            io.reactivex.plugins.a.Y(th2);
            return;
        }
        this.f124099d = true;
        Object objError = NotificationLite.error(th2);
        a<T> aVar = this.f124097b;
        aVar.a(objError);
        for (ReplayDisposable<T> replayDisposable : B8(objError)) {
            aVar.b(replayDisposable);
        }
    }

    @Override // io.reactivex.g0
    public void onNext(T t10) {
        io.reactivex.internal.functions.a.g(t10, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f124099d) {
            return;
        }
        a<T> aVar = this.f124097b;
        aVar.add(t10);
        for (ReplayDisposable<T> replayDisposable : this.f124098c.get()) {
            aVar.b(replayDisposable);
        }
    }

    @Override // io.reactivex.g0
    public void onSubscribe(io.reactivex.disposables.b bVar) {
        if (this.f124099d) {
            bVar.dispose();
        }
    }

    @f
    public T u8() {
        return this.f124097b.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Object[] v8() {
        Object[] objArr = f124096g;
        Object[] objArrW8 = w8(objArr);
        return objArrW8 == objArr ? new Object[0] : objArrW8;
    }

    public T[] w8(T[] tArr) {
        return this.f124097b.d(tArr);
    }

    public boolean x8() {
        return this.f124097b.size() != 0;
    }

    int y8() {
        return this.f124098c.get().length;
    }

    void z8(ReplayDisposable<T> replayDisposable) {
        ReplayDisposable<T>[] replayDisposableArr;
        ReplayDisposable[] replayDisposableArr2;
        do {
            replayDisposableArr = this.f124098c.get();
            if (replayDisposableArr == f124095f || replayDisposableArr == f124094e) {
                return;
            }
            int length = replayDisposableArr.length;
            int i10 = -1;
            for (int i11 = 0; i11 < length; i11++) {
                if (replayDisposableArr[i11] == replayDisposable) {
                    i10 = i11;
                    break;
                }
            }
            if (i10 < 0) {
                return;
            }
            if (length == 1) {
                replayDisposableArr2 = f124094e;
            } else {
                ReplayDisposable[] replayDisposableArr3 = new ReplayDisposable[length - 1];
                System.arraycopy(replayDisposableArr, 0, replayDisposableArr3, 0, i10);
                System.arraycopy(replayDisposableArr, i10 + 1, replayDisposableArr3, i10, (length - i10) - 1);
                replayDisposableArr2 = replayDisposableArr3;
            }
        } while (!s0.a(this.f124098c, replayDisposableArr, replayDisposableArr2));
    }
}
