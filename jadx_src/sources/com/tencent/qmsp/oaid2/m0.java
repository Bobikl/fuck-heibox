package com.tencent.qmsp.oaid2;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public class m0 implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l0 f101633a;

    public static String a(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, "unknown");
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    @Override // com.tencent.qmsp.oaid2.b
    public String a() {
        return this.f101633a.a(0, "");
    }

    @Override // com.tencent.qmsp.oaid2.b
    public void a(Context context, IVendorCallback iVendorCallback) {
        this.f101633a = new l0(context);
    }

    @Override // com.tencent.qmsp.oaid2.b
    public String d() {
        return null;
    }

    @Override // com.tencent.qmsp.oaid2.b
    public boolean e() {
        return "1".equals(a(s5.c.f139298c, "0"));
    }

    @Override // com.tencent.qmsp.oaid2.b
    public void j() {
    }

    @Override // com.tencent.qmsp.oaid2.b
    public boolean k() {
        return true;
    }

    @Override // com.tencent.qmsp.oaid2.b
    public void l() {
    }
}
