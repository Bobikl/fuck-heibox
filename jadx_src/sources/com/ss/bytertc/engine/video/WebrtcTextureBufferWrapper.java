package com.ss.bytertc.engine.video;

import android.graphics.Matrix;
import android.opengl.EGLContext;
import com.bytedance.realx.base.CalledByNative;
import com.bytedance.realx.video.FilterType;
import com.bytedance.realx.video.RendererCommon;
import com.bytedance.realx.video.TextureBufferImpl;
import com.bytedance.realx.video.f0;
import com.bytedance.realx.video.i0;

/* JADX INFO: loaded from: classes4.dex */
public class WebrtcTextureBufferWrapper implements ITextureBuffer, com.bytedance.realx.video.VideoFrame.TextureBuffer {
    TextureBufferImpl webrtcTextureBuffer;

    public WebrtcTextureBufferWrapper(TextureBufferImpl textureBufferImpl) {
        this.webrtcTextureBuffer = textureBufferImpl;
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public com.bytedance.realx.video.VideoFrame.Buffer copyData() {
        TextureBufferImpl textureBufferImpl = this.webrtcTextureBuffer;
        if (textureBufferImpl == null) {
            return null;
        }
        return textureBufferImpl.copyData();
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public com.bytedance.realx.video.VideoFrame.Buffer cropAndScale(int i10, int i11, int i12, int i13, int i14, int i15) {
        TextureBufferImpl textureBufferImpl = this.webrtcTextureBuffer;
        if (textureBufferImpl == null) {
            return null;
        }
        return textureBufferImpl.cropAndScale(i10, i11, i12, i13, i14, i15);
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public com.bytedance.realx.video.VideoFrame.Buffer cropAndScaleWithFilter(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        TextureBufferImpl textureBufferImpl = this.webrtcTextureBuffer;
        if (textureBufferImpl == null) {
            return null;
        }
        return textureBufferImpl.cropAndScale(i10, i11, i12, i13, i14, i15);
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer, com.bytedance.realx.video.VideoFrame.Buffer
    public /* synthetic */ int getBufferType() {
        return i0.a(this);
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public EGLContext getEglContext() {
        TextureBufferImpl textureBufferImpl = this.webrtcTextureBuffer;
        if (textureBufferImpl == null) {
            return null;
        }
        return textureBufferImpl.getEglContext();
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public int getHeight() {
        TextureBufferImpl textureBufferImpl = this.webrtcTextureBuffer;
        if (textureBufferImpl == null) {
            return 0;
        }
        return textureBufferImpl.getHeight();
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public long getNativeEglContext() {
        TextureBufferImpl textureBufferImpl = this.webrtcTextureBuffer;
        if (textureBufferImpl == null) {
            return 0L;
        }
        return textureBufferImpl.getNativeEglContext();
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public FilterType getScaleFilter() {
        return FilterType.Origin;
    }

    @Override // com.ss.bytertc.engine.video.ITextureBuffer, com.bytedance.realx.video.VideoFrame.TextureBuffer
    @CalledByNative
    public int getTextureId() {
        TextureBufferImpl textureBufferImpl = this.webrtcTextureBuffer;
        if (textureBufferImpl == null) {
            return 0;
        }
        return textureBufferImpl.getTextureId();
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public Matrix getTransformMatrix() {
        TextureBufferImpl textureBufferImpl = this.webrtcTextureBuffer;
        return textureBufferImpl == null ? new Matrix() : textureBufferImpl.getTransformMatrix();
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public com.bytedance.realx.video.VideoFrame.TextureBuffer.Type getType() {
        TextureBufferImpl textureBufferImpl = this.webrtcTextureBuffer;
        return textureBufferImpl == null ? com.bytedance.realx.video.VideoFrame.TextureBuffer.Type.OES : textureBufferImpl.getType();
    }

    @Override // com.ss.bytertc.engine.video.ITextureBuffer, com.bytedance.realx.video.VideoFrame.TextureBuffer
    public int getTypeGlTarget() {
        TextureBufferImpl textureBufferImpl = this.webrtcTextureBuffer;
        if (textureBufferImpl == null) {
            return 0;
        }
        return textureBufferImpl.getType().getGlTarget();
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public int getUnscaledHeight() {
        TextureBufferImpl textureBufferImpl = this.webrtcTextureBuffer;
        if (textureBufferImpl == null) {
            return 0;
        }
        return textureBufferImpl.getUnscaledHeight();
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public int getUnscaledWidth() {
        TextureBufferImpl textureBufferImpl = this.webrtcTextureBuffer;
        if (textureBufferImpl == null) {
            return 0;
        }
        return textureBufferImpl.getUnscaledWidth();
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public int getWidth() {
        TextureBufferImpl textureBufferImpl = this.webrtcTextureBuffer;
        if (textureBufferImpl == null) {
            return 0;
        }
        return textureBufferImpl.getWidth();
    }

    @Override // com.ss.bytertc.engine.video.ITextureBuffer, com.bytedance.realx.video.VideoFrame.TextureBuffer
    @CalledByNative
    public float[] nativeGetTransFormMatrix() {
        TextureBufferImpl textureBufferImpl = this.webrtcTextureBuffer;
        return textureBufferImpl == null ? new float[]{0.0f} : RendererCommon.convertMatrixFromAndroidGraphicsMatrix(textureBufferImpl.getTransformMatrix());
    }

    @Override // com.ss.bytertc.engine.video.ITextureBuffer, com.bytedance.realx.video.VideoFrame.Buffer, com.bytedance.realx.base.RefCounted
    public void release() {
        TextureBufferImpl textureBufferImpl = this.webrtcTextureBuffer;
        if (textureBufferImpl == null) {
            return;
        }
        textureBufferImpl.release();
    }

    @Override // com.ss.bytertc.engine.video.ITextureBuffer, com.bytedance.realx.video.VideoFrame.Buffer, com.bytedance.realx.base.RefCounted
    public void retain() {
        TextureBufferImpl textureBufferImpl = this.webrtcTextureBuffer;
        if (textureBufferImpl == null) {
            return;
        }
        textureBufferImpl.retain();
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public com.bytedance.realx.video.VideoFrame.Buffer scaleAndFill(int i10, int i11, int i12, int i13) {
        TextureBufferImpl textureBufferImpl = this.webrtcTextureBuffer;
        if (textureBufferImpl == null) {
            return null;
        }
        return textureBufferImpl.scaleAndFill(i10, i11, i12, i13);
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public com.bytedance.realx.video.VideoFrame.I420Buffer toI420() {
        TextureBufferImpl textureBufferImpl = this.webrtcTextureBuffer;
        if (textureBufferImpl == null) {
            return null;
        }
        return textureBufferImpl.toI420();
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public /* synthetic */ com.bytedance.realx.video.VideoFrame.NV12Buffer toNV12() {
        return f0.a(this);
    }
}
