package gf;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: Section32Header.java */
/* JADX INFO: loaded from: classes3.dex */
public class i extends c.d {
    public i(f fVar, c.b bVar, int i10) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.order(bVar.f119027a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f119042a = fVar.k(byteBufferAllocate, bVar.f119030d + ((long) (i10 * bVar.f119033g)) + 28);
    }
}
