package com.tencent.cos.xml.crypto;

import com.tencent.cos.xml.exception.CosXmlClientException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class RenewableCipherLiteInputStream extends CipherLiteInputStream {
    private boolean hasBeenAccessed;

    protected RenewableCipherLiteInputStream(InputStream inputStream) {
        super(inputStream);
    }

    public RenewableCipherLiteInputStream(InputStream inputStream, CipherLite cipherLite) {
        super(inputStream, cipherLite);
    }

    public RenewableCipherLiteInputStream(InputStream inputStream, CipherLite cipherLite, int i10) {
        super(inputStream, cipherLite, i10);
    }

    public RenewableCipherLiteInputStream(InputStream inputStream, CipherLite cipherLite, int i10, boolean z10, boolean z11) {
        super(inputStream, cipherLite, i10, z10, z11);
    }

    @Override // com.tencent.cos.xml.crypto.CipherLiteInputStream, com.tencent.cos.xml.crypto.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public void mark(int i10) {
        abortIfNeeded();
        if (this.hasBeenAccessed) {
            throw new UnsupportedOperationException("Marking is only supported before your first call to read or skip.");
        }
        ((FilterInputStream) this).in.mark(i10);
    }

    @Override // com.tencent.cos.xml.crypto.CipherLiteInputStream, com.tencent.cos.xml.crypto.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        abortIfNeeded();
        return ((FilterInputStream) this).in.markSupported();
    }

    @Override // com.tencent.cos.xml.crypto.CipherLiteInputStream, com.tencent.cos.xml.crypto.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        this.hasBeenAccessed = true;
        return super.read();
    }

    @Override // com.tencent.cos.xml.crypto.CipherLiteInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        this.hasBeenAccessed = true;
        return super.read(bArr);
    }

    @Override // com.tencent.cos.xml.crypto.CipherLiteInputStream, com.tencent.cos.xml.crypto.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        this.hasBeenAccessed = true;
        return super.read(bArr, i10, i11);
    }

    @Override // com.tencent.cos.xml.crypto.CipherLiteInputStream, com.tencent.cos.xml.crypto.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        abortIfNeeded();
        ((FilterInputStream) this).in.reset();
        try {
            renewCipherLite();
            resetInternal();
            this.hasBeenAccessed = false;
        } catch (CosXmlClientException e10) {
            e10.printStackTrace();
            throw new IOException(e10);
        }
    }

    @Override // com.tencent.cos.xml.crypto.CipherLiteInputStream, com.tencent.cos.xml.crypto.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) throws IOException {
        this.hasBeenAccessed = true;
        return super.skip(j10);
    }
}
