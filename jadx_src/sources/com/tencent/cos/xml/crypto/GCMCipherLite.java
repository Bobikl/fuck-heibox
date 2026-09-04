package com.tencent.cos.xml.crypto;

import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes4.dex */
public final class GCMCipherLite extends CipherLite {
    private static final int TAG_LENGTH = ContentCryptoScheme.AES_GCM.getTagLengthInBits() / 8;
    private CipherLite aux;
    private long currentCount;
    private boolean doneFinal;
    private byte[] finalBytes;
    private boolean invisiblyProcessed;
    private long markedCount;
    private long outputByteCount;
    private boolean securityViolated;
    private final int tagLen;

    GCMCipherLite(Cipher cipher, SecretKey secretKey, int i10) {
        super(cipher, ContentCryptoScheme.AES_GCM, secretKey, i10);
        this.tagLen = i10 == 1 ? TAG_LENGTH : 0;
        if (i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException();
        }
    }

    private int checkMax(int i10) {
        if (this.outputByteCount + ((long) i10) <= 68719476704L) {
            return i10;
        }
        this.securityViolated = true;
        throw new SecurityException("Number of bytes processed has exceeded the maximum allowed by AES/GCM; [outputByteCount=" + this.outputByteCount + ", delta=" + i10 + "]");
    }

    private final byte[] doFinal0(byte[] bArr, int i10, int i11) throws BadPaddingException, IllegalBlockSizeException {
        if (!this.doneFinal) {
            this.doneFinal = true;
            byte[] bArrDoFinal = super.doFinal(bArr, i10, i11);
            this.finalBytes = bArrDoFinal;
            if (bArrDoFinal == null) {
                return null;
            }
            this.outputByteCount += (long) checkMax(bArrDoFinal.length - this.tagLen);
            return (byte[]) this.finalBytes.clone();
        }
        if (this.securityViolated) {
            throw new SecurityException();
        }
        if (2 == getCipherMode()) {
            byte[] bArr2 = this.finalBytes;
            if (bArr2 == null) {
                return null;
            }
            return (byte[]) bArr2.clone();
        }
        byte[] bArr3 = this.finalBytes;
        int length = bArr3.length;
        int i12 = this.tagLen;
        int i13 = length - i12;
        if (i11 == i13) {
            return (byte[]) bArr3.clone();
        }
        if (i11 >= i13 || ((long) i11) + this.currentCount != this.outputByteCount) {
            throw new IllegalStateException("Inconsistent re-rencryption");
        }
        return Arrays.copyOfRange(bArr3, (bArr3.length - i12) - i11, bArr3.length);
    }

    @Override // com.tencent.cos.xml.crypto.CipherLite
    byte[] doFinal() throws BadPaddingException, IllegalBlockSizeException {
        if (this.doneFinal) {
            if (this.securityViolated) {
                throw new SecurityException();
            }
            byte[] bArr = this.finalBytes;
            if (bArr == null) {
                return null;
            }
            return (byte[]) bArr.clone();
        }
        this.doneFinal = true;
        byte[] bArrDoFinal = super.doFinal();
        this.finalBytes = bArrDoFinal;
        if (bArrDoFinal == null) {
            return null;
        }
        this.outputByteCount += (long) checkMax(bArrDoFinal.length - this.tagLen);
        return (byte[]) this.finalBytes.clone();
    }

    @Override // com.tencent.cos.xml.crypto.CipherLite
    final byte[] doFinal(byte[] bArr) throws BadPaddingException, IllegalBlockSizeException {
        return doFinal0(bArr, 0, bArr.length);
    }

    @Override // com.tencent.cos.xml.crypto.CipherLite
    final byte[] doFinal(byte[] bArr, int i10, int i11) throws BadPaddingException, IllegalBlockSizeException {
        return doFinal0(bArr, i10, i11);
    }

    long getCurrentCount() {
        return this.currentCount;
    }

    byte[] getFinalBytes() {
        byte[] bArr = this.finalBytes;
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    long getMarkedCount() {
        return this.markedCount;
    }

    long getOutputByteCount() {
        return this.outputByteCount;
    }

    byte[] getTag() {
        byte[] bArr;
        if (getCipherMode() != 1 || (bArr = this.finalBytes) == null) {
            return null;
        }
        return Arrays.copyOfRange(bArr, bArr.length - this.tagLen, bArr.length);
    }

    @Override // com.tencent.cos.xml.crypto.CipherLite
    long mark() {
        long j10 = this.aux == null ? this.outputByteCount : this.currentCount;
        this.markedCount = j10;
        return j10;
    }

    @Override // com.tencent.cos.xml.crypto.CipherLite
    boolean markSupported() {
        return true;
    }

    @Override // com.tencent.cos.xml.crypto.CipherLite
    void reset() {
        long j10 = this.markedCount;
        if (j10 < this.outputByteCount || this.invisiblyProcessed) {
            try {
                this.aux = createAuxiliary(j10);
                this.currentCount = this.markedCount;
            } catch (Exception e10) {
                if (!(e10 instanceof RuntimeException)) {
                    throw new IllegalStateException(e10);
                }
            }
        }
    }

    @Override // com.tencent.cos.xml.crypto.CipherLite
    byte[] update(byte[] bArr, int i10, int i11) {
        byte[] bArrUpdate;
        CipherLite cipherLite = this.aux;
        if (cipherLite == null) {
            bArrUpdate = super.update(bArr, i10, i11);
            if (bArrUpdate == null) {
                this.invisiblyProcessed = bArr.length > 0;
                return null;
            }
            this.outputByteCount += (long) checkMax(bArrUpdate.length);
            this.invisiblyProcessed = bArrUpdate.length == 0 && i11 > 0;
        } else {
            bArrUpdate = cipherLite.update(bArr, i10, i11);
            if (bArrUpdate == null) {
                return null;
            }
            long length = this.currentCount + ((long) bArrUpdate.length);
            this.currentCount = length;
            long j10 = this.outputByteCount;
            if (length == j10) {
                this.aux = null;
            } else if (length > j10) {
                if (1 == getCipherMode()) {
                    throw new IllegalStateException("currentCount=" + this.currentCount + " > outputByteCount=" + this.outputByteCount);
                }
                byte[] bArr2 = this.finalBytes;
                int length2 = bArr2 != null ? bArr2.length : 0;
                long j11 = this.outputByteCount;
                long length3 = j11 - (this.currentCount - ((long) bArrUpdate.length));
                long j12 = length2;
                this.currentCount = j11 - j12;
                this.aux = null;
                return Arrays.copyOf(bArrUpdate, (int) (length3 - j12));
            }
        }
        return bArrUpdate;
    }
}
