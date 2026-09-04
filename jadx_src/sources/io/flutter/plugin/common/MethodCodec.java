package io.flutter.plugin.common;

import androidx.annotation.n0;
import androidx.annotation.p0;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public interface MethodCodec {
    @n0
    Object decodeEnvelope(@n0 ByteBuffer byteBuffer);

    @n0
    MethodCall decodeMethodCall(@n0 ByteBuffer byteBuffer);

    @n0
    ByteBuffer encodeErrorEnvelope(@n0 String str, @p0 String str2, @p0 Object obj);

    @n0
    ByteBuffer encodeErrorEnvelopeWithStacktrace(@n0 String str, @p0 String str2, @p0 Object obj, @p0 String str3);

    @n0
    ByteBuffer encodeMethodCall(@n0 MethodCall methodCall);

    @n0
    ByteBuffer encodeSuccessEnvelope(@p0 Object obj);
}
