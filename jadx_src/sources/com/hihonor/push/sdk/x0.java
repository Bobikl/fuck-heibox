package com.hihonor.push.sdk;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes7.dex */
public final class x0<TResult> implements j0<TResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Executor f60102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m0<TResult> f60103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f60104c = new Object();

    public x0(Executor executor, m0<TResult> m0Var) {
        this.f60103b = m0Var;
        this.f60102a = executor;
    }

    @Override // com.hihonor.push.sdk.j0
    public final void a(a1<TResult> a1Var) {
        if (a1Var.e()) {
            a1Var.d();
            this.f60102a.execute(new w0(this, a1Var));
        }
    }
}
