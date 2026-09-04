package com.getkeepsafe.relinker.elf;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: Section64Header.java */
/* JADX INFO: loaded from: classes6.dex */
public class j extends c.d {
    public j(f fVar, c.b bVar, int i10) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(bVar.f43029a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f43044a = fVar.k(byteBufferAllocate, bVar.f43032d + ((long) (i10 * bVar.f43035g)) + 44);
    }
}
