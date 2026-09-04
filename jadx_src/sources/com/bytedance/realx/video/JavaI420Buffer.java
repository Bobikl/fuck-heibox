package com.bytedance.realx.video;

import androidx.annotation.p0;
import com.bytedance.realx.base.JniCommon;
import com.bytedance.realx.base.RefCountDelegate;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public class JavaI420Buffer implements VideoFrame.I420Buffer {
    private final ByteBuffer dataU;
    private final ByteBuffer dataV;
    private final ByteBuffer dataY;
    private final int height;
    private final RefCountDelegate refCountDelegate;
    private final int strideU;
    private final int strideV;
    private final int strideY;
    private final int width;

    private JavaI420Buffer(int i10, int i11, ByteBuffer byteBuffer, int i12, ByteBuffer byteBuffer2, int i13, ByteBuffer byteBuffer3, int i14, @p0 Runnable runnable) {
        this.width = i10;
        this.height = i11;
        this.dataY = byteBuffer;
        this.dataU = byteBuffer2;
        this.dataV = byteBuffer3;
        this.strideY = i12;
        this.strideU = i13;
        this.strideV = i14;
        this.refCountDelegate = new RefCountDelegate(runnable);
    }

    public static JavaI420Buffer allocate(int i10, int i11) {
        int i12 = (i11 + 1) / 2;
        int i13 = (i10 + 1) / 2;
        int i14 = i10 * i11;
        int i15 = i14 + 0;
        int i16 = i13 * i12;
        int i17 = i15 + i16;
        final ByteBuffer byteBufferNativeAllocateByteBuffer = JniCommon.nativeAllocateByteBuffer(i14 + (i13 * 2 * i12));
        if (byteBufferNativeAllocateByteBuffer == null) {
            return null;
        }
        byteBufferNativeAllocateByteBuffer.position(0);
        byteBufferNativeAllocateByteBuffer.limit(i15);
        ByteBuffer byteBufferSlice = byteBufferNativeAllocateByteBuffer.slice();
        byteBufferNativeAllocateByteBuffer.position(i15);
        byteBufferNativeAllocateByteBuffer.limit(i17);
        ByteBuffer byteBufferSlice2 = byteBufferNativeAllocateByteBuffer.slice();
        byteBufferNativeAllocateByteBuffer.position(i17);
        byteBufferNativeAllocateByteBuffer.limit(i17 + i16);
        return new JavaI420Buffer(i10, i11, byteBufferSlice, i10, byteBufferSlice2, i13, byteBufferNativeAllocateByteBuffer.slice(), i13, new Runnable() { // from class: com.bytedance.realx.video.l
            @Override // java.lang.Runnable
            public final void run() {
                JniCommon.nativeFreeByteBuffer(byteBufferNativeAllocateByteBuffer);
            }
        });
    }

    public static JavaI420Buffer allocate(int i10, int i11, int i12, int i13) {
        int i14 = i12 / 2;
        int i15 = i12 * i13;
        int i16 = i15 + 0;
        int i17 = i14 * i13;
        int i18 = (i17 / 2) + i16;
        final ByteBuffer byteBufferNativeAllocateByteBuffer = JniCommon.nativeAllocateByteBuffer(i15 + (i14 * 2 * i13));
        if (byteBufferNativeAllocateByteBuffer == null) {
            return null;
        }
        byteBufferNativeAllocateByteBuffer.position(0);
        byteBufferNativeAllocateByteBuffer.limit(i16);
        ByteBuffer byteBufferSlice = byteBufferNativeAllocateByteBuffer.slice();
        byteBufferNativeAllocateByteBuffer.position(i16);
        byteBufferNativeAllocateByteBuffer.limit(i18);
        ByteBuffer byteBufferSlice2 = byteBufferNativeAllocateByteBuffer.slice();
        byteBufferNativeAllocateByteBuffer.position(i18);
        byteBufferNativeAllocateByteBuffer.limit(i18 + i17);
        return new JavaI420Buffer(i10, i11, byteBufferSlice, i12, byteBufferSlice2, i14, byteBufferNativeAllocateByteBuffer.slice(), i14, new Runnable() { // from class: com.bytedance.realx.video.k
            @Override // java.lang.Runnable
            public final void run() {
                JniCommon.nativeFreeByteBuffer(byteBufferNativeAllocateByteBuffer);
            }
        });
    }

    private static void checkCapacity(ByteBuffer byteBuffer, int i10, int i11, int i12) {
        int i13 = (i12 * (i11 - 1)) + i10;
        if (byteBuffer.capacity() >= i13) {
            return;
        }
        throw new IllegalArgumentException("Buffer must be at least " + i13 + " bytes, but was " + byteBuffer.capacity());
    }

    public static VideoFrame.Buffer cropAndScaleI420(final VideoFrame.I420Buffer i420Buffer, int i10, int i11, int i12, int i13, int i14, int i15) {
        if (i12 != i14 || i13 != i15) {
            JavaI420Buffer javaI420BufferAllocate = allocate(i14, i15);
            if (javaI420BufferAllocate == null) {
                return null;
            }
            nativeCropAndScaleI420(i420Buffer.getDataY(), i420Buffer.getStrideY(), i420Buffer.getDataU(), i420Buffer.getStrideU(), i420Buffer.getDataV(), i420Buffer.getStrideV(), i10, i11, i12, i13, javaI420BufferAllocate.getDataY(), javaI420BufferAllocate.getStrideY(), javaI420BufferAllocate.getDataU(), javaI420BufferAllocate.getStrideU(), javaI420BufferAllocate.getDataV(), javaI420BufferAllocate.getStrideV(), i14, i15);
            return javaI420BufferAllocate;
        }
        ByteBuffer dataY = i420Buffer.getDataY();
        ByteBuffer dataU = i420Buffer.getDataU();
        ByteBuffer dataV = i420Buffer.getDataV();
        dataY.position(i10 + (i420Buffer.getStrideY() * i11));
        int i16 = i10 / 2;
        int i17 = i11 / 2;
        dataU.position((i420Buffer.getStrideU() * i17) + i16);
        dataV.position(i16 + (i17 * i420Buffer.getStrideV()));
        i420Buffer.retain();
        return wrap(i14, i15, dataY.slice(), i420Buffer.getStrideY(), dataU.slice(), i420Buffer.getStrideU(), dataV.slice(), i420Buffer.getStrideV(), new Runnable() { // from class: com.bytedance.realx.video.m
            @Override // java.lang.Runnable
            public final void run() {
                i420Buffer.release();
            }
        });
    }

    private static native void nativeCropAndScaleI420(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, int i13, int i14, int i15, int i16, ByteBuffer byteBuffer4, int i17, ByteBuffer byteBuffer5, int i18, ByteBuffer byteBuffer6, int i19, int i20, int i21);

    private static native void nativeScaleAndFillI420(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, int i13, int i14, ByteBuffer byteBuffer4, int i15, ByteBuffer byteBuffer5, int i16, ByteBuffer byteBuffer6, int i17, int i18, int i19, int i20, int i21);

    public static VideoFrame.Buffer scaleAndFillI420(VideoFrame.I420Buffer i420Buffer, int i10, int i11, int i12, int i13) {
        JavaI420Buffer javaI420BufferAllocate = allocate(i10, i11);
        if (javaI420BufferAllocate == null) {
            return null;
        }
        nativeScaleAndFillI420(i420Buffer.getDataY(), i420Buffer.getStrideY(), i420Buffer.getDataU(), i420Buffer.getStrideU(), i420Buffer.getDataV(), i420Buffer.getStrideV(), i420Buffer.getWidth(), i420Buffer.getHeight(), javaI420BufferAllocate.getDataY(), javaI420BufferAllocate.getStrideY(), javaI420BufferAllocate.getDataU(), javaI420BufferAllocate.getStrideU(), javaI420BufferAllocate.getDataV(), javaI420BufferAllocate.getStrideV(), i10, i11, i12, i13);
        return javaI420BufferAllocate;
    }

    public static JavaI420Buffer wrap(int i10, int i11, ByteBuffer byteBuffer, int i12, ByteBuffer byteBuffer2, int i13, ByteBuffer byteBuffer3, int i14, @p0 Runnable runnable) {
        if (byteBuffer == null || byteBuffer2 == null || byteBuffer3 == null) {
            throw new IllegalArgumentException("Data buffers cannot be null.");
        }
        if (!byteBuffer.isDirect() || !byteBuffer2.isDirect() || !byteBuffer3.isDirect()) {
            throw new IllegalArgumentException("Data buffers must be direct byte buffers.");
        }
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        ByteBuffer byteBufferSlice2 = byteBuffer2.slice();
        ByteBuffer byteBufferSlice3 = byteBuffer3.slice();
        int i15 = (i10 + 1) / 2;
        int i16 = (i11 + 1) / 2;
        checkCapacity(byteBufferSlice, i10, i11, i12);
        checkCapacity(byteBufferSlice2, i15, i16, i13);
        checkCapacity(byteBufferSlice3, i15, i16, i14);
        return new JavaI420Buffer(i10, i11, byteBufferSlice, i12, byteBufferSlice2, i13, byteBufferSlice3, i14, runnable);
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.Buffer copyData() {
        return null;
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i10, int i11, int i12, int i13, int i14, int i15) {
        return cropAndScaleI420(this, i10, i11, i12, i13, i14, i15);
    }

    @Override // com.bytedance.realx.video.VideoFrame.I420Buffer, com.bytedance.realx.video.VideoFrame.Buffer
    public /* synthetic */ int getBufferType() {
        return g0.a(this);
    }

    @Override // com.bytedance.realx.video.VideoFrame.I420Buffer
    public ByteBuffer getDataU() {
        return this.dataU.slice();
    }

    @Override // com.bytedance.realx.video.VideoFrame.I420Buffer
    public ByteBuffer getDataV() {
        return this.dataV.slice();
    }

    @Override // com.bytedance.realx.video.VideoFrame.I420Buffer
    public ByteBuffer getDataY() {
        return this.dataY.slice();
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public int getHeight() {
        return this.height;
    }

    @Override // com.bytedance.realx.video.VideoFrame.I420Buffer
    public int getStrideU() {
        return this.strideU;
    }

    @Override // com.bytedance.realx.video.VideoFrame.I420Buffer
    public int getStrideV() {
        return this.strideV;
    }

    @Override // com.bytedance.realx.video.VideoFrame.I420Buffer
    public int getStrideY() {
        return this.strideY;
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public int getWidth() {
        return this.width;
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer, com.bytedance.realx.base.RefCounted
    public void release() {
        this.refCountDelegate.release();
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer, com.bytedance.realx.base.RefCounted
    public void retain() {
        this.refCountDelegate.retain();
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.Buffer scaleAndFill(int i10, int i11, int i12, int i13) {
        return scaleAndFillI420(this, i10, i11, i12, i13);
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        retain();
        return this;
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public /* synthetic */ VideoFrame.NV12Buffer toNV12() {
        return f0.a(this);
    }
}
