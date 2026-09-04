package com.bytedance.realx.video;

import com.bytedance.realx.base.CalledByNative;
import com.bytedance.realx.base.RefCountDelegate;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public abstract class RGBABuffer implements VideoFrame.Buffer {
    protected ByteBuffer buffer_;
    protected int height_;
    protected RefCountDelegate refCountDelegate;
    protected int stride_;
    protected int width_;

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.Buffer copyData() {
        return null;
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i10, int i11, int i12, int i13, int i14, int i15) {
        return null;
    }

    @CalledByNative
    public ByteBuffer getBuffer() {
        return this.buffer_;
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public int getBufferType() {
        return 5;
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    @CalledByNative
    public int getHeight() {
        return this.height_;
    }

    @CalledByNative
    public int getStride() {
        return this.stride_;
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    @CalledByNative
    public int getWidth() {
        return this.width_;
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
        return null;
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        return null;
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public /* synthetic */ VideoFrame.NV12Buffer toNV12() {
        return f0.a(this);
    }
}
