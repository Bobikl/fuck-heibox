package com.hihonor.push.sdk;

/* JADX INFO: loaded from: classes7.dex */
public class s0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a1 f60080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t0 f60081b;

    public s0(t0 t0Var, a1 a1Var) {
        this.f60081b = t0Var;
        this.f60080a = a1Var;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f60081b.f60086c) {
            k0<TResult> k0Var = this.f60081b.f60085b;
            if (k0Var != 0) {
                k0Var.a((a1<TResult>) this.f60080a);
            }
        }
    }
}
