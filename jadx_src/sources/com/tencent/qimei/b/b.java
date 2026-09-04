package com.tencent.qimei.b;

import android.util.Base64;
import java.security.KeyFactory;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import n5.d;

/* JADX INFO: compiled from: RSAUtil.java */
/* JADX INFO: loaded from: classes4.dex */
public class b {
    public static String a(String str, String str2) throws Exception {
        RSAPublicKey rSAPublicKey = (RSAPublicKey) KeyFactory.getInstance(d.f132016a).generatePublic(new X509EncodedKeySpec(Base64.decode(str2, 2)));
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(1, rSAPublicKey);
        return Base64.encodeToString(cipher.doFinal(str.getBytes("UTF-8")), 2);
    }
}
