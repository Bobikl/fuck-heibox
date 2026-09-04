package com.tencent.cos.xml.crypto;

import com.tencent.cos.xml.exception.CosXmlClientException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;

/* JADX INFO: loaded from: classes4.dex */
public class CipherLiteInputStream extends SdkFilterInputStream {
    private static final int DEFAULT_IN_BUFFER_SIZE = 512;
    private static final int MAX_RETRY = 1000;
    private byte[] bufin;
    private byte[] bufout;
    private CipherLite cipherLite;
    private int curr_pos;
    private boolean eof;
    private final boolean lastMultiPart;
    private int max_pos;
    private final boolean multipart;

    protected CipherLiteInputStream(InputStream inputStream) {
        this(inputStream, CipherLite.Null, 512, false, false);
    }

    public CipherLiteInputStream(InputStream inputStream, CipherLite cipherLite) {
        this(inputStream, cipherLite, 512, false, false);
    }

    public CipherLiteInputStream(InputStream inputStream, CipherLite cipherLite, int i10) {
        this(inputStream, cipherLite, i10, false, false);
    }

    public CipherLiteInputStream(InputStream inputStream, CipherLite cipherLite, int i10, boolean z10, boolean z11) {
        super(inputStream);
        this.max_pos = -1;
        if (z11 && !z10) {
            throw new IllegalArgumentException("lastMultiPart can only be true if multipart is true");
        }
        this.multipart = z10;
        this.lastMultiPart = z11;
        this.cipherLite = cipherLite;
        if (i10 > 0 && i10 % 512 == 0) {
            this.bufin = new byte[i10];
            return;
        }
        throw new IllegalArgumentException("buffsize (" + i10 + ") must be a positive multiple of 512");
    }

    private int nextChunk() throws IOException {
        abortIfNeeded();
        if (this.eof) {
            return -1;
        }
        this.bufout = null;
        int i10 = ((FilterInputStream) this).in.read(this.bufin);
        if (i10 != -1) {
            byte[] bArrUpdate = this.cipherLite.update(this.bufin, 0, i10);
            this.bufout = bArrUpdate;
            this.curr_pos = 0;
            int length = bArrUpdate != null ? bArrUpdate.length : 0;
            this.max_pos = length;
            return length;
        }
        this.eof = true;
        if (!this.multipart || this.lastMultiPart) {
            try {
                byte[] bArrDoFinal = this.cipherLite.doFinal();
                this.bufout = bArrDoFinal;
                if (bArrDoFinal == null) {
                    return -1;
                }
                this.curr_pos = 0;
                int length2 = bArrDoFinal.length;
                this.max_pos = length2;
                return length2;
            } catch (BadPaddingException e10) {
                if (COSCryptoScheme.isAesGcm(this.cipherLite.getCipherAlgorithm())) {
                    throw new SecurityException(e10);
                }
            } catch (IllegalBlockSizeException unused) {
            }
        }
        return -1;
    }

    @Override // com.tencent.cos.xml.crypto.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int available() {
        abortIfNeeded();
        return this.max_pos - this.curr_pos;
    }

    @Override // com.tencent.cos.xml.crypto.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ((FilterInputStream) this).in.close();
        if (!this.multipart && !COSCryptoScheme.isAesGcm(this.cipherLite.getCipherAlgorithm())) {
            try {
                this.cipherLite.doFinal();
            } catch (BadPaddingException | IllegalBlockSizeException unused) {
            }
        }
        this.max_pos = 0;
        this.curr_pos = 0;
        abortIfNeeded();
    }

    @Override // com.tencent.cos.xml.crypto.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public void mark(int i10) {
        abortIfNeeded();
        ((FilterInputStream) this).in.mark(i10);
        this.cipherLite.mark();
    }

    @Override // com.tencent.cos.xml.crypto.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        abortIfNeeded();
        return ((FilterInputStream) this).in.markSupported() && this.cipherLite.markSupported();
    }

    @Override // com.tencent.cos.xml.crypto.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (this.curr_pos >= this.max_pos) {
            if (this.eof) {
                return -1;
            }
            int i10 = 0;
            while (i10 <= 1000) {
                int iNextChunk = nextChunk();
                i10++;
                if (iNextChunk != 0) {
                    if (iNextChunk == -1) {
                        return -1;
                    }
                }
            }
            throw new IOException("exceeded maximum number of attempts to read next chunk of data");
        }
        byte[] bArr = this.bufout;
        int i11 = this.curr_pos;
        this.curr_pos = i11 + 1;
        return bArr[i11] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // com.tencent.cos.xml.crypto.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int iNextChunk;
        if (this.curr_pos >= this.max_pos) {
            if (this.eof) {
                return -1;
            }
            int i12 = 0;
            do {
                if (i12 > 1000) {
                    throw new IOException("exceeded maximum number of attempts to read next chunk of data");
                }
                iNextChunk = nextChunk();
                i12++;
            } while (iNextChunk == 0);
            if (iNextChunk == -1) {
                return -1;
            }
        }
        if (i11 <= 0) {
            return 0;
        }
        int i13 = this.max_pos;
        int i14 = this.curr_pos;
        int i15 = i13 - i14;
        if (i11 >= i15) {
            i11 = i15;
        }
        System.arraycopy(this.bufout, i14, bArr, i10, i11);
        this.curr_pos += i11;
        return i11;
    }

    void renewCipherLite() throws CosXmlClientException {
        this.cipherLite = this.cipherLite.recreate();
    }

    @Override // com.tencent.cos.xml.crypto.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        abortIfNeeded();
        ((FilterInputStream) this).in.reset();
        this.cipherLite.reset();
        resetInternal();
    }

    final void resetInternal() {
        this.max_pos = 0;
        this.curr_pos = 0;
        this.eof = false;
    }

    @Override // com.tencent.cos.xml.crypto.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) throws IOException {
        abortIfNeeded();
        int i10 = this.max_pos;
        int i11 = this.curr_pos;
        long j11 = i10 - i11;
        if (j10 > j11) {
            j10 = j11;
        }
        if (j10 < 0) {
            return 0L;
        }
        this.curr_pos = (int) (((long) i11) + j10);
        return j10;
    }
}
