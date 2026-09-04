package com.google.common.util.concurrent;

import com.google.common.base.Functions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.io.Closeable;
import java.io.IOException;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@com.google.common.util.concurrent.u
@s9.f("Use ClosingFuture.from(Futures.immediate*Future)")
public final class ClosingFuture<V> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Logger f59204d = Logger.getLogger(ClosingFuture.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference<State> f59205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CloseableList f59206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.common.util.concurrent.y<V> f59207c;

    public static final class CloseableList extends IdentityHashMap<Closeable, Executor> implements Closeable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final v f59208b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile boolean f59209c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @CheckForNull
        private volatile CountDownLatch f59210d;

        private CloseableList() {
            this.f59208b = new v(this);
        }

        /* synthetic */ CloseableList(d dVar) {
            this();
        }

        void b(@CheckForNull Closeable closeable, Executor executor) {
            com.google.common.base.w.E(executor);
            if (closeable == null) {
                return;
            }
            synchronized (this) {
                if (this.f59209c) {
                    ClosingFuture.q(closeable, executor);
                } else {
                    put(closeable, executor);
                }
            }
        }

        <V, U> com.google.common.util.concurrent.y<U> c(n<V, U> nVar, @b1 V v10) throws Exception {
            CloseableList closeableList = new CloseableList();
            try {
                ClosingFuture<U> closingFutureA = nVar.a(closeableList.f59208b, v10);
                closingFutureA.i(closeableList);
                return ((ClosingFuture) closingFutureA).f59207c;
            } finally {
                b(closeableList, y0.c());
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f59209c) {
                return;
            }
            synchronized (this) {
                if (this.f59209c) {
                    return;
                }
                this.f59209c = true;
                for (Map.Entry<Closeable, Executor> entry : entrySet()) {
                    ClosingFuture.q(entry.getKey(), entry.getValue());
                }
                clear();
                if (this.f59210d != null) {
                    this.f59210d.countDown();
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        <V, U> p0<U> d(p<? super V, U> pVar, @b1 V v10) throws Exception {
            CloseableList closeableList = new CloseableList();
            try {
                return j0.m(pVar.a(closeableList.f59208b, v10));
            } finally {
                b(closeableList, y0.c());
            }
        }

        CountDownLatch e() {
            if (this.f59209c) {
                return new CountDownLatch(0);
            }
            synchronized (this) {
                if (this.f59209c) {
                    return new CountDownLatch(0);
                }
                com.google.common.base.w.g0(this.f59210d == null);
                CountDownLatch countDownLatch = new CountDownLatch(1);
                this.f59210d = countDownLatch;
                return countDownLatch;
            }
        }
    }

    public enum State {
        OPEN,
        SUBSUMED,
        WILL_CLOSE,
        CLOSING,
        CLOSED,
        WILL_CREATE_VALUE_AND_CLOSER
    }

    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ y f59211b;

        a(y yVar) {
            this.f59211b = yVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            ClosingFuture.x(this.f59211b, ClosingFuture.this);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Closeable f59213b;

        b(Closeable closeable) {
            this.f59213b = closeable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f59213b.close();
            } catch (IOException | RuntimeException e10) {
                ClosingFuture.f59204d.log(Level.WARNING, "thrown by close()", e10);
            }
        }
    }

    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f59214a;

        static {
            int[] iArr = new int[State.values().length];
            f59214a = iArr;
            try {
                iArr[State.SUBSUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f59214a[State.WILL_CREATE_VALUE_AND_CLOSER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f59214a[State.WILL_CLOSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f59214a[State.CLOSING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f59214a[State.CLOSED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f59214a[State.OPEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public class d implements i0<Closeable> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Executor f59216b;

        d(Executor executor) {
            this.f59216b = executor;
        }

        @Override // com.google.common.util.concurrent.i0
        public void a(Throwable th2) {
        }

        @Override // com.google.common.util.concurrent.i0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@CheckForNull Closeable closeable) {
            ClosingFuture.this.f59206b.f59208b.a(closeable, this.f59216b);
        }
    }

    public class e implements Callable<V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o f59217b;

        e(o oVar) {
            this.f59217b = oVar;
        }

        @Override // java.util.concurrent.Callable
        @b1
        public V call() throws Exception {
            return (V) this.f59217b.a(ClosingFuture.this.f59206b.f59208b);
        }

        public String toString() {
            return this.f59217b.toString();
        }
    }

    public class f implements com.google.common.util.concurrent.l<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ m f59219a;

        f(m mVar) {
            this.f59219a = mVar;
        }

        @Override // com.google.common.util.concurrent.l
        public p0<V> call() throws Exception {
            CloseableList closeableList = new CloseableList(null);
            try {
                ClosingFuture<V> closingFutureA = this.f59219a.a(closeableList.f59208b);
                closingFutureA.i(ClosingFuture.this.f59206b);
                return ((ClosingFuture) closingFutureA).f59207c;
            } finally {
                ClosingFuture.this.f59206b.b(closeableList, y0.c());
            }
        }

        public String toString() {
            return this.f59219a.toString();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [U] */
    public class g<U> implements com.google.common.util.concurrent.m<V, U> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p f59221a;

        g(p pVar) {
            this.f59221a = pVar;
        }

        @Override // com.google.common.util.concurrent.m
        public p0<U> apply(V v10) throws Exception {
            return ClosingFuture.this.f59206b.d(this.f59221a, v10);
        }

        public String toString() {
            return this.f59221a.toString();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [U] */
    public class h<U> implements com.google.common.util.concurrent.m<V, U> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f59223a;

        h(n nVar) {
            this.f59223a = nVar;
        }

        @Override // com.google.common.util.concurrent.m
        public p0<U> apply(V v10) throws Exception {
            return ClosingFuture.this.f59206b.c(this.f59223a, v10);
        }

        public String toString() {
            return this.f59223a.toString();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [U] */
    public class i<U> implements n<V, U> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.common.util.concurrent.m f59225a;

        i(com.google.common.util.concurrent.m mVar) {
            this.f59225a = mVar;
        }

        @Override // com.google.common.util.concurrent.ClosingFuture.n
        public ClosingFuture<U> a(v vVar, V v10) throws Exception {
            return ClosingFuture.w(this.f59225a.apply(v10));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [W, X] */
    public class j<W, X> implements com.google.common.util.concurrent.m<X, W> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p f59226a;

        j(p pVar) {
            this.f59226a = pVar;
        }

        /* JADX WARN: Incorrect types in method signature: (TX;)Lcom/google/common/util/concurrent/p0<TW;>; */
        @Override // com.google.common.util.concurrent.m
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public p0 apply(Throwable th2) throws Exception {
            return ClosingFuture.this.f59206b.d(this.f59226a, th2);
        }

        public String toString() {
            return this.f59226a.toString();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [W, X] */
    public class k<W, X> implements com.google.common.util.concurrent.m<X, W> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f59228a;

        k(n nVar) {
            this.f59228a = nVar;
        }

        /* JADX WARN: Incorrect types in method signature: (TX;)Lcom/google/common/util/concurrent/p0<TW;>; */
        @Override // com.google.common.util.concurrent.m
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public p0 apply(Throwable th2) throws Exception {
            return ClosingFuture.this.f59206b.c(this.f59228a, th2);
        }

        public String toString() {
            return this.f59228a.toString();
        }
    }

    public class l implements Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ClosingFuture closingFuture = ClosingFuture.this;
            State state = State.WILL_CLOSE;
            State state2 = State.CLOSING;
            closingFuture.o(state, state2);
            ClosingFuture.this.p();
            ClosingFuture.this.o(state2, State.CLOSED);
        }
    }

    public interface m<V> {
        ClosingFuture<V> a(v vVar) throws Exception;
    }

    public interface n<T, U> {
        ClosingFuture<U> a(v vVar, @b1 T t10) throws Exception;
    }

    public interface o<V> {
        @b1
        V a(v vVar) throws Exception;
    }

    public interface p<T, U> {
        @b1
        U a(v vVar, @b1 T t10) throws Exception;
    }

    @s9.f("Use ClosingFuture.whenAllSucceed() or .whenAllComplete() instead.")
    public static class q {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final com.google.common.base.n<ClosingFuture<?>, com.google.common.util.concurrent.y<?>> f59231d = new c();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final CloseableList f59232a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f59233b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected final ImmutableList<ClosingFuture<?>> f59234c;

        public class a implements Callable<V> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f59235b;

            a(e eVar) {
                this.f59235b = eVar;
            }

            @Override // java.util.concurrent.Callable
            @b1
            public V call() throws Exception {
                return (V) new w(q.this.f59234c, null).c(this.f59235b, q.this.f59232a);
            }

            public String toString() {
                return this.f59235b.toString();
            }
        }

        public class b implements com.google.common.util.concurrent.l<V> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f59237a;

            b(d dVar) {
                this.f59237a = dVar;
            }

            @Override // com.google.common.util.concurrent.l
            public p0<V> call() throws Exception {
                return new w(q.this.f59234c, null).d(this.f59237a, q.this.f59232a);
            }

            public String toString() {
                return this.f59237a.toString();
            }
        }

        public class c implements com.google.common.base.n<ClosingFuture<?>, com.google.common.util.concurrent.y<?>> {
            c() {
            }

            @Override // com.google.common.base.n
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public com.google.common.util.concurrent.y<?> apply(ClosingFuture<?> closingFuture) {
                return ((ClosingFuture) closingFuture).f59207c;
            }
        }

        public interface d<V> {
            ClosingFuture<V> a(v vVar, w wVar) throws Exception;
        }

        public interface e<V> {
            @b1
            V a(v vVar, w wVar) throws Exception;
        }

        private q(boolean z10, Iterable<? extends ClosingFuture<?>> iterable) {
            this.f59232a = new CloseableList(null);
            this.f59233b = z10;
            this.f59234c = ImmutableList.u(iterable);
            Iterator<? extends ClosingFuture<?>> it = iterable.iterator();
            while (it.hasNext()) {
                it.next().i(this.f59232a);
            }
        }

        /* synthetic */ q(boolean z10, Iterable iterable, d dVar) {
            this(z10, iterable);
        }

        private j0.e<Object> d() {
            return this.f59233b ? j0.B(e()) : j0.z(e());
        }

        private ImmutableList<com.google.common.util.concurrent.y<?>> e() {
            return com.google.common.collect.f0.y(this.f59234c).V(f59231d).N();
        }

        public <V> ClosingFuture<V> b(e<V> eVar, Executor executor) {
            ClosingFuture<V> closingFuture = new ClosingFuture<>(d().a(new a(eVar), executor), (d) null);
            ((ClosingFuture) closingFuture).f59206b.b(this.f59232a, y0.c());
            return closingFuture;
        }

        public <V> ClosingFuture<V> c(d<V> dVar, Executor executor) {
            ClosingFuture<V> closingFuture = new ClosingFuture<>(d().b(new b(dVar), executor), (d) null);
            ((ClosingFuture) closingFuture).f59206b.b(this.f59232a, y0.c());
            return closingFuture;
        }
    }

    public static final class r<V1, V2> extends q {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final ClosingFuture<V1> f59239e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final ClosingFuture<V2> f59240f;

        /* JADX INFO: Add missing generic type declarations: [U] */
        public class a<U> implements q.e<U> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f59241a;

            a(d dVar) {
                this.f59241a = dVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.util.concurrent.ClosingFuture.q.e
            @b1
            public U a(v vVar, w wVar) throws Exception {
                return (U) this.f59241a.a(vVar, wVar.e(r.this.f59239e), wVar.e(r.this.f59240f));
            }

            public String toString() {
                return this.f59241a.toString();
            }
        }

        /* JADX INFO: Add missing generic type declarations: [U] */
        public class b<U> implements q.d<U> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ c f59243a;

            b(c cVar) {
                this.f59243a = cVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.util.concurrent.ClosingFuture.q.d
            public ClosingFuture<U> a(v vVar, w wVar) throws Exception {
                return this.f59243a.a(vVar, wVar.e(r.this.f59239e), wVar.e(r.this.f59240f));
            }

            public String toString() {
                return this.f59243a.toString();
            }
        }

        public interface c<V1, V2, U> {
            ClosingFuture<U> a(v vVar, @b1 V1 v10, @b1 V2 v11) throws Exception;
        }

        public interface d<V1, V2, U> {
            @b1
            U a(v vVar, @b1 V1 v10, @b1 V2 v11) throws Exception;
        }

        private r(ClosingFuture<V1> closingFuture, ClosingFuture<V2> closingFuture2) {
            super(true, ImmutableList.E(closingFuture, closingFuture2), null);
            this.f59239e = closingFuture;
            this.f59240f = closingFuture2;
        }

        /* synthetic */ r(ClosingFuture closingFuture, ClosingFuture closingFuture2, d dVar) {
            this(closingFuture, closingFuture2);
        }

        public <U> ClosingFuture<U> h(d<V1, V2, U> dVar, Executor executor) {
            return b(new a(dVar), executor);
        }

        public <U> ClosingFuture<U> i(c<V1, V2, U> cVar, Executor executor) {
            return c(new b(cVar), executor);
        }
    }

    public static final class s<V1, V2, V3> extends q {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final ClosingFuture<V1> f59245e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final ClosingFuture<V2> f59246f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final ClosingFuture<V3> f59247g;

        /* JADX INFO: Add missing generic type declarations: [U] */
        public class a<U> implements q.e<U> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f59248a;

            a(d dVar) {
                this.f59248a = dVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.util.concurrent.ClosingFuture.q.e
            @b1
            public U a(v vVar, w wVar) throws Exception {
                return (U) this.f59248a.a(vVar, wVar.e(s.this.f59245e), wVar.e(s.this.f59246f), wVar.e(s.this.f59247g));
            }

            public String toString() {
                return this.f59248a.toString();
            }
        }

        /* JADX INFO: Add missing generic type declarations: [U] */
        public class b<U> implements q.d<U> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ c f59250a;

            b(c cVar) {
                this.f59250a = cVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.util.concurrent.ClosingFuture.q.d
            public ClosingFuture<U> a(v vVar, w wVar) throws Exception {
                return this.f59250a.a(vVar, wVar.e(s.this.f59245e), wVar.e(s.this.f59246f), wVar.e(s.this.f59247g));
            }

            public String toString() {
                return this.f59250a.toString();
            }
        }

        public interface c<V1, V2, V3, U> {
            ClosingFuture<U> a(v vVar, @b1 V1 v10, @b1 V2 v11, @b1 V3 v12) throws Exception;
        }

        public interface d<V1, V2, V3, U> {
            @b1
            U a(v vVar, @b1 V1 v10, @b1 V2 v11, @b1 V3 v12) throws Exception;
        }

        private s(ClosingFuture<V1> closingFuture, ClosingFuture<V2> closingFuture2, ClosingFuture<V3> closingFuture3) {
            super(true, ImmutableList.F(closingFuture, closingFuture2, closingFuture3), null);
            this.f59245e = closingFuture;
            this.f59246f = closingFuture2;
            this.f59247g = closingFuture3;
        }

        /* synthetic */ s(ClosingFuture closingFuture, ClosingFuture closingFuture2, ClosingFuture closingFuture3, d dVar) {
            this(closingFuture, closingFuture2, closingFuture3);
        }

        public <U> ClosingFuture<U> i(d<V1, V2, V3, U> dVar, Executor executor) {
            return b(new a(dVar), executor);
        }

        public <U> ClosingFuture<U> j(c<V1, V2, V3, U> cVar, Executor executor) {
            return c(new b(cVar), executor);
        }
    }

    public static final class t<V1, V2, V3, V4> extends q {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final ClosingFuture<V1> f59252e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final ClosingFuture<V2> f59253f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final ClosingFuture<V3> f59254g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final ClosingFuture<V4> f59255h;

        /* JADX INFO: Add missing generic type declarations: [U] */
        public class a<U> implements q.e<U> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f59256a;

            a(d dVar) {
                this.f59256a = dVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.util.concurrent.ClosingFuture.q.e
            @b1
            public U a(v vVar, w wVar) throws Exception {
                return (U) this.f59256a.a(vVar, wVar.e(t.this.f59252e), wVar.e(t.this.f59253f), wVar.e(t.this.f59254g), wVar.e(t.this.f59255h));
            }

            public String toString() {
                return this.f59256a.toString();
            }
        }

        /* JADX INFO: Add missing generic type declarations: [U] */
        public class b<U> implements q.d<U> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ c f59258a;

            b(c cVar) {
                this.f59258a = cVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.util.concurrent.ClosingFuture.q.d
            public ClosingFuture<U> a(v vVar, w wVar) throws Exception {
                return this.f59258a.a(vVar, wVar.e(t.this.f59252e), wVar.e(t.this.f59253f), wVar.e(t.this.f59254g), wVar.e(t.this.f59255h));
            }

            public String toString() {
                return this.f59258a.toString();
            }
        }

        public interface c<V1, V2, V3, V4, U> {
            ClosingFuture<U> a(v vVar, @b1 V1 v10, @b1 V2 v11, @b1 V3 v12, @b1 V4 v13) throws Exception;
        }

        public interface d<V1, V2, V3, V4, U> {
            @b1
            U a(v vVar, @b1 V1 v10, @b1 V2 v11, @b1 V3 v12, @b1 V4 v13) throws Exception;
        }

        private t(ClosingFuture<V1> closingFuture, ClosingFuture<V2> closingFuture2, ClosingFuture<V3> closingFuture3, ClosingFuture<V4> closingFuture4) {
            super(true, ImmutableList.G(closingFuture, closingFuture2, closingFuture3, closingFuture4), null);
            this.f59252e = closingFuture;
            this.f59253f = closingFuture2;
            this.f59254g = closingFuture3;
            this.f59255h = closingFuture4;
        }

        /* synthetic */ t(ClosingFuture closingFuture, ClosingFuture closingFuture2, ClosingFuture closingFuture3, ClosingFuture closingFuture4, d dVar) {
            this(closingFuture, closingFuture2, closingFuture3, closingFuture4);
        }

        public <U> ClosingFuture<U> j(d<V1, V2, V3, V4, U> dVar, Executor executor) {
            return b(new a(dVar), executor);
        }

        public <U> ClosingFuture<U> k(c<V1, V2, V3, V4, U> cVar, Executor executor) {
            return c(new b(cVar), executor);
        }
    }

    public static final class u<V1, V2, V3, V4, V5> extends q {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final ClosingFuture<V1> f59260e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final ClosingFuture<V2> f59261f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final ClosingFuture<V3> f59262g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final ClosingFuture<V4> f59263h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final ClosingFuture<V5> f59264i;

        /* JADX INFO: Add missing generic type declarations: [U] */
        public class a<U> implements q.e<U> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f59265a;

            a(d dVar) {
                this.f59265a = dVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.util.concurrent.ClosingFuture.q.e
            @b1
            public U a(v vVar, w wVar) throws Exception {
                return (U) this.f59265a.a(vVar, wVar.e(u.this.f59260e), wVar.e(u.this.f59261f), wVar.e(u.this.f59262g), wVar.e(u.this.f59263h), wVar.e(u.this.f59264i));
            }

            public String toString() {
                return this.f59265a.toString();
            }
        }

        /* JADX INFO: Add missing generic type declarations: [U] */
        public class b<U> implements q.d<U> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ c f59267a;

            b(c cVar) {
                this.f59267a = cVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.util.concurrent.ClosingFuture.q.d
            public ClosingFuture<U> a(v vVar, w wVar) throws Exception {
                return this.f59267a.a(vVar, wVar.e(u.this.f59260e), wVar.e(u.this.f59261f), wVar.e(u.this.f59262g), wVar.e(u.this.f59263h), wVar.e(u.this.f59264i));
            }

            public String toString() {
                return this.f59267a.toString();
            }
        }

        public interface c<V1, V2, V3, V4, V5, U> {
            ClosingFuture<U> a(v vVar, @b1 V1 v10, @b1 V2 v11, @b1 V3 v12, @b1 V4 v13, @b1 V5 v14) throws Exception;
        }

        public interface d<V1, V2, V3, V4, V5, U> {
            @b1
            U a(v vVar, @b1 V1 v10, @b1 V2 v11, @b1 V3 v12, @b1 V4 v13, @b1 V5 v14) throws Exception;
        }

        private u(ClosingFuture<V1> closingFuture, ClosingFuture<V2> closingFuture2, ClosingFuture<V3> closingFuture3, ClosingFuture<V4> closingFuture4, ClosingFuture<V5> closingFuture5) {
            super(true, ImmutableList.H(closingFuture, closingFuture2, closingFuture3, closingFuture4, closingFuture5), null);
            this.f59260e = closingFuture;
            this.f59261f = closingFuture2;
            this.f59262g = closingFuture3;
            this.f59263h = closingFuture4;
            this.f59264i = closingFuture5;
        }

        /* synthetic */ u(ClosingFuture closingFuture, ClosingFuture closingFuture2, ClosingFuture closingFuture3, ClosingFuture closingFuture4, ClosingFuture closingFuture5, d dVar) {
            this(closingFuture, closingFuture2, closingFuture3, closingFuture4, closingFuture5);
        }

        public <U> ClosingFuture<U> k(d<V1, V2, V3, V4, V5, U> dVar, Executor executor) {
            return b(new a(dVar), executor);
        }

        public <U> ClosingFuture<U> l(c<V1, V2, V3, V4, V5, U> cVar, Executor executor) {
            return c(new b(cVar), executor);
        }
    }

    public static final class v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @u9.f
        private final CloseableList f59269a;

        v(CloseableList closeableList) {
            this.f59269a = closeableList;
        }

        @s9.a
        @b1
        public <C extends Closeable> C a(@b1 C c10, Executor executor) {
            com.google.common.base.w.E(executor);
            if (c10 != null) {
                this.f59269a.b(c10, executor);
            }
            return c10;
        }
    }

    public static final class w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ImmutableList<ClosingFuture<?>> f59270a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile boolean f59271b;

        private w(ImmutableList<ClosingFuture<?>> immutableList) {
            this.f59270a = (ImmutableList) com.google.common.base.w.E(immutableList);
        }

        /* synthetic */ w(ImmutableList immutableList, d dVar) {
            this(immutableList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @b1
        public <V> V c(q.e<V> eVar, CloseableList closeableList) throws Exception {
            this.f59271b = true;
            CloseableList closeableList2 = new CloseableList(null);
            try {
                return eVar.a(closeableList2.f59208b, this);
            } finally {
                closeableList.b(closeableList2, y0.c());
                this.f59271b = false;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public <V> com.google.common.util.concurrent.y<V> d(q.d<V> dVar, CloseableList closeableList) throws Exception {
            this.f59271b = true;
            CloseableList closeableList2 = new CloseableList(null);
            try {
                ClosingFuture<V> closingFutureA = dVar.a(closeableList2.f59208b, this);
                closingFutureA.i(closeableList);
                return ((ClosingFuture) closingFutureA).f59207c;
            } finally {
                closeableList.b(closeableList2, y0.c());
                this.f59271b = false;
            }
        }

        @b1
        public final <D> D e(ClosingFuture<D> closingFuture) throws ExecutionException {
            com.google.common.base.w.g0(this.f59271b);
            com.google.common.base.w.d(this.f59270a.contains(closingFuture));
            return (D) j0.h(((ClosingFuture) closingFuture).f59207c);
        }
    }

    public static final class x<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ClosingFuture<? extends V> f59272a;

        x(ClosingFuture<? extends V> closingFuture) {
            this.f59272a = (ClosingFuture) com.google.common.base.w.E(closingFuture);
        }

        public void a() {
            this.f59272a.p();
        }

        @b1
        public V b() throws ExecutionException {
            return (V) j0.h(((ClosingFuture) this.f59272a).f59207c);
        }
    }

    public interface y<V> {
        void a(x<V> xVar);
    }

    private ClosingFuture(m<V> mVar, Executor executor) {
        this.f59205a = new AtomicReference<>(State.OPEN);
        this.f59206b = new CloseableList(null);
        com.google.common.base.w.E(mVar);
        TrustedListenableFutureTask trustedListenableFutureTaskN = TrustedListenableFutureTask.N(new f(mVar));
        executor.execute(trustedListenableFutureTaskN);
        this.f59207c = trustedListenableFutureTaskN;
    }

    private ClosingFuture(o<V> oVar, Executor executor) {
        this.f59205a = new AtomicReference<>(State.OPEN);
        this.f59206b = new CloseableList(null);
        com.google.common.base.w.E(oVar);
        TrustedListenableFutureTask trustedListenableFutureTaskP = TrustedListenableFutureTask.P(new e(oVar));
        executor.execute(trustedListenableFutureTaskP);
        this.f59207c = trustedListenableFutureTaskP;
    }

    private ClosingFuture(p0<V> p0Var) {
        this.f59205a = new AtomicReference<>(State.OPEN);
        this.f59206b = new CloseableList(null);
        this.f59207c = com.google.common.util.concurrent.y.J(p0Var);
    }

    /* synthetic */ ClosingFuture(p0 p0Var, d dVar) {
        this(p0Var);
    }

    public static <V> ClosingFuture<V> A(m<V> mVar, Executor executor) {
        return new ClosingFuture<>(mVar, executor);
    }

    public static q D(ClosingFuture<?> closingFuture, ClosingFuture<?>... closingFutureArr) {
        return E(Lists.c(closingFuture, closingFutureArr));
    }

    public static q E(Iterable<? extends ClosingFuture<?>> iterable) {
        return new q(false, iterable, null);
    }

    public static <V1, V2> r<V1, V2> F(ClosingFuture<V1> closingFuture, ClosingFuture<V2> closingFuture2) {
        return new r<>(closingFuture, closingFuture2, null);
    }

    public static <V1, V2, V3> s<V1, V2, V3> G(ClosingFuture<V1> closingFuture, ClosingFuture<V2> closingFuture2, ClosingFuture<V3> closingFuture3) {
        return new s<>(closingFuture, closingFuture2, closingFuture3, null);
    }

    public static <V1, V2, V3, V4> t<V1, V2, V3, V4> H(ClosingFuture<V1> closingFuture, ClosingFuture<V2> closingFuture2, ClosingFuture<V3> closingFuture3, ClosingFuture<V4> closingFuture4) {
        return new t<>(closingFuture, closingFuture2, closingFuture3, closingFuture4, null);
    }

    public static <V1, V2, V3, V4, V5> u<V1, V2, V3, V4, V5> I(ClosingFuture<V1> closingFuture, ClosingFuture<V2> closingFuture2, ClosingFuture<V3> closingFuture3, ClosingFuture<V4> closingFuture4, ClosingFuture<V5> closingFuture5) {
        return new u<>(closingFuture, closingFuture2, closingFuture3, closingFuture4, closingFuture5, null);
    }

    public static q J(ClosingFuture<?> closingFuture, ClosingFuture<?> closingFuture2, ClosingFuture<?> closingFuture3, ClosingFuture<?> closingFuture4, ClosingFuture<?> closingFuture5, ClosingFuture<?> closingFuture6, ClosingFuture<?>... closingFutureArr) {
        return K(com.google.common.collect.f0.I(closingFuture, closingFuture2, closingFuture3, closingFuture4, closingFuture5, closingFuture6).g(closingFutureArr));
    }

    public static q K(Iterable<? extends ClosingFuture<?>> iterable) {
        return new q(true, iterable, null);
    }

    public static <V, U> n<V, U> M(com.google.common.util.concurrent.m<V, U> mVar) {
        com.google.common.base.w.E(mVar);
        return new i(mVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(CloseableList closeableList) {
        o(State.OPEN, State.SUBSUMED);
        closeableList.b(this.f59206b, y0.c());
    }

    private <X extends Throwable, W extends V> ClosingFuture<V> m(Class<X> cls, n<? super X, W> nVar, Executor executor) {
        com.google.common.base.w.E(nVar);
        return (ClosingFuture<V>) s(this.f59207c.H(cls, new k(nVar), executor));
    }

    private <X extends Throwable, W extends V> ClosingFuture<V> n(Class<X> cls, p<? super X, W> pVar, Executor executor) {
        com.google.common.base.w.E(pVar);
        return (ClosingFuture<V>) s(this.f59207c.H(cls, new j(pVar), executor));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(State state, State state2) {
        com.google.common.base.w.B0(r(state, state2), "Expected state to be %s, but it was %s", state, state2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        f59204d.log(Level.FINER, "closing {0}", this);
        this.f59206b.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void q(@CheckForNull Closeable closeable, Executor executor) {
        if (closeable == null) {
            return;
        }
        try {
            executor.execute(new b(closeable));
        } catch (RejectedExecutionException e10) {
            Logger logger = f59204d;
            Level level = Level.WARNING;
            if (logger.isLoggable(level)) {
                logger.log(level, String.format("while submitting close to %s; will close inline", executor), (Throwable) e10);
            }
            q(closeable, y0.c());
        }
    }

    private boolean r(State state, State state2) {
        return androidx.compose.animation.core.s0.a(this.f59205a, state, state2);
    }

    private <U> ClosingFuture<U> s(com.google.common.util.concurrent.y<U> yVar) {
        ClosingFuture<U> closingFuture = new ClosingFuture<>(yVar);
        i(closingFuture.f59206b);
        return closingFuture;
    }

    @Deprecated
    public static <C extends Closeable> ClosingFuture<C> t(p0<C> p0Var, Executor executor) {
        com.google.common.base.w.E(executor);
        ClosingFuture<C> closingFuture = new ClosingFuture<>(j0.q(p0Var));
        j0.a(p0Var, new d(executor), y0.c());
        return closingFuture;
    }

    public static <V> ClosingFuture<V> w(p0<V> p0Var) {
        return new ClosingFuture<>(p0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <C, V extends C> void x(y<C> yVar, ClosingFuture<V> closingFuture) {
        yVar.a(new x<>(closingFuture));
    }

    public static <V> ClosingFuture<V> z(o<V> oVar, Executor executor) {
        return new ClosingFuture<>(oVar, executor);
    }

    public <U> ClosingFuture<U> B(p<? super V, U> pVar, Executor executor) {
        com.google.common.base.w.E(pVar);
        return s(this.f59207c.L(new g(pVar), executor));
    }

    public <U> ClosingFuture<U> C(n<? super V, U> nVar, Executor executor) {
        com.google.common.base.w.E(nVar);
        return s(this.f59207c.L(new h(nVar), executor));
    }

    @o9.d
    CountDownLatch L() {
        return this.f59206b.e();
    }

    protected void finalize() {
        if (this.f59205a.get().equals(State.OPEN)) {
            f59204d.log(Level.SEVERE, "Uh oh! An open ClosingFuture has leaked and will close: {0}", this);
            u();
        }
    }

    @s9.a
    public boolean j(boolean z10) {
        f59204d.log(Level.FINER, "cancelling {0}", this);
        boolean zCancel = this.f59207c.cancel(z10);
        if (zCancel) {
            p();
        }
        return zCancel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <X extends Throwable> ClosingFuture<V> k(Class<X> cls, p<? super X, ? extends V> pVar, Executor executor) {
        return n(cls, pVar, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <X extends Throwable> ClosingFuture<V> l(Class<X> cls, n<? super X, ? extends V> nVar, Executor executor) {
        return m(cls, nVar, executor);
    }

    public String toString() {
        return com.google.common.base.q.c(this).f("state", this.f59205a.get()).s(this.f59207c).toString();
    }

    public com.google.common.util.concurrent.y<V> u() {
        if (!r(State.OPEN, State.WILL_CLOSE)) {
            switch (c.f59214a[this.f59205a.get().ordinal()]) {
                case 1:
                    throw new IllegalStateException("Cannot call finishToFuture() after deriving another step");
                case 2:
                    throw new IllegalStateException("Cannot call finishToFuture() after calling finishToValueAndCloser()");
                case 3:
                case 4:
                case 5:
                    throw new IllegalStateException("Cannot call finishToFuture() twice");
                case 6:
                    throw new AssertionError();
            }
        }
        f59204d.log(Level.FINER, "will close {0}", this);
        this.f59207c.V(new l(), y0.c());
        return this.f59207c;
    }

    public void v(y<? super V> yVar, Executor executor) {
        com.google.common.base.w.E(yVar);
        if (r(State.OPEN, State.WILL_CREATE_VALUE_AND_CLOSER)) {
            this.f59207c.V(new a(yVar), executor);
            return;
        }
        int i10 = c.f59214a[this.f59205a.get().ordinal()];
        if (i10 == 1) {
            throw new IllegalStateException("Cannot call finishToValueAndCloser() after deriving another step");
        }
        if (i10 == 2) {
            throw new IllegalStateException("Cannot call finishToValueAndCloser() twice");
        }
        if (i10 != 3 && i10 != 4 && i10 != 5) {
            throw new AssertionError(this.f59205a);
        }
        throw new IllegalStateException("Cannot call finishToValueAndCloser() after calling finishToFuture()");
    }

    public p0<?> y() {
        return j0.q(this.f59207c.K(Functions.b(null), y0.c()));
    }
}
