package com.tencent.cos.xml.crypto;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class InputSubstream extends SdkFilterInputStream {
    private static final int MAX_SKIPS = 100;
    private final boolean closeSourceStream;
    private long currentPosition;
    private long markedPosition;
    private final long requestedLength;
    private final long requestedOffset;

    public InputSubstream(InputStream inputStream, long j10, long j11, boolean z10) {
        super(inputStream);
        this.markedPosition = 0L;
        this.currentPosition = 0L;
        this.requestedLength = j11;
        this.requestedOffset = j10;
        this.closeSourceStream = z10;
    }

    @Override // com.tencent.cos.xml.crypto.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        long j10 = this.currentPosition;
        long j11 = this.requestedOffset;
        return (int) Math.min(j10 < j11 ? this.requestedLength : (this.requestedLength + j11) - j10, super.available());
    }

    @Override // com.tencent.cos.xml.crypto.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closeSourceStream) {
            super.close();
        }
    }

    InputStream getWrappedInputStream() {
        return ((FilterInputStream) this).in;
    }

    @Override // com.tencent.cos.xml.crypto.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i10) {
        this.markedPosition = this.currentPosition;
        super.mark(i10);
    }

    @Override // com.tencent.cos.xml.crypto.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        byte[] bArr = new byte[1];
        int i10 = read(bArr, 0, 1);
        return i10 == -1 ? i10 : bArr[0];
    }

    @Override // com.tencent.cos.xml.crypto.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        while (true) {
            long j10 = this.currentPosition;
            long j11 = this.requestedOffset;
            if (j10 >= j11) {
                long j12 = (this.requestedLength + j11) - j10;
                if (j12 <= 0) {
                    return -1;
                }
                int i13 = super.read(bArr, i10, (int) Math.min(i11, j12));
                this.currentPosition += (long) i13;
                return i13;
            }
            long jSkip = super.skip(j11 - j10);
            if (jSkip == 0 && (i12 = i12 + 1) > 100) {
                throw new IOException("Unable to position the currentPosition from " + this.currentPosition + " to " + this.requestedOffset);
            }
            this.currentPosition += jSkip;
        }
    }

    @Override // com.tencent.cos.xml.crypto.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        this.currentPosition = this.markedPosition;
        super.reset();
    }
}
