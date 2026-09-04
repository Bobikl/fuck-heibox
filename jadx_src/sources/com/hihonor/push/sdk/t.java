package com.hihonor.push.sdk;

/* JADX INFO: loaded from: classes7.dex */
public class t implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HonorPushCallback f60082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f60083b;

    public t(s sVar, HonorPushCallback honorPushCallback, Object obj) {
        this.f60082a = honorPushCallback;
        this.f60083b = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        HonorPushCallback honorPushCallback = this.f60082a;
        if (honorPushCallback != null) {
            honorPushCallback.onSuccess(this.f60083b);
        }
    }
}
