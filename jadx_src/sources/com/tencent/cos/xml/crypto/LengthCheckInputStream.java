package com.tencent.cos.xml.crypto;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public class LengthCheckInputStream extends SdkFilterInputStream {
    public static final boolean EXCLUDE_SKIPPED_BYTES = false;
    public static final boolean INCLUDE_SKIPPED_BYTES = true;
    private long dataLength;
    private final long expectedLength;
    private final boolean includeSkipped;
    private int markCount;
    private long marked;
    private int resetCount;
    private boolean resetSinceLastMarked;

    public LengthCheckInputStream(InputStream inputStream, long j10, boolean z10) {
        super(inputStream);
        if (j10 < 0) {
            throw new IllegalArgumentException();
        }
        this.expectedLength = j10;
        this.includeSkipped = z10;
    }

    private void checkLength(boolean z10) throws IOException {
        if (z10) {
            if (this.dataLength == this.expectedLength) {
                return;
            }
            throw new IOException("Data read has a different length than the expected: " + diagnosticInfo());
        }
        if (this.dataLength <= this.expectedLength) {
            return;
        }
        throw new IOException("More data read than expected: " + diagnosticInfo());
    }

    private String diagnosticInfo() {
        return "dataLength=" + this.dataLength + "; expectedLength=" + this.expectedLength + "; includeSkipped=" + this.includeSkipped + "; in.getClass()=" + ((FilterInputStream) this).in.getClass() + "; markedSupported=" + markSupported() + "; marked=" + this.marked + "; resetSinceLastMarked=" + this.resetSinceLastMarked + "; markCount=" + this.markCount + "; resetCount=" + this.resetCount;
    }

    @Override // com.tencent.cos.xml.crypto.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public void mark(int i10) {
        if (markSupported()) {
            super.mark(i10);
            this.marked = this.dataLength;
            this.markCount++;
            this.resetSinceLastMarked = false;
        }
    }

    @Override // com.tencent.cos.xml.crypto.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i10 = super.read();
        if (i10 >= 0) {
            this.dataLength++;
        }
        checkLength(i10 == -1);
        return i10;
    }

    @Override // com.tencent.cos.xml.crypto.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = super.read(bArr, i10, i11);
        this.dataLength += i12 >= 0 ? i12 : 0L;
        checkLength(i12 == -1);
        return i12;
    }

    @Override // com.tencent.cos.xml.crypto.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        if (!markSupported()) {
            throw new IOException("mark/reset not supported");
        }
        super.reset();
        this.dataLength = this.marked;
        this.resetCount++;
        this.resetSinceLastMarked = true;
    }

    @Override // com.tencent.cos.xml.crypto.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) throws IOException {
        long jSkip = super.skip(j10);
        if (this.includeSkipped && jSkip > 0) {
            this.dataLength += jSkip;
            checkLength(false);
        }
        return jSkip;
    }
}
