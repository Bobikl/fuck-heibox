package com.ss.bytertc.base.media;

import android.graphics.Matrix;
import android.graphics.Point;
import android.opengl.GLES20;
import android.util.Log;
import androidx.annotation.p0;
import com.bytedance.realx.video.FilterType;
import com.bytedance.realx.video.GlUtil;
import com.bytedance.realx.video.RendererCommon;
import com.bytedance.realx.video.VideoFrame;
import com.bytedance.realx.video.YuvHelper;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes10.dex */
public class VideoFrameDrawer {
    static final float[] srcPoints = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f};

    @p0
    private VideoFrame lastI420Frame;
    private int renderHeight;
    private int renderWidth;
    private final float[] dstPoints = new float[6];
    private final Point renderSize = new Point();
    private final YuvUploader yuvUploader = new YuvUploader(null);
    private final Matrix renderMatrix = new Matrix();

    /* JADX INFO: renamed from: com.ss.bytertc.base.media.VideoFrameDrawer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$bytedance$realx$video$VideoFrame$TextureBuffer$Type;

        static {
            int[] iArr = new int[VideoFrame.TextureBuffer.Type.values().length];
            $SwitchMap$com$bytedance$realx$video$VideoFrame$TextureBuffer$Type = iArr;
            try {
                iArr[VideoFrame.TextureBuffer.Type.OES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$VideoFrame$TextureBuffer$Type[VideoFrame.TextureBuffer.Type.RGB.ordinal()] = 2;
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
        public int[] uploadFromBuffer(VideoFrame.I420Buffer i420Buffer) {
            return uploadYuvData(i420Buffer.getWidth(), i420Buffer.getHeight(), new int[]{i420Buffer.getStrideY(), i420Buffer.getStrideU(), i420Buffer.getStrideV()}, new ByteBuffer[]{i420Buffer.getDataY(), i420Buffer.getDataU(), i420Buffer.getDataV()});
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

    static void drawTexture(RendererCommon.GlDrawer glDrawer, VideoFrame.TextureBuffer textureBuffer, Matrix matrix, int i10, int i11, int i12, int i13, int i14, int i15, FilterType filterType, int i16, int i17) {
        Matrix matrix2 = new Matrix(textureBuffer.getTransformMatrix());
        matrix2.preConcat(matrix);
        float[] fArrConvertMatrixFromAndroidGraphicsMatrix = RendererCommon.convertMatrixFromAndroidGraphicsMatrix(matrix2);
        int i18 = AnonymousClass1.$SwitchMap$com$bytedance$realx$video$VideoFrame$TextureBuffer$Type[textureBuffer.getType().ordinal()];
        if (i18 == 1) {
            glDrawer.drawOes(textureBuffer.getTextureId(), fArrConvertMatrixFromAndroidGraphicsMatrix, i10, i11, i12, i13, i14, i15, filterType, i16, i17);
        } else {
            if (i18 != 2) {
                throw new RuntimeException("Unknown texture type.");
            }
            glDrawer.drawRgb(textureBuffer.getTextureId(), fArrConvertMatrixFromAndroidGraphicsMatrix, i10, i11, i12, i13, i14, i15, filterType, i16, i17);
        }
    }

    public void drawFrame(VideoFrame videoFrame, RendererCommon.GlDrawer glDrawer) {
        drawFrame(videoFrame, glDrawer, null);
    }

    public void drawFrame(VideoFrame videoFrame, RendererCommon.GlDrawer glDrawer, Matrix matrix) {
        drawFrame(videoFrame, glDrawer, matrix, 0, 0, videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight());
    }

    public void drawFrame(VideoFrame videoFrame, RendererCommon.GlDrawer glDrawer, @p0 Matrix matrix, int i10, int i11, int i12, int i13) {
        try {
            calculateTransformedRenderSize(videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight(), matrix);
            boolean z10 = videoFrame.getBuffer() instanceof VideoFrame.TextureBuffer;
            this.renderMatrix.reset();
            this.renderMatrix.preTranslate(0.5f, 0.5f);
            if (!z10) {
                this.renderMatrix.preScale(1.0f, -1.0f);
            }
            this.renderMatrix.preRotate(videoFrame.getRotation());
            this.renderMatrix.preTranslate(-0.5f, -0.5f);
            if (matrix != null) {
                this.renderMatrix.preConcat(matrix);
            }
            if (!z10 || this.renderWidth <= 0) {
                if (videoFrame != this.lastI420Frame) {
                    this.lastI420Frame = videoFrame;
                    if (videoFrame.getBuffer() != null) {
                        VideoFrame.I420Buffer i420 = videoFrame.getBuffer().toI420();
                        this.yuvUploader.uploadFromBuffer(i420);
                        i420.release();
                    }
                }
                glDrawer.drawYuv(this.yuvUploader.getYuvTextures(), RendererCommon.convertMatrixFromAndroidGraphicsMatrix(this.renderMatrix), this.renderWidth, this.renderHeight, i10, i11, i12, i13, FilterType.Origin, 0, 0);
                return;
            }
            FilterType scaleFilter = ((VideoFrame.TextureBuffer) videoFrame.getBuffer()).getScaleFilter();
            int unscaledWidth = ((VideoFrame.TextureBuffer) videoFrame.getBuffer()).getUnscaledWidth();
            int unscaledHeight = ((VideoFrame.TextureBuffer) videoFrame.getBuffer()).getUnscaledHeight();
            this.lastI420Frame = null;
            if (scaleFilter == null || scaleFilter == FilterType.Origin || unscaledWidth == 0 || unscaledHeight == 0) {
                drawTexture(glDrawer, (VideoFrame.TextureBuffer) videoFrame.getBuffer(), this.renderMatrix, this.renderWidth, this.renderHeight, i10, i11, i12, i13, FilterType.Origin, 0, 0);
            } else {
                drawTexture(glDrawer, (VideoFrame.TextureBuffer) videoFrame.getBuffer(), this.renderMatrix, this.renderWidth, this.renderHeight, i10, i11, i12, i13, scaleFilter, unscaledWidth, unscaledHeight);
            }
        } catch (Exception e10) {
            Log.w("VideoFrameDrawer", "draw frame error", e10);
        }
    }

    public void release() {
        this.yuvUploader.release();
        this.lastI420Frame = null;
    }
}
