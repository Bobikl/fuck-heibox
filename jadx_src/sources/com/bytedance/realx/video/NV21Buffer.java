package com.bytedance.realx.video;

import androidx.annotation.p0;
import com.bytedance.realx.base.RefCountDelegate;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public class NV21Buffer implements VideoFrame.Buffer {
    private final byte[] data;
    private final int height;
    private final RefCountDelegate refCountDelegate;
    private final int stride;
    private final int width;

    public NV21Buffer(byte[] bArr, int i10, int i11, int i12, @p0 Runnable runnable) {
        this.data = bArr;
        this.stride = i10;
        this.width = i11;
        this.height = i12;
        this.refCountDelegate = new RefCountDelegate(runnable);
    }

    public NV21Buffer(byte[] bArr, int i10, int i11, @p0 Runnable runnable) {
        this.data = bArr;
        this.width = i10;
        this.stride = i10;
        this.height = i11;
        this.refCountDelegate = new RefCountDelegate(runnable);
    }

    private static native void nativeCropAndScale(int i10, int i11, int i12, int i13, int i14, int i15, byte[] bArr, int i16, int i17, ByteBuffer byteBuffer, int i18, ByteBuffer byteBuffer2, int i19, ByteBuffer byteBuffer3, int i20);

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
        nativeCropAndScale(i10, i11, i12, i13, i14, i15, this.data, this.stride, this.height, javaI420BufferAllocate.getDataY(), javaI420BufferAllocate.getStrideY(), javaI420BufferAllocate.getDataU(), javaI420BufferAllocate.getStrideU(), javaI420BufferAllocate.getDataV(), javaI420BufferAllocate.getStrideV());
        return javaI420BufferAllocate;
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public int getBufferType() {
        return 2;
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public int getHeight() {
        return this.height;
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
        int i10 = this.stride;
        int i11 = this.height;
        return (VideoFrame.I420Buffer) cropAndScale(0, 0, i10, i11, i10, i11);
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public /* synthetic */ VideoFrame.NV12Buffer toNV12() {
        return f0.a(this);
    }
}
