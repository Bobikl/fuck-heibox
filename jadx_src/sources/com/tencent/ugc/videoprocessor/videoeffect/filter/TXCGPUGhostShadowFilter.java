package com.tencent.ugc.videoprocessor.videoeffect.filter;

import com.tencent.liteav.base.util.Size;
import com.tencent.ugc.videobase.frame.GLTexture;
import com.tencent.ugc.videobase.frame.GLTexturePool;
import com.tencent.ugc.videoprocessor.videoeffect.TXCGPUEffectFilterBase;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class TXCGPUGhostShadowFilter extends TXCGPUEffectFilterBase {
    private static final String TAG = "TXCGPUGhostShadowFilter";
    private GLTexturePool mGLTexturePool;
    private TXCGPUDissolveBlendFilter mDissolveBlendFilter = null;
    private GhostShadowParam mGhostShadowParam = null;
    private TXCSavePreFrameFilter mSavePreFrameFilter = null;

    public static class GhostShadowParam extends TXCGPUEffectFilterBase.VideoEffectParams {
        public int delayNumber = 5;
        public int shadowLevel = 1;
        public float mixLevel = 0.5f;
    }

    private boolean initParams(GhostShadowParam ghostShadowParam) {
        if (ghostShadowParam == null) {
            return false;
        }
        TXCSavePreFrameFilter tXCSavePreFrameFilter = this.mSavePreFrameFilter;
        if (tXCSavePreFrameFilter == null) {
            return true;
        }
        tXCSavePreFrameFilter.setSavePreFrameNumber(ghostShadowParam.delayNumber);
        return true;
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onDraw(int i10, GLTexture gLTexture, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        if (isInitialized()) {
            runPendingOnDrawTasks();
            if (initParams(this.mGhostShadowParam)) {
                GLTexturePool gLTexturePool = this.mGLTexturePool;
                Size size = this.mOutputSize;
                GLTexture gLTextureObtain = gLTexturePool.obtain(size.width, size.height);
                TXCSavePreFrameFilter tXCSavePreFrameFilter = this.mSavePreFrameFilter;
                boolean zOnDrawToTexture = tXCSavePreFrameFilter != null ? tXCSavePreFrameFilter.onDrawToTexture(i10, gLTextureObtain, floatBuffer, floatBuffer2) : false;
                TXCGPUDissolveBlendFilter tXCGPUDissolveBlendFilter = this.mDissolveBlendFilter;
                if (tXCGPUDissolveBlendFilter != null) {
                    if (zOnDrawToTexture) {
                        tXCGPUDissolveBlendFilter.setSecondInputTexture(gLTextureObtain.getId());
                    }
                    this.mDissolveBlendFilter.onDraw(i10, gLTexture, floatBuffer, floatBuffer2);
                }
                gLTextureObtain.release();
            }
        }
    }

    @Override // com.tencent.ugc.videoprocessor.videoeffect.TXCGPUEffectFilterBase, com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onInit(GLTexturePool gLTexturePool) {
        super.onInit(gLTexturePool);
        this.mGLTexturePool = gLTexturePool;
        if (this.mDissolveBlendFilter == null) {
            TXCGPUDissolveBlendFilter tXCGPUDissolveBlendFilter = new TXCGPUDissolveBlendFilter();
            this.mDissolveBlendFilter = tXCGPUDissolveBlendFilter;
            tXCGPUDissolveBlendFilter.initialize(gLTexturePool);
        }
        if (this.mSavePreFrameFilter == null) {
            TXCSavePreFrameFilter tXCSavePreFrameFilter = new TXCSavePreFrameFilter();
            this.mSavePreFrameFilter = tXCSavePreFrameFilter;
            tXCSavePreFrameFilter.initFilter(gLTexturePool);
        }
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onOutputSizeChanged(int i10, int i11) {
        super.onOutputSizeChanged(i10, i11);
        TXCGPUDissolveBlendFilter tXCGPUDissolveBlendFilter = this.mDissolveBlendFilter;
        if (tXCGPUDissolveBlendFilter != null) {
            tXCGPUDissolveBlendFilter.onOutputSizeChanged(i10, i11);
        }
        TXCSavePreFrameFilter tXCSavePreFrameFilter = this.mSavePreFrameFilter;
        if (tXCSavePreFrameFilter != null) {
            tXCSavePreFrameFilter.onOutputSizeChanged(i10, i11);
        }
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onUninit() {
        super.onUninit();
        TXCGPUDissolveBlendFilter tXCGPUDissolveBlendFilter = this.mDissolveBlendFilter;
        if (tXCGPUDissolveBlendFilter != null) {
            tXCGPUDissolveBlendFilter.uninitialize();
            this.mDissolveBlendFilter = null;
        }
        TXCSavePreFrameFilter tXCSavePreFrameFilter = this.mSavePreFrameFilter;
        if (tXCSavePreFrameFilter != null) {
            tXCSavePreFrameFilter.destroy();
            this.mSavePreFrameFilter = null;
        }
    }

    @Override // com.tencent.ugc.videoprocessor.videoeffect.TXCGPUEffectFilterBase
    public void setNextFrameTimestamp(long j10) {
        super.setNextFrameTimestamp(j10);
        if (this.mGhostShadowParam == null) {
            this.mGhostShadowParam = new GhostShadowParam();
        }
        GhostShadowParam ghostShadowParam = this.mGhostShadowParam;
        ghostShadowParam.delayNumber = 5;
        ghostShadowParam.shadowLevel = 1;
        ghostShadowParam.mixLevel = 0.5f;
    }
}
