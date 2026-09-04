package gf;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: Program64Header.java */
/* JADX INFO: loaded from: classes3.dex */
public class h extends c.AbstractC1077c {
    public h(f fVar, c.b bVar, long j10) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(bVar.f119027a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j11 = bVar.f119029c + (j10 * ((long) bVar.f119031e));
        this.f119038a = fVar.k(byteBufferAllocate, j11);
        this.f119039b = fVar.g(byteBufferAllocate, 8 + j11);
        this.f119040c = fVar.g(byteBufferAllocate, 16 + j11);
        this.f119041d = fVar.g(byteBufferAllocate, j11 + 40);
    }
}
