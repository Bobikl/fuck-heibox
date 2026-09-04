package io.reactivex.subscribers;

import androidx.compose.animation.core.s0;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.o;
import io.reactivex.observers.BaseTestConsumer;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kh.g;
import lh.l;

/* JADX INFO: loaded from: classes5.dex */
public class TestSubscriber<T> extends BaseTestConsumer<T, TestSubscriber<T>> implements o<T>, org.reactivestreams.e, io.reactivex.disposables.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final org.reactivestreams.d<? super T> f124163l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private volatile boolean f124164m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AtomicReference<org.reactivestreams.e> f124165n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final AtomicLong f124166o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private l<T> f124167p;

    public enum EmptySubscriber implements o<Object> {
        INSTANCE;

        @Override // org.reactivestreams.d
        public void onComplete() {
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
        }

        @Override // org.reactivestreams.d
        public void onNext(Object obj) {
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
        }
    }

    public TestSubscriber() {
        this(EmptySubscriber.INSTANCE, Long.MAX_VALUE);
    }

    public TestSubscriber(long j10) {
        this(EmptySubscriber.INSTANCE, j10);
    }

    public TestSubscriber(org.reactivestreams.d<? super T> dVar) {
        this(dVar, Long.MAX_VALUE);
    }

    public TestSubscriber(org.reactivestreams.d<? super T> dVar, long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException("Negative initial request not allowed");
        }
        this.f124163l = dVar;
        this.f124165n = new AtomicReference<>();
        this.f124166o = new AtomicLong(j10);
    }

    public static <T> TestSubscriber<T> k0() {
        return new TestSubscriber<>();
    }

    public static <T> TestSubscriber<T> l0(long j10) {
        return new TestSubscriber<>(j10);
    }

    public static <T> TestSubscriber<T> m0(org.reactivestreams.d<? super T> dVar) {
        return new TestSubscriber<>(dVar);
    }

    static String n0(int i10) {
        if (i10 == 0) {
            return "NONE";
        }
        if (i10 == 1) {
            return "SYNC";
        }
        if (i10 == 2) {
            return "ASYNC";
        }
        return "Unknown(" + i10 + ")";
    }

    @Override // org.reactivestreams.e
    public final void cancel() {
        if (this.f124164m) {
            return;
        }
        this.f124164m = true;
        SubscriptionHelper.cancel(this.f124165n);
    }

    @Override // io.reactivex.disposables.b
    public final void dispose() {
        cancel();
    }

    final TestSubscriber<T> e0() {
        if (this.f124167p != null) {
            return this;
        }
        throw new AssertionError("Upstream is not fuseable.");
    }

    final TestSubscriber<T> f0(int i10) {
        int i11 = this.f123895i;
        if (i11 == i10) {
            return this;
        }
        if (this.f124167p == null) {
            throw V("Upstream is not fuseable");
        }
        throw new AssertionError("Fusion mode different. Expected: " + n0(i10) + ", actual: " + n0(i11));
    }

    final TestSubscriber<T> g0() {
        if (this.f124167p == null) {
            return this;
        }
        throw new AssertionError("Upstream is fuseable.");
    }

    @Override // io.reactivex.observers.BaseTestConsumer
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public final TestSubscriber<T> s() {
        if (this.f124165n.get() != null) {
            throw V("Subscribed!");
        }
        if (this.f123890d.isEmpty()) {
            return this;
        }
        throw V("Not subscribed but errors found");
    }

    public final TestSubscriber<T> i0(g<? super TestSubscriber<T>> gVar) {
        try {
            gVar.accept(this);
            return this;
        } catch (Throwable th2) {
            throw ExceptionHelper.f(th2);
        }
    }

    @Override // io.reactivex.disposables.b
    public final boolean isDisposed() {
        return this.f124164m;
    }

    @Override // io.reactivex.observers.BaseTestConsumer
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public final TestSubscriber<T> v() {
        if (this.f124165n.get() != null) {
            return this;
        }
        throw V("Not subscribed!");
    }

    public final boolean o0() {
        return this.f124165n.get() != null;
    }

    @Override // org.reactivestreams.d
    public void onComplete() {
        if (!this.f123893g) {
            this.f123893g = true;
            if (this.f124165n.get() == null) {
                this.f123890d.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.f123892f = Thread.currentThread();
            this.f123891e++;
            this.f124163l.onComplete();
        } finally {
            this.f123888b.countDown();
        }
    }

    @Override // org.reactivestreams.d
    public void onError(Throwable th2) {
        if (!this.f123893g) {
            this.f123893g = true;
            if (this.f124165n.get() == null) {
                this.f123890d.add(new NullPointerException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.f123892f = Thread.currentThread();
            this.f123890d.add(th2);
            if (th2 == null) {
                this.f123890d.add(new IllegalStateException("onError received a null Throwable"));
            }
            this.f124163l.onError(th2);
        } finally {
            this.f123888b.countDown();
        }
    }

    @Override // org.reactivestreams.d
    public void onNext(T t10) {
        if (!this.f123893g) {
            this.f123893g = true;
            if (this.f124165n.get() == null) {
                this.f123890d.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        this.f123892f = Thread.currentThread();
        if (this.f123895i != 2) {
            this.f123889c.add(t10);
            if (t10 == null) {
                this.f123890d.add(new NullPointerException("onNext received a null value"));
            }
            this.f124163l.onNext(t10);
            return;
        }
        while (true) {
            try {
                T tPoll = this.f124167p.poll();
                if (tPoll == null) {
                    return;
                } else {
                    this.f123889c.add(tPoll);
                }
            } catch (Throwable th2) {
                this.f123890d.add(th2);
                this.f124167p.cancel();
                return;
            }
        }
    }

    @Override // io.reactivex.o, org.reactivestreams.d
    public void onSubscribe(org.reactivestreams.e eVar) {
        this.f123892f = Thread.currentThread();
        if (eVar == null) {
            this.f123890d.add(new NullPointerException("onSubscribe received a null Subscription"));
            return;
        }
        if (!s0.a(this.f124165n, null, eVar)) {
            eVar.cancel();
            if (this.f124165n.get() != SubscriptionHelper.CANCELLED) {
                this.f123890d.add(new IllegalStateException("onSubscribe received multiple subscriptions: " + eVar));
                return;
            }
            return;
        }
        int i10 = this.f123894h;
        if (i10 != 0 && (eVar instanceof l)) {
            l<T> lVar = (l) eVar;
            this.f124167p = lVar;
            int iRequestFusion = lVar.requestFusion(i10);
            this.f123895i = iRequestFusion;
            if (iRequestFusion == 1) {
                this.f123893g = true;
                this.f123892f = Thread.currentThread();
                while (true) {
                    try {
                        T tPoll = this.f124167p.poll();
                        if (tPoll == null) {
                            this.f123891e++;
                            return;
                        }
                        this.f123889c.add(tPoll);
                    } catch (Throwable th2) {
                        this.f123890d.add(th2);
                        return;
                    }
                }
            }
        }
        this.f124163l.onSubscribe(eVar);
        long andSet = this.f124166o.getAndSet(0L);
        if (andSet != 0) {
            eVar.request(andSet);
        }
        q0();
    }

    public final boolean p0() {
        return this.f124164m;
    }

    protected void q0() {
    }

    public final TestSubscriber<T> r0(long j10) {
        request(j10);
        return this;
    }

    @Override // org.reactivestreams.e
    public final void request(long j10) {
        SubscriptionHelper.deferredRequest(this.f124165n, this.f124166o, j10);
    }

    final TestSubscriber<T> s0(int i10) {
        this.f123894h = i10;
        return this;
    }
}
