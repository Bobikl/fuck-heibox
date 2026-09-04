package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableIntervalRange extends io.reactivex.z<Long> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.h0 f122278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f122279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final long f122280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final long f122281e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final long f122282f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final TimeUnit f122283g;

    public static final class IntervalRangeObserver extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.disposables.b, Runnable {
        private static final long serialVersionUID = 1891866368734007884L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super Long> f122284b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f122285c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f122286d;

        IntervalRangeObserver(io.reactivex.g0<? super Long> g0Var, long j10, long j11) {
            this.f122284b = g0Var;
            this.f122286d = j10;
            this.f122285c = j11;
        }

        public void a(io.reactivex.disposables.b bVar) {
            DisposableHelper.setOnce(this, bVar);
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return get() == DisposableHelper.DISPOSED;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (isDisposed()) {
                return;
            }
            long j10 = this.f122286d;
            this.f122284b.onNext(Long.valueOf(j10));
            if (j10 != this.f122285c) {
                this.f122286d = j10 + 1;
            } else {
                DisposableHelper.dispose(this);
                this.f122284b.onComplete();
            }
        }
    }

    public ObservableIntervalRange(long j10, long j11, long j12, long j13, TimeUnit timeUnit, io.reactivex.h0 h0Var) {
        this.f122281e = j12;
        this.f122282f = j13;
        this.f122283g = timeUnit;
        this.f122278b = h0Var;
        this.f122279c = j10;
        this.f122280d = j11;
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
    @Override // io.reactivex.z
    public void H5(io.reactivex.g0<? super Long> g0Var) {
        IntervalRangeObserver intervalRangeObserver = new IntervalRangeObserver(g0Var, this.f122279c, this.f122280d);
        g0Var.onSubscribe(intervalRangeObserver);
        io.reactivex.h0 h0Var = this.f122278b;
        if (!(h0Var instanceof io.reactivex.internal.schedulers.l)) {
            intervalRangeObserver.a(h0Var.h(intervalRangeObserver, this.f122281e, this.f122282f, this.f122283g));
            return;
        }
        io.reactivex.h0.c cVarC = h0Var.c();
        intervalRangeObserver.a(cVarC);
        cVarC.d(intervalRangeObserver, this.f122281e, this.f122282f, this.f122283g);
    }
}
