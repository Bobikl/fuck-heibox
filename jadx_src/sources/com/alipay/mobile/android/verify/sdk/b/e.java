package com.alipay.mobile.android.verify.sdk.b;

import com.alipay.face.api.ZIMCallback;
import com.alipay.face.api.ZIMResponse;
import com.alipay.mobile.android.verify.sdk.g;

/* JADX INFO: compiled from: ZolozPlugin.java */
/* JADX INFO: loaded from: classes6.dex */
public class e implements ZIMCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ j4.a f39397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ d f39398b;

    e(d dVar, j4.a aVar) {
        this.f39398b = dVar;
        this.f39397a = aVar;
    }

    @Override // com.alipay.face.api.ZIMCallback
    public boolean response(ZIMResponse zIMResponse) {
        g.a(new f(this, zIMResponse));
        k4.a.c("zolozCallback");
        return true;
    }
}
