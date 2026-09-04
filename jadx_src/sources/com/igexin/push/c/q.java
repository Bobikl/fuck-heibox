package com.igexin.push.c;

/* JADX INFO: loaded from: classes.dex */
public class q implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ o f63402a;

    q(o oVar) {
        this.f63402a = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f63402a.p();
        } catch (Exception unused) {
        }
    }
}
