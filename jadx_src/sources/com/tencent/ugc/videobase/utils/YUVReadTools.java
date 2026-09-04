package com.tencent.ugc.videobase.utils;

import com.tencent.liteav.base.annotations.JNINamespace;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav::ugc")
public class YUVReadTools {
    public static native void nativeReadYUVPlanesForByteArray(int i10, int i11, byte[] bArr);

    public static native void nativeReadYUVPlanesForByteBuffer(int i10, int i11, ByteBuffer byteBuffer);
}
