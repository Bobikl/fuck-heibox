package com.igexin.push.core.d;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.Signature;
import android.text.TextUtils;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public class o extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f63725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f63726b;

    public o() {
        super("com.heytap.openid", "com.heytap.openid.IdentifyService", "action.com.heytap.openid.OPEN_ID_SERVICE", "com.heytap.openid.IOpenID");
    }

    @Override // com.igexin.push.core.d.f
    protected String a() {
        return "OUID";
    }

    @Override // com.igexin.push.core.d.f, com.igexin.push.core.d.c
    public /* bridge */ /* synthetic */ boolean a(Context context) {
        return super.a(context);
    }

    @Override // com.igexin.push.core.d.f, com.igexin.push.core.d.c
    public /* bridge */ /* synthetic */ String b(Context context) {
        return super.b(context);
    }

    @Override // com.igexin.push.core.d.f, com.igexin.push.core.d.c
    public /* bridge */ /* synthetic */ boolean c(Context context) {
        return super.c(context);
    }

    @Override // com.igexin.push.core.d.f
    protected String d(Context context) {
        if (TextUtils.isEmpty(this.f63726b)) {
            this.f63726b = context.getPackageName();
        }
        return this.f63726b;
    }

    @Override // com.igexin.push.core.d.f
    @SuppressLint({"PackageManagerGetSignatures"})
    protected String e(Context context) {
        if (TextUtils.isEmpty(this.f63725a)) {
            try {
                String strD = d(context);
                this.f63726b = strD;
                Signature[] signatureArr = com.igexin.push.util.l.a(strD, 64).signatures;
                if (signatureArr != null && signatureArr.length > 0) {
                    byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(signatureArr[0].toByteArray());
                    StringBuilder sb2 = new StringBuilder();
                    for (byte b10 : bArrDigest) {
                        sb2.append(Integer.toHexString((b10 & 255) | 256).substring(1, 3));
                    }
                    this.f63725a = sb2.toString();
                }
            } catch (Throwable unused) {
            }
        }
        return this.f63725a;
    }
}
