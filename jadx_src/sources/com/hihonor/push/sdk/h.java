package com.hihonor.push.sdk;

/* JADX INFO: loaded from: classes7.dex */
public class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HonorPushCallback f60037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f60038b;

    public h(l lVar, HonorPushCallback honorPushCallback) {
        this.f60038b = lVar;
        this.f60037a = honorPushCallback;
    }

    @Override // java.lang.Runnable
    public void run() {
        s sVar = this.f60038b.f60054d;
        sVar.a(new o(sVar), this.f60037a);
    }
}
