package com.huawei.hms.hatool;

import com.huawei.secure.android.common.encrypt.utils.EncryptUtil;

/* JADX INFO: loaded from: classes7.dex */
public class m1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static m1 f60997b = new m1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f60998a = new a();

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f60999a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f61000b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f61001c = 0;

        a() {
        }

        void a(long j10) {
            m1.this.f60998a.f61001c = j10;
        }

        void a(String str) {
            m1.this.f60998a.f61000b = str;
        }

        void b(String str) {
            m1.this.f60998a.f60999a = str;
        }
    }

    public static m1 d() {
        return f60997b;
    }

    public String a() {
        return this.f60998a.f61000b;
    }

    public void a(String str, String str2) {
        long jB = b();
        String strC = w0.c(str, str2);
        if (strC == null || strC.isEmpty()) {
            v.e("WorkKeyHandler", "get rsa pubkey config error");
            return;
        }
        if (jB == 0) {
            jB = System.currentTimeMillis();
        } else if (System.currentTimeMillis() - jB <= x9.a.f141105g) {
            return;
        }
        String strGenerateSecureRandomStr = EncryptUtil.generateSecureRandomStr(16);
        String strA = h0.a(strC, strGenerateSecureRandomStr);
        this.f60998a.a(jB);
        this.f60998a.b(strGenerateSecureRandomStr);
        this.f60998a.a(strA);
    }

    public long b() {
        return this.f60998a.f61001c;
    }

    public String c() {
        return this.f60998a.f60999a;
    }
}
