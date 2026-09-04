package com.google.common.io;

import com.google.common.primitives.Longs;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: LittleEndianDataOutputStream.java */
/* JADX INFO: loaded from: classes7.dex */
@p
@o9.a
@o9.c
public final class x extends FilterOutputStream implements DataOutput {
    public x(OutputStream outputStream) {
        super(new DataOutputStream((OutputStream) com.google.common.base.w.E(outputStream)));
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ((FilterOutputStream) this).out.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.DataOutput
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i10, i11);
    }

    @Override // java.io.DataOutput
    public void writeBoolean(boolean z10) throws IOException {
        ((DataOutputStream) ((FilterOutputStream) this).out).writeBoolean(z10);
    }

    @Override // java.io.DataOutput
    public void writeByte(int i10) throws IOException {
        ((DataOutputStream) ((FilterOutputStream) this).out).writeByte(i10);
    }

    @Override // java.io.DataOutput
    @Deprecated
    public void writeBytes(String str) throws IOException {
        ((DataOutputStream) ((FilterOutputStream) this).out).writeBytes(str);
    }

    @Override // java.io.DataOutput
    public void writeChar(int i10) throws IOException {
        writeShort(i10);
    }

    @Override // java.io.DataOutput
    public void writeChars(String str) throws IOException {
        for (int i10 = 0; i10 < str.length(); i10++) {
            writeChar(str.charAt(i10));
        }
    }

    @Override // java.io.DataOutput
    public void writeDouble(double d10) throws IOException {
        writeLong(Double.doubleToLongBits(d10));
    }

    @Override // java.io.DataOutput
    public void writeFloat(float f10) throws IOException {
        writeInt(Float.floatToIntBits(f10));
    }

    @Override // java.io.DataOutput
    public void writeInt(int i10) throws IOException {
        ((FilterOutputStream) this).out.write(i10 & 255);
        ((FilterOutputStream) this).out.write((i10 >> 8) & 255);
        ((FilterOutputStream) this).out.write((i10 >> 16) & 255);
        ((FilterOutputStream) this).out.write((i10 >> 24) & 255);
    }

    @Override // java.io.DataOutput
    public void writeLong(long j10) throws IOException {
        byte[] bArrA = Longs.A(Long.reverseBytes(j10));
        write(bArrA, 0, bArrA.length);
    }

    @Override // java.io.DataOutput
    public void writeShort(int i10) throws IOException {
        ((FilterOutputStream) this).out.write(i10 & 255);
        ((FilterOutputStream) this).out.write((i10 >> 8) & 255);
    }

    @Override // java.io.DataOutput
    public void writeUTF(String str) throws IOException {
        ((DataOutputStream) ((FilterOutputStream) this).out).writeUTF(str);
    }
}
