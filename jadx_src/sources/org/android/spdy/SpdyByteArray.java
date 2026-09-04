package org.android.spdy;

import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class SpdyByteArray implements Comparable<SpdyByteArray> {
    private byte[] byteArray;
    int dataLength;
    int length;

    SpdyByteArray() {
        this.byteArray = null;
        this.length = 0;
        this.dataLength = 0;
    }

    SpdyByteArray(int i10) {
        this.byteArray = new byte[i10];
        this.length = i10;
        this.dataLength = 0;
    }

    @Override // java.lang.Comparable
    public int compareTo(SpdyByteArray spdyByteArray) {
        int i10 = this.length;
        int i11 = spdyByteArray.length;
        if (i10 != i11) {
            return i10 - i11;
        }
        if (this.byteArray == null) {
            return -1;
        }
        if (spdyByteArray.byteArray == null) {
            return 1;
        }
        return hashCode() - spdyByteArray.hashCode();
    }

    public byte[] getByteArray() {
        return this.byteArray;
    }

    public int getDataLength() {
        return this.dataLength;
    }

    public void recycle() {
        Arrays.fill(this.byteArray, (byte) 0);
        this.dataLength = 0;
        SpdyBytePool.getInstance().recycle(this);
    }

    void setByteArrayDataLength(int i10) {
        this.dataLength = i10;
    }
}
