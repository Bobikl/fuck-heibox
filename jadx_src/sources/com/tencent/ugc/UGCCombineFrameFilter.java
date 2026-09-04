package com.tencent.ugc;

import android.opengl.GLES20;
import android.util.Log;
import com.tencent.liteav.base.util.Size;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.ugc.videobase.chain.TXCGPUImageFilter;
import com.tencent.ugc.videobase.frame.GLFrameBuffer;
import com.tencent.ugc.videobase.frame.GLTexture;
import com.tencent.ugc.videobase.frame.GLTexturePool;
import com.tencent.ugc.videobase.frame.PixelFrame;
import com.tencent.ugc.videobase.utils.OpenGlUtils;
import com.uc.crashsdk.export.LogType;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class UGCCombineFrameFilter {
    private static final String TAG = "UGCCombineFrameFilter";
    private UGCWatermarkAlphaTextureFilter mAlphaBlendFilter;
    private Size mCanvasSize;
    private FloatBuffer mCropRectTextureCoordsBuffer;
    private GLFrameBuffer mFrameBufferForClear;
    private final GLTexturePool mTexturePool;
    private UGCRotateScaleFilter mRotateScaleFilter = null;
    private TXCGPUImageFilter mCropFilter = null;
    private TXVideoEditConstants.TXAbsoluteRect mCropRect = null;
    private GLTexture mBackgroundTexture = null;
    private final FloatBuffer mNormalCubeVerticesBuffer = OpenGlUtils.createNormalCubeVerticesBuffer();
    private final FloatBuffer mNormalTextureCoordsBuffer = OpenGlUtils.createTextureCoordsBuffer(com.tencent.liteav.base.util.l.NORMAL, false, false);

    public UGCCombineFrameFilter(GLTexturePool gLTexturePool) {
        this.mTexturePool = gLTexturePool;
    }

    private void clearTexture(GLTexture gLTexture) {
        if (this.mFrameBufferForClear == null) {
            GLFrameBuffer gLFrameBuffer = new GLFrameBuffer();
            this.mFrameBufferForClear = gLFrameBuffer;
            gLFrameBuffer.initialize();
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
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

    private GLTexture combineFrameWithAlphaBlendFilter(List<UGCTransitionProcessor.TXCCombineFrame> list) {
        int backgroundTextureId = getBackgroundTextureId();
        GLTexture gLTexture = null;
        int i10 = 0;
        while (i10 < list.size()) {
            UGCTransitionProcessor.TXCCombineFrame tXCCombineFrame = list.get(i10);
            setAlphaBlendFilterParameter(tXCCombineFrame);
            Size size = this.mCanvasSize;
            GLES20.glViewport(0, 0, size.width, size.height);
            Size outputSize = this.mAlphaBlendFilter.getOutputSize();
            GLTexture gLTextureObtain = this.mTexturePool.obtain(outputSize.width, outputSize.height);
            gLTextureObtain.setColorFormat(tXCCombineFrame.drawInputFrame.getColorRange(), tXCCombineFrame.drawInputFrame.getColorSpace());
            this.mAlphaBlendFilter.onDraw(backgroundTextureId, gLTextureObtain, this.mNormalCubeVerticesBuffer, this.mNormalTextureCoordsBuffer);
            if (gLTexture != null) {
                gLTexture.release();
            }
            backgroundTextureId = gLTextureObtain.getId();
            i10++;
            gLTexture = gLTextureObtain;
        }
        return gLTexture;
    }

    private GLTexture cropTexture(GLTexture gLTexture) {
        TXCGPUImageFilter tXCGPUImageFilter;
        if (gLTexture == null || (tXCGPUImageFilter = this.mCropFilter) == null) {
            return gLTexture;
        }
        Size outputSize = tXCGPUImageFilter.getOutputSize();
        GLTexture gLTextureObtain = this.mTexturePool.obtain(outputSize.width, outputSize.height);
        gLTextureObtain.setColorFormat(gLTexture.getColorRange(), gLTexture.getColorSpace());
        GLES20.glViewport(0, 0, outputSize.width, outputSize.height);
        this.mCropFilter.onDraw(gLTexture.getId(), gLTextureObtain, this.mNormalCubeVerticesBuffer, this.mCropRectTextureCoordsBuffer);
        gLTexture.release();
        return gLTextureObtain;
    }

    private int getBackgroundTextureId() {
        if (this.mBackgroundTexture == null) {
            GLTexturePool gLTexturePool = this.mTexturePool;
            Size size = this.mCanvasSize;
            GLTexture gLTextureObtain = gLTexturePool.obtain(size.width, size.height);
            this.mBackgroundTexture = gLTextureObtain;
            gLTextureObtain.setColorFormat(GLConstants.ColorRange.VIDEO_RANGE, GLConstants.ColorSpace.BT601);
            clearTexture(this.mBackgroundTexture);
        }
        return this.mBackgroundTexture.getId();
    }

    private static FloatBuffer getCropRectTextureCoords(int i10, int i11, TXVideoEditConstants.TXAbsoluteRect tXAbsoluteRect) {
        int length = GLConstants.f100241e.length;
        float[] fArr = new float[length];
        OpenGlUtils.initTextureCoordsBuffer(fArr, com.tencent.liteav.base.util.l.NORMAL, false, false);
        if (tXAbsoluteRect != null) {
            int i12 = tXAbsoluteRect.f103210x;
            float f10 = i10 * 1.0f;
            float f11 = i12 / f10;
            float f12 = ((i10 - i12) - tXAbsoluteRect.width) / f10;
            int i13 = tXAbsoluteRect.f103211y;
            float f13 = i11 * 1.0f;
            float f14 = i13 / f13;
            float f15 = ((i11 - i13) - tXAbsoluteRect.height) / f13;
            for (int i14 = 0; i14 < length / 2; i14++) {
                int i15 = i14 * 2;
                float f16 = fArr[i15];
                if (f16 < 0.5f) {
                    fArr[i15] = f16 + f11;
                } else {
                    fArr[i15] = f16 - f12;
                }
                int i16 = i15 + 1;
                float f17 = fArr[i16];
                if (f17 < 0.5f) {
                    fArr[i16] = f17 + f14;
                } else {
                    fArr[i16] = f17 - f15;
                }
            }
        }
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(GLConstants.f100241e.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArr).position(0);
        return floatBufferAsFloatBuffer;
    }

    private void initFilter() {
        if (this.mRotateScaleFilter == null) {
            UGCRotateScaleFilter uGCRotateScaleFilter = new UGCRotateScaleFilter();
            this.mRotateScaleFilter = uGCRotateScaleFilter;
            uGCRotateScaleFilter.initialize(this.mTexturePool);
        }
        if (this.mAlphaBlendFilter == null) {
            UGCWatermarkAlphaTextureFilter uGCWatermarkAlphaTextureFilter = new UGCWatermarkAlphaTextureFilter();
            this.mAlphaBlendFilter = uGCWatermarkAlphaTextureFilter;
            uGCWatermarkAlphaTextureFilter.initialize(this.mTexturePool);
        }
        this.mAlphaBlendFilter.enableWatermark(true);
        UGCWatermarkAlphaTextureFilter uGCWatermarkAlphaTextureFilter2 = this.mAlphaBlendFilter;
        Size size = this.mCanvasSize;
        uGCWatermarkAlphaTextureFilter2.onOutputSizeChanged(size.width, size.height);
        if (this.mCropRect == null) {
            TXCGPUImageFilter tXCGPUImageFilter = this.mCropFilter;
            if (tXCGPUImageFilter != null) {
                tXCGPUImageFilter.uninitialize();
                this.mCropFilter = null;
                return;
            }
            return;
        }
        if (this.mCropFilter == null) {
            TXCGPUImageFilter tXCGPUImageFilter2 = new TXCGPUImageFilter();
            this.mCropFilter = tXCGPUImageFilter2;
            tXCGPUImageFilter2.initialize(this.mTexturePool);
        }
        TXCGPUImageFilter tXCGPUImageFilter3 = this.mCropFilter;
        TXVideoEditConstants.TXAbsoluteRect tXAbsoluteRect = this.mCropRect;
        tXCGPUImageFilter3.onOutputSizeChanged(tXAbsoluteRect.width, tXAbsoluteRect.height);
    }

    private void processRotateScale(List<UGCTransitionProcessor.TXCCombineFrame> list) {
        UGCTransitionProcessor.TransformParams transformParams;
        for (int i10 = 0; i10 < list.size(); i10++) {
            UGCTransitionProcessor.TXCCombineFrame tXCCombineFrame = list.get(i10);
            UGCRotateScaleFilter uGCRotateScaleFilter = this.mRotateScaleFilter;
            if (uGCRotateScaleFilter == null || (transformParams = tXCCombineFrame.transformParams) == null) {
                return;
            }
            uGCRotateScaleFilter.setRotateAndScale(transformParams.rotate, transformParams.scale);
            this.mRotateScaleFilter.setAlpha(tXCCombineFrame.transformParams.alpha);
            TXVideoEditConstants.TXAbsoluteRect tXAbsoluteRect = tXCCombineFrame.drawRect;
            GLES20.glViewport(0, 0, tXAbsoluteRect.width, tXAbsoluteRect.height);
            GLTexturePool gLTexturePool = this.mTexturePool;
            TXVideoEditConstants.TXAbsoluteRect tXAbsoluteRect2 = tXCCombineFrame.drawRect;
            GLTexture gLTextureObtain = gLTexturePool.obtain(tXAbsoluteRect2.width, tXAbsoluteRect2.height);
            gLTextureObtain.setColorFormat(tXCCombineFrame.drawInputFrame.getColorRange(), tXCCombineFrame.drawInputFrame.getColorSpace());
            clearTexture(gLTextureObtain);
            this.mRotateScaleFilter.onDraw(tXCCombineFrame.drawInputFrame.getTextureId(), gLTextureObtain, this.mNormalCubeVerticesBuffer, this.mNormalTextureCoordsBuffer);
            PixelFrame pixelFrame = tXCCombineFrame.drawInputFrame;
            tXCCombineFrame.drawInputFrame = gLTextureObtain.wrap(pixelFrame.getGLContext());
            pixelFrame.release();
            gLTextureObtain.release();
        }
    }

    private void setAlphaBlendFilterParameter(UGCTransitionProcessor.TXCCombineFrame tXCCombineFrame) {
        UGCTransitionProcessor.TransformParams transformParams = tXCCombineFrame.transformParams;
        if (transformParams != null) {
            this.mAlphaBlendFilter.setAlpha(transformParams.alpha);
            this.mAlphaBlendFilter.setShowBackImageMoment(tXCCombineFrame.transformParams.isBackgroundTransparent);
        } else {
            this.mAlphaBlendFilter.setAlpha(1.0f);
            this.mAlphaBlendFilter.setShowBackImageMoment(false);
        }
        int textureId = tXCCombineFrame.drawInputFrame.getTextureId();
        TXVideoEditConstants.TXAbsoluteRect tXAbsoluteRect = tXCCombineFrame.drawRect;
        int i10 = tXAbsoluteRect.width;
        int i11 = tXAbsoluteRect.height;
        float f10 = tXAbsoluteRect.f103210x * 1.0f;
        Size size = this.mCanvasSize;
        int i12 = size.width;
        this.mAlphaBlendFilter.setTextureWatermark(textureId, i10, i11, f10 / i12, (tXAbsoluteRect.f103211y * 1.0f) / size.height, (i10 * 1.0f) / i12);
    }

    private void unInitFilter() {
        UGCRotateScaleFilter uGCRotateScaleFilter = this.mRotateScaleFilter;
        if (uGCRotateScaleFilter != null) {
            uGCRotateScaleFilter.uninitialize();
            this.mRotateScaleFilter = null;
        }
        UGCWatermarkAlphaTextureFilter uGCWatermarkAlphaTextureFilter = this.mAlphaBlendFilter;
        if (uGCWatermarkAlphaTextureFilter != null) {
            uGCWatermarkAlphaTextureFilter.uninitialize();
            this.mAlphaBlendFilter = null;
        }
        TXCGPUImageFilter tXCGPUImageFilter = this.mCropFilter;
        if (tXCGPUImageFilter != null) {
            tXCGPUImageFilter.uninitialize();
            this.mCropFilter = null;
        }
        GLTexture gLTexture = this.mBackgroundTexture;
        if (gLTexture != null) {
            gLTexture.release();
            this.mBackgroundTexture = null;
        }
        GLFrameBuffer gLFrameBuffer = this.mFrameBufferForClear;
        if (gLFrameBuffer != null) {
            gLFrameBuffer.uninitialize();
            this.mFrameBufferForClear = null;
        }
    }

    public GLTexture combineFrame(List<UGCTransitionProcessor.TXCCombineFrame> list) {
        if (list == null || list.size() <= 0) {
            Log.e(TAG, "frames is null or no frames!");
            return null;
        }
        initFilter();
        processRotateScale(list);
        return cropTexture(combineFrameWithAlphaBlendFilter(list));
    }

    public void release() {
        unInitFilter();
    }

    public void setCanvasSize(int i10, int i11) {
        Size size = this.mCanvasSize;
        if (size != null && i10 == size.width && i11 == size.height) {
            return;
        }
        Size size2 = new Size(i10, i11);
        this.mCanvasSize = size2;
        this.mCropRectTextureCoordsBuffer = getCropRectTextureCoords(size2.width, size2.height, this.mCropRect);
    }

    public void setCropRect(TXVideoEditConstants.TXAbsoluteRect tXAbsoluteRect) {
        TXVideoEditConstants.TXAbsoluteRect tXAbsoluteRect2 = this.mCropRect;
        if (tXAbsoluteRect2 != null && tXAbsoluteRect != null && tXAbsoluteRect2.width == tXAbsoluteRect.width && tXAbsoluteRect2.height == tXAbsoluteRect.height && tXAbsoluteRect2.f103210x == tXAbsoluteRect.f103210x && tXAbsoluteRect2.f103211y == tXAbsoluteRect.f103211y) {
            return;
        }
        this.mCropRect = tXAbsoluteRect;
        Size size = this.mCanvasSize;
        this.mCropRectTextureCoordsBuffer = getCropRectTextureCoords(size.width, size.height, tXAbsoluteRect);
    }
}
