package com.ss.bytertc.engine.video.builder;

import com.ss.bytertc.engine.data.ColorSpace;
import com.ss.bytertc.engine.data.VideoPixelFormat;
import com.ss.bytertc.engine.data.VideoRotation;
import com.ss.bytertc.engine.video.VideoFrame;
import com.ss.bytertc.engine.video.impl.DirectBufferVideoFrame;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class CpuBufferVideoFrameBuilder {
    private final DirectBufferVideoFrame frame;

    public CpuBufferVideoFrameBuilder(VideoPixelFormat videoPixelFormat) {
        this.frame = new DirectBufferVideoFrame(videoPixelFormat);
    }

    public VideoFrame build() {
        return this.frame;
    }

    public CpuBufferVideoFrameBuilder setColorSpace(ColorSpace colorSpace) {
        this.frame.setColorSpace(colorSpace);
        return this;
    }

    public CpuBufferVideoFrameBuilder setExternalDataInfo(ByteBuffer byteBuffer) {
        this.frame.setExternalDataInfo(byteBuffer);
        return this;
    }

    public CpuBufferVideoFrameBuilder setHeight(int i10) {
        this.frame.setHeight(i10);
        return this;
    }

    public CpuBufferVideoFrameBuilder setPlaneData(int i10, ByteBuffer byteBuffer) {
        this.frame.setPlaneData(i10, byteBuffer);
        return this;
    }

    public CpuBufferVideoFrameBuilder setPlaneStride(int i10, int i11) {
        this.frame.setPlaneStride(i10, i11);
        return this;
    }

    public CpuBufferVideoFrameBuilder setReleaseCallback(Runnable runnable) {
        this.frame.setReleaseCallback(runnable);
        return this;
    }

    public CpuBufferVideoFrameBuilder setRotation(VideoRotation videoRotation) {
        this.frame.setRotation(videoRotation);
        return this;
    }

    public CpuBufferVideoFrameBuilder setSupplementaryInfo(ByteBuffer byteBuffer) {
        this.frame.setSupplementaryInfo(byteBuffer);
        return this;
    }

    public CpuBufferVideoFrameBuilder setTimeStampUs(long j10) {
        this.frame.setTimeStampUs(j10);
        return this;
    }

    public CpuBufferVideoFrameBuilder setWidth(int i10) {
        this.frame.setWidth(i10);
        return this;
    }
}
