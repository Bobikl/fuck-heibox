package com.bytedance.realx.video;

import android.util.Log;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public class YuvHelper {
    public static void I420Copy(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, ByteBuffer byteBuffer4, int i13, int i14) {
        if (byteBuffer == null || byteBuffer2 == null || byteBuffer3 == null || byteBuffer4 == null) {
            Log.e("YuvHelper", "I420Copy params is null");
            return;
        }
        int i15 = (i13 + 1) / 2;
        int i16 = i13 * i14;
        int i17 = ((i14 + 1) / 2) * i15;
        int i18 = (i17 * 2) + i16;
        if (byteBuffer4.capacity() < i18) {
            throw new IllegalArgumentException("Expected destination buffer capacity to be at least " + i18 + " was " + byteBuffer4.capacity());
        }
        byteBuffer4.position(0);
        ByteBuffer byteBufferSlice = byteBuffer4.slice();
        byteBuffer4.position(i16);
        ByteBuffer byteBufferSlice2 = byteBuffer4.slice();
        byteBuffer4.position(i17 + i16);
        nativeI420Copy(byteBuffer, i10, byteBuffer2, i11, byteBuffer3, i12, byteBufferSlice, i13, byteBufferSlice2, i15, byteBuffer4.slice(), i15, i13, i14);
    }

    public static void I420Copy(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, ByteBuffer byteBuffer4, int i13, ByteBuffer byteBuffer5, int i14, ByteBuffer byteBuffer6, int i15, int i16, int i17) {
        nativeI420Copy(byteBuffer, i10, byteBuffer2, i11, byteBuffer3, i12, byteBuffer4, i13, byteBuffer5, i14, byteBuffer6, i15, i16, i17);
    }

    public static void I420Rotate(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, ByteBuffer byteBuffer4, int i13, int i14, int i15) {
        int i16 = i15 % 180;
        int i17 = i16 == 0 ? i13 : i14;
        int i18 = i16 == 0 ? i14 : i13;
        int i19 = (i18 + 1) / 2;
        int i20 = (i17 + 1) / 2;
        int i21 = i18 * i17;
        int i22 = i19 * i20;
        int i23 = (i22 * 2) + i21;
        if (byteBuffer4.capacity() < i23) {
            throw new IllegalArgumentException("Expected destination buffer capacity to be at least " + i23 + " was " + byteBuffer4.capacity());
        }
        byteBuffer4.position(0);
        ByteBuffer byteBufferSlice = byteBuffer4.slice();
        byteBuffer4.position(i21);
        ByteBuffer byteBufferSlice2 = byteBuffer4.slice();
        byteBuffer4.position(i22 + i21);
        nativeI420Rotate(byteBuffer, i10, byteBuffer2, i11, byteBuffer3, i12, byteBufferSlice, i17, byteBufferSlice2, i20, byteBuffer4.slice(), i20, i13, i14, i15);
    }

    public static void I420Rotate(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, ByteBuffer byteBuffer4, int i13, ByteBuffer byteBuffer5, int i14, ByteBuffer byteBuffer6, int i15, int i16, int i17, int i18) {
        nativeI420Rotate(byteBuffer, i10, byteBuffer2, i11, byteBuffer3, i12, byteBuffer4, i13, byteBuffer5, i14, byteBuffer6, i15, i16, i17, i18);
    }

    public static void I420ToNV12(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, ByteBuffer byteBuffer4, int i13, int i14) {
        int i15 = (i13 + 1) / 2;
        int i16 = i13 * i14;
        int i17 = (((i14 + 1) / 2) * i15 * 2) + i16;
        if (byteBuffer4.capacity() >= i17) {
            byteBuffer4.position(0);
            ByteBuffer byteBufferSlice = byteBuffer4.slice();
            byteBuffer4.position(i16);
            nativeI420ToNV12(byteBuffer, i10, byteBuffer2, i11, byteBuffer3, i12, byteBufferSlice, i13, byteBuffer4.slice(), i15 * 2, i13, i14);
            return;
        }
        throw new IllegalArgumentException("Expected destination buffer capacity to be at least " + i17 + " was " + byteBuffer4.capacity());
    }

    public static void I420ToNV12(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, ByteBuffer byteBuffer4, int i13, ByteBuffer byteBuffer5, int i14, int i15, int i16) {
        nativeI420ToNV12(byteBuffer, i10, byteBuffer2, i11, byteBuffer3, i12, byteBuffer4, i13, byteBuffer5, i14, i15, i16);
    }

    public static void NV12Copy(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, int i13) {
        int i14 = (i12 + 1) / 2;
        int i15 = i12 * i13;
        int i16 = (((i13 + 1) / 2) * i14 * 2) + i15;
        if (byteBuffer3.capacity() >= i16) {
            byteBuffer3.position(0);
            ByteBuffer byteBufferSlice = byteBuffer3.slice();
            byteBuffer3.position(i15);
            nativeNV12Copy(byteBuffer, i10, byteBuffer2, i11, byteBufferSlice, i12, byteBuffer3.slice(), i14 * 2, i12, i13);
            return;
        }
        throw new IllegalArgumentException("Expected destination buffer capacity to be at least " + i16 + " was " + byteBuffer3.capacity());
    }

    public static void copyPlane(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, int i12, int i13) {
        nativeCopyPlane(byteBuffer, i10, byteBuffer2, i11, i12, i13);
    }

    private static native void nativeCopyPlane(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, int i12, int i13);

    private static native void nativeI420Copy(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, ByteBuffer byteBuffer4, int i13, ByteBuffer byteBuffer5, int i14, ByteBuffer byteBuffer6, int i15, int i16, int i17);

    private static native void nativeI420Rotate(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, ByteBuffer byteBuffer4, int i13, ByteBuffer byteBuffer5, int i14, ByteBuffer byteBuffer6, int i15, int i16, int i17, int i18);

    private static native void nativeI420ToNV12(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, ByteBuffer byteBuffer4, int i13, ByteBuffer byteBuffer5, int i14, int i15, int i16);

    private static native void nativeNV12Copy(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, ByteBuffer byteBuffer4, int i13, int i14, int i15);
}
