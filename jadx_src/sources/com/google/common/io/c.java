package com.google.common.io;

import java.io.DataOutput;

/* JADX INFO: compiled from: ByteArrayDataOutput.java */
/* JADX INFO: loaded from: classes7.dex */
@p
@o9.c
public interface c extends DataOutput {
    byte[] k();

    @Override // java.io.DataOutput
    void write(int i10);

    @Override // java.io.DataOutput
    void write(byte[] bArr);

    @Override // java.io.DataOutput
    void write(byte[] bArr, int i10, int i11);

    @Override // java.io.DataOutput
    void writeBoolean(boolean z10);

    @Override // java.io.DataOutput
    void writeByte(int i10);

    @Override // java.io.DataOutput
    @Deprecated
    void writeBytes(String str);

    @Override // java.io.DataOutput
    void writeChar(int i10);

    @Override // java.io.DataOutput
    void writeChars(String str);

    @Override // java.io.DataOutput
    void writeDouble(double d10);

    @Override // java.io.DataOutput
    void writeFloat(float f10);

    @Override // java.io.DataOutput
    void writeInt(int i10);

    @Override // java.io.DataOutput
    void writeLong(long j10);

    @Override // java.io.DataOutput
    void writeShort(int i10);

    @Override // java.io.DataOutput
    void writeUTF(String str);
}
