package com.hihonor.push.sdk;

/* JADX INFO: loaded from: classes7.dex */
public class w0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a1 f60099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0 f60100b;

    public w0(x0 x0Var, a1 a1Var) {
        this.f60100b = x0Var;
        this.f60099a = a1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f60100b.f60104c) {
            Object obj = this.f60100b.f60103b;
            if (obj != null) {
                this.f60099a.c();
                ((y0) obj).f60107a.countDown();
            }
        }
    }
}
