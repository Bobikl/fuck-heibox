package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableTakeLastTimed<T> extends a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f122590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final long f122591d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final TimeUnit f122592e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final io.reactivex.h0 f122593f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f122594g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final boolean f122595h;

    public static final class TakeLastTimedObserver<T> extends AtomicBoolean implements io.reactivex.g0<T>, io.reactivex.disposables.b {
        private static final long serialVersionUID = -5677354903406201275L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super T> f122596b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f122597c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final long f122598d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final TimeUnit f122599e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final io.reactivex.h0 f122600f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final io.reactivex.internal.queue.a<Object> f122601g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final boolean f122602h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        io.reactivex.disposables.b f122603i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        volatile boolean f122604j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Throwable f122605k;

        TakeLastTimedObserver(io.reactivex.g0<? super T> g0Var, long j10, long j11, TimeUnit timeUnit, io.reactivex.h0 h0Var, int i10, boolean z10) {
            this.f122596b = g0Var;
            this.f122597c = j10;
            this.f122598d = j11;
            this.f122599e = timeUnit;
            this.f122600f = h0Var;
            this.f122601g = new io.reactivex.internal.queue.a<>(i10);
            this.f122602h = z10;
        }

        void a() {
            Throwable th2;
            if (compareAndSet(false, true)) {
                io.reactivex.g0<? super T> g0Var = this.f122596b;
                io.reactivex.internal.queue.a<Object> aVar = this.f122601g;
                boolean z10 = this.f122602h;
                while (!this.f122604j) {
                    if (!z10 && (th2 = this.f122605k) != null) {
                        aVar.clear();
                        g0Var.onError(th2);
                        return;
                    }
                    Object objPoll = aVar.poll();
                    if (objPoll == null) {
                        Throwable th3 = this.f122605k;
                        if (th3 != null) {
                            g0Var.onError(th3);
                            return;
                        } else {
                            g0Var.onComplete();
                            return;
                        }
                    }
                    Object objPoll2 = aVar.poll();
                    if (((Long) objPoll).longValue() >= this.f122600f.d(this.f122599e) - this.f122598d) {
                        g0Var.onNext(objPoll2);
                    }
                }
                aVar.clear();
            }
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (this.f122604j) {
                return;
            }
            this.f122604j = true;
            this.f122603i.dispose();
            if (compareAndSet(false, true)) {
                this.f122601g.clear();
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f122604j;
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            a();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            this.f122605k = th2;
            a();
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            io.reactivex.internal.queue.a<Object> aVar = this.f122601g;
            long jD = this.f122600f.d(this.f122599e);
            long j10 = this.f122598d;
            long j11 = this.f122597c;
            boolean z10 = j11 == Long.MAX_VALUE;
            aVar.offer(Long.valueOf(jD), t10);
            while (!aVar.isEmpty()) {
                if (((Long) aVar.peek()).longValue() > jD - j10 && (z10 || (aVar.p() >> 1) <= j11)) {
                    return;
                }
                aVar.poll();
                aVar.poll();
            }
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f122603i, bVar)) {
                this.f122603i = bVar;
                this.f122596b.onSubscribe(this);
            }
        }
    }

    public ObservableTakeLastTimed(io.reactivex.e0<T> e0Var, long j10, long j11, TimeUnit timeUnit, io.reactivex.h0 h0Var, int i10, boolean z10) {
        super(e0Var);
        this.f122590c = j10;
        this.f122591d = j11;
        this.f122592e = timeUnit;
        this.f122593f = h0Var;
        this.f122594g = i10;
        this.f122595h = z10;
    }

    @Override // io.reactivex.z
    public void H5(io.reactivex.g0<? super T> g0Var) {
        this.f122785b.g(new TakeLastTimedObserver(g0Var, this.f122590c, this.f122591d, this.f122592e, this.f122593f, this.f122594g, this.f122595h));
    }
}
