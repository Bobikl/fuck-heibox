package com.heytap.msp.push.encrypt;

import com.heytap.mcssdk.utils.e;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes7.dex */
public class AESEncrypt {
    private static final String ALGORITHM = "AES";
    private static final String IV_CONNECT = "%IV1%";
    private static final int KEY_BYTE_SIZE = 256;
    public static final String SDK_APP_SECRET = "isvrbeT7qUywVEZ1Ia0/aUVA/TcFaeV0wC8qFLc8rg4=";
    private static final String TRANSFORMATION = "AES/CTR/NoPadding";

    public static String decrypt(String str, String str2) throws Exception {
        String[] strArrSplit = str2.split(IV_CONNECT);
        byte[] bArrDecodeBase64 = Base64.decodeBase64(strArrSplit[0]);
        byte[] bArrDecodeBase65 = Base64.decodeBase64(strArrSplit[1]);
        SecretKeySpec secretKeySpec = new SecretKeySpec(Base64.decodeBase64(str), "AES");
        Cipher cipher = Cipher.getInstance(TRANSFORMATION);
        cipher.init(2, secretKeySpec, new IvParameterSpec(bArrDecodeBase65));
        return new String(cipher.doFinal(bArrDecodeBase64));
    }

    public static String encrypt(String str) {
        try {
            return encrypt(SDK_APP_SECRET, str);
        } catch (Exception e10) {
            e.a(e10.getLocalizedMessage());
            return "";
        }
    }

    public static String encrypt(String str, String str2) throws Exception {
        SecretKeySpec secretKeySpec = new SecretKeySpec(Base64.decodeBase64(str), "AES");
        Cipher cipher = Cipher.getInstance(TRANSFORMATION);
        cipher.init(1, secretKeySpec);
        String strEncodeBase64String = Base64.encodeBase64String(cipher.getIV());
        return Base64.encodeBase64String(cipher.doFinal(str2.getBytes())) + IV_CONNECT + strEncodeBase64String;
    }

    public static String genKey() throws NoSuchAlgorithmException {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(256);
        return Base64.encodeBase64String(keyGenerator.generateKey().getEncoded());
    }
}
