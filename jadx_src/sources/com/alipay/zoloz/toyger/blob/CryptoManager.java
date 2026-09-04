package com.alipay.zoloz.toyger.blob;

import java.security.SecureRandom;
import java.security.interfaces.RSAPublicKey;

/* JADX INFO: loaded from: classes6.dex */
public class CryptoManager {
    private static final int AES_LENGTH = 16;
    private static final String TAG = "CryptoManager";
    private byte[] aesCypher;
    private byte[] aesKey;
    protected boolean mEncUp;
    private RSAPublicKey publicKey;

    public CryptoManager(String str, boolean z10) {
        this.mEncUp = true;
        try {
            this.publicKey = RSAEncrypt.loadPublicKeyByStr(str);
            byte[] bArrRandomBytes = randomBytes(16);
            this.aesKey = bArrRandomBytes;
            this.aesCypher = RSAEncrypt.encrypt(this.publicKey, bArrRandomBytes);
            this.mEncUp = z10;
        } catch (Exception unused) {
            throw new IllegalArgumentException("fail to init crypto manager");
        }
    }

    private byte[] randomBytes(int i10) {
        byte[] bArr = new byte[i10];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }

    public byte[] encrypt(byte[] bArr) {
        return this.mEncUp ? AESEncrypt.encrypt(bArr, this.aesKey) : bArr;
    }

    public byte[] getAESCypher() {
        return this.aesCypher;
    }
}
