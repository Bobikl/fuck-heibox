package com.tencent.cos.xml.crypto;

import java.security.Key;
import n5.d;

/* JADX INFO: loaded from: classes4.dex */
public class COSKeyWrapScheme {
    public static final String AESWrap = "AESWrap";
    public static final String RSA_ECB_OAEPWithSHA256AndMGF1Padding = "RSA/ECB/OAEPWithSHA-256AndMGF1Padding";

    COSKeyWrapScheme() {
    }

    String getKeyWrapAlgorithm(Key key) {
        String algorithm = key.getAlgorithm();
        if (JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM.equals(algorithm)) {
            return AESWrap;
        }
        if (d.f132016a.equals(algorithm)) {
            return RSA_ECB_OAEPWithSHA256AndMGF1Padding;
        }
        throw new IllegalArgumentException("Unsupported key wrap algorithm " + algorithm);
    }

    public String toString() {
        return "COSKeyWrapScheme";
    }
}
