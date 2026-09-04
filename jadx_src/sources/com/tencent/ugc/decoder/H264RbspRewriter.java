package com.tencent.ugc.decoder;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public class H264RbspRewriter {
    public static final boolean DEBUG = false;
    private static final String TAG = "H264RbspRewriter";
    protected static int bitsRead;
    private int curBit;
    private int curByte;
    private int[] curByteWrite;
    protected CharCache debugBits;
    private InputStream is;
    int nBit;
    private int nextByte;
    private final OutputStream os;

    public H264RbspRewriter(InputStream inputStream) throws IOException {
        this.debugBits = new CharCache(50);
        this.curByteWrite = new int[8];
        this.is = inputStream;
        this.os = null;
        this.curByte = inputStream.read();
        this.nextByte = inputStream.read();
    }

    public H264RbspRewriter(InputStream inputStream, OutputStream outputStream) throws IOException {
        this.debugBits = new CharCache(50);
        this.curByteWrite = new int[8];
        this.is = inputStream;
        this.os = outputStream;
        this.curByte = inputStream.read();
        this.nextByte = inputStream.read();
    }

    private void advance() throws IOException {
        this.curByte = this.nextByte;
        this.nextByte = this.is.read();
        this.nBit = 0;
    }

    private int readUE() throws IOException {
        int i10 = 0;
        while (read1Bit(true) == 0) {
            i10++;
        }
        if (i10 <= 0) {
            return 0;
        }
        return (int) (((long) ((1 << i10) - 1)) + readNBit(i10));
    }

    private void skipUE() throws IOException {
        int i10 = 0;
        while (read1Bit(true) == 0) {
            i10++;
        }
        if (i10 > 0) {
            skipNBit(i10);
        }
    }

    private void trace(String str, String str2) {
    }

    private void writeCurByte() throws IOException {
        int[] iArr = this.curByteWrite;
        this.os.write(iArr[7] | (iArr[0] << 7) | (iArr[1] << 6) | (iArr[2] << 5) | (iArr[3] << 4) | (iArr[4] << 3) | (iArr[5] << 2) | (iArr[6] << 1));
    }

    public void flush() throws IOException {
        for (int i10 = this.curBit; i10 < 8; i10++) {
            this.curByteWrite[i10] = 0;
        }
        this.curBit = 0;
        writeCurByte();
    }

    public byte[] read(int i10) throws IOException {
        byte[] bArr = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[i11] = (byte) readByte();
        }
        return bArr;
    }

    public int read1Bit(boolean z10) throws IOException {
        if (this.nBit == 8) {
            advance();
            if (this.curByte == -1) {
                return -1;
            }
        }
        int i10 = this.curByte;
        int i11 = this.nBit;
        int i12 = (i10 >> (7 - i11)) & 1;
        this.nBit = i11 + 1;
        if (z10 && this.os != null) {
            write1Bit(i12);
        }
        return i12;
    }

    public boolean readBool(String str) throws IOException {
        boolean bool = readBool(true);
        trace(str, bool ? "1" : "0");
        return bool;
    }

    public boolean readBool(boolean z10) throws IOException {
        return read1Bit(z10) == 1;
    }

    public int readByte() throws IOException {
        if (this.nBit > 0) {
            advance();
        }
        int i10 = this.curByte;
        advance();
        return i10;
    }

    public long readNBit(int i10) throws IOException {
        if (i10 > 64) {
            throw new IllegalArgumentException("Can not readByte more then 64 bit");
        }
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 1) | ((long) read1Bit(true));
        }
        return j10;
    }

    public long readNBit(int i10, String str) throws IOException {
        long nBit = readNBit(i10);
        trace(str, String.valueOf(nBit));
        return nBit;
    }

    public long readNBit(int i10, boolean z10) throws IOException {
        if (i10 > 64) {
            throw new IllegalArgumentException("Can not readByte more then 64 bit");
        }
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 1) | ((long) read1Bit(z10));
        }
        return j10;
    }

    public long readRemainingByte() throws IOException {
        return readNBit(8 - this.nBit);
    }

    public int readSE(String str) throws IOException {
        int ue2 = readUE();
        int i10 = ue2 & 1;
        int i11 = ((ue2 >> 1) + i10) * ((i10 << 1) - 1);
        trace(str, String.valueOf(i11));
        return i11;
    }

    public void readTrailingBits() throws IOException {
        read1Bit(true);
        readRemainingByte();
    }

    public int readU(int i10, String str) throws IOException {
        return (int) readNBit(i10, str);
    }

    public int readUE(String str) throws IOException {
        int ue2 = readUE();
        trace(str, String.valueOf(ue2));
        return ue2;
    }

    public int readUE(boolean z10) throws IOException {
        int i10 = 0;
        while (read1Bit(z10) == 0) {
            i10++;
        }
        if (i10 <= 0) {
            return 0;
        }
        return (int) (((long) ((1 << i10) - 1)) + readNBit(i10, z10));
    }

    public int readZeroBitCount(String str) throws IOException {
        int i10 = 0;
        while (read1Bit(true) == 0) {
            i10++;
        }
        trace(str, String.valueOf(i10));
        return i10;
    }

    public void skipNBit(int i10) throws IOException {
        if (i10 > 64) {
            throw new IllegalArgumentException("Can not skip more then 64 bit");
        }
        for (int i11 = 0; i11 < i10; i11++) {
            read1Bit(true);
        }
    }

    public void skipNBit(int i10, String str) throws IOException {
        skipNBit(i10);
        trace(str, "skip NBits");
    }

    public void skipScalingList(int i10) throws IOException {
        int[] iArr = new int[i10];
        int se2 = 8;
        int i11 = 8;
        for (int i12 = 0; i12 < i10; i12++) {
            if (se2 != 0) {
                se2 = ((readSE("deltaScale") + i11) + 256) % 256;
            }
            if (se2 != 0) {
                i11 = se2;
            }
            iArr[i12] = i11;
        }
    }

    public void skipUE(String str) throws IOException {
        skipUE();
        trace(str, "skip UE");
    }

    public boolean testBool(String str) throws IOException {
        boolean bool = readBool(false);
        trace(str, bool ? "1" : "0");
        return bool;
    }

    public void write1Bit(int i10) throws IOException {
        if (this.curBit == 8) {
            this.curBit = 0;
            writeCurByte();
        }
        int[] iArr = this.curByteWrite;
        int i11 = this.curBit;
        this.curBit = i11 + 1;
        iArr[i11] = i10;
    }

    public void writeBool(boolean z10, String str) throws IOException {
        write1Bit(z10 ? 1 : 0);
    }

    public void writeNBit(long j10, int i10) throws IOException {
        for (int i11 = 0; i11 < i10; i11++) {
            write1Bit(((int) (j10 >> ((i10 - i11) - 1))) & 1);
        }
    }

    public void writeNBit(long j10, int i10, String str) throws IOException {
        for (int i11 = 0; i11 < i10; i11++) {
            write1Bit(((int) (j10 >> ((i10 - i11) - 1))) & 1);
        }
    }

    public void writeRemainingZero() throws IOException {
        writeNBit(0L, 8 - this.curBit);
    }

    public void writeSE(int i10, String str) throws IOException {
        writeUE(((i10 << 1) * (i10 < 0 ? -1 : 1)) + (i10 <= 0 ? 0 : 1));
    }

    public void writeSliceTrailingBits() {
        throw new IllegalStateException("todo");
    }

    public void writeTrailingBits() throws IOException {
        write1Bit(1);
        writeRemainingZero();
        flush();
    }

    public void writeU(int i10, int i11) throws IOException {
        writeNBit(i10, i11);
    }

    public void writeU(int i10, int i11, String str) throws IOException {
        writeNBit(i10, i11);
    }

    public void writeUE(int i10) throws IOException {
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < 15) {
            int i14 = (1 << i12) + i13;
            if (i10 < i14) {
                i11 = i12;
                break;
            } else {
                i12++;
                i13 = i14;
            }
        }
        writeNBit(0L, i11);
        write1Bit(1);
        writeNBit(i10 - i13, i11);
    }

    public void writeUE(int i10, String str) throws IOException {
        writeUE(i10);
    }
}
