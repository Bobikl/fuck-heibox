package gf;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: Dynamic32Structure.java */
/* JADX INFO: loaded from: classes3.dex */
public class a extends c.a {
    public a(f fVar, c.b bVar, long j10, int i10) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.order(bVar.f119027a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j11 = j10 + ((long) (i10 * 8));
        this.f119022a = fVar.k(byteBufferAllocate, j11);
        this.f119023b = fVar.k(byteBufferAllocate, j11 + 4);
    }
}
