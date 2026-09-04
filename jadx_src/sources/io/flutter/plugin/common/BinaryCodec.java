package io.flutter.plugin.common;

import androidx.annotation.p0;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class BinaryCodec implements MessageCodec<ByteBuffer> {
    public static final BinaryCodec INSTANCE = new BinaryCodec();
    public static final BinaryCodec INSTANCE_DIRECT = new BinaryCodec(true);
    private final boolean returnsDirectByteBufferFromDecoding;

    private BinaryCodec() {
        this.returnsDirectByteBufferFromDecoding = false;
    }

    private BinaryCodec(boolean z10) {
        this.returnsDirectByteBufferFromDecoding = z10;
    }

    @Override // io.flutter.plugin.common.MessageCodec
    public ByteBuffer decodeMessage(@p0 ByteBuffer byteBuffer) {
        if (byteBuffer == null || this.returnsDirectByteBufferFromDecoding) {
            return byteBuffer;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.capacity());
        byteBufferAllocate.put(byteBuffer);
        byteBufferAllocate.rewind();
        return byteBufferAllocate;
    }

    @Override // io.flutter.plugin.common.MessageCodec
    public ByteBuffer encodeMessage(@p0 ByteBuffer byteBuffer) {
        return byteBuffer;
    }
}
