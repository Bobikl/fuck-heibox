package com.huawei.hms.hatool;

import android.text.TextUtils;
import com.huawei.secure.android.common.encrypt.keystore.aes.AesGcmKS;
import com.huawei.secure.android.common.encrypt.utils.EncryptUtil;

/* JADX INFO: loaded from: classes7.dex */
public class o0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static o0 f61006c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f61007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f61008b;

    private String a(String str) {
        String strDecrypt = f() ? AesGcmKS.decrypt("analytics_keystore", str) : "";
        if (TextUtils.isEmpty(strDecrypt)) {
            v.c("hmsSdk", "deCrypt work key first");
            strDecrypt = n.a(str, e());
            if (TextUtils.isEmpty(strDecrypt)) {
                strDecrypt = EncryptUtil.generateSecureRandomStr(16);
                c(b(strDecrypt));
                if (f()) {
                    x.c();
                }
            } else if (f()) {
                c(b(strDecrypt));
                x.c();
            }
        }
        return strDecrypt;
    }

    private String b(String str) {
        return f() ? AesGcmKS.encrypt("analytics_keystore", str) : n.b(str, e());
    }

    private String c() {
        String strA = d.a(q0.i(), "Privacy_MY", "PrivacyData", "");
        if (!TextUtils.isEmpty(strA)) {
            return a(strA);
        }
        String strGenerateSecureRandomStr = EncryptUtil.generateSecureRandomStr(16);
        c(b(strGenerateSecureRandomStr));
        return strGenerateSecureRandomStr;
    }

    private boolean c(String str) {
        v.c("hmsSdk", "refresh sp aes key");
        if (TextUtils.isEmpty(str)) {
            v.c("hmsSdk", "refreshLocalKey(): encrypted key is empty");
            return false;
        }
        d.b(q0.i(), "Privacy_MY", "PrivacyData", str);
        d.b(q0.i(), "Privacy_MY", "flashKeyTime", System.currentTimeMillis());
        return true;
    }

    public static o0 d() {
        if (f61006c == null) {
            g();
        }
        return f61006c;
    }

    private String e() {
        if (TextUtils.isEmpty(this.f61008b)) {
            this.f61008b = new x().a();
        }
        return this.f61008b;
    }

    private boolean f() {
        return true;
    }

    private static synchronized void g() {
        if (f61006c == null) {
            f61006c = new o0();
        }
    }

    public String a() {
        if (TextUtils.isEmpty(this.f61007a)) {
            this.f61007a = c();
        }
        return this.f61007a;
    }

    public void b() {
        String strGenerateSecureRandomStr = EncryptUtil.generateSecureRandomStr(16);
        if (c(b(strGenerateSecureRandomStr))) {
            this.f61007a = strGenerateSecureRandomStr;
        }
    }
}
