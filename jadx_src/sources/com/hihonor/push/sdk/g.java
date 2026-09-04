package com.hihonor.push.sdk;

/* JADX INFO: loaded from: classes7.dex */
public class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HonorPushCallback f60032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f60033b;

    public g(l lVar, HonorPushCallback honorPushCallback) {
        this.f60033b = lVar;
        this.f60032a = honorPushCallback;
    }

    @Override // java.lang.Runnable
    public void run() {
        s sVar = this.f60033b.f60054d;
        sVar.a(new n(sVar), this.f60032a);
    }
}
