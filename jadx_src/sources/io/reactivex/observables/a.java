package io.reactivex.observables;

import io.reactivex.h0;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.operators.observable.ObservableRefCount;
import io.reactivex.internal.operators.observable.i;
import io.reactivex.z;
import java.util.concurrent.TimeUnit;
import jh.c;
import jh.e;
import kh.g;

/* JADX INFO: compiled from: ConnectableObservable.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a<T> extends z<T> {
    @e
    public z<T> h8() {
        return i8(1);
    }

    @e
    public z<T> i8(int i10) {
        return j8(i10, Functions.h());
    }

    @e
    public z<T> j8(int i10, @e g<? super io.reactivex.disposables.b> gVar) {
        if (i10 > 0) {
            return io.reactivex.plugins.a.R(new i(this, i10, gVar));
        }
        l8(gVar);
        return io.reactivex.plugins.a.U(this);
    }

    public final io.reactivex.disposables.b k8() {
        io.reactivex.internal.util.e eVar = new io.reactivex.internal.util.e();
        l8(eVar);
        return eVar.f123870b;
    }

    public abstract void l8(@e g<? super io.reactivex.disposables.b> gVar);

    @e
    @c
    @jh.g("none")
    public z<T> m8() {
        return io.reactivex.plugins.a.R(new ObservableRefCount(this));
    }

    @c
    @jh.g("none")
    public final z<T> n8(int i10) {
        return p8(i10, 0L, TimeUnit.NANOSECONDS, io.reactivex.schedulers.b.i());
    }

    @c
    @jh.g(jh.g.E0)
    public final z<T> o8(int i10, long j10, TimeUnit timeUnit) {
        return p8(i10, j10, timeUnit, io.reactivex.schedulers.b.a());
    }

    @c
    @jh.g("custom")
    public final z<T> p8(int i10, long j10, TimeUnit timeUnit, h0 h0Var) {
        io.reactivex.internal.functions.a.h(i10, "subscriberCount");
        io.reactivex.internal.functions.a.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.a.g(h0Var, "scheduler is null");
        return io.reactivex.plugins.a.R(new ObservableRefCount(this, i10, j10, timeUnit, h0Var));
    }

    @c
    @jh.g(jh.g.E0)
    public final z<T> q8(long j10, TimeUnit timeUnit) {
        return p8(1, j10, timeUnit, io.reactivex.schedulers.b.a());
    }

    @c
    @jh.g("custom")
    public final z<T> r8(long j10, TimeUnit timeUnit, h0 h0Var) {
        return p8(1, j10, timeUnit, h0Var);
    }
}
