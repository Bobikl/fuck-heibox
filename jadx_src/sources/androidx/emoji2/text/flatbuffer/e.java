package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: ByteBufferUtil.java */
/* JADX INFO: loaded from: classes6.dex */
public class e {
    public static int a(ByteBuffer byteBuffer) {
        return byteBuffer.getInt(byteBuffer.position());
    }

    public static ByteBuffer b(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        return byteBufferDuplicate;
    }
}
