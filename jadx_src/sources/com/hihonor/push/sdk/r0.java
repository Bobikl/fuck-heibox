package com.hihonor.push.sdk;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes7.dex */
public final class r0<TResult> implements j0<TResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Executor f60072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public y0 f60073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f60074c = new Object();

    public r0(Executor executor, y0 y0Var) {
        this.f60073b = y0Var;
        this.f60072a = executor;
    }

    @Override // com.hihonor.push.sdk.j0
    public final void a(a1<TResult> a1Var) {
        a1Var.d();
    }
}
