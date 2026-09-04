package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: ByteVector.java */
/* JADX INFO: loaded from: classes6.dex */
public final class f extends b {
    public f f(int i10, ByteBuffer byteBuffer) {
        b(i10, 1, byteBuffer);
        return this;
    }

    public byte g(int i10) {
        return this.f23039d.get(a(i10));
    }

    public int h(int i10) {
        return g(i10) & 255;
    }
}
