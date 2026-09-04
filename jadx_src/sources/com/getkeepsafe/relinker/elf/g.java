package com.getkeepsafe.relinker.elf;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: Program32Header.java */
/* JADX INFO: loaded from: classes6.dex */
public class g extends c.AbstractC0364c {
    public g(f fVar, c.b bVar, long j10) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.order(bVar.f43029a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j11 = bVar.f43031c + (j10 * ((long) bVar.f43033e));
        this.f43040a = fVar.k(byteBufferAllocate, j11);
        this.f43041b = fVar.k(byteBufferAllocate, 4 + j11);
        this.f43042c = fVar.k(byteBufferAllocate, 8 + j11);
        this.f43043d = fVar.k(byteBufferAllocate, j11 + 20);
    }
}
