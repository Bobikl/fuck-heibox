package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: FlowableDelay.java */
/* JADX INFO: loaded from: classes12.dex */
public final class q<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final long f121286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final TimeUnit f121287e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final io.reactivex.h0 f121288f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final boolean f121289g;

    /* JADX INFO: compiled from: FlowableDelay.java */
    public static final class a<T> implements io.reactivex.o<T>, org.reactivestreams.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f121290b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f121291c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final TimeUnit f121292d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final io.reactivex.h0.c f121293e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final boolean f121294f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        org.reactivestreams.e f121295g;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.flowable.q$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: FlowableDelay.java */
        public final class RunnableC1099a implements Runnable {
            RunnableC1099a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    a.this.f121290b.onComplete();
                } finally {
                    a.this.f121293e.dispose();
                }
            }
        }

        /* JADX INFO: compiled from: FlowableDelay.java */
        public final class b implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Throwable f121297b;

            b(Throwable th2) {
                this.f121297b = th2;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    a.this.f121290b.onError(this.f121297b);
                } finally {
                    a.this.f121293e.dispose();
                }
            }
        }

        /* JADX INFO: compiled from: FlowableDelay.java */
        public final class c implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final T f121299b;

            c(T t10) {
                this.f121299b = t10;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f121290b.onNext(this.f121299b);
            }
        }

        a(org.reactivestreams.d<? super T> dVar, long j10, TimeUnit timeUnit, io.reactivex.h0.c cVar, boolean z10) {
            this.f121290b = dVar;
            this.f121291c = j10;
            this.f121292d = timeUnit;
            this.f121293e = cVar;
            this.f121294f = z10;
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            this.f121295g.cancel();
            this.f121293e.dispose();
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            this.f121293e.c(new RunnableC1099a(), this.f121291c, this.f121292d);
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            this.f121293e.c(new b(th2), this.f121294f ? this.f121291c : 0L, this.f121292d);
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            this.f121293e.c(new c(t10), this.f121291c, this.f121292d);
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f121295g, eVar)) {
                this.f121295g = eVar;
                this.f121290b.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            this.f121295g.request(j10);
        }
    }

    public q(io.reactivex.j<T> jVar, long j10, TimeUnit timeUnit, io.reactivex.h0 h0Var, boolean z10) {
        super(jVar);
        this.f121286d = j10;
        this.f121287e = timeUnit;
        this.f121288f = h0Var;
        this.f121289g = z10;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super T> dVar) {
        this.f121039c.j6(new a(this.f121289g ? dVar : new io.reactivex.subscribers.e(dVar), this.f121286d, this.f121287e, this.f121288f.c(), this.f121289g));
    }
}
