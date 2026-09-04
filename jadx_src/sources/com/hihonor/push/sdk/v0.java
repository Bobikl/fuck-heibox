package com.hihonor.push.sdk;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes7.dex */
public final class v0<TResult> implements j0<TResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Executor f60094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l0 f60095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f60096c = new Object();

    public v0(Executor executor, l0 l0Var) {
        this.f60095b = l0Var;
        this.f60094a = executor;
    }

    @Override // com.hihonor.push.sdk.j0
    public final void a(a1<TResult> a1Var) {
        if (a1Var.e()) {
            return;
        }
        a1Var.d();
        this.f60094a.execute(new u0(this, a1Var));
    }
}
