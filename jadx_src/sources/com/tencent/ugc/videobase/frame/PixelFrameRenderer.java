package com.tencent.ugc.videobase.frame;

import android.opengl.GLES20;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import com.tencent.liteav.base.util.l;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.ugc.videobase.chain.TXCGPUImageFilter;
import com.tencent.ugc.videobase.filter.TXCGPUImageOESInputFilter;
import com.tencent.ugc.videobase.filter.TXCGPUImageRGBAInputFilter;
import com.tencent.ugc.videobase.utils.OpenGlUtils;
import com.tencent.ugc.videobase.yuv.TXCGPUImageI420InputFilter;
import com.tencent.ugc.videobase.yuv.TXCGPUImageNV12InputFilter;
import com.tencent.ugc.videobase.yuv.TXCGPUImageNV21InputFilter;
import com.tencent.ugc.videobase.yuv.TXCGPUImageYUVInputFilter;
import com.uc.crashsdk.export.LogType;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class PixelFrameRenderer {
    private static final String TAG = "PixelFrameRenderer";
    private final FloatBuffer mCubeVerticesBuffer;
    private GLFrameBuffer mFrameBufferForClear;
    private final FloatBuffer mInputTextureCoordsBuffer;
    private int mOutFrameHeight;
    private int mOutFrameWidth;
    private GLConstants.GLScaleType mScaleType;
    private static final float[] OES_TEXTURE_COORDS_NO_ROTATION = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};
    private static final float[] OES_TEXTURE_COORDS_ROTATE_RIGHT = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
    private static final float[] OES_TEXTURE_COORDS_ROTATE_LEFT = {1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f};
    private static final float[] OES_TEXTURE_COORDS_ROTATED_180 = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f};
    private final TXCGPUImageFilter[] mRawDataInputFilter = new TXCGPUImageFilter[GLConstants.PixelFormatType.values().length];
    private PixelFrame mFrameParams = null;
    private TXCGPUImageOESInputFilter mOesInputFilter = null;
    private TXCGPUImageFilter mNormalFilter = null;

    /* JADX INFO: renamed from: com.tencent.ugc.videobase.frame.PixelFrameRenderer$1, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f103893a;

        static {
            int[] iArr = new int[l.values().length];
            f103893a = iArr;
            try {
                iArr[l.ROTATION_90.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f103893a[l.ROTATION_180.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f103893a[l.ROTATION_270.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f103893a[l.NORMAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public PixelFrameRenderer(int i10, int i11) {
        this.mOutFrameWidth = i10;
        this.mOutFrameHeight = i11;
        float[] fArr = GLConstants.f100240d;
        this.mCubeVerticesBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr);
        this.mInputTextureCoordsBuffer = OpenGlUtils.createTextureCoordsBuffer(l.NORMAL, false, false);
    }

    private float addDistance(float f10, float f11) {
        return f10 == 0.0f ? f11 : 1.0f - f11;
    }

    private void clearTexture(GLTexture gLTexture) {
        if (this.mFrameBufferForClear == null) {
            GLFrameBuffer gLFrameBuffer = new GLFrameBuffer();
            this.mFrameBufferForClear = gLFrameBuffer;
            gLFrameBuffer.initialize();
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        if (gLTexture == null) {
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glClear(LogType.UNEXP_RESTART);
            return;
        }
        this.mFrameBufferForClear.attachTexture(gLTexture.getId());
        this.mFrameBufferForClear.bindToContext();
        GLES20.glClear(LogType.UNEXP_RESTART);
        this.mFrameBufferForClear.unbindFromContext();
        this.mFrameBufferForClear.detachTexture();
    }

    private void destroyGLComponents() {
        TXCGPUImageOESInputFilter tXCGPUImageOESInputFilter = this.mOesInputFilter;
        if (tXCGPUImageOESInputFilter != null) {
            tXCGPUImageOESInputFilter.uninitialize();
            this.mOesInputFilter = null;
        }
        TXCGPUImageFilter tXCGPUImageFilter = this.mNormalFilter;
        if (tXCGPUImageFilter != null) {
            tXCGPUImageFilter.uninitialize();
            this.mNormalFilter = null;
        }
        GLFrameBuffer gLFrameBuffer = this.mFrameBufferForClear;
        if (gLFrameBuffer != null) {
            gLFrameBuffer.uninitialize();
            this.mFrameBufferForClear = null;
        }
        int i10 = 0;
        while (true) {
            TXCGPUImageFilter[] tXCGPUImageFilterArr = this.mRawDataInputFilter;
            if (i10 >= tXCGPUImageFilterArr.length) {
                LiteavLog.i(TAG, "uninitialize GL components");
                return;
            }
            TXCGPUImageFilter tXCGPUImageFilter2 = tXCGPUImageFilterArr[i10];
            if (tXCGPUImageFilter2 != null) {
                tXCGPUImageFilter2.uninitialize();
                this.mRawDataInputFilter[i10] = null;
            }
            i10++;
        }
    }

    private static float flip(float f10) {
        return f10 == 0.0f ? 1.0f : 0.0f;
    }

    private void initNormalFilter() {
        if (this.mNormalFilter != null) {
            return;
        }
        TXCGPUImageFilter tXCGPUImageFilter = new TXCGPUImageFilter();
        this.mNormalFilter = tXCGPUImageFilter;
        tXCGPUImageFilter.initialize(null);
    }

    private static void initOESTextureCoordsBuffer(float[] fArr, l lVar, boolean z10, boolean z11) {
        float[] fArr2 = OES_TEXTURE_COORDS_NO_ROTATION;
        if (lVar != null) {
            int i10 = AnonymousClass1.f103893a[lVar.ordinal()];
            if (i10 == 1) {
                fArr2 = OES_TEXTURE_COORDS_ROTATE_RIGHT;
            } else if (i10 == 2) {
                fArr2 = OES_TEXTURE_COORDS_ROTATED_180;
            } else if (i10 == 3) {
                fArr2 = OES_TEXTURE_COORDS_ROTATE_LEFT;
            }
        }
        System.arraycopy(fArr2, 0, fArr, 0, fArr2.length);
        if (z10) {
            fArr[0] = flip(fArr[0]);
            fArr[2] = flip(fArr[2]);
            fArr[4] = flip(fArr[4]);
            fArr[6] = flip(fArr[6]);
        }
        if (z11) {
            fArr[1] = flip(fArr[1]);
            fArr[3] = flip(fArr[3]);
            fArr[5] = flip(fArr[5]);
            fArr[7] = flip(fArr[7]);
        }
    }

    private boolean isIncompatible(PixelFrame pixelFrame, GLConstants.GLScaleType gLScaleType) {
        return (gLScaleType == this.mScaleType && pixelFrame.getWidth() == this.mFrameParams.getWidth() && pixelFrame.getHeight() == this.mFrameParams.getHeight() && pixelFrame.getPixelBufferType() == this.mFrameParams.getPixelBufferType() && pixelFrame.getPixelFormatType() == this.mFrameParams.getPixelFormatType() && pixelFrame.isMirrorHorizontal() == this.mFrameParams.isMirrorHorizontal() && pixelFrame.isMirrorVertical() == this.mFrameParams.isMirrorVertical() && pixelFrame.getRotation() == this.mFrameParams.getRotation()) ? false : true;
    }

    private void recalcCubeAndTextureCoordinates() {
        PixelFrame pixelFrame = this.mFrameParams;
        if (pixelFrame == null) {
            return;
        }
        boolean z10 = pixelFrame.getRotation() == l.ROTATION_90 || this.mFrameParams.getRotation() == l.ROTATION_270;
        float width = this.mFrameParams.getWidth();
        float height = this.mFrameParams.getHeight();
        float fMax = Math.max((this.mOutFrameWidth * 1.0f) / width, (this.mOutFrameHeight * 1.0f) / height);
        float fRound = (Math.round(width * fMax) * 1.0f) / this.mOutFrameWidth;
        float fRound2 = (Math.round(height * fMax) * 1.0f) / this.mOutFrameHeight;
        float[] fArr = GLConstants.f100240d;
        float[] fArr2 = new float[8];
        if (this.mFrameParams.getPixelBufferType() == GLConstants.a.TEXTURE_OES) {
            initOESTextureCoordsBuffer(fArr2, this.mFrameParams.getRotation(), this.mFrameParams.isMirrorHorizontal(), this.mFrameParams.isMirrorVertical());
        } else {
            OpenGlUtils.initTextureCoordsBuffer(fArr2, this.mFrameParams.getRotation(), this.mFrameParams.isMirrorHorizontal(), this.mFrameParams.isMirrorVertical());
        }
        GLConstants.GLScaleType gLScaleType = this.mScaleType;
        if (gLScaleType == GLConstants.GLScaleType.CENTER_CROP) {
            float f10 = (1.0f - (z10 ? 1.0f / fRound2 : 1.0f / fRound)) / 2.0f;
            float f11 = (1.0f - (z10 ? 1.0f / fRound : 1.0f / fRound2)) / 2.0f;
            fArr2[0] = addDistance(fArr2[0], f10);
            fArr2[1] = addDistance(fArr2[1], f11);
            fArr2[2] = addDistance(fArr2[2], f10);
            fArr2[3] = addDistance(fArr2[3], f11);
            fArr2[4] = addDistance(fArr2[4], f10);
            fArr2[5] = addDistance(fArr2[5], f11);
            fArr2[6] = addDistance(fArr2[6], f10);
            fArr2[7] = addDistance(fArr2[7], f11);
        } else if (gLScaleType == GLConstants.GLScaleType.FIT_CENTER) {
            fArr = new float[]{fArr[0] / fRound2, fArr[1] / fRound, fArr[2] / fRound2, fArr[3] / fRound, fArr[4] / fRound2, fArr[5] / fRound, fArr[6] / fRound2, fArr[7] / fRound};
        }
        this.mCubeVerticesBuffer.clear();
        this.mCubeVerticesBuffer.put(fArr).position(0);
        this.mInputTextureCoordsBuffer.clear();
        this.mInputTextureCoordsBuffer.put(fArr2).position(0);
    }

    private void renderRgbaData(GLTexture gLTexture, Buffer buffer) {
        int iOrdinal = GLConstants.PixelFormatType.RGBA.ordinal();
        TXCGPUImageFilter[] tXCGPUImageFilterArr = this.mRawDataInputFilter;
        if (tXCGPUImageFilterArr[iOrdinal] == null) {
            tXCGPUImageFilterArr[iOrdinal] = new TXCGPUImageRGBAInputFilter();
            this.mRawDataInputFilter[iOrdinal].initialize(null);
        }
        TXCGPUImageRGBAInputFilter tXCGPUImageRGBAInputFilter = (TXCGPUImageRGBAInputFilter) this.mRawDataInputFilter[iOrdinal];
        tXCGPUImageRGBAInputFilter.onOutputSizeChanged(this.mOutFrameWidth, this.mOutFrameHeight);
        OpenGlUtils.glViewport(0, 0, this.mOutFrameWidth, this.mOutFrameHeight);
        if (this.mFrameParams.getRotation() == l.ROTATION_90 || this.mFrameParams.getRotation() == l.ROTATION_270) {
            tXCGPUImageRGBAInputFilter.loadRgbaData(buffer, this.mFrameParams.getHeight(), this.mFrameParams.getWidth());
        } else {
            tXCGPUImageRGBAInputFilter.loadRgbaData(buffer, this.mFrameParams.getWidth(), this.mFrameParams.getHeight());
        }
        tXCGPUImageRGBAInputFilter.onDraw(-1, gLTexture, this.mCubeVerticesBuffer, this.mInputTextureCoordsBuffer);
    }

    private void renderTexture2DInput(GLTexture gLTexture, int i10) {
        initNormalFilter();
        OpenGlUtils.glViewport(0, 0, this.mOutFrameWidth, this.mOutFrameHeight);
        this.mNormalFilter.onOutputSizeChanged(this.mOutFrameWidth, this.mOutFrameHeight);
        this.mNormalFilter.onDraw(i10, gLTexture, this.mCubeVerticesBuffer, this.mInputTextureCoordsBuffer);
    }

    private void renderTextureOesInput(GLTexture gLTexture, int i10, float[] fArr) {
        if (this.mOesInputFilter == null) {
            TXCGPUImageOESInputFilter tXCGPUImageOESInputFilter = new TXCGPUImageOESInputFilter();
            this.mOesInputFilter = tXCGPUImageOESInputFilter;
            tXCGPUImageOESInputFilter.initialize(null);
        }
        OpenGlUtils.glViewport(0, 0, this.mOutFrameWidth, this.mOutFrameHeight);
        this.mOesInputFilter.setTextureTransform(fArr);
        this.mOesInputFilter.onOutputSizeChanged(this.mOutFrameWidth, this.mOutFrameHeight);
        this.mOesInputFilter.onDraw(i10, gLTexture, this.mCubeVerticesBuffer, this.mInputTextureCoordsBuffer);
    }

    private void renderYuvData(GLConstants.PixelFormatType pixelFormatType, GLTexture gLTexture, ByteBuffer byteBuffer, GLConstants.ColorRange colorRange, GLConstants.ColorSpace colorSpace) {
        int iOrdinal = pixelFormatType.ordinal();
        TXCGPUImageFilter[] tXCGPUImageFilterArr = this.mRawDataInputFilter;
        if (tXCGPUImageFilterArr[iOrdinal] == null) {
            if (pixelFormatType == GLConstants.PixelFormatType.I420) {
                tXCGPUImageFilterArr[iOrdinal] = new TXCGPUImageI420InputFilter();
            } else if (pixelFormatType == GLConstants.PixelFormatType.NV21) {
                tXCGPUImageFilterArr[iOrdinal] = new TXCGPUImageNV21InputFilter();
            } else {
                tXCGPUImageFilterArr[iOrdinal] = new TXCGPUImageNV12InputFilter();
            }
            this.mRawDataInputFilter[iOrdinal].setColorFormat(colorRange, colorSpace);
            this.mRawDataInputFilter[iOrdinal].initialize(null);
        }
        TXCGPUImageYUVInputFilter tXCGPUImageYUVInputFilter = (TXCGPUImageYUVInputFilter) this.mRawDataInputFilter[iOrdinal];
        tXCGPUImageYUVInputFilter.onOutputSizeChanged(this.mOutFrameWidth, this.mOutFrameHeight);
        OpenGlUtils.glViewport(0, 0, this.mOutFrameWidth, this.mOutFrameHeight);
        if (this.mFrameParams.getRotation() == l.ROTATION_90 || this.mFrameParams.getRotation() == l.ROTATION_270) {
            tXCGPUImageYUVInputFilter.loadYuvDataToTexture(byteBuffer, this.mFrameParams.getHeight(), this.mFrameParams.getWidth());
        } else {
            tXCGPUImageYUVInputFilter.loadYuvDataToTexture(byteBuffer, this.mFrameParams.getWidth(), this.mFrameParams.getHeight());
        }
        tXCGPUImageYUVInputFilter.onDraw(-1, gLTexture, this.mCubeVerticesBuffer, this.mInputTextureCoordsBuffer);
    }

    public Size getOutputSize() {
        return new Size(this.mOutFrameWidth, this.mOutFrameHeight);
    }

    public void renderFrame(PixelFrame pixelFrame, GLConstants.GLScaleType gLScaleType, GLTexture gLTexture) {
        if (pixelFrame == null || !pixelFrame.isFrameDataValid()) {
            LiteavLog.w(TAG, "renderFrame: pixelFrame is not valid");
            return;
        }
        if (gLTexture != null) {
            gLTexture.setColorFormat(pixelFrame.getColorRange(), pixelFrame.getColorSpace());
        }
        if (this.mFrameParams == null || isIncompatible(pixelFrame, gLScaleType)) {
            this.mScaleType = gLScaleType;
            this.mFrameParams = new PixelFrame(pixelFrame);
            destroyGLComponents();
            recalcCubeAndTextureCoordinates();
        }
        if (gLScaleType == GLConstants.GLScaleType.FIT_CENTER) {
            clearTexture(gLTexture);
        }
        if (this.mFrameParams.getPixelBufferType() == GLConstants.a.BYTE_BUFFER) {
            if (this.mFrameParams.getPixelFormatType() != GLConstants.PixelFormatType.RGBA) {
                renderYuvData(this.mFrameParams.getPixelFormatType(), gLTexture, pixelFrame.getBuffer(), pixelFrame.getColorRange(), pixelFrame.getColorSpace());
                return;
            } else {
                renderRgbaData(gLTexture, pixelFrame.getBuffer());
                return;
            }
        }
        if (this.mFrameParams.getPixelBufferType() == GLConstants.a.BYTE_ARRAY) {
            if (this.mFrameParams.getPixelFormatType() != GLConstants.PixelFormatType.RGBA) {
                renderYuvData(this.mFrameParams.getPixelFormatType(), gLTexture, ByteBuffer.wrap(pixelFrame.getData()), pixelFrame.getColorRange(), pixelFrame.getColorSpace());
                return;
            } else {
                renderRgbaData(gLTexture, ByteBuffer.wrap(pixelFrame.getData()));
                return;
            }
        }
        if (this.mFrameParams.getPixelBufferType() == GLConstants.a.TEXTURE_OES) {
            renderTextureOesInput(gLTexture, pixelFrame.getTextureId(), pixelFrame.getMatrix());
        } else if (this.mFrameParams.getPixelBufferType() == GLConstants.a.TEXTURE_2D) {
            renderTexture2DInput(gLTexture, pixelFrame.getTextureId());
        }
    }

    public void setOutputSize(int i10, int i11) {
        if (this.mOutFrameWidth == i10 && this.mOutFrameHeight == i11) {
            return;
        }
        this.mOutFrameWidth = i10;
        this.mOutFrameHeight = i11;
        recalcCubeAndTextureCoordinates();
    }

    public void uninitialize() {
        this.mFrameParams = null;
        destroyGLComponents();
    }
}
