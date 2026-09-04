package com.bytedance.realx.video.memory;

import android.graphics.Matrix;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import androidx.annotation.n0;
import com.bytedance.realx.base.CalledByNative;
import com.bytedance.realx.video.RXPixelFormat;
import com.bytedance.realx.video.RXVideoMemoryType;
import com.bytedance.realx.video.RXVideoRotation;
import com.bytedance.realx.video.RXVideoScaleFilter;
import com.bytedance.realx.video.RendererCommon;

/* JADX INFO: loaded from: classes6.dex */
public class NativeRXOpenGLMemory extends RXVideoMemory implements RXVideoOpenGLMemoryInterface {
    @CalledByNative
    NativeRXOpenGLMemory(long j10) {
        super(j10);
    }

    @n0
    public static NativeRXOpenGLMemory createRXOpenGLMemory(int i10, int i11, int i12, int i13, int i14, RXPixelFormat rXPixelFormat, float[] fArr, EGLContext eGLContext, RXVideoScaleFilter rXVideoScaleFilter, RXVideoRotation rXVideoRotation, Runnable runnable) {
        return new NativeRXOpenGLMemory(nativeCreateOpenGLMemory(i10, i11, i12, i13, i14, rXPixelFormat, fArr, eGLContext, rXVideoScaleFilter, rXVideoRotation, runnable));
    }

    private static native long nativeCreateOpenGLMemory(int i10, int i11, int i12, int i13, int i14, RXPixelFormat rXPixelFormat, float[] fArr, EGLContext eGLContext, RXVideoScaleFilter rXVideoScaleFilter, RXVideoRotation rXVideoRotation, Runnable runnable);

    private static native int nativeGetHeight(long j10);

    private static native EGLContext nativeGetJavaEGLContext(long j10);

    private static native long nativeGetNativeEGLContext(long j10);

    private static native RXVideoRotation nativeGetRotation(long j10);

    private static native RXVideoScaleFilter nativeGetScaleFilter(long j10);

    private static native int nativeGetTextureId(long j10);

    private static native float[] nativeGetTextureMatrix(long j10);

    private static native RXPixelFormat nativeGetTextureTarget(long j10);

    private static native int nativeGetUnscaledHeight(long j10);

    private static native int nativeGetUnscaledWidth(long j10);

    private static native RXVideoMemoryType nativeGetVideoMemoryType(long j10);

    private static native int nativeGetWidth(long j10);

    private static native void nativeReleaseTextureVideoMemory(long j10);

    @CalledByNative
    private static void release(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // com.bytedance.realx.video.memory.RXVideoOpenGLMemoryInterface
    public Matrix getAndroidTextureMatrix() {
        return isNullPointer() ? new Matrix() : RendererCommon.convertMatrixToAndroidGraphicsMatrix(nativeGetTextureMatrix(this.nativeHandle));
    }

    @Override // com.bytedance.realx.video.memory.RXVideoOpenGLMemoryInterface
    public EGLContext getEGLContext() {
        return isNullPointer() ? EGL14.EGL_NO_CONTEXT : nativeGetJavaEGLContext(this.nativeHandle);
    }

    @Override // com.bytedance.realx.video.memory.RXVideoMemoryInterface
    public int getHeight() {
        return nativeGetHeight(this.nativeHandle);
    }

    @Override // com.bytedance.realx.video.memory.RXVideoMemoryInterface
    public RXVideoMemoryType getMemoryType() {
        if (isNullPointer()) {
            return null;
        }
        return nativeGetVideoMemoryType(this.nativeHandle);
    }

    @Override // com.bytedance.realx.video.memory.RXVideoOpenGLMemoryInterface
    public long getNativeEGLContext() {
        if (isNullPointer()) {
            return 0L;
        }
        return nativeGetNativeEGLContext(this.nativeHandle);
    }

    @Override // com.bytedance.realx.video.memory.RXVideoMemoryInterface
    public RXPixelFormat getPixelFormat() {
        return getTextureTarget();
    }

    @Override // com.bytedance.realx.video.memory.RXVideoOpenGLMemoryInterface
    public RXVideoRotation getRotation() {
        if (isNullPointer()) {
            return null;
        }
        return nativeGetRotation(this.nativeHandle);
    }

    @Override // com.bytedance.realx.video.memory.RXVideoOpenGLMemoryInterface
    public RXVideoScaleFilter getScaleFilter() {
        return nativeGetScaleFilter(this.nativeHandle);
    }

    @Override // com.bytedance.realx.video.memory.RXVideoOpenGLMemoryInterface
    public int getTextureId() {
        if (isNullPointer()) {
            return 0;
        }
        return nativeGetTextureId(this.nativeHandle);
    }

    @Override // com.bytedance.realx.video.memory.RXVideoOpenGLMemoryInterface
    public float[] getTextureMatrix() {
        if (!isNullPointer()) {
            return nativeGetTextureMatrix(this.nativeHandle);
        }
        float[] fArr = new float[16];
        fArr[0] = 1.0f;
        fArr[5] = 1.0f;
        fArr[10] = 1.0f;
        fArr[15] = 1.0f;
        return fArr;
    }

    @Override // com.bytedance.realx.video.memory.RXVideoOpenGLMemoryInterface
    public RXPixelFormat getTextureTarget() {
        return isNullPointer() ? RXPixelFormat.kUnknown : nativeGetTextureTarget(this.nativeHandle);
    }

    @Override // com.bytedance.realx.video.memory.RXVideoOpenGLMemoryInterface
    public int getUnScaledHeight() {
        return nativeGetUnscaledHeight(this.nativeHandle);
    }

    @Override // com.bytedance.realx.video.memory.RXVideoOpenGLMemoryInterface
    public int getUnScaledWidth() {
        return nativeGetUnscaledWidth(this.nativeHandle);
    }

    @Override // com.bytedance.realx.video.memory.RXVideoMemoryInterface
    public int getWidth() {
        return nativeGetWidth(this.nativeHandle);
    }
}
