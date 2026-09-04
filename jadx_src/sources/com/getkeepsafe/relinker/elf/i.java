package com.getkeepsafe.relinker.elf;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: Section32Header.java */
/* JADX INFO: loaded from: classes6.dex */
public class i extends c.d {
    public i(f fVar, c.b bVar, int i10) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.order(bVar.f43029a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f43044a = fVar.k(byteBufferAllocate, bVar.f43032d + ((long) (i10 * bVar.f43035g)) + 28);
    }
}
