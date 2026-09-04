package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableInterval extends io.reactivex.z<Long> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.h0 f122272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f122273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final long f122274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final TimeUnit f122275e;

    public static final class IntervalObserver extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.disposables.b, Runnable {
        private static final long serialVersionUID = 346773832286157679L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super Long> f122276b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f122277c;

        IntervalObserver(io.reactivex.g0<? super Long> g0Var) {
            this.f122276b = g0Var;
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
            if (get() != DisposableHelper.DISPOSED) {
                io.reactivex.g0<? super Long> g0Var = this.f122276b;
                long j10 = this.f122277c;
                this.f122277c = 1 + j10;
                g0Var.onNext(Long.valueOf(j10));
            }
        }
    }

    public ObservableInterval(long j10, long j11, TimeUnit timeUnit, io.reactivex.h0 h0Var) {
        this.f122273c = j10;
        this.f122274d = j11;
        this.f122275e = timeUnit;
        this.f122272b = h0Var;
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
        IntervalObserver intervalObserver = new IntervalObserver(g0Var);
        g0Var.onSubscribe(intervalObserver);
        io.reactivex.h0 h0Var = this.f122272b;
        if (!(h0Var instanceof io.reactivex.internal.schedulers.l)) {
            intervalObserver.a(h0Var.h(intervalObserver, this.f122273c, this.f122274d, this.f122275e));
            return;
        }
        io.reactivex.h0.c cVarC = h0Var.c();
        intervalObserver.a(cVarC);
        cVarC.d(intervalObserver, this.f122273c, this.f122274d, this.f122275e);
    }
}
