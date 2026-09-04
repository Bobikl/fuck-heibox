package com.tencent.cos.xml.crypto;

import com.tencent.cos.xml.exception.CosXmlClientException;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import lg.a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ContentCryptoScheme {
    static final long MAX_CBC_BYTES = 4503599627370496L;
    static final long MAX_CTR_BYTES = -1;
    static final long MAX_GCM_BLOCKS = 4294967294L;
    static final long MAX_GCM_BYTES = 68719476704L;
    static final ContentCryptoScheme AES_GCM = new AesGcm();
    static final ContentCryptoScheme AES_CTR = new AesCtr();

    ContentCryptoScheme() {
    }

    static ContentCryptoScheme fromCEKAlgo(String str) {
        ContentCryptoScheme contentCryptoScheme = AES_CTR;
        if (contentCryptoScheme.getCipherAlgorithm().equals(str)) {
            return contentCryptoScheme;
        }
        throw new UnsupportedOperationException("Unsupported content encryption scheme: " + str);
    }

    static byte[] incrementBlocks(byte[] bArr, long j10) {
        if (j10 == 0) {
            return bArr;
        }
        if (bArr == null || bArr.length != 16) {
            throw new IllegalArgumentException();
        }
        if (j10 > MAX_GCM_BLOCKS) {
            throw new IllegalStateException();
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        for (int i10 = 12; i10 <= 15; i10++) {
            byteBufferAllocate.put(i10 - 8, bArr[i10]);
        }
        long j11 = byteBufferAllocate.getLong() + j10;
        if (j11 > MAX_GCM_BLOCKS) {
            throw new IllegalStateException();
        }
        byteBufferAllocate.rewind();
        byte[] bArrArray = byteBufferAllocate.putLong(j11).array();
        for (int i11 = 12; i11 <= 15; i11++) {
            bArr[i11] = bArrArray[i11 - 8];
        }
        return bArr;
    }

    byte[] adjustIV(byte[] bArr, long j10) {
        return bArr;
    }

    CipherLite createAuxillaryCipher(SecretKey secretKey, byte[] bArr, int i10, Provider provider, long j10) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, InvalidAlgorithmParameterException {
        return null;
    }

    CipherLite createCipherLite(SecretKey secretKey, byte[] bArr, int i10) throws CosXmlClientException {
        return createCipherLite(secretKey, bArr, i10, null);
    }

    CipherLite createCipherLite(SecretKey secretKey, byte[] bArr, int i10, Provider provider) throws CosXmlClientException {
        Cipher cipher;
        String specificCipherProvider = getSpecificCipherProvider();
        try {
            if (specificCipherProvider != null) {
                cipher = Cipher.getInstance(getCipherAlgorithm(), specificCipherProvider);
            } else {
                cipher = provider != null ? Cipher.getInstance(getCipherAlgorithm(), provider) : Cipher.getInstance(getCipherAlgorithm());
            }
            cipher.init(i10, secretKey, new IvParameterSpec(bArr));
            return newCipherLite(cipher, secretKey, i10);
        } catch (Exception e10) {
            throw CosXmlClientException.internalException("Unable to build cipher: " + e10.getMessage() + "\nMake sure you have the JCE unlimited strength policy files installed and configured for your JVM");
        }
    }

    abstract int getBlockSizeInBytes();

    abstract String getCipherAlgorithm();

    abstract int getIVLengthInBytes();

    abstract String getKeyGeneratorAlgorithm();

    abstract int getKeyLengthInBits();

    final String getKeySpec() {
        return getKeyGeneratorAlgorithm() + a.f131412e + getKeyLengthInBits();
    }

    abstract long getMaxPlaintextSize();

    String getSpecificCipherProvider() {
        return null;
    }

    int getTagLengthInBits() {
        return 0;
    }

    protected CipherLite newCipherLite(Cipher cipher, SecretKey secretKey, int i10) {
        return new CipherLite(cipher, this, secretKey, i10);
    }

    public String toString() {
        return "cipherAlgo=" + getCipherAlgorithm() + ", blockSizeInBytes=" + getBlockSizeInBytes() + ", ivLengthInBytes=" + getIVLengthInBytes() + ", keyGenAlgo=" + getKeyGeneratorAlgorithm() + ", keyLengthInBits=" + getKeyLengthInBits() + ", specificProvider=" + getSpecificCipherProvider() + ", tagLengthInBits=" + getTagLengthInBits();
    }
}
