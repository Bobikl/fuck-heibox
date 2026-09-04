package com.hihonor.push.sdk;

/* JADX INFO: loaded from: classes7.dex */
public class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HonorPushCallback f60042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f60043b;

    public i(l lVar, HonorPushCallback honorPushCallback) {
        this.f60043b = lVar;
        this.f60042a = honorPushCallback;
    }

    @Override // java.lang.Runnable
    public void run() {
        s sVar = this.f60043b.f60054d;
        sVar.a(new p(sVar), this.f60042a);
    }
}
