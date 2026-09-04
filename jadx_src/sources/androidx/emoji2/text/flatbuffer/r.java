package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import kotlin.x1;

/* JADX INFO: compiled from: ShortVector.java */
/* JADX INFO: loaded from: classes6.dex */
public final class r extends b {
    public r f(int i10, ByteBuffer byteBuffer) {
        b(i10, 2, byteBuffer);
        return this;
    }

    public short g(int i10) {
        return this.f23039d.getShort(a(i10));
    }

    public int h(int i10) {
        return g(i10) & x1.f128661e;
    }
}
