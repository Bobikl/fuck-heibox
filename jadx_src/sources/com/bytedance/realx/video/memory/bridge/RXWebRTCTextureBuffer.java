package com.bytedance.realx.video.memory.bridge;

import android.graphics.Matrix;
import android.opengl.EGLContext;
import com.bytedance.realx.base.CalledByNative;
import com.bytedance.realx.base.RefCountDelegate;
import com.bytedance.realx.video.FilterType;
import com.bytedance.realx.video.RXPixelFormat;
import com.bytedance.realx.video.RXVideoScaleFilter;
import com.bytedance.realx.video.RendererCommon;
import com.bytedance.realx.video.VideoFrame;
import com.bytedance.realx.video.f0;
import com.bytedance.realx.video.i0;

/* JADX INFO: loaded from: classes6.dex */
public class RXWebRTCTextureBuffer implements VideoFrame.TextureBuffer {
    private boolean isAgfxTexture;
    private final long nativeRXVideoFrame;
    private final RefCountDelegate refCountDelegate;

    @CalledByNative
    RXWebRTCTextureBuffer(final long j10, boolean z10) {
        this.nativeRXVideoFrame = j10;
        this.isAgfxTexture = z10;
        this.refCountDelegate = new RefCountDelegate(new Runnable() { // from class: com.bytedance.realx.video.memory.bridge.a
            @Override // java.lang.Runnable
            public final void run() {
                RXWebRTCTextureBuffer.nativeReleaseRXVideoFrame(j10);
            }
        });
    }

    private VideoFrame.TextureBuffer applyTransformMatrix(Matrix matrix, int i10, int i11, int i12, int i13, FilterType filterType) {
        if (this.isAgfxTexture) {
            return null;
        }
        Matrix matrix2 = new Matrix(getTransformMatrix());
        matrix2.preConcat(matrix);
        retain();
        RXVideoScaleFilter rXVideoScaleFilterFromId = RXVideoScaleFilter.fromId(filterType.toInt());
        return new RXWebRTCTextureBuffer(nativeCreateTextureRXVideoFrame(this.nativeRXVideoFrame, RendererCommon.convertMatrixFromAndroidGraphicsMatrix(matrix2), i10, i11, i12, i13, rXVideoScaleFilterFromId), false);
    }

    private static native long nativeCreateTextureRXVideoFrame(long j10, float[] fArr, int i10, int i11, int i12, int i13, RXVideoScaleFilter rXVideoScaleFilter);

    private static native EGLContext nativeGetAndroidEGLContext(long j10);

    private static native EGLContext nativeGetEGLContext(long j10);

    private static native float[] nativeGetFloatTextureMatrix(long j10);

    private static native int nativeGetHeight(long j10);

    private static native RXPixelFormat nativeGetPixelFormat(long j10);

    private static native RXVideoScaleFilter nativeGetRXVideoScaleFilter(long j10);

    private static native int nativeGetTextureId(long j10);

    private static native int nativeGetUnscaledHeight(long j10);

    private static native int nativeGetUnscaledWidth(long j10);

    private static native int nativeGetWidth(long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeReleaseRXVideoFrame(long j10);

    private static native VideoFrame.I420Buffer nativeToI420(long j10);

    public VideoFrame.TextureBuffer applyTransformMatrix(Matrix matrix, int i10, int i11) {
        return applyTransformMatrix(matrix, i10, i11, i10, i11, FilterType.Origin);
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.Buffer copyData() {
        return null;
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i10, int i11, int i12, int i13, int i14, int i15) {
        if (this.isAgfxTexture) {
            return null;
        }
        int width = getWidth();
        int height = getHeight();
        int unscaledWidth = getUnscaledWidth();
        int unscaledHeight = getUnscaledHeight();
        Matrix matrix = new Matrix();
        float f10 = width;
        float f11 = height - (i11 + i13);
        float f12 = height;
        matrix.preTranslate(i10 / f10, f11 / f12);
        matrix.preScale(i12 / f10, i13 / f12);
        return applyTransformMatrix(matrix, Math.round((unscaledWidth * i12) / f10), Math.round((unscaledHeight * i13) / f12), i14, i15, FilterType.Origin);
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public VideoFrame.Buffer cropAndScaleWithFilter(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        if (this.isAgfxTexture) {
            return null;
        }
        int width = getWidth();
        int height = getHeight();
        int unscaledWidth = getUnscaledWidth();
        int unscaledHeight = getUnscaledHeight();
        Matrix matrix = new Matrix();
        float f10 = width;
        float f11 = height - (i11 + i13);
        float f12 = height;
        matrix.preTranslate(i10 / f10, f11 / f12);
        matrix.preScale(i12 / f10, i13 / f12);
        return applyTransformMatrix(matrix, Math.round((unscaledWidth * i12) / f10), Math.round((unscaledHeight * i13) / f12), i14, i15, FilterType.fromValue(i16));
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer, com.bytedance.realx.video.VideoFrame.Buffer
    public int getBufferType() {
        return i0.a(this);
    }

    EGLContext getEGLContext() {
        return nativeGetAndroidEGLContext(this.nativeRXVideoFrame);
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public EGLContext getEglContext() {
        return nativeGetEGLContext(this.nativeRXVideoFrame);
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public int getHeight() {
        return nativeGetHeight(this.nativeRXVideoFrame);
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public long getNativeEglContext() {
        EGLContext eGLContext = getEGLContext();
        if (eGLContext == null) {
            return 0L;
        }
        return eGLContext.getNativeHandle();
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public FilterType getScaleFilter() {
        return FilterType.fromValue(nativeGetRXVideoScaleFilter(this.nativeRXVideoFrame).value());
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public int getTextureId() {
        return nativeGetTextureId(this.nativeRXVideoFrame);
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public Matrix getTransformMatrix() {
        return RendererCommon.convertMatrixToAndroidGraphicsMatrix(nativeGetFloatTextureMatrix(this.nativeRXVideoFrame));
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public VideoFrame.TextureBuffer.Type getType() {
        RXPixelFormat rXPixelFormatNativeGetPixelFormat = nativeGetPixelFormat(this.nativeRXVideoFrame);
        if (rXPixelFormatNativeGetPixelFormat == RXPixelFormat.kTexture2D) {
            return VideoFrame.TextureBuffer.Type.RGB;
        }
        if (rXPixelFormatNativeGetPixelFormat == RXPixelFormat.kTextureOES) {
            return VideoFrame.TextureBuffer.Type.OES;
        }
        return null;
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public int getTypeGlTarget() {
        return getType().getGlTarget();
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public int getUnscaledHeight() {
        return nativeGetUnscaledHeight(this.nativeRXVideoFrame);
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public int getUnscaledWidth() {
        return nativeGetUnscaledWidth(this.nativeRXVideoFrame);
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public int getWidth() {
        return nativeGetWidth(this.nativeRXVideoFrame);
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public float[] nativeGetTransFormMatrix() {
        return nativeGetFloatTextureMatrix(this.nativeRXVideoFrame);
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
        if (this.isAgfxTexture) {
            return null;
        }
        Matrix matrix = new Matrix();
        int iMin = Math.min(i10, (getWidth() * i11) / getHeight());
        int iMin2 = Math.min(i11, (getHeight() * i10) / getWidth());
        matrix.preScale(iMin / getWidth(), iMin2 / getHeight());
        matrix.preTranslate(i12 / i10, (i11 - (i13 + iMin2)) / i11);
        return applyTransformMatrix(matrix, i10, i11);
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        return nativeToI420(this.nativeRXVideoFrame);
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public /* synthetic */ VideoFrame.NV12Buffer toNV12() {
        return f0.a(this);
    }
}
