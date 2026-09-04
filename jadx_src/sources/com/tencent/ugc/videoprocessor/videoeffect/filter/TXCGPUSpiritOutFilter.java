package com.tencent.ugc.videoprocessor.videoeffect.filter;

import com.tencent.ugc.UGCWatermarkAlphaTextureFilter;
import com.tencent.ugc.videobase.frame.GLTexture;
import com.tencent.ugc.videobase.frame.GLTexturePool;
import com.tencent.ugc.videoprocessor.videoeffect.TXCGPUEffectFilterBase;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class TXCGPUSpiritOutFilter extends TXCGPUEffectFilterBase {
    private static final int DURATION_SPIRITOUT_LV1 = 230;
    private static final int DURATION_SPIRITOUT_LV10 = 560;
    private static final int DURATION_SPIRITOUT_LV2 = 274;
    private static final int DURATION_SPIRITOUT_LV3 = 318;
    private static final int DURATION_SPIRITOUT_LV4 = 362;
    private static final int DURATION_SPIRITOUT_LV5 = 406;
    private static final int DURATION_SPIRITOUT_LV6 = 450;
    private static final int DURATION_SPIRITOUT_LV7 = 494;
    private static final int DURATION_SPIRITOUT_LV8 = 538;
    private static final int DURATION_SPIRITOUT_LV9 = 582;
    private static final int DURATION_SPIRITOUT_LVMAX = 1120;
    private static final int DURATION_SPIRITOUT_LVMIN = 120;
    private static final String TAG = "TXCGPUSpiritOutFilter";
    private GLTexturePool mTexturePool;
    protected TXCZoomInOutFilter mZoomInOutFilter = null;
    private UGCWatermarkAlphaTextureFilter mTextureWaterMarkFilter = null;
    private SpiritOutEffectParam mSpritParams = null;
    private int mTextureWidth = -1;
    private int mTextureHeight = -1;

    public static class SpiritOutEffectParam extends TXCGPUEffectFilterBase.VideoEffectParams {
        public float zoomCenterX = 0.5f;
        public float zoomCenterY = 0.5f;
        public int fringeNumber = 1;
        public int zoomOutLevel = 1;
        public float alpahLevel = 0.5f;
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onDraw(int i10, GLTexture gLTexture, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        TXCZoomInOutFilter tXCZoomInOutFilter;
        if (isInitialized()) {
            runPendingOnDrawTasks();
            SpiritOutEffectParam spiritOutEffectParam = this.mSpritParams;
            if (spiritOutEffectParam == null || (tXCZoomInOutFilter = this.mZoomInOutFilter) == null || this.mTextureWaterMarkFilter == null) {
                return;
            }
            tXCZoomInOutFilter.setZoomLevel(0.96f, spiritOutEffectParam.zoomOutLevel);
            this.mZoomInOutFilter.setAlphaLevel(this.mSpritParams.alpahLevel);
            GLTexture gLTextureObtain = this.mTexturePool.obtain(this.mTextureWidth, this.mTextureHeight);
            this.mZoomInOutFilter.onDraw(i10, gLTextureObtain, floatBuffer, floatBuffer2);
            this.mTextureWaterMarkFilter.setTextureWatermark(gLTextureObtain.getId(), this.mTextureWidth, this.mTextureHeight, 0.0f, 0.0f, 1.0f);
            this.mTextureWaterMarkFilter.setAlpha(this.mSpritParams.alpahLevel);
            this.mTextureWaterMarkFilter.onDraw(i10, gLTexture, floatBuffer, floatBuffer2);
            gLTextureObtain.release();
        }
    }

    @Override // com.tencent.ugc.videoprocessor.videoeffect.TXCGPUEffectFilterBase, com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onInit(GLTexturePool gLTexturePool) {
        super.onInit(gLTexturePool);
        this.mTexturePool = gLTexturePool;
        if (this.mZoomInOutFilter == null) {
            TXCZoomInOutFilter tXCZoomInOutFilter = new TXCZoomInOutFilter();
            this.mZoomInOutFilter = tXCZoomInOutFilter;
            tXCZoomInOutFilter.initialize(gLTexturePool);
        }
        if (this.mTextureWaterMarkFilter == null) {
            UGCWatermarkAlphaTextureFilter uGCWatermarkAlphaTextureFilter = new UGCWatermarkAlphaTextureFilter();
            this.mTextureWaterMarkFilter = uGCWatermarkAlphaTextureFilter;
            uGCWatermarkAlphaTextureFilter.initialize(gLTexturePool);
            this.mTextureWaterMarkFilter.setAlpha(0.5f);
            this.mTextureWaterMarkFilter.enableWatermark(true);
        }
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onOutputSizeChanged(int i10, int i11) {
        super.onOutputSizeChanged(i10, i11);
        this.mTextureWidth = i10;
        this.mTextureHeight = i11;
        TXCZoomInOutFilter tXCZoomInOutFilter = this.mZoomInOutFilter;
        if (tXCZoomInOutFilter != null) {
            tXCZoomInOutFilter.onOutputSizeChanged(i10, i11);
        }
        UGCWatermarkAlphaTextureFilter uGCWatermarkAlphaTextureFilter = this.mTextureWaterMarkFilter;
        if (uGCWatermarkAlphaTextureFilter != null) {
            uGCWatermarkAlphaTextureFilter.onOutputSizeChanged(i10, i11);
        }
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onUninit() {
        super.onUninit();
        TXCZoomInOutFilter tXCZoomInOutFilter = this.mZoomInOutFilter;
        if (tXCZoomInOutFilter != null) {
            tXCZoomInOutFilter.uninitialize();
            this.mZoomInOutFilter = null;
        }
        UGCWatermarkAlphaTextureFilter uGCWatermarkAlphaTextureFilter = this.mTextureWaterMarkFilter;
        if (uGCWatermarkAlphaTextureFilter != null) {
            uGCWatermarkAlphaTextureFilter.uninitialize();
            this.mTextureWaterMarkFilter = null;
        }
    }

    @Override // com.tencent.ugc.videoprocessor.videoeffect.TXCGPUEffectFilterBase
    public void setNextFrameTimestamp(long j10) {
        super.setNextFrameTimestamp(j10);
        if (this.mSpritParams == null) {
            SpiritOutEffectParam spiritOutEffectParam = new SpiritOutEffectParam();
            this.mSpritParams = spiritOutEffectParam;
            spiritOutEffectParam.fringeNumber = 1;
            spiritOutEffectParam.alpahLevel = 0.3f;
        }
        long jAbs = Math.abs(j10 - this.mEffectStartTime);
        if (jAbs < 120) {
            this.mSpritParams.zoomOutLevel = 0;
            return;
        }
        if (jAbs < 230) {
            this.mSpritParams.zoomOutLevel = 1;
            return;
        }
        if (jAbs < 274) {
            this.mSpritParams.zoomOutLevel = 2;
            return;
        }
        if (jAbs < 318) {
            this.mSpritParams.zoomOutLevel = 3;
            return;
        }
        if (jAbs < 362) {
            this.mSpritParams.zoomOutLevel = 4;
            return;
        }
        if (jAbs < 406) {
            this.mSpritParams.zoomOutLevel = 5;
            return;
        }
        if (jAbs < 450) {
            this.mSpritParams.zoomOutLevel = 6;
            return;
        }
        if (jAbs < 494) {
            this.mSpritParams.zoomOutLevel = 7;
            return;
        }
        if (jAbs < 538) {
            this.mSpritParams.zoomOutLevel = 8;
            return;
        }
        if (jAbs < 582) {
            this.mSpritParams.zoomOutLevel = 9;
        } else if (jAbs < 1120) {
            this.mSpritParams.zoomOutLevel = 0;
        } else {
            this.mEffectStartTime = -1L;
        }
    }
}
