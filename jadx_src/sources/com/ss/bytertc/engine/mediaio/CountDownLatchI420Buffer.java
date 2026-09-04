package com.ss.bytertc.engine.mediaio;

import androidx.annotation.n0;
import com.bytedance.realx.video.JavaI420Buffer;
import com.bytedance.realx.video.VideoFrame;
import com.bytedance.realx.video.f0;
import com.bytedance.realx.video.g0;
import java.nio.ByteBuffer;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes4.dex */
public class CountDownLatchI420Buffer implements VideoFrame.I420Buffer {

    @n0
    private final JavaI420Buffer buffer;
    private final CountDownLatch mCountDownLatch = new CountDownLatch(1);
    private Runnable mCustomReleaseCallback;

    private CountDownLatchI420Buffer(int i10, int i11, ByteBuffer byteBuffer, int i12, ByteBuffer byteBuffer2, int i13, ByteBuffer byteBuffer3, int i14, final Runnable runnable) {
        this.mCustomReleaseCallback = runnable;
        this.buffer = JavaI420Buffer.wrap(i10, i11, byteBuffer, i12, byteBuffer2, i13, byteBuffer3, i14, new Runnable() { // from class: ug.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f140796b.lambda$new$0(runnable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(Runnable runnable) {
        this.mCountDownLatch.countDown();
        if (this.mCustomReleaseCallback != null) {
            runnable.run();
        }
    }

    public static CountDownLatchI420Buffer wrap(int i10, int i11, ByteBuffer byteBuffer, int i12, ByteBuffer byteBuffer2, int i13, ByteBuffer byteBuffer3, int i14, Runnable runnable) {
        return new CountDownLatchI420Buffer(i10, i11, byteBuffer, i12, byteBuffer2, i13, byteBuffer3, i14, runnable);
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.Buffer copyData() {
        return this.buffer.copyData();
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i10, int i11, int i12, int i13, int i14, int i15) {
        return this.buffer.cropAndScale(i10, i11, i12, i13, i14, i15);
    }

    @Override // com.bytedance.realx.video.VideoFrame.I420Buffer, com.bytedance.realx.video.VideoFrame.Buffer
    public /* synthetic */ int getBufferType() {
        return g0.a(this);
    }

    @Override // com.bytedance.realx.video.VideoFrame.I420Buffer
    public ByteBuffer getDataU() {
        return this.buffer.getDataU();
    }

    @Override // com.bytedance.realx.video.VideoFrame.I420Buffer
    public ByteBuffer getDataV() {
        return this.buffer.getDataV();
    }

    @Override // com.bytedance.realx.video.VideoFrame.I420Buffer
    public ByteBuffer getDataY() {
        return this.buffer.getDataY();
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public int getHeight() {
        return this.buffer.getHeight();
    }

    public CountDownLatch getLatch() {
        return this.mCountDownLatch;
    }

    @Override // com.bytedance.realx.video.VideoFrame.I420Buffer
    public int getStrideU() {
        return this.buffer.getStrideU();
    }

    @Override // com.bytedance.realx.video.VideoFrame.I420Buffer
    public int getStrideV() {
        return this.buffer.getStrideV();
    }

    @Override // com.bytedance.realx.video.VideoFrame.I420Buffer
    public int getStrideY() {
        return this.buffer.getStrideY();
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public int getWidth() {
        return this.buffer.getWidth();
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer, com.bytedance.realx.base.RefCounted
    public void release() {
        this.buffer.release();
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer, com.bytedance.realx.base.RefCounted
    public void retain() {
        this.buffer.retain();
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.Buffer scaleAndFill(int i10, int i11, int i12, int i13) {
        return this.buffer.scaleAndFill(i10, i11, i12, i13);
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        return this.buffer.toI420();
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public /* synthetic */ VideoFrame.NV12Buffer toNV12() {
        return f0.a(this);
    }
}
