package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableIntervalRange extends io.reactivex.j<Long> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.h0 f120347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final long f120348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final long f120349e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final long f120350f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final long f120351g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final TimeUnit f120352h;

    public static final class IntervalRangeSubscriber extends AtomicLong implements org.reactivestreams.e, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super Long> f120353b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f120354c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f120355d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicReference<io.reactivex.disposables.b> f120356e = new AtomicReference<>();

        IntervalRangeSubscriber(org.reactivestreams.d<? super Long> dVar, long j10, long j11) {
            this.f120353b = dVar;
            this.f120355d = j10;
            this.f120354c = j11;
        }

        public void a(io.reactivex.disposables.b bVar) {
            DisposableHelper.setOnce(this.f120356e, bVar);
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            DisposableHelper.dispose(this.f120356e);
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                io.reactivex.internal.util.b.a(this, j10);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            io.reactivex.disposables.b bVar = this.f120356e.get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (bVar != disposableHelper) {
                long j10 = get();
                if (j10 == 0) {
                    this.f120353b.onError(new MissingBackpressureException("Can't deliver value " + this.f120355d + " due to lack of requests"));
                    DisposableHelper.dispose(this.f120356e);
                    return;
                }
                long j11 = this.f120355d;
                this.f120353b.onNext(Long.valueOf(j11));
                if (j11 == this.f120354c) {
                    if (this.f120356e.get() != disposableHelper) {
                        this.f120353b.onComplete();
                    }
                    DisposableHelper.dispose(this.f120356e);
                } else {
                    this.f120355d = j11 + 1;
                    if (j10 != Long.MAX_VALUE) {
                        decrementAndGet();
                    }
                }
            }
        }
    }

    public FlowableIntervalRange(long j10, long j11, long j12, long j13, TimeUnit timeUnit, io.reactivex.h0 h0Var) {
        this.f120350f = j12;
        this.f120351g = j13;
        this.f120352h = timeUnit;
        this.f120347c = h0Var;
        this.f120348d = j10;
        this.f120349e = j11;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // io.reactivex.j
    public void k6(org.reactivestreams.d<? super Long> dVar) {
        IntervalRangeSubscriber intervalRangeSubscriber = new IntervalRangeSubscriber(dVar, this.f120348d, this.f120349e);
        dVar.onSubscribe(intervalRangeSubscriber);
        io.reactivex.h0 h0Var = this.f120347c;
        if (!(h0Var instanceof io.reactivex.internal.schedulers.l)) {
            intervalRangeSubscriber.a(h0Var.h(intervalRangeSubscriber, this.f120350f, this.f120351g, this.f120352h));
            return;
        }
        io.reactivex.h0.c cVarC = h0Var.c();
        intervalRangeSubscriber.a(cVarC);
        cVarC.d(intervalRangeSubscriber, this.f120350f, this.f120351g, this.f120352h);
    }
}
