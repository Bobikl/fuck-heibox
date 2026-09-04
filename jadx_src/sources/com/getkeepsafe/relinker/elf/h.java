package com.getkeepsafe.relinker.elf;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: Program64Header.java */
/* JADX INFO: loaded from: classes6.dex */
public class h extends c.AbstractC0364c {
    public h(f fVar, c.b bVar, long j10) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(bVar.f43029a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j11 = bVar.f43031c + (j10 * ((long) bVar.f43033e));
        this.f43040a = fVar.k(byteBufferAllocate, j11);
        this.f43041b = fVar.g(byteBufferAllocate, 8 + j11);
        this.f43042c = fVar.g(byteBufferAllocate, 16 + j11);
        this.f43043d = fVar.g(byteBufferAllocate, j11 + 40);
    }
}
