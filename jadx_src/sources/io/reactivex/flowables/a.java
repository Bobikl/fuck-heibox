package io.reactivex.flowables;

import io.reactivex.annotations.BackpressureKind;
import io.reactivex.h0;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.operators.flowable.FlowableRefCount;
import io.reactivex.j;
import java.util.concurrent.TimeUnit;
import jh.c;
import jh.e;
import kh.g;

/* JADX INFO: compiled from: ConnectableFlowable.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a<T> extends j<T> {
    @e
    public j<T> M8() {
        return N8(1);
    }

    @e
    public j<T> N8(int i10) {
        return O8(i10, Functions.h());
    }

    @e
    public j<T> O8(int i10, @e g<? super io.reactivex.disposables.b> gVar) {
        if (i10 > 0) {
            return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.g(this, i10, gVar));
        }
        Q8(gVar);
        return io.reactivex.plugins.a.T(this);
    }

    public final io.reactivex.disposables.b P8() {
        io.reactivex.internal.util.e eVar = new io.reactivex.internal.util.e();
        Q8(eVar);
        return eVar.f123870b;
    }

    public abstract void Q8(@e g<? super io.reactivex.disposables.b> gVar);

    @jh.a(BackpressureKind.PASS_THROUGH)
    @c
    @e
    @jh.g("none")
    public j<T> R8() {
        return io.reactivex.plugins.a.P(new FlowableRefCount(this));
    }

    @jh.a(BackpressureKind.PASS_THROUGH)
    @c
    @jh.g("none")
    public final j<T> S8(int i10) {
        return U8(i10, 0L, TimeUnit.NANOSECONDS, io.reactivex.schedulers.b.i());
    }

    @jh.a(BackpressureKind.PASS_THROUGH)
    @c
    @jh.g(jh.g.E0)
    public final j<T> T8(int i10, long j10, TimeUnit timeUnit) {
        return U8(i10, j10, timeUnit, io.reactivex.schedulers.b.a());
    }

    @jh.a(BackpressureKind.PASS_THROUGH)
    @c
    @jh.g("custom")
    public final j<T> U8(int i10, long j10, TimeUnit timeUnit, h0 h0Var) {
        io.reactivex.internal.functions.a.h(i10, "subscriberCount");
        io.reactivex.internal.functions.a.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        return io.reactivex.plugins.a.P(new FlowableRefCount(this, i10, j10, timeUnit, h0Var));
    }

    @jh.a(BackpressureKind.PASS_THROUGH)
    @c
    @jh.g(jh.g.E0)
    public final j<T> V8(long j10, TimeUnit timeUnit) {
        return U8(1, j10, timeUnit, io.reactivex.schedulers.b.a());
    }

    @jh.a(BackpressureKind.PASS_THROUGH)
    @c
    @jh.g("custom")
    public final j<T> W8(long j10, TimeUnit timeUnit, h0 h0Var) {
        return U8(1, j10, timeUnit, h0Var);
    }
}
