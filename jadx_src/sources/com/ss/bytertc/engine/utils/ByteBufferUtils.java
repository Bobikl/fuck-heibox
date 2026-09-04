package com.ss.bytertc.engine.utils;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class ByteBufferUtils {
    public static native ByteBuffer nativeAllocateBuffer(int i10);

    public static native int nativeRGBAToI420(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, ByteBuffer byteBuffer4, int i13, int i14, int i15);

    public static native void nativeReleaseBuffer(ByteBuffer byteBuffer);
}
