package com.igexin.push.core.a;

/* JADX INFO: loaded from: classes.dex */
public class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f63482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f63483b;

    f(e eVar, String str) {
        this.f63483b = eVar;
        this.f63482a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f63483b.b(this.f63482a);
    }
}
