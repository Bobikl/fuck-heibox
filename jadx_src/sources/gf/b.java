package gf;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: Dynamic64Structure.java */
/* JADX INFO: loaded from: classes3.dex */
public class b extends c.a {
    public b(f fVar, c.b bVar, long j10, int i10) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(bVar.f119027a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j11 = j10 + ((long) (i10 * 16));
        this.f119022a = fVar.g(byteBufferAllocate, j11);
        this.f119023b = fVar.g(byteBufferAllocate, j11 + 8);
    }
}
