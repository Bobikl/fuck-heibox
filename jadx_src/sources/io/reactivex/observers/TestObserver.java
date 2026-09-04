package io.reactivex.observers;

import androidx.compose.animation.core.s0;
import io.reactivex.g0;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.l0;
import io.reactivex.t;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public class TestObserver<T> extends BaseTestConsumer<T, TestObserver<T>> implements g0<T>, io.reactivex.disposables.b, t<T>, l0<T>, io.reactivex.d {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final g0<? super T> f123898l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final AtomicReference<io.reactivex.disposables.b> f123899m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private lh.j<T> f123900n;

    public enum EmptyObserver implements g0<Object> {
        INSTANCE;

        @Override // io.reactivex.g0
        public void onComplete() {
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
        }

        @Override // io.reactivex.g0
        public void onNext(Object obj) {
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
        }
    }

    public TestObserver() {
        this(EmptyObserver.INSTANCE);
    }

    public TestObserver(g0<? super T> g0Var) {
        this.f123899m = new AtomicReference<>();
        this.f123898l = g0Var;
    }

    public static <T> TestObserver<T> k0() {
        return new TestObserver<>();
    }

    public static <T> TestObserver<T> l0(g0<? super T> g0Var) {
        return new TestObserver<>(g0Var);
    }

    static String m0(int i10) {
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

    public final void cancel() {
        dispose();
    }

    @Override // io.reactivex.disposables.b
    public final void dispose() {
        DisposableHelper.dispose(this.f123899m);
    }

    final TestObserver<T> e0() {
        if (this.f123900n != null) {
            return this;
        }
        throw new AssertionError("Upstream is not fuseable.");
    }

    final TestObserver<T> f0(int i10) {
        int i11 = this.f123895i;
        if (i11 == i10) {
            return this;
        }
        if (this.f123900n == null) {
            throw V("Upstream is not fuseable");
        }
        throw new AssertionError("Fusion mode different. Expected: " + m0(i10) + ", actual: " + m0(i11));
    }

    final TestObserver<T> g0() {
        if (this.f123900n == null) {
            return this;
        }
        throw new AssertionError("Upstream is fuseable.");
    }

    @Override // io.reactivex.observers.BaseTestConsumer
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public final TestObserver<T> s() {
        if (this.f123899m.get() != null) {
            throw V("Subscribed!");
        }
        if (this.f123890d.isEmpty()) {
            return this;
        }
        throw V("Not subscribed but errors found");
    }

    public final TestObserver<T> i0(kh.g<? super TestObserver<T>> gVar) {
        try {
            gVar.accept(this);
            return this;
        } catch (Throwable th2) {
            throw ExceptionHelper.f(th2);
        }
    }

    @Override // io.reactivex.disposables.b
    public final boolean isDisposed() {
        return DisposableHelper.isDisposed(this.f123899m.get());
    }

    @Override // io.reactivex.observers.BaseTestConsumer
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public final TestObserver<T> v() {
        if (this.f123899m.get() != null) {
            return this;
        }
        throw V("Not subscribed!");
    }

    public final boolean n0() {
        return this.f123899m.get() != null;
    }

    public final boolean o0() {
        return isDisposed();
    }

    @Override // io.reactivex.g0
    public void onComplete() {
        if (!this.f123893g) {
            this.f123893g = true;
            if (this.f123899m.get() == null) {
                this.f123890d.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.f123892f = Thread.currentThread();
            this.f123891e++;
            this.f123898l.onComplete();
        } finally {
            this.f123888b.countDown();
        }
    }

    @Override // io.reactivex.g0
    public void onError(Throwable th2) {
        if (!this.f123893g) {
            this.f123893g = true;
            if (this.f123899m.get() == null) {
                this.f123890d.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.f123892f = Thread.currentThread();
            if (th2 == null) {
                this.f123890d.add(new NullPointerException("onError received a null Throwable"));
            } else {
                this.f123890d.add(th2);
            }
            this.f123898l.onError(th2);
        } finally {
            this.f123888b.countDown();
        }
    }

    @Override // io.reactivex.g0
    public void onNext(T t10) {
        if (!this.f123893g) {
            this.f123893g = true;
            if (this.f123899m.get() == null) {
                this.f123890d.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        this.f123892f = Thread.currentThread();
        if (this.f123895i != 2) {
            this.f123889c.add(t10);
            if (t10 == null) {
                this.f123890d.add(new NullPointerException("onNext received a null value"));
            }
            this.f123898l.onNext(t10);
            return;
        }
        while (true) {
            try {
                T tPoll = this.f123900n.poll();
                if (tPoll == null) {
                    return;
                } else {
                    this.f123889c.add(tPoll);
                }
            } catch (Throwable th2) {
                this.f123890d.add(th2);
                this.f123900n.dispose();
                return;
            }
        }
    }

    @Override // io.reactivex.g0
    public void onSubscribe(io.reactivex.disposables.b bVar) {
        this.f123892f = Thread.currentThread();
        if (bVar == null) {
            this.f123890d.add(new NullPointerException("onSubscribe received a null Subscription"));
            return;
        }
        if (!s0.a(this.f123899m, null, bVar)) {
            bVar.dispose();
            if (this.f123899m.get() != DisposableHelper.DISPOSED) {
                this.f123890d.add(new IllegalStateException("onSubscribe received multiple subscriptions: " + bVar));
                return;
            }
            return;
        }
        int i10 = this.f123894h;
        if (i10 != 0 && (bVar instanceof lh.j)) {
            lh.j<T> jVar = (lh.j) bVar;
            this.f123900n = jVar;
            int iRequestFusion = jVar.requestFusion(i10);
            this.f123895i = iRequestFusion;
            if (iRequestFusion == 1) {
                this.f123893g = true;
                this.f123892f = Thread.currentThread();
                while (true) {
                    try {
                        T tPoll = this.f123900n.poll();
                        if (tPoll == null) {
                            this.f123891e++;
                            this.f123899m.lazySet(DisposableHelper.DISPOSED);
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
        this.f123898l.onSubscribe(bVar);
    }

    @Override // io.reactivex.t
    public void onSuccess(T t10) {
        onNext(t10);
        onComplete();
    }

    final TestObserver<T> p0(int i10) {
        this.f123894h = i10;
        return this;
    }
}
