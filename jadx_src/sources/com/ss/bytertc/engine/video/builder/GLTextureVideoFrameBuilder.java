package com.ss.bytertc.engine.video.builder;

import android.opengl.EGLContext;
import com.ss.bytertc.engine.data.ColorSpace;
import com.ss.bytertc.engine.data.VideoPixelFormat;
import com.ss.bytertc.engine.data.VideoRotation;
import com.ss.bytertc.engine.video.VideoFrame;
import com.ss.bytertc.engine.video.impl.DirectBufferVideoFrame;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class GLTextureVideoFrameBuilder {
    private final DirectBufferVideoFrame frame;

    public GLTextureVideoFrameBuilder(VideoPixelFormat videoPixelFormat) {
        this.frame = new DirectBufferVideoFrame(videoPixelFormat);
    }

    public VideoFrame build() {
        return this.frame;
    }

    public GLTextureVideoFrameBuilder setColorSpace(ColorSpace colorSpace) {
        this.frame.setColorSpace(colorSpace);
        return this;
    }

    public GLTextureVideoFrameBuilder setEGLContext(EGLContext eGLContext) {
        this.frame.setEGLContext(eGLContext);
        return this;
    }

    public GLTextureVideoFrameBuilder setExternalDataInfo(ByteBuffer byteBuffer) {
        this.frame.setExternalDataInfo(byteBuffer);
        return this;
    }

    public GLTextureVideoFrameBuilder setHeight(int i10) {
        this.frame.setHeight(i10);
        return this;
    }

    public GLTextureVideoFrameBuilder setReleaseCallback(Runnable runnable) {
        this.frame.setReleaseCallback(runnable);
        return this;
    }

    public GLTextureVideoFrameBuilder setRotation(VideoRotation videoRotation) {
        this.frame.setRotation(videoRotation);
        return this;
    }

    public GLTextureVideoFrameBuilder setSupplementaryInfo(ByteBuffer byteBuffer) {
        this.frame.setSupplementaryInfo(byteBuffer);
        return this;
    }

    public GLTextureVideoFrameBuilder setTextureID(int i10) {
        this.frame.setTextureID(i10);
        return this;
    }

    public GLTextureVideoFrameBuilder setTextureMatrix(float[] fArr) {
        this.frame.setTextureMatrix(fArr);
        return this;
    }

    public GLTextureVideoFrameBuilder setTimeStampUs(long j10) {
        this.frame.setTimeStampUs(j10);
        return this;
    }

    public GLTextureVideoFrameBuilder setWidth(int i10) {
        this.frame.setWidth(i10);
        return this;
    }
}
