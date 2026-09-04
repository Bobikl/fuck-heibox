package com.bytedance.realx.video.memory;

import android.opengl.EGLContext;
import com.bytedance.realx.base.CalledByNative;
import com.bytedance.realx.video.RXPixelFormat;
import com.bytedance.realx.video.RXVideoMemoryType;
import com.bytedance.realx.video.RXVideoRotation;
import com.bytedance.realx.video.RXVideoScaleFilter;

/* JADX INFO: loaded from: classes6.dex */
public class NativeTextureVideoMemory extends RXVideoTextureMemory {
    private long nativeHandle;

    @CalledByNative
    public NativeTextureVideoMemory(long j10) {
        this.nativeHandle = j10;
        setReleaseCallback(new Runnable() { // from class: com.bytedance.realx.video.memory.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f42209b.lambda$new$0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        long j10 = this.nativeHandle;
        if (j10 != 0) {
            nativeReleaseTextureVideoMemory(j10);
            this.nativeHandle = 0L;
        }
    }

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

    @Override // com.bytedance.realx.video.memory.RXVideoTextureMemory
    public EGLContext getEGLContext() {
        long j10 = this.nativeHandle;
        if (j10 == 0) {
            return null;
        }
        return nativeGetJavaEGLContext(j10);
    }

    @Override // com.bytedance.realx.video.memory.RTCVideoMemory
    public int getHeight() {
        long j10 = this.nativeHandle;
        if (j10 == 0) {
            return 0;
        }
        return nativeGetHeight(j10);
    }

    @Override // com.bytedance.realx.video.memory.RTCVideoMemory
    public RXVideoMemoryType getMemoryType() {
        long j10 = this.nativeHandle;
        if (j10 == 0) {
            return null;
        }
        return nativeGetVideoMemoryType(j10);
    }

    @Override // com.bytedance.realx.video.memory.RXVideoTextureMemory
    public long getNativeEGLContext() {
        long j10 = this.nativeHandle;
        if (j10 == 0) {
            return 0L;
        }
        return nativeGetNativeEGLContext(j10);
    }

    @Override // com.bytedance.realx.video.memory.RTCVideoMemory
    public RXVideoRotation getRotation() {
        long j10 = this.nativeHandle;
        if (j10 == 0) {
            return null;
        }
        return nativeGetRotation(j10);
    }

    @Override // com.bytedance.realx.video.memory.RXVideoTextureMemory
    public RXVideoScaleFilter getScaleFilter() {
        return nativeGetScaleFilter(this.nativeHandle);
    }

    @Override // com.bytedance.realx.video.memory.RXVideoTextureMemory
    public int getTextureId() {
        long j10 = this.nativeHandle;
        if (j10 == 0) {
            return 0;
        }
        return nativeGetTextureId(j10);
    }

    @Override // com.bytedance.realx.video.memory.RXVideoTextureMemory
    public float[] getTextureMatrix() {
        long j10 = this.nativeHandle;
        if (j10 != 0) {
            return nativeGetTextureMatrix(j10);
        }
        float[] fArr = new float[16];
        fArr[0] = 1.0f;
        fArr[5] = 1.0f;
        fArr[10] = 1.0f;
        fArr[15] = 1.0f;
        return fArr;
    }

    @Override // com.bytedance.realx.video.memory.RXVideoTextureMemory
    public RXPixelFormat getTextureTarget() {
        long j10 = this.nativeHandle;
        if (j10 == 0) {
            return null;
        }
        return nativeGetTextureTarget(j10);
    }

    @Override // com.bytedance.realx.video.memory.RXVideoTextureMemory
    public int getUnScaledHeight() {
        return nativeGetUnscaledHeight(this.nativeHandle);
    }

    @Override // com.bytedance.realx.video.memory.RXVideoTextureMemory
    public int getUnScaledWidth() {
        return nativeGetUnscaledWidth(this.nativeHandle);
    }

    @Override // com.bytedance.realx.video.memory.RTCVideoMemory
    public int getWidth() {
        long j10 = this.nativeHandle;
        if (j10 == 0) {
            return 0;
        }
        return nativeGetWidth(j10);
    }
}
