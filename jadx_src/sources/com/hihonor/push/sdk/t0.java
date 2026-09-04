package com.hihonor.push.sdk;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes7.dex */
public final class t0<TResult> implements j0<TResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Executor f60084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k0<TResult> f60085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f60086c = new Object();

    public t0(Executor executor, k0<TResult> k0Var) {
        this.f60085b = k0Var;
        this.f60084a = executor;
    }

    @Override // com.hihonor.push.sdk.j0
    public final void a(a1<TResult> a1Var) {
        this.f60084a.execute(new s0(this, a1Var));
    }
}
