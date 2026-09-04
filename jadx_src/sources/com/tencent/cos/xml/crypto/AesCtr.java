package com.tencent.cos.xml.crypto;

/* JADX INFO: loaded from: classes4.dex */
public class AesCtr extends ContentCryptoScheme {
    AesCtr() {
    }

    private byte[] computeJ0(byte[] bArr) {
        int blockSizeInBytes = getBlockSizeInBytes();
        byte[] bArr2 = new byte[blockSizeInBytes];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        bArr2[blockSizeInBytes - 1] = 1;
        return ContentCryptoScheme.incrementBlocks(bArr2, 1L);
    }

    @Override // com.tencent.cos.xml.crypto.ContentCryptoScheme
    byte[] adjustIV(byte[] bArr, long j10) {
        if (bArr.length != 12) {
            throw new UnsupportedOperationException();
        }
        int blockSizeInBytes = getBlockSizeInBytes();
        long j11 = blockSizeInBytes;
        long j12 = j10 / j11;
        if (j11 * j12 == j10) {
            return ContentCryptoScheme.incrementBlocks(computeJ0(bArr), j12);
        }
        throw new IllegalArgumentException("Expecting byteOffset to be multiple of 16, but got blockOffset=" + j12 + ", blockSize=" + blockSizeInBytes + ", byteOffset=" + j10);
    }

    @Override // com.tencent.cos.xml.crypto.ContentCryptoScheme
    int getBlockSizeInBytes() {
        return 16;
    }

    @Override // com.tencent.cos.xml.crypto.ContentCryptoScheme
    String getCipherAlgorithm() {
        return "AES/CTR/NoPadding";
    }

    @Override // com.tencent.cos.xml.crypto.ContentCryptoScheme
    int getIVLengthInBytes() {
        return 16;
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
        return -1L;
    }
}
