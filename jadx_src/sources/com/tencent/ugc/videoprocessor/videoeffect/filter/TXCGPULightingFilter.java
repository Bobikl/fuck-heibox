package com.tencent.ugc.videoprocessor.videoeffect.filter;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import com.tencent.ugc.videobase.frame.GLTexture;
import com.tencent.ugc.videobase.frame.GLTexturePool;
import com.tencent.ugc.videoprocessor.videoeffect.TXCGPUEffectFilterBase;
import java.io.IOException;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class TXCGPULightingFilter extends TXCGPUEffectFilterBase {
    private static final int DURATION_LIGHTNING_LV1 = 50;
    private static final int DURATION_LIGHTNING_LV2 = 150;
    private static final int DURATION_LIGHTNING_LV3 = 250;
    private static final int DURATION_LIGHTNING_LV4 = 300;
    private static final int DURATION_LIGHTNING_LV5 = 400;
    private static final int DURATION_LIGHTNING_LV6 = 580;
    private static final String TAG = "TXCGPULightingFilter";
    private final Context mContext;
    private GLTexturePool mGLTexturePool;
    private TXCGPULookUpInvertFilter mLookUpInvertFilter = null;
    private TXCGPULookUpFilter mLookUpFilter = null;
    private LightningParam mLightningParam = null;

    public static class LightningParam extends TXCGPUEffectFilterBase.VideoEffectParams {
        public float lightningLevel = 0.0f;
    }

    public TXCGPULightingFilter(Context context) {
        this.mContext = context.getApplicationContext();
    }

    private void updateParams() {
        LightningParam lightningParam = this.mLightningParam;
        if (lightningParam != null) {
            TXCGPULookUpInvertFilter tXCGPULookUpInvertFilter = this.mLookUpInvertFilter;
            if (tXCGPULookUpInvertFilter != null) {
                tXCGPULookUpInvertFilter.setIntensity(lightningParam.lightningLevel / 5.0f);
                this.mLookUpInvertFilter.setInvertLevel(this.mLightningParam.lightningLevel * 1.5f);
            }
            TXCGPULookUpFilter tXCGPULookUpFilter = this.mLookUpFilter;
            if (tXCGPULookUpFilter != null) {
                tXCGPULookUpFilter.setIntensity(this.mLightningParam.lightningLevel / 5.0f);
            }
        }
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onDraw(int i10, GLTexture gLTexture, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        if (isInitialized()) {
            runPendingOnDrawTasks();
            LightningParam lightningParam = this.mLightningParam;
            if (lightningParam == null || lightningParam.lightningLevel <= 0.0f) {
                return;
            }
            GLTexture gLTextureObtain = null;
            if (this.mLookUpInvertFilter != null) {
                GLTexturePool gLTexturePool = this.mGLTexturePool;
                Size size = this.mOutputSize;
                gLTextureObtain = gLTexturePool.obtain(size.width, size.height);
                this.mLookUpInvertFilter.onDraw(i10, gLTextureObtain, floatBuffer, floatBuffer2);
                i10 = gLTextureObtain.getId();
            }
            TXCGPULookUpFilter tXCGPULookUpFilter = this.mLookUpFilter;
            if (tXCGPULookUpFilter != null) {
                tXCGPULookUpFilter.onDraw(i10, gLTexture, floatBuffer, floatBuffer2);
            }
            if (gLTextureObtain != null) {
                gLTextureObtain.release();
            }
        }
    }

    @Override // com.tencent.ugc.videoprocessor.videoeffect.TXCGPUEffectFilterBase, com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onInit(GLTexturePool gLTexturePool) {
        super.onInit(gLTexturePool);
        this.mGLTexturePool = gLTexturePool;
        AssetManager assets = this.mContext.getResources().getAssets();
        try {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(assets.open("fennen.png"));
            if (this.mLookUpInvertFilter == null) {
                TXCGPULookUpInvertFilter tXCGPULookUpInvertFilter = new TXCGPULookUpInvertFilter(bitmapDecodeStream);
                this.mLookUpInvertFilter = tXCGPULookUpInvertFilter;
                tXCGPULookUpInvertFilter.initialize(gLTexturePool);
            }
            try {
                bitmapDecodeStream = BitmapFactory.decodeStream(assets.open("qingliang.png"));
            } catch (IOException e10) {
                LiteavLog.e(TAG, "decode stream failed.", e10);
            }
            if (this.mLookUpFilter == null) {
                TXCGPULookUpFilter tXCGPULookUpFilter = new TXCGPULookUpFilter(bitmapDecodeStream);
                this.mLookUpFilter = tXCGPULookUpFilter;
                tXCGPULookUpFilter.initialize(gLTexturePool);
            }
        } catch (IOException e11) {
            LiteavLog.e(TAG, "decode stream failed.", e11);
        }
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onOutputSizeChanged(int i10, int i11) {
        super.onOutputSizeChanged(i10, i11);
        TXCGPULookUpInvertFilter tXCGPULookUpInvertFilter = this.mLookUpInvertFilter;
        if (tXCGPULookUpInvertFilter != null) {
            tXCGPULookUpInvertFilter.onOutputSizeChanged(i10, i11);
        }
        TXCGPULookUpFilter tXCGPULookUpFilter = this.mLookUpFilter;
        if (tXCGPULookUpFilter != null) {
            tXCGPULookUpFilter.onOutputSizeChanged(i10, i11);
        }
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onUninit() {
        super.onUninit();
        TXCGPULookUpInvertFilter tXCGPULookUpInvertFilter = this.mLookUpInvertFilter;
        if (tXCGPULookUpInvertFilter != null) {
            tXCGPULookUpInvertFilter.uninitialize();
            this.mLookUpInvertFilter = null;
        }
        TXCGPULookUpFilter tXCGPULookUpFilter = this.mLookUpFilter;
        if (tXCGPULookUpFilter != null) {
            tXCGPULookUpFilter.uninitialize();
            this.mLookUpFilter = null;
        }
    }

    @Override // com.tencent.ugc.videoprocessor.videoeffect.TXCGPUEffectFilterBase
    public void setNextFrameTimestamp(long j10) {
        super.setNextFrameTimestamp(j10);
        if (this.mLightningParam == null) {
            LightningParam lightningParam = new LightningParam();
            this.mLightningParam = lightningParam;
            lightningParam.lightningLevel = 0.0f;
        }
        long jAbs = Math.abs(j10 - this.mEffectStartTime);
        if (jAbs < 50) {
            this.mLightningParam.lightningLevel = 0.7f;
        } else if (jAbs < 150) {
            this.mLightningParam.lightningLevel = 0.5f;
        } else if (jAbs < 250) {
            this.mLightningParam.lightningLevel = 0.4f;
        } else if (jAbs < 300) {
            this.mLightningParam.lightningLevel = 1.0f;
        } else if (jAbs < 400) {
            this.mLightningParam.lightningLevel = 0.3f;
        } else if (jAbs < 580) {
            this.mLightningParam.lightningLevel = 0.0f;
        } else {
            this.mEffectStartTime = -1L;
        }
        updateParams();
    }
}
