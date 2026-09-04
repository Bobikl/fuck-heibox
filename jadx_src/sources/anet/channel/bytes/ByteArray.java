package anet.channel.bytes;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class ByteArray implements Comparable<ByteArray> {
    final byte[] buffer;
    int bufferLength;
    int dataLength;

    private ByteArray(byte[] bArr, int i10) {
        bArr = bArr == null ? new byte[i10] : bArr;
        this.buffer = bArr;
        this.bufferLength = bArr.length;
        this.dataLength = i10;
    }

    public static ByteArray create(int i10) {
        return new ByteArray(null, i10);
    }

    public static ByteArray wrap(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return wrap(bArr, bArr.length);
    }

    public static ByteArray wrap(byte[] bArr, int i10) {
        if (bArr == null || i10 < 0 || i10 > bArr.length) {
            return null;
        }
        return new ByteArray(bArr, i10);
    }

    @Override // java.lang.Comparable
    public int compareTo(ByteArray byteArray) {
        int i10 = this.bufferLength;
        int i11 = byteArray.bufferLength;
        if (i10 != i11) {
            return i10 - i11;
        }
        if (this.buffer == null) {
            return -1;
        }
        if (byteArray.buffer == null) {
            return 1;
        }
        return hashCode() - byteArray.hashCode();
    }

    public byte[] getBuffer() {
        return this.buffer;
    }

    public int getBufferLength() {
        return this.bufferLength;
    }

    public int getDataLength() {
        return this.dataLength;
    }

    public int readFrom(InputStream inputStream) throws IOException {
        int i10 = inputStream.read(this.buffer, 0, this.bufferLength);
        this.dataLength = i10 != -1 ? i10 : 0;
        return i10;
    }

    public void recycle() {
        if (this.bufferLength == 0) {
            return;
        }
        a.C0240a.f29622a.a(this);
    }

    public void setDataLength(int i10) {
        this.dataLength = i10;
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(this.buffer, 0, this.dataLength);
    }
}
