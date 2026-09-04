package com.hihonor.push.sdk;

/* JADX INFO: loaded from: classes7.dex */
public class u implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HonorPushCallback f60087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f60088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f60089c;

    public u(s sVar, HonorPushCallback honorPushCallback, int i10, String str) {
        this.f60087a = honorPushCallback;
        this.f60088b = i10;
        this.f60089c = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        HonorPushCallback honorPushCallback = this.f60087a;
        if (honorPushCallback != null) {
            honorPushCallback.onFailure(this.f60088b, this.f60089c);
        }
    }
}
