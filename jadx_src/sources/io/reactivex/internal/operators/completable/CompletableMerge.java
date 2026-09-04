package io.reactivex.internal.operators.completable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class CompletableMerge extends io.reactivex.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final org.reactivestreams.c<? extends io.reactivex.g> f119733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f119734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f119735d;

    public static final class CompletableMergeSubscriber extends AtomicInteger implements io.reactivex.o<io.reactivex.g>, io.reactivex.disposables.b {
        private static final long serialVersionUID = -2108443387387077490L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.d f119736b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f119737c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final boolean f119738d;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        org.reactivestreams.e f119741g;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final io.reactivex.disposables.a f119740f = new io.reactivex.disposables.a();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicThrowable f119739e = new AtomicThrowable();

        public final class MergeInnerObserver extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.d, io.reactivex.disposables.b {
            private static final long serialVersionUID = 251330541679988317L;

            MergeInnerObserver() {
            }

            @Override // io.reactivex.disposables.b
            public void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.disposables.b
            public boolean isDisposed() {
                return DisposableHelper.isDisposed(get());
            }

            @Override // io.reactivex.d
            public void onComplete() {
                CompletableMergeSubscriber.this.a(this);
            }

            @Override // io.reactivex.d
            public void onError(Throwable th2) {
                CompletableMergeSubscriber.this.b(this, th2);
            }

            @Override // io.reactivex.d
            public void onSubscribe(io.reactivex.disposables.b bVar) {
                DisposableHelper.setOnce(this, bVar);
            }
        }

        CompletableMergeSubscriber(io.reactivex.d dVar, int i10, boolean z10) {
            this.f119736b = dVar;
            this.f119737c = i10;
            this.f119738d = z10;
            lazySet(1);
        }

        void a(MergeInnerObserver mergeInnerObserver) {
            this.f119740f.b(mergeInnerObserver);
            if (decrementAndGet() != 0) {
                if (this.f119737c != Integer.MAX_VALUE) {
                    this.f119741g.request(1L);
                }
            } else {
                Throwable th2 = this.f119739e.get();
                if (th2 != null) {
                    this.f119736b.onError(th2);
                } else {
                    this.f119736b.onComplete();
                }
            }
        }

        void b(MergeInnerObserver mergeInnerObserver, Throwable th2) {
            this.f119740f.b(mergeInnerObserver);
            if (!this.f119738d) {
                this.f119741g.cancel();
                this.f119740f.dispose();
                if (!this.f119739e.a(th2)) {
                    io.reactivex.plugins.a.Y(th2);
                    return;
                } else {
                    if (getAndSet(0) > 0) {
                        this.f119736b.onError(this.f119739e.c());
                        return;
                    }
                    return;
                }
            }
            if (!this.f119739e.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
            } else if (decrementAndGet() == 0) {
                this.f119736b.onError(this.f119739e.c());
            } else if (this.f119737c != Integer.MAX_VALUE) {
                this.f119741g.request(1L);
            }
        }

        @Override // org.reactivestreams.d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(io.reactivex.g gVar) {
            getAndIncrement();
            MergeInnerObserver mergeInnerObserver = new MergeInnerObserver();
            this.f119740f.c(mergeInnerObserver);
            gVar.d(mergeInnerObserver);
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f119741g.cancel();
            this.f119740f.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f119740f.isDisposed();
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            if (decrementAndGet() == 0) {
                if (this.f119739e.get() != null) {
                    this.f119736b.onError(this.f119739e.c());
                } else {
                    this.f119736b.onComplete();
                }
            }
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (this.f119738d) {
                if (!this.f119739e.a(th2)) {
                    io.reactivex.plugins.a.Y(th2);
                    return;
                } else {
                    if (decrementAndGet() == 0) {
                        this.f119736b.onError(this.f119739e.c());
                        return;
                    }
                    return;
                }
            }
            this.f119740f.dispose();
            if (!this.f119739e.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
            } else if (getAndSet(0) > 0) {
                this.f119736b.onError(this.f119739e.c());
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f119741g, eVar)) {
                this.f119741g = eVar;
                this.f119736b.onSubscribe(this);
                int i10 = this.f119737c;
                if (i10 == Integer.MAX_VALUE) {
                    eVar.request(Long.MAX_VALUE);
                } else {
                    eVar.request(i10);
                }
            }
        }
    }

    public CompletableMerge(org.reactivestreams.c<? extends io.reactivex.g> cVar, int i10, boolean z10) {
        this.f119733b = cVar;
        this.f119734c = i10;
        this.f119735d = z10;
    }

    @Override // io.reactivex.a
    public void J0(io.reactivex.d dVar) {
        this.f119733b.g(new CompletableMergeSubscriber(dVar, this.f119734c, this.f119735d));
    }
}
