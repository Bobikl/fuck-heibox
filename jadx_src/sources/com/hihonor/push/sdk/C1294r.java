package com.hihonor.push.sdk;

import java.util.List;

/* JADX INFO: renamed from: com.hihonor.push.sdk.r, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C1294r implements k0<List<HonorPushDataMsg>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HonorPushCallback f60070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f60071b;

    public C1294r(s sVar, HonorPushCallback honorPushCallback) {
        this.f60071b = sVar;
        this.f60070a = honorPushCallback;
    }

    @Override // com.hihonor.push.sdk.k0
    public void a(a1<List<HonorPushDataMsg>> a1Var) {
        if (!a1Var.e()) {
            s.a(this.f60071b, this.f60070a, -1, a1Var.b().toString());
            return;
        }
        s sVar = this.f60071b;
        HonorPushCallback honorPushCallback = this.f60070a;
        List<HonorPushDataMsg> listC = a1Var.c();
        sVar.getClass();
        b1.a(new t(sVar, honorPushCallback, listC));
    }
}
