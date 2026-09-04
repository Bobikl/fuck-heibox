package com.hihonor.push.sdk;

import com.hihonor.push.sdk.internal.HonorPushErrorEnum;

/* JADX INFO: loaded from: classes7.dex */
public class y implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f60105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z.a f60106b;

    public y(z.a aVar, int i10) {
        this.f60106b = aVar;
        this.f60105a = i10;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f60106b.a(HonorPushErrorEnum.fromCode(this.f60105a));
    }
}
