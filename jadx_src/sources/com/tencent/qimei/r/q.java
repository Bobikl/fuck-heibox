package com.tencent.qimei.r;

/* JADX INFO: compiled from: TokenHolder.java */
/* JADX INFO: loaded from: classes4.dex */
public class q implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f101431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f101432b;

    public q(r rVar, String str) {
        this.f101432b = rVar;
        this.f101431a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f101432b.c(this.f101431a);
    }
}
