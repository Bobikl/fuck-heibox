package com.hihonor.push.sdk;

/* JADX INFO: loaded from: classes7.dex */
public class n0<TResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a1<TResult> f60061a = new a1<>();

    public void a(Exception exc) {
        a1<TResult> a1Var = this.f60061a;
        synchronized (a1Var.f60000a) {
            if (!a1Var.f60001b) {
                a1Var.f60001b = true;
                a1Var.f60003d = exc;
                a1Var.f60000a.notifyAll();
                a1Var.a();
            }
        }
    }

    public void a(TResult tresult) {
        a1<TResult> a1Var = this.f60061a;
        synchronized (a1Var.f60000a) {
            if (!a1Var.f60001b) {
                a1Var.f60001b = true;
                a1Var.f60002c = tresult;
                a1Var.f60000a.notifyAll();
                a1Var.a();
            }
        }
    }
}
