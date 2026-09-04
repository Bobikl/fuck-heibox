package io.flutter.embedding.engine.dart;

import androidx.annotation.n0;
import androidx.annotation.p0;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public interface PlatformMessageHandler {
    void handleMessageFromDart(@n0 String str, @p0 ByteBuffer byteBuffer, int i10, long j10);

    void handlePlatformMessageResponse(int i10, @p0 ByteBuffer byteBuffer);
}
