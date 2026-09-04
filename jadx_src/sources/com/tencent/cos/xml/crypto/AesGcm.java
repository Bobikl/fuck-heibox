package com.tencent.cos.xml.crypto;

import com.tencent.cos.xml.exception.CosXmlClientException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes4.dex */
public class AesGcm extends ContentCryptoScheme {
    AesGcm() {
    }

    @Override // com.tencent.cos.xml.crypto.ContentCryptoScheme
    CipherLite createAuxillaryCipher(SecretKey secretKey, byte[] bArr, int i10, Provider provider, long j10) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, InvalidAlgorithmParameterException {
        ContentCryptoScheme contentCryptoScheme = ContentCryptoScheme.AES_CTR;
        try {
            return contentCryptoScheme.createCipherLite(secretKey, contentCryptoScheme.adjustIV(bArr, j10), i10, provider);
        } catch (CosXmlClientException e10) {
            throw new InvalidKeyException(e10);
        }
    }

    @Override // com.tencent.cos.xml.crypto.ContentCryptoScheme
    int getBlockSizeInBytes() {
        return 16;
    }

    @Override // com.tencent.cos.xml.crypto.ContentCryptoScheme
    String getCipherAlgorithm() {
        return "AES/GCM/NoPadding";
    }

    @Override // com.tencent.cos.xml.crypto.ContentCryptoScheme
    int getIVLengthInBytes() {
        return 12;
    }

    @Override // com.tencent.cos.xml.crypto.ContentCryptoScheme
    String getKeyGeneratorAlgorithm() {
        return JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM;
    }

    @Override // com.tencent.cos.xml.crypto.ContentCryptoScheme
    int getKeyLengthInBits() {
        return 256;
    }

    @Override // com.tencent.cos.xml.crypto.ContentCryptoScheme
    long getMaxPlaintextSize() {
        return 68719476704L;
    }

    @Override // com.tencent.cos.xml.crypto.ContentCryptoScheme
    String getSpecificCipherProvider() {
        return "BC";
    }

    @Override // com.tencent.cos.xml.crypto.ContentCryptoScheme
    int getTagLengthInBits() {
        return 128;
    }

    @Override // com.tencent.cos.xml.crypto.ContentCryptoScheme
    protected CipherLite newCipherLite(Cipher cipher, SecretKey secretKey, int i10) {
        return new GCMCipherLite(cipher, secretKey, i10);
    }
}
