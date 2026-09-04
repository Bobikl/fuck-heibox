package gf;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: Section64Header.java */
/* JADX INFO: loaded from: classes3.dex */
public class j extends c.d {
    public j(f fVar, c.b bVar, int i10) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(bVar.f119027a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f119042a = fVar.k(byteBufferAllocate, bVar.f119030d + ((long) (i10 * bVar.f119033g)) + 44);
    }
}
