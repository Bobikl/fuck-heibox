package com.bytedance.realx.video;

import android.graphics.Matrix;
import android.graphics.Point;
import android.opengl.GLES20;
import android.util.Log;
import androidx.annotation.p0;
import com.bytedance.realx.video.memory.NativeRXByteMemory;
import com.bytedance.realx.video.memory.RXVideoByteMemoryInterface;
import com.bytedance.realx.video.memory.RXVideoFrameInterface;
import com.bytedance.realx.video.memory.RXVideoMemoryInterface;
import com.bytedance.realx.video.memory.RXVideoOpenGLMemoryInterface;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public class VideoFrameDrawer {
    static final float[] srcPoints = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f};

    @p0
    private RXVideoFrameInterface lastI420Frame;
    private int renderHeight;
    private int renderWidth;
    private final float[] dstPoints = new float[6];
    private final Point renderSize = new Point();
    private final YuvUploader yuvUploader = new YuvUploader(null);
    private final Matrix renderMatrix = new Matrix();

    /* JADX INFO: renamed from: com.bytedance.realx.video.VideoFrameDrawer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$bytedance$realx$video$RXPixelFormat;

        static {
            int[] iArr = new int[RXPixelFormat.values().length];
            $SwitchMap$com$bytedance$realx$video$RXPixelFormat = iArr;
            try {
                iArr[RXPixelFormat.kTextureOES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXPixelFormat[RXPixelFormat.kTexture2D.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class YuvUploader {

        @p0
        private ByteBuffer copyBuffer;

        @p0
        private int[] yuvTextures;

        private YuvUploader() {
        }

        /* synthetic */ YuvUploader(AnonymousClass1 anonymousClass1) {
            this();
        }

        @p0
        public int[] getYuvTextures() {
            return this.yuvTextures;
        }

        public void release() {
            this.copyBuffer = null;
            int[] iArr = this.yuvTextures;
            if (iArr != null) {
                GLES20.glDeleteTextures(3, iArr, 0);
                this.yuvTextures = null;
            }
        }

        @p0
        public int[] uploadFromBuffer(RXVideoByteMemoryInterface rXVideoByteMemoryInterface) {
            if (rXVideoByteMemoryInterface.getPixelFormat() != RXPixelFormat.kI420) {
                return null;
            }
            return uploadYuvData(rXVideoByteMemoryInterface.getWidth(), rXVideoByteMemoryInterface.getHeight(), new int[]{rXVideoByteMemoryInterface.getPlaneLineSize(0), rXVideoByteMemoryInterface.getPlaneLineSize(1), rXVideoByteMemoryInterface.getPlaneLineSize(2)}, new ByteBuffer[]{rXVideoByteMemoryInterface.getPlaneData(0), rXVideoByteMemoryInterface.getPlaneData(1), rXVideoByteMemoryInterface.getPlaneData(2)});
        }

        @p0
        public int[] uploadYuvData(int i10, int i11, int[] iArr, ByteBuffer[] byteBufferArr) {
            ByteBuffer byteBuffer;
            ByteBuffer byteBuffer2;
            int i12 = i10 / 2;
            int[] iArr2 = {i10, i12, i12};
            int i13 = i11 / 2;
            int[] iArr3 = {i11, i13, i13};
            int iMax = 0;
            for (int i14 = 0; i14 < 3; i14++) {
                int i15 = iArr[i14];
                int i16 = iArr2[i14];
                if (i15 > i16) {
                    iMax = Math.max(iMax, i16 * iArr3[i14]);
                }
            }
            if (iMax > 0 && ((byteBuffer2 = this.copyBuffer) == null || byteBuffer2.capacity() < iMax)) {
                this.copyBuffer = ByteBuffer.allocateDirect(iMax);
            }
            if (this.yuvTextures == null) {
                this.yuvTextures = new int[3];
                for (int i17 = 0; i17 < 3; i17++) {
                    this.yuvTextures[i17] = GlUtil.generateTexture(bb.c.e.F);
                }
            }
            for (int i18 = 0; i18 < 3; i18++) {
                GLES20.glPixelStorei(bb.c.d.On, 1);
                GLES20.glActiveTexture(33984 + i18);
                GLES20.glBindTexture(bb.c.e.F, this.yuvTextures[i18]);
                int i19 = iArr[i18];
                int i20 = iArr2[i18];
                if (i19 == i20) {
                    byteBuffer = byteBufferArr[i18];
                } else {
                    YuvHelper.copyPlane(byteBufferArr[i18], i19, this.copyBuffer, i20, i20, iArr3[i18]);
                    byteBuffer = this.copyBuffer;
                }
                GLES20.glTexImage2D(bb.c.e.F, 0, bb.c.f.PB, iArr2[i18], iArr3[i18], 0, bb.c.f.PB, bb.c.f.Zc, byteBuffer);
                GLES20.glPixelStorei(bb.c.d.On, 4);
            }
            return this.yuvTextures;
        }
    }

    private void calculateTransformedRenderSize(int i10, int i11, @p0 Matrix matrix) {
        if (matrix == null) {
            this.renderWidth = i10;
            this.renderHeight = i11;
            return;
        }
        matrix.mapPoints(this.dstPoints, srcPoints);
        for (int i12 = 0; i12 < 3; i12++) {
            float[] fArr = this.dstPoints;
            int i13 = i12 * 2;
            int i14 = i13 + 0;
            fArr[i14] = fArr[i14] * i10;
            int i15 = i13 + 1;
            fArr[i15] = fArr[i15] * i11;
        }
        float[] fArr2 = this.dstPoints;
        this.renderWidth = distance(fArr2[0], fArr2[1], fArr2[2], fArr2[3]);
        float[] fArr3 = this.dstPoints;
        this.renderHeight = distance(fArr3[0], fArr3[1], fArr3[4], fArr3[5]);
    }

    private static int distance(float f10, float f11, float f12, float f13) {
        return (int) Math.round(Math.hypot(f12 - f10, f13 - f11));
    }

    static void drawTexture(RendererCommon.GlDrawer glDrawer, RXVideoOpenGLMemoryInterface rXVideoOpenGLMemoryInterface, Matrix matrix, int i10, int i11, int i12, int i13, int i14, int i15, FilterType filterType, int i16, int i17) {
        Matrix matrix2 = new Matrix(rXVideoOpenGLMemoryInterface.getAndroidTextureMatrix());
        matrix2.preConcat(matrix);
        float[] fArrConvertMatrixFromAndroidGraphicsMatrix = RendererCommon.convertMatrixFromAndroidGraphicsMatrix(matrix2);
        int i18 = AnonymousClass1.$SwitchMap$com$bytedance$realx$video$RXPixelFormat[rXVideoOpenGLMemoryInterface.getTextureTarget().ordinal()];
        if (i18 == 1) {
            glDrawer.drawOes(rXVideoOpenGLMemoryInterface.getTextureId(), fArrConvertMatrixFromAndroidGraphicsMatrix, i10, i11, i12, i13, i14, i15, filterType, i16, i17);
        } else {
            if (i18 != 2) {
                throw new RuntimeException("Unknown texture type.");
            }
            glDrawer.drawRgb(rXVideoOpenGLMemoryInterface.getTextureId(), fArrConvertMatrixFromAndroidGraphicsMatrix, i10, i11, i12, i13, i14, i15, filterType, i16, i17);
        }
    }

    public void drawFrame(RXVideoFrameInterface rXVideoFrameInterface, RendererCommon.GlDrawer glDrawer) {
        drawFrame(rXVideoFrameInterface, glDrawer, null);
    }

    public void drawFrame(RXVideoFrameInterface rXVideoFrameInterface, RendererCommon.GlDrawer glDrawer, Matrix matrix) {
        drawFrame(rXVideoFrameInterface, glDrawer, matrix, 0, 0, rXVideoFrameInterface.getRotatedWidth(), rXVideoFrameInterface.getRotatedHeight());
    }

    public void drawFrame(RXVideoFrameInterface rXVideoFrameInterface, RendererCommon.GlDrawer glDrawer, @p0 Matrix matrix, int i10, int i11, int i12, int i13) {
        if (rXVideoFrameInterface == null) {
            return;
        }
        RXVideoMemoryInterface andRetainVideoFrameMemory = rXVideoFrameInterface.getAndRetainVideoFrameMemory();
        try {
            if (andRetainVideoFrameMemory == null) {
                return;
            }
            try {
                calculateTransformedRenderSize(rXVideoFrameInterface.getRotatedWidth(), rXVideoFrameInterface.getRotatedHeight(), matrix);
                boolean z10 = andRetainVideoFrameMemory.getMemoryType() == RXVideoMemoryType.kOPENGL_TEXTURE;
                this.renderMatrix.reset();
                this.renderMatrix.preTranslate(0.5f, 0.5f);
                if (!z10) {
                    this.renderMatrix.preScale(1.0f, -1.0f);
                }
                this.renderMatrix.preRotate(rXVideoFrameInterface.getRotation().value());
                this.renderMatrix.preTranslate(-0.5f, -0.5f);
                if (matrix != null) {
                    this.renderMatrix.preConcat(matrix);
                }
                if (!z10 || this.renderWidth <= 0) {
                    if (rXVideoFrameInterface != this.lastI420Frame) {
                        this.lastI420Frame = rXVideoFrameInterface;
                        RXVideoFrameInterface i420 = rXVideoFrameInterface.toI420();
                        if (i420 == null) {
                            return;
                        }
                        RXVideoMemoryInterface andRetainVideoFrameMemory2 = i420.getAndRetainVideoFrameMemory();
                        if (!(andRetainVideoFrameMemory2 instanceof NativeRXByteMemory)) {
                            i420.release();
                            return;
                        } else {
                            this.yuvUploader.uploadFromBuffer((RXVideoByteMemoryInterface) andRetainVideoFrameMemory2);
                            andRetainVideoFrameMemory2.release();
                            i420.release();
                        }
                    }
                    glDrawer.drawYuv(this.yuvUploader.getYuvTextures(), RendererCommon.convertMatrixFromAndroidGraphicsMatrix(this.renderMatrix), this.renderWidth, this.renderHeight, i10, i11, i12, i13, FilterType.Origin, 0, 0);
                } else {
                    RXVideoOpenGLMemoryInterface rXVideoOpenGLMemoryInterface = (RXVideoOpenGLMemoryInterface) andRetainVideoFrameMemory;
                    FilterType filterTypeFromValue = FilterType.fromValue(rXVideoOpenGLMemoryInterface.getScaleFilter().value());
                    int unScaledWidth = rXVideoOpenGLMemoryInterface.getUnScaledWidth();
                    int unScaledHeight = rXVideoOpenGLMemoryInterface.getUnScaledHeight();
                    this.lastI420Frame = null;
                    if (filterTypeFromValue == null || filterTypeFromValue == FilterType.Origin || unScaledWidth == 0 || unScaledHeight == 0) {
                        drawTexture(glDrawer, rXVideoOpenGLMemoryInterface, this.renderMatrix, this.renderWidth, this.renderHeight, i10, i11, i12, i13, FilterType.Origin, 0, 0);
                    } else {
                        drawTexture(glDrawer, rXVideoOpenGLMemoryInterface, this.renderMatrix, this.renderWidth, this.renderHeight, i10, i11, i12, i13, filterTypeFromValue, unScaledWidth, unScaledHeight);
                    }
                }
            } catch (Exception e10) {
                Log.w("VideoFrameDrawer", "draw frame error", e10);
            }
        } finally {
            andRetainVideoFrameMemory.release();
        }
    }

    public void release() {
        this.yuvUploader.release();
        this.lastI420Frame = null;
    }
}
