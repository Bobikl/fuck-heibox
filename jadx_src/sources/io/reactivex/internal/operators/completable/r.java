package io.reactivex.internal.operators.completable;

import io.reactivex.i0;
import io.reactivex.l0;

/* JADX INFO: compiled from: CompletableMaterialize.java */
/* JADX INFO: loaded from: classes12.dex */
@jh.d
public final class r<T> extends i0<io.reactivex.y<T>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.a f119828b;

    public r(io.reactivex.a aVar) {
        this.f119828b = aVar;
    }

    @Override // io.reactivex.i0
    protected void c1(l0<? super io.reactivex.y<T>> l0Var) {
        this.f119828b.d(new io.reactivex.internal.operators.mixed.a(l0Var));
    }
}
