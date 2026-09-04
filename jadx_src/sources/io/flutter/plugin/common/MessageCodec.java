package io.flutter.plugin.common;

import androidx.annotation.p0;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public interface MessageCodec<T> {
    @p0
    T decodeMessage(@p0 ByteBuffer byteBuffer);

    @p0
    ByteBuffer encodeMessage(@p0 T t10);
}
