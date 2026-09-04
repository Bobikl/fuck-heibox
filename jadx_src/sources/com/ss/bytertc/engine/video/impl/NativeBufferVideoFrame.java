package com.ss.bytertc.engine.video.impl;

import android.opengl.EGLContext;
import com.bytedance.realx.base.CalledByNative;
import com.ss.bytertc.engine.data.CameraId;
import com.ss.bytertc.engine.data.ColorSpace;
import com.ss.bytertc.engine.data.VideoContentType;
import com.ss.bytertc.engine.data.VideoFrameType;
import com.ss.bytertc.engine.data.VideoPixelFormat;
import com.ss.bytertc.engine.data.VideoRotation;
import com.ss.bytertc.engine.video.FovVideoFrameInfo;
import com.ss.bytertc.engine.video.VideoFrame;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class NativeBufferVideoFrame extends VideoFrame {
    private long nativeHandle;

    @CalledByNative
    NativeBufferVideoFrame(long j10) {
        this.nativeHandle = j10;
        setReleaseCallback(new Runnable() { // from class: com.ss.bytertc.engine.video.impl.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f98043b.lambda$new$0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        long j10 = this.nativeHandle;
        if (j10 != 0) {
            nativeFreeVideoFrame(j10);
            this.nativeHandle = 0L;
        }
    }

    private static native void nativeFreeVideoFrame(long j10);

    private static native CameraId nativeGetCameraId(long j10);

    private static native ColorSpace nativeGetColorSpace(long j10);

    private static native VideoContentType nativeGetContentType(long j10);

    private static native EGLContext nativeGetEglContext(long j10);

    private static native ByteBuffer nativeGetExternalDataInfo(long j10);

    private static native FovVideoFrameInfo nativeGetFovTile(long j10);

    private static native int nativeGetHeight(long j10);

    private static native int nativeGetNumberOfPlanes(long j10);

    private static native VideoPixelFormat nativeGetPixelFormat(long j10);

    private static native ByteBuffer nativeGetPlaneData(long j10, int i10);

    private static native VideoRotation nativeGetRotation(long j10);

    private static native ByteBuffer nativeGetSupplementaryInfo(long j10);

    private static native int nativeGetTextureID(long j10);

    private static native float[] nativeGetTextureMatrix(long j10);

    private static native long nativeGetTimeStampUs(long j10);

    private static native VideoFrameType nativeGetVideoFrameType(long j10);

    private static native int nativeGetWidth(long j10);

    private static native int nativegetPlaneStride(long j10, int i10);

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public CameraId getCameraId() {
        long j10 = this.nativeHandle;
        if (j10 == 0) {
            return null;
        }
        return nativeGetCameraId(j10);
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public ColorSpace getColorSpace() {
        long j10 = this.nativeHandle;
        if (j10 == 0) {
            return null;
        }
        return nativeGetColorSpace(j10);
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public VideoContentType getContentType() {
        long j10 = this.nativeHandle;
        if (j10 == 0) {
            return null;
        }
        return nativeGetContentType(j10);
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public EGLContext getEGLContext() {
        long j10 = this.nativeHandle;
        if (j10 == 0) {
            return null;
        }
        return nativeGetEglContext(j10);
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public ByteBuffer getExternalDataInfo() {
        long j10 = this.nativeHandle;
        if (j10 == 0) {
            return null;
        }
        return nativeGetExternalDataInfo(j10);
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public FovVideoFrameInfo getFovTileInfo() {
        return nativeGetFovTile(this.nativeHandle);
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public VideoFrameType getFrameType() {
        long j10 = this.nativeHandle;
        if (j10 == 0) {
            return null;
        }
        return nativeGetVideoFrameType(j10);
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public int getHeight() {
        long j10 = this.nativeHandle;
        if (j10 == 0) {
            return 0;
        }
        return nativeGetHeight(j10);
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public int getNumberOfPlanes() {
        long j10 = this.nativeHandle;
        if (j10 == 0) {
            return 0;
        }
        return nativeGetNumberOfPlanes(j10);
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public VideoPixelFormat getPixelFormat() {
        long j10 = this.nativeHandle;
        if (j10 == 0) {
            return null;
        }
        return nativeGetPixelFormat(j10);
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public ByteBuffer getPlaneData(int i10) {
        long j10 = this.nativeHandle;
        if (j10 == 0) {
            return null;
        }
        return nativeGetPlaneData(j10, i10);
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public int getPlaneStride(int i10) {
        long j10 = this.nativeHandle;
        if (j10 == 0) {
            return 0;
        }
        return nativegetPlaneStride(j10, i10);
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public VideoRotation getRotation() {
        long j10 = this.nativeHandle;
        if (j10 == 0) {
            return null;
        }
        return nativeGetRotation(j10);
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public ByteBuffer getSupplementaryInfo() {
        long j10 = this.nativeHandle;
        if (j10 == 0) {
            return null;
        }
        return nativeGetSupplementaryInfo(j10);
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public int getTextureID() {
        long j10 = this.nativeHandle;
        if (j10 == 0) {
            return 0;
        }
        return nativeGetTextureID(j10);
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public float[] getTextureMatrix() {
        long j10 = this.nativeHandle;
        if (j10 == 0) {
            return null;
        }
        return nativeGetTextureMatrix(j10);
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public long getTimeStampUs() {
        long j10 = this.nativeHandle;
        if (j10 == 0) {
            return 0L;
        }
        return nativeGetTimeStampUs(j10);
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public int getWidth() {
        long j10 = this.nativeHandle;
        if (j10 == 0) {
            return 0;
        }
        return nativeGetWidth(j10);
    }
}
