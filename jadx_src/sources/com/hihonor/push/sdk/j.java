package com.hihonor.push.sdk;

/* JADX INFO: loaded from: classes7.dex */
public class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HonorPushCallback f60046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f60047b;

    public j(l lVar, HonorPushCallback honorPushCallback) {
        this.f60047b = lVar;
        this.f60046a = honorPushCallback;
    }

    @Override // java.lang.Runnable
    public void run() {
        s sVar = this.f60047b.f60054d;
        sVar.a(new q(sVar), this.f60046a);
    }
}
