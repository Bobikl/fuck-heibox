package com.hihonor.push.sdk;

/* JADX INFO: loaded from: classes7.dex */
public class u0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a1 f60090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v0 f60091b;

    public u0(v0 v0Var, a1 a1Var) {
        this.f60091b = v0Var;
        this.f60090a = a1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f60091b.f60096c) {
            l0 l0Var = this.f60091b.f60095b;
            if (l0Var != null) {
                this.f60090a.b();
                ((y0) l0Var).f60107a.countDown();
            }
        }
    }
}
