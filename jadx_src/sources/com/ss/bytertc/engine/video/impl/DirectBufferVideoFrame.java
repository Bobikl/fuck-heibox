package com.ss.bytertc.engine.video.impl;

import android.opengl.EGLContext;
import com.ss.bytertc.engine.data.CameraId;
import com.ss.bytertc.engine.data.ColorSpace;
import com.ss.bytertc.engine.data.VideoContentType;
import com.ss.bytertc.engine.data.VideoFrameType;
import com.ss.bytertc.engine.data.VideoPixelFormat;
import com.ss.bytertc.engine.data.VideoRotation;
import com.ss.bytertc.engine.video.VideoFrame;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class DirectBufferVideoFrame extends VideoFrame {
    private ByteBuffer[] dataOfPlanes;
    private ByteBuffer externalDataInfo;
    private VideoFrameType frameType;
    private int height;
    private VideoPixelFormat pixelFormat;
    private int[] strideOfPlanes;
    private ByteBuffer supplementaryInfo;
    private long timestampUs;
    private int width;
    private ColorSpace colorSpace = ColorSpace.BT601_LIMITED_RANGE;
    private VideoRotation rotation = VideoRotation.VIDEO_ROTATION_0;
    private int textureID = 0;
    private float[] textureMatrix = null;
    private EGLContext eglContext = null;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.video.impl.DirectBufferVideoFrame$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$VideoPixelFormat;

        static {
            int[] iArr = new int[VideoPixelFormat.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$VideoPixelFormat = iArr;
            try {
                iArr[VideoPixelFormat.I420.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$VideoPixelFormat[VideoPixelFormat.NV12.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$VideoPixelFormat[VideoPixelFormat.NV21.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$VideoPixelFormat[VideoPixelFormat.RGBA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$VideoPixelFormat[VideoPixelFormat.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$VideoPixelFormat[VideoPixelFormat.TEXTURE_2D.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$VideoPixelFormat[VideoPixelFormat.TEXTURE_OES.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public DirectBufferVideoFrame(VideoPixelFormat videoPixelFormat) {
        int i10 = 0;
        this.pixelFormat = videoPixelFormat;
        int i11 = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$VideoPixelFormat[videoPixelFormat.ordinal()];
        if (i11 == 1) {
            this.frameType = VideoFrameType.RAW_MEMORY;
            i10 = 3;
        } else if (i11 == 2 || i11 == 3) {
            this.frameType = VideoFrameType.RAW_MEMORY;
            i10 = 2;
        } else if (i11 != 4) {
            this.frameType = VideoFrameType.GL_TEXTURE;
        } else {
            this.frameType = VideoFrameType.RAW_MEMORY;
            i10 = 1;
        }
        this.dataOfPlanes = new ByteBuffer[i10];
        this.strideOfPlanes = new int[i10];
    }

    private ByteBuffer convert2DirectBuffer(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        if (byteBuffer.isDirect()) {
            return byteBuffer;
        }
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(byteBuffer.remaining());
        byteBufferAllocateDirect.position(0);
        byteBufferAllocateDirect.put(byteBuffer);
        byteBufferAllocateDirect.rewind();
        return byteBufferAllocateDirect;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public CameraId getCameraId() {
        return CameraId.CAMERA_ID_INVALID;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public ColorSpace getColorSpace() {
        return this.colorSpace;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public VideoContentType getContentType() {
        return VideoContentType.NORMAL_FRAME;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public EGLContext getEGLContext() {
        return this.eglContext;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public ByteBuffer getExternalDataInfo() {
        return this.externalDataInfo;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public VideoFrameType getFrameType() {
        return this.frameType;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public int getHeight() {
        return this.height;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public int getNumberOfPlanes() {
        return this.dataOfPlanes.length;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public VideoPixelFormat getPixelFormat() {
        return this.pixelFormat;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public ByteBuffer getPlaneData(int i10) {
        return this.dataOfPlanes[i10];
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public int getPlaneStride(int i10) {
        return this.strideOfPlanes[i10];
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public VideoRotation getRotation() {
        return this.rotation;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public ByteBuffer getSupplementaryInfo() {
        return this.supplementaryInfo;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public int getTextureID() {
        return this.textureID;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public float[] getTextureMatrix() {
        return this.textureMatrix;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public long getTimeStampUs() {
        return this.timestampUs;
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public int getWidth() {
        return this.width;
    }

    public void setColorSpace(ColorSpace colorSpace) {
        this.colorSpace = colorSpace;
    }

    public void setEGLContext(EGLContext eGLContext) {
        this.eglContext = eGLContext;
    }

    public void setExternalDataInfo(ByteBuffer byteBuffer) {
        this.externalDataInfo = convert2DirectBuffer(byteBuffer);
    }

    public void setHeight(int i10) {
        this.height = i10;
    }

    public void setPlaneData(int i10, ByteBuffer byteBuffer) {
        if (this.frameType != VideoFrameType.GL_TEXTURE && i10 < this.dataOfPlanes.length) {
            this.dataOfPlanes[i10] = convert2DirectBuffer(byteBuffer);
        }
    }

    public void setPlaneStride(int i10, int i11) {
        if (this.frameType != VideoFrameType.GL_TEXTURE && i10 < this.dataOfPlanes.length) {
            this.strideOfPlanes[i10] = i11;
        }
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public void setReleaseCallback(Runnable runnable) {
        super.setReleaseCallback(runnable);
    }

    public void setRotation(VideoRotation videoRotation) {
        this.rotation = videoRotation;
    }

    public void setSupplementaryInfo(ByteBuffer byteBuffer) {
        this.supplementaryInfo = convert2DirectBuffer(byteBuffer);
    }

    public void setTextureID(int i10) {
        if (this.frameType == VideoFrameType.RAW_MEMORY) {
            return;
        }
        this.textureID = i10;
    }

    public void setTextureMatrix(float[] fArr) {
        this.textureMatrix = fArr;
    }

    public void setTimeStampUs(long j10) {
        this.timestampUs = j10;
    }

    public void setWidth(int i10) {
        this.width = i10;
    }
}
