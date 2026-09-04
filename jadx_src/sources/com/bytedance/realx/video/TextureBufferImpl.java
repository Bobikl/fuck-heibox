package com.bytedance.realx.video;

import android.graphics.Matrix;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.os.Handler;
import androidx.annotation.p0;
import com.bytedance.realx.base.RefCountDelegate;
import com.bytedance.realx.base.ThreadUtils;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public class TextureBufferImpl implements VideoFrame.TextureBuffer {
    private final int height;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final int f42176id;
    private final RefCountDelegate refCountDelegate;
    private FilterType scaleFilter;
    private final Handler toI420Handler;
    private final Matrix transformMatrix;
    private final VideoFrame.TextureBuffer.Type type;
    private final int unscaledHeight;
    private final int unscaledWidth;
    private final int width;
    private final YuvConverter yuvConverter;

    private TextureBufferImpl(int i10, int i11, int i12, int i13, VideoFrame.TextureBuffer.Type type, int i14, FilterType filterType, Matrix matrix, Handler handler, YuvConverter yuvConverter, @p0 Runnable runnable) {
        this.unscaledWidth = i10;
        this.unscaledHeight = i11;
        this.width = i12;
        this.height = i13;
        this.type = type;
        this.f42176id = i14;
        this.scaleFilter = filterType;
        this.transformMatrix = matrix;
        this.toI420Handler = handler;
        this.yuvConverter = yuvConverter;
        this.refCountDelegate = new RefCountDelegate(runnable);
    }

    public TextureBufferImpl(int i10, int i11, VideoFrame.TextureBuffer.Type type, int i12, Matrix matrix, Handler handler, YuvConverter yuvConverter, @p0 Runnable runnable) {
        this.unscaledWidth = i10;
        this.unscaledHeight = i11;
        this.width = i10;
        this.height = i11;
        this.type = type;
        this.f42176id = i12;
        this.transformMatrix = matrix;
        this.toI420Handler = handler;
        this.yuvConverter = yuvConverter;
        this.refCountDelegate = new RefCountDelegate(runnable);
    }

    private TextureBufferImpl applyTransformMatrix(Matrix matrix, int i10, int i11, int i12, int i13) {
        Matrix matrix2 = new Matrix(this.transformMatrix);
        matrix2.preConcat(matrix);
        retain();
        return new TextureBufferImpl(i10, i11, i12, i13, this.type, this.f42176id, this.scaleFilter, matrix2, this.toI420Handler, this.yuvConverter, new Runnable() { // from class: com.bytedance.realx.video.c0
            @Override // java.lang.Runnable
            public final void run() {
                this.f42183b.release();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$copyData$3(int i10) {
        this.yuvConverter.queueTexture(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ TextureBufferImpl lambda$copyData$4() throws Exception {
        final int iDequeueTexture = this.yuvConverter.dequeueTexture(this.width, this.height);
        if (iDequeueTexture == 0) {
            return null;
        }
        this.yuvConverter.drawTexture(this.type == VideoFrame.TextureBuffer.Type.OES ? 11 : 10, this.f42176id, iDequeueTexture, this.width, this.height);
        return new TextureBufferImpl(this.width, this.height, VideoFrame.TextureBuffer.Type.RGB, iDequeueTexture, this.transformMatrix, this.toI420Handler, this.yuvConverter, new Runnable() { // from class: com.bytedance.realx.video.a0
            @Override // java.lang.Runnable
            public final void run() {
                this.f42177b.lambda$copyData$3(iDequeueTexture);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ VideoFrame.I420Buffer lambda$toI420$1() throws Exception {
        return this.yuvConverter.convert(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ VideoFrame.I420Buffer lambda$toI420$2() throws Exception {
        return this.yuvConverter.convert(this, this.scaleFilter, this.unscaledWidth, this.unscaledHeight);
    }

    public TextureBufferImpl applyTransformMatrix(Matrix matrix, int i10, int i11) {
        return applyTransformMatrix(matrix, i10, i11, i10, i11);
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.Buffer copyData() {
        return (VideoFrame.Buffer) ThreadUtils.invokeAtFrontUninterruptibly(this.toI420Handler, new Callable() { // from class: com.bytedance.realx.video.z
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f42231b.lambda$copyData$4();
            }
        });
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i10, int i11, int i12, int i13, int i14, int i15) {
        Matrix matrix = new Matrix();
        int i16 = this.height;
        matrix.preTranslate(i10 / this.width, (i16 - (i11 + i13)) / i16);
        matrix.preScale(i12 / this.width, i13 / this.height);
        this.scaleFilter = FilterType.Origin;
        return applyTransformMatrix(matrix, Math.round((this.unscaledWidth * i12) / this.width), Math.round((this.unscaledHeight * i13) / this.height), i14, i15);
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public VideoFrame.Buffer cropAndScaleWithFilter(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        Matrix matrix = new Matrix();
        int i17 = this.height;
        matrix.preTranslate(i10 / this.width, (i17 - (i11 + i13)) / i17);
        matrix.preScale(i12 / this.width, i13 / this.height);
        this.scaleFilter = FilterType.fromValue(i16);
        return applyTransformMatrix(matrix, Math.round((this.unscaledWidth * i12) / this.width), Math.round((this.unscaledHeight * i13) / this.height), i14, i15);
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer, com.bytedance.realx.video.VideoFrame.Buffer
    public /* synthetic */ int getBufferType() {
        return i0.a(this);
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public EGLContext getEglContext() {
        Handler handler = this.toI420Handler;
        if (handler == null) {
            return null;
        }
        return (EGLContext) ThreadUtils.invokeAtFrontUninterruptibly(handler, new Callable() { // from class: com.bytedance.realx.video.b0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return EGL14.eglGetCurrentContext();
            }
        });
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public int getHeight() {
        return this.height;
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public long getNativeEglContext() {
        EGLContext eglContext = getEglContext();
        if (eglContext == null) {
            return 0L;
        }
        return eglContext.getNativeHandle();
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public FilterType getScaleFilter() {
        return this.scaleFilter;
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public int getTextureId() {
        return this.f42176id;
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public Matrix getTransformMatrix() {
        return this.transformMatrix;
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public VideoFrame.TextureBuffer.Type getType() {
        return this.type;
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public int getTypeGlTarget() {
        return this.type.getGlTarget();
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public int getUnscaledHeight() {
        return this.unscaledHeight;
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public int getUnscaledWidth() {
        return this.unscaledWidth;
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public int getWidth() {
        return this.width;
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public float[] nativeGetTransFormMatrix() {
        return RendererCommon.convertMatrixFromAndroidGraphicsMatrix(this.transformMatrix);
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
        Matrix matrix = new Matrix();
        int iMin = Math.min(i10, (getWidth() * i11) / getHeight());
        int iMin2 = Math.min(i11, (getHeight() * i10) / getWidth());
        matrix.preScale(iMin / getWidth(), iMin2 / getHeight());
        matrix.preTranslate(i12 / i10, (i11 - (i13 + iMin2)) / i11);
        return applyTransformMatrix(matrix, i10, i11);
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        FilterType filterType = this.scaleFilter;
        return (filterType == null || filterType == FilterType.Origin) ? (VideoFrame.I420Buffer) ThreadUtils.invokeAtFrontUninterruptibly(this.toI420Handler, new Callable() { // from class: com.bytedance.realx.video.x
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f42229b.lambda$toI420$1();
            }
        }) : (VideoFrame.I420Buffer) ThreadUtils.invokeAtFrontUninterruptibly(this.toI420Handler, new Callable() { // from class: com.bytedance.realx.video.y
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f42230b.lambda$toI420$2();
            }
        });
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public /* synthetic */ VideoFrame.NV12Buffer toNV12() {
        return f0.a(this);
    }
}
