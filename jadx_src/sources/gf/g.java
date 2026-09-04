package gf;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: Program32Header.java */
/* JADX INFO: loaded from: classes3.dex */
public class g extends c.AbstractC1077c {
    public g(f fVar, c.b bVar, long j10) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.order(bVar.f119027a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j11 = bVar.f119029c + (j10 * ((long) bVar.f119031e));
        this.f119038a = fVar.k(byteBufferAllocate, j11);
        this.f119039b = fVar.k(byteBufferAllocate, 4 + j11);
        this.f119040c = fVar.k(byteBufferAllocate, 8 + j11);
        this.f119041d = fVar.k(byteBufferAllocate, j11 + 20);
    }
}
