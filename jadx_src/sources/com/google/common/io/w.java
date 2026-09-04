package com.google.common.io;

import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: LittleEndianDataInputStream.java */
/* JADX INFO: loaded from: classes7.dex */
@p
@o9.a
@o9.c
public final class w extends FilterInputStream implements DataInput {
    public w(InputStream inputStream) {
        super((InputStream) com.google.common.base.w.E(inputStream));
    }

    private byte a() throws IOException {
        int i10 = ((FilterInputStream) this).in.read();
        if (-1 != i10) {
            return (byte) i10;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    @s9.a
    public boolean readBoolean() throws IOException {
        return readUnsignedByte() != 0;
    }

    @Override // java.io.DataInput
    @s9.a
    public byte readByte() throws IOException {
        return (byte) readUnsignedByte();
    }

    @Override // java.io.DataInput
    @s9.a
    public char readChar() throws IOException {
        return (char) readUnsignedShort();
    }

    @Override // java.io.DataInput
    @s9.a
    public double readDouble() throws IOException {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    @s9.a
    public float readFloat() throws IOException {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr) throws IOException {
        g.p(this, bArr);
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr, int i10, int i11) throws IOException {
        g.q(this, bArr, i10, i11);
    }

    @Override // java.io.DataInput
    @s9.a
    public int readInt() throws IOException {
        byte bA = a();
        byte bA2 = a();
        return Ints.k(a(), a(), bA2, bA);
    }

    @Override // java.io.DataInput
    @s9.a
    @s9.e("Always throws UnsupportedOperationException")
    public String readLine() {
        throw new UnsupportedOperationException("readLine is not supported");
    }

    @Override // java.io.DataInput
    @s9.a
    public long readLong() throws IOException {
        byte bA = a();
        byte bA2 = a();
        byte bA3 = a();
        byte bA4 = a();
        byte bA5 = a();
        byte bA6 = a();
        return Longs.j(a(), a(), bA6, bA5, bA4, bA3, bA2, bA);
    }

    @Override // java.io.DataInput
    @s9.a
    public short readShort() throws IOException {
        return (short) readUnsignedShort();
    }

    @Override // java.io.DataInput
    @s9.a
    public String readUTF() throws IOException {
        return new DataInputStream(((FilterInputStream) this).in).readUTF();
    }

    @Override // java.io.DataInput
    @s9.a
    public int readUnsignedByte() throws IOException {
        int i10 = ((FilterInputStream) this).in.read();
        if (i10 >= 0) {
            return i10;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    @s9.a
    public int readUnsignedShort() throws IOException {
        return Ints.k((byte) 0, (byte) 0, a(), a());
    }

    @Override // java.io.DataInput
    public int skipBytes(int i10) throws IOException {
        return (int) ((FilterInputStream) this).in.skip(i10);
    }
}
