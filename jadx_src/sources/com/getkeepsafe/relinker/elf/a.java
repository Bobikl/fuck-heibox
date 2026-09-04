package com.getkeepsafe.relinker.elf;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: Dynamic32Structure.java */
/* JADX INFO: loaded from: classes6.dex */
public class a extends c.a {
    public a(f fVar, c.b bVar, long j10, int i10) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.order(bVar.f43029a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j11 = j10 + ((long) (i10 * 8));
        this.f43024a = fVar.k(byteBufferAllocate, j11);
        this.f43025b = fVar.k(byteBufferAllocate, j11 + 4);
    }
}
