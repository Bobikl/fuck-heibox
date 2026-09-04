package com.hihonor.push.sdk;

/* JADX INFO: loaded from: classes7.dex */
public class k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HonorPushCallback f60048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f60049b;

    public k(l lVar, HonorPushCallback honorPushCallback) {
        this.f60049b = lVar;
        this.f60048a = honorPushCallback;
    }

    @Override // java.lang.Runnable
    public void run() {
        s sVar = this.f60049b.f60054d;
        HonorPushCallback honorPushCallback = this.f60048a;
        sVar.getClass();
        if (honorPushCallback == null) {
            return;
        }
        a1 a1VarA = b.a(new p0(sVar.f60075a));
        C1294r c1294r = new C1294r(sVar, honorPushCallback);
        a1VarA.getClass();
        a1VarA.a(new t0(o0.f60063c.f60064a, c1294r));
    }
}
