package com.hihonor.push.sdk;

/* JADX INFO: loaded from: classes7.dex */
public class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HonorPushCallback f60019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f60020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f60021c;

    public f(l lVar, HonorPushCallback honorPushCallback, boolean z10) {
        this.f60021c = lVar;
        this.f60019a = honorPushCallback;
        this.f60020b = z10;
    }

    @Override // java.lang.Runnable
    public void run() {
        s sVar = this.f60021c.f60054d;
        sVar.a(new m(sVar, this.f60020b), this.f60019a);
    }
}
