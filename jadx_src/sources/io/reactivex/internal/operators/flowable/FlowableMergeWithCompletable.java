package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableMergeWithCompletable<T> extends a<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final io.reactivex.g f120389d;

    public static final class MergeWithSubscriber<T> extends AtomicInteger implements io.reactivex.o<T>, org.reactivestreams.e {
        private static final long serialVersionUID = -4592979584110982903L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f120390b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicReference<org.reactivestreams.e> f120391c = new AtomicReference<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final OtherObserver f120392d = new OtherObserver(this);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicThrowable f120393e = new AtomicThrowable();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final AtomicLong f120394f = new AtomicLong();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        volatile boolean f120395g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        volatile boolean f120396h;

        public static final class OtherObserver extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.d {
            private static final long serialVersionUID = -2935427570954647017L;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final MergeWithSubscriber<?> f120397b;

            OtherObserver(MergeWithSubscriber<?> mergeWithSubscriber) {
                this.f120397b = mergeWithSubscriber;
            }

            @Override // io.reactivex.d
            public void onComplete() {
                this.f120397b.a();
            }

            @Override // io.reactivex.d
            public void onError(Throwable th2) {
                this.f120397b.b(th2);
            }

            @Override // io.reactivex.d
            public void onSubscribe(io.reactivex.disposables.b bVar) {
                DisposableHelper.setOnce(this, bVar);
            }
        }

        MergeWithSubscriber(org.reactivestreams.d<? super T> dVar) {
            this.f120390b = dVar;
        }

        void a() {
            this.f120396h = true;
            if (this.f120395g) {
                io.reactivex.internal.util.g.b(this.f120390b, this, this.f120393e);
            }
        }

        void b(Throwable th2) {
            SubscriptionHelper.cancel(this.f120391c);
            io.reactivex.internal.util.g.d(this.f120390b, th2, this, this.f120393e);
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            SubscriptionHelper.cancel(this.f120391c);
            DisposableHelper.dispose(this.f120392d);
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            this.f120395g = true;
            if (this.f120396h) {
                io.reactivex.internal.util.g.b(this.f120390b, this, this.f120393e);
            }
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            SubscriptionHelper.cancel(this.f120391c);
            io.reactivex.internal.util.g.d(this.f120390b, th2, this, this.f120393e);
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            io.reactivex.internal.util.g.f(this.f120390b, t10, this, this.f120393e);
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            SubscriptionHelper.deferredSetOnce(this.f120391c, this.f120394f, eVar);
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            SubscriptionHelper.deferredRequest(this.f120391c, this.f120394f, j10);
        }
    }

    public FlowableMergeWithCompletable(io.reactivex.j<T> jVar, io.reactivex.g gVar) {
        super(jVar);
        this.f120389d = gVar;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super T> dVar) {
        MergeWithSubscriber mergeWithSubscriber = new MergeWithSubscriber(dVar);
        dVar.onSubscribe(mergeWithSubscriber);
        this.f121039c.j6(mergeWithSubscriber);
        this.f120389d.d(mergeWithSubscriber.f120392d);
    }
}
