package com.bytedance.realx.video;

import androidx.annotation.p0;
import com.bytedance.realx.base.RefCountDelegate;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public class NV12Buffer implements VideoFrame.NV12Buffer {
    private final ByteBuffer buffer;
    private final ByteBuffer dataUV;
    private final ByteBuffer dataY;
    private final int height;
    private final RefCountDelegate refCountDelegate;
    private final int sliceHeight;
    private final int stride;
    private final int strideUV;
    private final int strideY;
    private final int width;

    public NV12Buffer(int i10, int i11, int i12, int i13, ByteBuffer byteBuffer, @p0 Runnable runnable) {
        this.width = i10;
        this.height = i11;
        this.stride = i12;
        this.sliceHeight = i13;
        this.buffer = byteBuffer;
        this.strideY = i12;
        this.strideUV = i12;
        int i14 = (i12 * i11) + 0;
        byteBuffer.position(0);
        byteBuffer.limit(i14);
        this.dataY = byteBuffer.slice();
        byteBuffer.position(i14);
        byteBuffer.limit(i14 + (((i11 + 1) / 2) * i12));
        this.dataUV = byteBuffer.slice();
        this.refCountDelegate = new RefCountDelegate(runnable);
    }

    private static native void nativeCropAndScale(int i10, int i11, int i12, int i13, int i14, int i15, ByteBuffer byteBuffer, int i16, int i17, int i18, int i19, ByteBuffer byteBuffer2, int i20, ByteBuffer byteBuffer3, int i21, ByteBuffer byteBuffer4, int i22);

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.Buffer copyData() {
        return null;
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i10, int i11, int i12, int i13, int i14, int i15) {
        JavaI420Buffer javaI420BufferAllocate = JavaI420Buffer.allocate(i14, i15);
        if (javaI420BufferAllocate == null) {
            return null;
        }
        nativeCropAndScale(i10, i11, i12, i13, i14, i15, this.buffer, this.width, this.height, this.stride, this.sliceHeight, javaI420BufferAllocate.getDataY(), javaI420BufferAllocate.getStrideY(), javaI420BufferAllocate.getDataU(), javaI420BufferAllocate.getStrideU(), javaI420BufferAllocate.getDataV(), javaI420BufferAllocate.getStrideV());
        return javaI420BufferAllocate;
    }

    @Override // com.bytedance.realx.video.VideoFrame.NV12Buffer, com.bytedance.realx.video.VideoFrame.Buffer
    public int getBufferType() {
        return 1;
    }

    @Override // com.bytedance.realx.video.VideoFrame.NV12Buffer
    public ByteBuffer getDataUV() {
        return this.dataUV.slice();
    }

    @Override // com.bytedance.realx.video.VideoFrame.NV12Buffer
    public ByteBuffer getDataY() {
        return this.dataY.slice();
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public int getHeight() {
        return this.height;
    }

    @Override // com.bytedance.realx.video.VideoFrame.NV12Buffer
    public int getStrideUV() {
        return this.strideUV;
    }

    @Override // com.bytedance.realx.video.VideoFrame.NV12Buffer
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
        JavaI420Buffer javaI420BufferAllocate = JavaI420Buffer.allocate(i10, i11);
        if (javaI420BufferAllocate == null) {
            return null;
        }
        return javaI420BufferAllocate;
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        int i10 = this.width;
        int i11 = this.height;
        return (VideoFrame.I420Buffer) cropAndScale(0, 0, i10, i11, i10, i11);
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.NV12Buffer toNV12() {
        retain();
        return this;
    }
}
