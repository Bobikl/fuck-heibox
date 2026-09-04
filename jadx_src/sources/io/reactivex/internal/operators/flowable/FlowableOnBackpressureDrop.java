package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableOnBackpressureDrop<T> extends a<T, T> implements kh.g<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.g<? super T> f120481d;

    public static final class BackpressureDropSubscriber<T> extends AtomicLong implements io.reactivex.o<T>, org.reactivestreams.e {
        private static final long serialVersionUID = -6246093802440953054L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f120482b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.g<? super T> f120483c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        org.reactivestreams.e f120484d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f120485e;

        BackpressureDropSubscriber(org.reactivestreams.d<? super T> dVar, kh.g<? super T> gVar) {
            this.f120482b = dVar;
            this.f120483c = gVar;
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            this.f120484d.cancel();
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            if (this.f120485e) {
                return;
            }
            this.f120485e = true;
            this.f120482b.onComplete();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (this.f120485e) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f120485e = true;
                this.f120482b.onError(th2);
            }
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (this.f120485e) {
                return;
            }
            if (get() != 0) {
                this.f120482b.onNext(t10);
                io.reactivex.internal.util.b.e(this, 1L);
                return;
            }
            try {
                this.f120483c.accept(t10);
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f120484d, eVar)) {
                this.f120484d = eVar;
                this.f120482b.onSubscribe(this);
                eVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                io.reactivex.internal.util.b.a(this, j10);
            }
        }
    }

    public FlowableOnBackpressureDrop(io.reactivex.j<T> jVar) {
        super(jVar);
        this.f120481d = this;
    }

    public FlowableOnBackpressureDrop(io.reactivex.j<T> jVar, kh.g<? super T> gVar) {
        super(jVar);
        this.f120481d = gVar;
    }

    @Override // kh.g
    public void accept(T t10) {
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super T> dVar) {
        this.f121039c.j6(new BackpressureDropSubscriber(dVar, this.f120481d));
    }
}
