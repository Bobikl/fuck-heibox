package com.google.common.io;

import java.io.DataInput;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: ByteArrayDataInput.java */
/* JADX INFO: loaded from: classes7.dex */
@p
@o9.c
public interface b extends DataInput {
    @Override // java.io.DataInput
    @s9.a
    boolean readBoolean();

    @Override // java.io.DataInput
    @s9.a
    byte readByte();

    @Override // java.io.DataInput
    @s9.a
    char readChar();

    @Override // java.io.DataInput
    @s9.a
    double readDouble();

    @Override // java.io.DataInput
    @s9.a
    float readFloat();

    @Override // java.io.DataInput
    void readFully(byte[] bArr);

    @Override // java.io.DataInput
    void readFully(byte[] bArr, int i10, int i11);

    @Override // java.io.DataInput
    @s9.a
    int readInt();

    @Override // java.io.DataInput
    @s9.a
    @CheckForNull
    String readLine();

    @Override // java.io.DataInput
    @s9.a
    long readLong();

    @Override // java.io.DataInput
    @s9.a
    short readShort();

    @Override // java.io.DataInput
    @s9.a
    String readUTF();

    @Override // java.io.DataInput
    @s9.a
    int readUnsignedByte();

    @Override // java.io.DataInput
    @s9.a
    int readUnsignedShort();

    @Override // java.io.DataInput
    int skipBytes(int i10);
}
