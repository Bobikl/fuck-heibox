package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableSkipLastTimed<T> extends a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f122546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final TimeUnit f122547d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final io.reactivex.h0 f122548e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int f122549f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final boolean f122550g;

    public static final class SkipLastTimedObserver<T> extends AtomicInteger implements io.reactivex.g0<T>, io.reactivex.disposables.b {
        private static final long serialVersionUID = -5677354903406201275L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super T> f122551b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f122552c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final TimeUnit f122553d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final io.reactivex.h0 f122554e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final io.reactivex.internal.queue.a<Object> f122555f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final boolean f122556g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        io.reactivex.disposables.b f122557h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        volatile boolean f122558i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        volatile boolean f122559j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Throwable f122560k;

        SkipLastTimedObserver(io.reactivex.g0<? super T> g0Var, long j10, TimeUnit timeUnit, io.reactivex.h0 h0Var, int i10, boolean z10) {
            this.f122551b = g0Var;
            this.f122552c = j10;
            this.f122553d = timeUnit;
            this.f122554e = h0Var;
            this.f122555f = new io.reactivex.internal.queue.a<>(i10);
            this.f122556g = z10;
        }

        void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.g0<? super T> g0Var = this.f122551b;
            io.reactivex.internal.queue.a<Object> aVar = this.f122555f;
            boolean z10 = this.f122556g;
            TimeUnit timeUnit = this.f122553d;
            io.reactivex.h0 h0Var = this.f122554e;
            long j10 = this.f122552c;
            int iAddAndGet = 1;
            while (!this.f122558i) {
                boolean z11 = this.f122559j;
                Long l10 = (Long) aVar.peek();
                boolean z12 = l10 == null;
                long jD = h0Var.d(timeUnit);
                if (!z12 && l10.longValue() > jD - j10) {
                    z12 = true;
                }
                if (z11) {
                    if (!z10) {
                        Throwable th2 = this.f122560k;
                        if (th2 != null) {
                            this.f122555f.clear();
                            g0Var.onError(th2);
                            return;
                        } else if (z12) {
                            g0Var.onComplete();
                            return;
                        }
                    } else if (z12) {
                        Throwable th3 = this.f122560k;
                        if (th3 != null) {
                            g0Var.onError(th3);
                            return;
                        } else {
                            g0Var.onComplete();
                            return;
                        }
                    }
                }
                if (z12) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    aVar.poll();
                    g0Var.onNext(aVar.poll());
                }
            }
            this.f122555f.clear();
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (this.f122558i) {
                return;
            }
            this.f122558i = true;
            this.f122557h.dispose();
            if (getAndIncrement() == 0) {
                this.f122555f.clear();
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f122558i;
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            this.f122559j = true;
            a();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            this.f122560k = th2;
            this.f122559j = true;
            a();
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            this.f122555f.offer(Long.valueOf(this.f122554e.d(this.f122553d)), t10);
            a();
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f122557h, bVar)) {
                this.f122557h = bVar;
                this.f122551b.onSubscribe(this);
            }
        }
    }

    public ObservableSkipLastTimed(io.reactivex.e0<T> e0Var, long j10, TimeUnit timeUnit, io.reactivex.h0 h0Var, int i10, boolean z10) {
        super(e0Var);
        this.f122546c = j10;
        this.f122547d = timeUnit;
        this.f122548e = h0Var;
        this.f122549f = i10;
        this.f122550g = z10;
    }

    @Override // io.reactivex.z
    public void H5(io.reactivex.g0<? super T> g0Var) {
        this.f122785b.g(new SkipLastTimedObserver(g0Var, this.f122546c, this.f122547d, this.f122548e, this.f122549f, this.f122550g));
    }
}
