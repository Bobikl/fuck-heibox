package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableInterval extends io.reactivex.j<Long> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.h0 f120340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final long f120341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final long f120342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final TimeUnit f120343f;

    public static final class IntervalSubscriber extends AtomicLong implements org.reactivestreams.e, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super Long> f120344b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f120345c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicReference<io.reactivex.disposables.b> f120346d = new AtomicReference<>();

        IntervalSubscriber(org.reactivestreams.d<? super Long> dVar) {
            this.f120344b = dVar;
        }

        public void a(io.reactivex.disposables.b bVar) {
            DisposableHelper.setOnce(this.f120346d, bVar);
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            DisposableHelper.dispose(this.f120346d);
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                io.reactivex.internal.util.b.a(this, j10);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f120346d.get() != DisposableHelper.DISPOSED) {
                if (get() != 0) {
                    org.reactivestreams.d<? super Long> dVar = this.f120344b;
                    long j10 = this.f120345c;
                    this.f120345c = j10 + 1;
                    dVar.onNext(Long.valueOf(j10));
                    io.reactivex.internal.util.b.e(this, 1L);
                    return;
                }
                this.f120344b.onError(new MissingBackpressureException("Can't deliver value " + this.f120345c + " due to lack of requests"));
                DisposableHelper.dispose(this.f120346d);
            }
        }
    }

    public FlowableInterval(long j10, long j11, TimeUnit timeUnit, io.reactivex.h0 h0Var) {
        this.f120341d = j10;
        this.f120342e = j11;
        this.f120343f = timeUnit;
        this.f120340c = h0Var;
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
        IntervalSubscriber intervalSubscriber = new IntervalSubscriber(dVar);
        dVar.onSubscribe(intervalSubscriber);
        io.reactivex.h0 h0Var = this.f120340c;
        if (!(h0Var instanceof io.reactivex.internal.schedulers.l)) {
            intervalSubscriber.a(h0Var.h(intervalSubscriber, this.f120341d, this.f120342e, this.f120343f));
            return;
        }
        io.reactivex.h0.c cVarC = h0Var.c();
        intervalSubscriber.a(cVarC);
        cVarC.d(intervalSubscriber, this.f120341d, this.f120342e, this.f120343f);
    }
}
