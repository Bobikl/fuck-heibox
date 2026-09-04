package com.bytedance.realx.video;

import com.bytedance.realx.base.CalledByNative;
import com.bytedance.realx.base.JniCommon;
import com.bytedance.realx.base.RXLogging;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public class WrappedNativeNV12Buffer implements VideoFrame.NV12Buffer {
    private static final String TAG = "WrappedNativeNV12Buffer";
    private final ByteBuffer dataUV;
    private final ByteBuffer dataY;
    private final int height;
    private final long nativeBuffer;
    private final int strideUV;
    private final int strideY;
    private final int width;

    @CalledByNative
    WrappedNativeNV12Buffer(int i10, int i11, ByteBuffer byteBuffer, int i12, ByteBuffer byteBuffer2, int i13, long j10) {
        this.width = i10;
        this.height = i11;
        this.dataY = byteBuffer;
        this.strideY = i12;
        this.dataUV = byteBuffer2;
        this.strideUV = i13;
        this.nativeBuffer = j10;
        retain();
    }

    private static native void nativeNV12ToI420(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, ByteBuffer byteBuffer4, int i13, ByteBuffer byteBuffer5, int i14, int i15, int i16);

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.Buffer copyData() {
        return null;
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i10, int i11, int i12, int i13, int i14, int i15) {
        RXLogging.e(TAG, "cropAndScale has not been implemented, default return null");
        return null;
    }

    @Override // com.bytedance.realx.video.VideoFrame.NV12Buffer, com.bytedance.realx.video.VideoFrame.Buffer
    public /* synthetic */ int getBufferType() {
        return h0.a(this);
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
        JniCommon.nativeReleaseRef(this.nativeBuffer);
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer, com.bytedance.realx.base.RefCounted
    public void retain() {
        JniCommon.nativeAddRef(this.nativeBuffer);
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.Buffer scaleAndFill(int i10, int i11, int i12, int i13) {
        RXLogging.e(TAG, "scaleAndFill has not been implemented, default return null");
        return null;
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        JavaI420Buffer javaI420BufferAllocate = JavaI420Buffer.allocate(this.width, this.height);
        if (javaI420BufferAllocate == null) {
            return null;
        }
        nativeNV12ToI420(this.dataY, this.strideY, this.dataUV, this.strideUV, javaI420BufferAllocate.getDataY(), javaI420BufferAllocate.getStrideY(), javaI420BufferAllocate.getDataU(), javaI420BufferAllocate.getStrideU(), javaI420BufferAllocate.getDataV(), javaI420BufferAllocate.getStrideV(), this.width, this.height);
        return javaI420BufferAllocate;
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.NV12Buffer toNV12() {
        retain();
        return this;
    }
}
