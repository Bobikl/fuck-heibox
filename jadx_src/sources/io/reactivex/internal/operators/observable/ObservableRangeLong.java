package io.reactivex.internal.operators.observable;

import io.reactivex.internal.observers.BasicIntQueueDisposable;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableRangeLong extends io.reactivex.z<Long> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f122378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f122379c;

    public static final class RangeDisposable extends BasicIntQueueDisposable<Long> {
        private static final long serialVersionUID = 396518478098735504L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super Long> f122380b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f122381c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f122382d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f122383e;

        RangeDisposable(io.reactivex.g0<? super Long> g0Var, long j10, long j11) {
            this.f122380b = g0Var;
            this.f122382d = j10;
            this.f122381c = j11;
        }

        @Override // lh.o
        @jh.f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long poll() throws Exception {
            long j10 = this.f122382d;
            if (j10 != this.f122381c) {
                this.f122382d = 1 + j10;
                return Long.valueOf(j10);
            }
            lazySet(1);
            return null;
        }

        @Override // lh.o
        public void clear() {
            this.f122382d = this.f122381c;
            lazySet(1);
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            set(1);
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return get() != 0;
        }

        @Override // lh.o
        public boolean isEmpty() {
            return this.f122382d == this.f122381c;
        }

        @Override // lh.k
        public int requestFusion(int i10) {
            if ((i10 & 1) == 0) {
                return 0;
            }
            this.f122383e = true;
            return 1;
        }

        void run() {
            if (this.f122383e) {
                return;
            }
            io.reactivex.g0<? super Long> g0Var = this.f122380b;
            long j10 = this.f122381c;
            for (long j11 = this.f122382d; j11 != j10 && get() == 0; j11++) {
                g0Var.onNext(Long.valueOf(j11));
            }
            if (get() == 0) {
                lazySet(1);
                g0Var.onComplete();
            }
        }
    }

    public ObservableRangeLong(long j10, long j11) {
        this.f122378b = j10;
        this.f122379c = j11;
    }

    @Override // io.reactivex.z
    protected void H5(io.reactivex.g0<? super Long> g0Var) {
        long j10 = this.f122378b;
        RangeDisposable rangeDisposable = new RangeDisposable(g0Var, j10, j10 + this.f122379c);
        g0Var.onSubscribe(rangeDisposable);
        rangeDisposable.run();
    }
}
