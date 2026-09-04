package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableRefCount<T> extends io.reactivex.j<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.flowables.a<T> f120565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f120566d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final long f120567e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final TimeUnit f120568f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final io.reactivex.h0 f120569g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    RefConnection f120570h;

    public static final class RefConnection extends AtomicReference<io.reactivex.disposables.b> implements Runnable, kh.g<io.reactivex.disposables.b> {
        private static final long serialVersionUID = -4552101107598366241L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final FlowableRefCount<?> f120571b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.disposables.b f120572c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f120573d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f120574e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f120575f;

        RefConnection(FlowableRefCount<?> flowableRefCount) {
            this.f120571b = flowableRefCount;
        }

        @Override // kh.g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(io.reactivex.disposables.b bVar) throws Exception {
            DisposableHelper.replace(this, bVar);
            synchronized (this.f120571b) {
                if (this.f120575f) {
                    ((io.reactivex.internal.disposables.c) this.f120571b.f120565c).a(bVar);
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f120571b.O8(this);
        }
    }

    public static final class RefCountSubscriber<T> extends AtomicBoolean implements io.reactivex.o<T>, org.reactivestreams.e {
        private static final long serialVersionUID = -7419642935409022375L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f120576b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final FlowableRefCount<T> f120577c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final RefConnection f120578d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        org.reactivestreams.e f120579e;

        RefCountSubscriber(org.reactivestreams.d<? super T> dVar, FlowableRefCount<T> flowableRefCount, RefConnection refConnection) {
            this.f120576b = dVar;
            this.f120577c = flowableRefCount;
            this.f120578d = refConnection;
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            this.f120579e.cancel();
            if (compareAndSet(false, true)) {
                this.f120577c.M8(this.f120578d);
            }
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            if (compareAndSet(false, true)) {
                this.f120577c.N8(this.f120578d);
                this.f120576b.onComplete();
            }
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (!compareAndSet(false, true)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f120577c.N8(this.f120578d);
                this.f120576b.onError(th2);
            }
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            this.f120576b.onNext(t10);
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f120579e, eVar)) {
                this.f120579e = eVar;
                this.f120576b.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            this.f120579e.request(j10);
        }
    }

    public FlowableRefCount(io.reactivex.flowables.a<T> aVar) {
        this(aVar, 1, 0L, TimeUnit.NANOSECONDS, null);
    }

    public FlowableRefCount(io.reactivex.flowables.a<T> aVar, int i10, long j10, TimeUnit timeUnit, io.reactivex.h0 h0Var) {
        this.f120565c = aVar;
        this.f120566d = i10;
        this.f120567e = j10;
        this.f120568f = timeUnit;
        this.f120569g = h0Var;
    }

    void M8(RefConnection refConnection) {
        synchronized (this) {
            RefConnection refConnection2 = this.f120570h;
            if (refConnection2 != null && refConnection2 == refConnection) {
                long j10 = refConnection.f120573d - 1;
                refConnection.f120573d = j10;
                if (j10 == 0 && refConnection.f120574e) {
                    if (this.f120567e == 0) {
                        O8(refConnection);
                        return;
                    }
                    SequentialDisposable sequentialDisposable = new SequentialDisposable();
                    refConnection.f120572c = sequentialDisposable;
                    sequentialDisposable.a(this.f120569g.g(refConnection, this.f120567e, this.f120568f));
                }
            }
        }
    }

    void N8(RefConnection refConnection) {
        synchronized (this) {
            RefConnection refConnection2 = this.f120570h;
            if (refConnection2 != null && refConnection2 == refConnection) {
                this.f120570h = null;
                io.reactivex.disposables.b bVar = refConnection.f120572c;
                if (bVar != null) {
                    bVar.dispose();
                }
            }
            long j10 = refConnection.f120573d - 1;
            refConnection.f120573d = j10;
            if (j10 == 0) {
                io.reactivex.flowables.a<T> aVar = this.f120565c;
                if (aVar instanceof io.reactivex.disposables.b) {
                    ((io.reactivex.disposables.b) aVar).dispose();
                } else if (aVar instanceof io.reactivex.internal.disposables.c) {
                    ((io.reactivex.internal.disposables.c) aVar).a(refConnection.get());
                }
            }
        }
    }

    void O8(RefConnection refConnection) {
        synchronized (this) {
            if (refConnection.f120573d == 0 && refConnection == this.f120570h) {
                this.f120570h = null;
                io.reactivex.disposables.b bVar = refConnection.get();
                DisposableHelper.dispose(refConnection);
                io.reactivex.flowables.a<T> aVar = this.f120565c;
                if (aVar instanceof io.reactivex.disposables.b) {
                    ((io.reactivex.disposables.b) aVar).dispose();
                } else if (aVar instanceof io.reactivex.internal.disposables.c) {
                    if (bVar == null) {
                        refConnection.f120575f = true;
                    } else {
                        ((io.reactivex.internal.disposables.c) aVar).a(bVar);
                    }
                }
            }
        }
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super T> dVar) {
        RefConnection refConnection;
        boolean z10;
        io.reactivex.disposables.b bVar;
        synchronized (this) {
            refConnection = this.f120570h;
            if (refConnection == null) {
                refConnection = new RefConnection(this);
                this.f120570h = refConnection;
            }
            long j10 = refConnection.f120573d;
            if (j10 == 0 && (bVar = refConnection.f120572c) != null) {
                bVar.dispose();
            }
            long j11 = j10 + 1;
            refConnection.f120573d = j11;
            z10 = true;
            if (refConnection.f120574e || j11 != this.f120566d) {
                z10 = false;
            } else {
                refConnection.f120574e = true;
            }
        }
        this.f120565c.j6(new RefCountSubscriber(dVar, this, refConnection));
        if (z10) {
            this.f120565c.Q8(refConnection);
        }
    }
}
