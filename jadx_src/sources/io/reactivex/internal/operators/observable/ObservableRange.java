package io.reactivex.internal.operators.observable;

import io.reactivex.internal.observers.BasicIntQueueDisposable;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableRange extends io.reactivex.z<Integer> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f122372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f122373c;

    public static final class RangeDisposable extends BasicIntQueueDisposable<Integer> {
        private static final long serialVersionUID = 396518478098735504L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super Integer> f122374b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f122375c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f122376d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f122377e;

        RangeDisposable(io.reactivex.g0<? super Integer> g0Var, long j10, long j11) {
            this.f122374b = g0Var;
            this.f122376d = j10;
            this.f122375c = j11;
        }

        @Override // lh.o
        @jh.f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer poll() throws Exception {
            long j10 = this.f122376d;
            if (j10 != this.f122375c) {
                this.f122376d = 1 + j10;
                return Integer.valueOf((int) j10);
            }
            lazySet(1);
            return null;
        }

        @Override // lh.o
        public void clear() {
            this.f122376d = this.f122375c;
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
            return this.f122376d == this.f122375c;
        }

        @Override // lh.k
        public int requestFusion(int i10) {
            if ((i10 & 1) == 0) {
                return 0;
            }
            this.f122377e = true;
            return 1;
        }

        void run() {
            if (this.f122377e) {
                return;
            }
            io.reactivex.g0<? super Integer> g0Var = this.f122374b;
            long j10 = this.f122375c;
            for (long j11 = this.f122376d; j11 != j10 && get() == 0; j11++) {
                g0Var.onNext(Integer.valueOf((int) j11));
            }
            if (get() == 0) {
                lazySet(1);
                g0Var.onComplete();
            }
        }
    }

    public ObservableRange(int i10, int i11) {
        this.f122372b = i10;
        this.f122373c = ((long) i10) + ((long) i11);
    }

    @Override // io.reactivex.z
    protected void H5(io.reactivex.g0<? super Integer> g0Var) {
        RangeDisposable rangeDisposable = new RangeDisposable(g0Var, this.f122372b, this.f122373c);
        g0Var.onSubscribe(rangeDisposable);
        rangeDisposable.run();
    }
}
