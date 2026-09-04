package com.alipay.mobile.android.verify.sdk.b;

import com.alipay.face.api.ZIMResponse;

/* JADX INFO: compiled from: ZolozPlugin.java */
/* JADX INFO: loaded from: classes6.dex */
public class f implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ZIMResponse f39399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ e f39400c;

    f(e eVar, ZIMResponse zIMResponse) {
        this.f39400c = eVar;
        this.f39399b = zIMResponse;
    }

    @Override // java.lang.Runnable
    public void run() {
        ZIMResponse zIMResponse = this.f39399b;
        if (zIMResponse != null) {
            this.f39400c.f39397a.f124237b.put("code", (Object) Integer.valueOf(zIMResponse.code));
            this.f39400c.f39397a.f124237b.put("reason", (Object) this.f39399b.reason);
        } else {
            this.f39400c.f39397a.f124237b.put("success", (Object) Boolean.FALSE);
            this.f39400c.f39397a.f124237b.put("errorMessage", (Object) "核身失败");
        }
        com.alipay.mobile.android.verify.bridge.b.a().post(this.f39400c.f39397a);
    }
}
